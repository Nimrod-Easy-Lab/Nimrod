package saferefactor.core.analysis.analyzer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.tools.ant.DefaultLogger;
import org.apache.tools.ant.ProjectHelper;

import saferefactor.core.analysis.Report;
import saferefactor.core.analysis.naive.NaiveReport;
import saferefactor.core.util.Constants;
import saferefactor.core.util.Project;
import saferefactor.core.util.ast.Method;
import saferefactor.core.util.ast.Clazz;
import saferefactor.core.util.ast.ConstructorImp;

public class ReflectionBasedAnalyzer implements TransformationAnalyzer {

	private List<Clazz> sourceClasses;
	private List<Clazz> targetClasses;
	private final Project source;
	private final Project target;
	private final String tmpDir;

	public ReflectionBasedAnalyzer(Project source, Project target, String tmpDir) {
		this.source = source;
		this.target = target;
		this.tmpDir = tmpDir;

	}

	public Report analyze() throws Exception {
		Report result = new NaiveReport();

		sourceClasses = getClasses(source);
		targetClasses = getClasses(target);

		List<Method> methodsToTest = getCommonMethods();

		result.setMethodsToTest(methodsToTest);

		return result;
	}

	private List<Method> getCommonMethods() {
		List<Method> result = new ArrayList<Method>();

		Map<String, Clazz> mapSourceClasses = createMapByName(sourceClasses);
		Map<String, Clazz> mapTargetClasses = createMapByName(targetClasses);

		for (Clazz sourceClass : mapSourceClasses.values()) {

			// se no target nao tiver essa classe, pula
			if (!mapTargetClasses.values().contains(sourceClass))
				continue;

			// classe do target
			Clazz targetClass = mapTargetClasses.get(sourceClass.getFullName());

			for (ConstructorImp constructor : sourceClass.getConstructors()) {
				if (targetClass.getConstructors().contains(constructor))
					result.add(constructor);
			}
			for (Method sourceMethod : sourceClass.getMethods()) {
				if (!targetClass.getMethods().contains(sourceMethod)) {

					// senao, verifica se o method existe na hierarquia
					for (int j = 0; j < targetClass.getMethods().size(); j++) {
						Method targetMethod = targetClass.getMethods()
								.get(j);
						// existem um method na classe, porem eles estao
						// definidos em classes diferentes
						if (targetMethod.getSimpleName().equals(
								sourceMethod.getSimpleName())
								&& sourceMethod.getParameterList().equals(
										targetMethod.getParameterList())) {

							Clazz c1 = mapSourceClasses.get(sourceMethod
									.getDeclaringClass());
							Clazz c2 = mapSourceClasses.get(targetMethod
									.getDeclaringClass());

							Clazz c3 = mapTargetClasses.get(sourceMethod
									.getDeclaringClass());
							Clazz c4 = mapTargetClasses.get(targetMethod
									.getDeclaringClass());

							// a classe do target Žé super da classe do source
							// nas duas hierarquias
							// inclui a class do source no allowedclasses
							if (isSuperClass(c1, c2, mapSourceClasses)
									&& isSuperClass(c3, c4, mapTargetClasses)) {
								if (result.contains(sourceMethod)) {
									int indexOf = result.indexOf(sourceMethod);
									result.get(indexOf)
											.getAllowedClasses()
											.add(sourceMethod
													.getDeclaringClass());
								} else {
									sourceMethod.getAllowedClasses().add(
											sourceMethod.getDeclaringClass());
									result.add(sourceMethod);
								}
							} // o inverso
								// inclui a classe do target no allowed classes
							else if (isSuperClass(c2, c1, mapSourceClasses)
									&& isSuperClass(c4, c3, mapTargetClasses)) {
								sourceMethod.getAllowedClasses().add(
										targetMethod.getDeclaringClass());

								if (result.contains(sourceMethod)) {
									int indexOf = result.indexOf(sourceMethod);
									result.get(indexOf)
											.getAllowedClasses()
											.add(targetMethod
													.getDeclaringClass());
								} else {
									sourceMethod.getAllowedClasses().add(
											targetMethod.getDeclaringClass());
									result.add(sourceMethod);
								}

							}

						}
					}

				} else {
					if (result.contains(sourceMethod)) {
						int indexOf = result.indexOf(sourceMethod);
						result.get(indexOf).getAllowedClasses()
								.add(sourceClass.getFullName());
					} else {
						sourceMethod.getAllowedClasses().add(
								sourceClass.getFullName());
						result.add(sourceMethod);
					}
				}

			}

		}
		return result;
	}

	private Map<String, Clazz> createMapByName(List<Clazz> sourceClasses) {
		Map<String, Clazz> result = new HashMap<String, Clazz>();
		for (Clazz clazz : sourceClasses) {
			result.put(clazz.getFullName(), clazz);
		}
		return result;
	}

	private List<Clazz> getClasses(Project source) throws Exception {

		loadAndAnalyzeProject(source);
		List<Clazz> classes = deserializeClasses();
		return classes;

	}

	private List<Clazz> deserializeClasses() throws IOException,
			ClassNotFoundException {
		// Read from disk using FileInputStream
		FileInputStream f_in = new FileInputStream(
				ProjectAnalyzer.SERIALIZABLE_CLASSES);

		// Read object using ObjectInputStream
		ObjectInputStream obj_in = new ObjectInputStream(f_in);

		// Read an object
		List<Clazz> result = (List<Clazz>) obj_in.readObject();

		return result;
	}

	private void loadAndAnalyzeProject(Project source) throws Exception {
		
		
//		URL buildFile = ReflectionBasedAnalyzer.class
//				.getResource("/build_analyze.xml");

		String path = System.getProperty("user.dir");
		 URL buildFile = null;
			try {
				buildFile = new File(path
						+ "/src/" + "build_analyze.xml").toURL();
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		org.apache.tools.ant.Project p = new org.apache.tools.ant.Project();
		p.setProperty("source", source.getProjectFolder().getAbsolutePath());
		p.setProperty("sourceBin", source.getBuildFolder().getAbsolutePath());
		if (source.getLibFolder() != null)
			p.setProperty("sourceLib", source.getLibFolder().getAbsolutePath());
		else
			p.setProperty("sourceLib", source.getProjectFolder()
					.getAbsolutePath());
		p.setProperty("sourceSrc", source.getSrcFolder().getAbsolutePath());

		DefaultLogger consoleLogger = new DefaultLogger();
		consoleLogger
				.setMessageOutputLevel(org.apache.tools.ant.Project.MSG_INFO);
		
		
		FileOutputStream fileOutputStream = new FileOutputStream(tmpDir  + Constants.SEPARATOR + 	 "log_saferefactor_analysis.txt");
		PrintStream ps = new PrintStream(fileOutputStream);
		consoleLogger.setOutputPrintStream(ps);		
		consoleLogger.setErrorPrintStream(ps);
		p.addBuildListener(consoleLogger);

		p.init();
		ProjectHelper helper = ProjectHelper.getProjectHelper();
		p.addReference("ant.projectHelper", helper);
		helper.parse(p, buildFile);

		p.executeTarget(p.getDefaultTarget());

	}

	private boolean isSuperClass(Clazz c1, Clazz c2, Map<String, Clazz> classes) {
		if (c1 == null || c2 == null)
			return false;
		if (c1.getParent().equals("java.lang.Object"))
			return false;
		if (c1.getParent().equals(c2.getFullName()))
			return true;
		else {
			Clazz c3 = classes.get(c1.getParent());
			return isSuperClass(c3, c2, classes);
		}
	}

	
}
