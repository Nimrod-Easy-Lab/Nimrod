package saferefactor.core.execution;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.tools.ant.DefaultLogger;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.ProjectHelper;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.filter.ElementFilter;
import org.jdom.input.SAXBuilder;

import saferefactor.core.execution.CoverageDataReader.CoverageReport;
import saferefactor.core.util.Constants;
import saferefactor.core.util.ast.ConstructorImp;
import saferefactor.core.util.ast.Method;
import saferefactor.core.util.ast.MethodImp;

public class CoverageMeter {

	private saferefactor.core.util.Project project;
	private String testFolder;
	private CoverageReport coverageReport;
	private String baseFolder;

	public CoverageMeter(saferefactor.core.util.Project project,
			String testFolder) {
		this.project = project;
		this.testFolder = testFolder;
		File tests = new File(testFolder);
		baseFolder = tests.getParent();

	}

	public void checkTestCoverage() throws FileNotFoundException {

		URL buildFile = CoverageMeter.class.getResource("/build_coverage.xml");
		// File buildFile = new File("ant" + "/" + "build_coverage.xml");
		Project p = new Project();

		// propriedades
		p.setProperty("target", project.getProjectFolder().getAbsolutePath());
		p.setProperty("targetBin", project.getBuildFolder().getAbsolutePath());
		p.setProperty("targetSrc", project.getSrcFolder().getAbsolutePath());
		p.setProperty("test.name", "RandoopTest.class");
		if (project.getLibFolder() != null)
			p.setProperty("lib", project.getLibFolder().getAbsolutePath());
		else
			p.setProperty("lib", project.getBuildFolder().getAbsolutePath());
		p.setProperty("tests.folder", testFolder);

		// log do ant no console
		DefaultLogger consoleLogger = new DefaultLogger();
		FileOutputStream fileOutputStream = new FileOutputStream(baseFolder
				+ Constants.SEPARATOR + "log_saferefactor_coverage.txt");
		PrintStream ps = new PrintStream(fileOutputStream);
		consoleLogger.setOutputPrintStream(ps);
		consoleLogger.setErrorPrintStream(ps);
		consoleLogger.setMessageOutputLevel(Project.MSG_INFO);
		p.addBuildListener(consoleLogger);

		// logar em arquivo//
		DefaultLogger consoleLogger2 = new DefaultLogger();
		File f = new File("log_coverage.txt");
		try {
			f.createNewFile();
			FileOutputStream myFile;
			PrintStream myStream;
			myFile = new FileOutputStream("log_coverage.txt");
			myStream = new PrintStream(myFile);
			consoleLogger2.setErrorPrintStream(myStream);
			consoleLogger2.setOutputPrintStream(myStream);
			consoleLogger2.setMessageOutputLevel(Project.MSG_INFO);
			p.addBuildListener(consoleLogger2);
		} catch (IOException ex) {
			Logger.getLogger(CoverageMeter.class.getName()).log(Level.SEVERE,
					null, ex);
		}

		p.init();
		ProjectHelper helper = ProjectHelper.getProjectHelper();
		p.addReference("ant.projectHelper", helper);
		helper.parse(p, buildFile);
		p.executeTarget(p.getDefaultTarget());

		coverageReport = CoverageDataReader.readCoverageData(new File(
				testFolder, "coverage/coverage.xml"));

	}

	public CoverageReport getCoverageReport() {
		return this.coverageReport;
	}

	public static CoverageImpactedMethodReport checkCoverageImpactedMethod(
			List<Method> impactedMethods, File file) throws JDOMException,
			IOException {

		CoverageImpactedMethodReport result = new CoverageImpactedMethodReport();

		List<MethodCoverage> MethodCoveredByTests = extractMethodsCoveredByTests(file);

		double totalImpactedMethods = impactedMethods.size();
		double totalCoveredMethods = 0;

		for (Method method : impactedMethods) {


	

//			boolean found = false;
			for (MethodCoverage methodCoverage : MethodCoveredByTests) {
				if (method.equals(methodCoverage.getMethod())) {
//					found = true;
					if (methodCoverage.getLine_rate() > 1) 
						totalCoveredMethods++;
					break;
				}
			}
//			if (!found)
//				System.out.println("methodNotFound: " + method.getDeclaringClass() + "." + method.getSimpleName());
		}
		result.setMethodCoverage(totalCoveredMethods / totalImpactedMethods);

		return result;
	}

	private static List<MethodCoverage> extractMethodsCoveredByTests(File file)
			throws JDOMException, IOException {

		List<MethodCoverage> MethodCoveredByTests = new ArrayList<MethodCoverage>();

		Document doc = null;

		SAXBuilder builder = new SAXBuilder();
		try {
			doc = builder.build(file.getAbsolutePath());
		} catch (Exception e) {
			e.printStackTrace();
		}

		Element root = doc.getRootElement();

		Iterator packages = root.getDescendants(new ElementFilter("package"));
		while (packages.hasNext()) {
			Object nextPack = packages.next();
			if (nextPack instanceof Element) {
				String packageName = ((Element) nextPack).getAttribute("name")
						.getValue();
				Iterator classes = ((Element) nextPack)
						.getDescendants(new ElementFilter("class"));
				while (classes.hasNext()) {

					Object next = classes.next();
					if (next instanceof Element) {
						String className = ((Element) next)
								.getAttribute("name").getValue();

						Iterator methodNodes = ((Element) next)
								.getDescendants(new ElementFilter("method"));
						while (methodNodes.hasNext()) {
							Object nextMethod = methodNodes.next();
							if (nextMethod instanceof Element) {
								String line = "";
								Iterator coverageNodes = ((Element) next)
										.getDescendants(new ElementFilter(
												"coverage"));
								while (coverageNodes.hasNext()) {
									Object nextCoverage = coverageNodes.next();
									if (nextCoverage instanceof Element) {
										String coverage = ((Element) nextCoverage)
												.getAttribute("type")
												.getValue();
										if (coverage.equals("method, %")) {
											line = ((Element) nextCoverage)
													.getAttribute("value")
													.getValue();
										}
									}
								}
								String methodName = ((Element) nextMethod)
										.getAttribute("name").getValue();

								// TODO hack to avoid aspects
								if (className.equals("Asp"))
									continue;
								if (methodName.equals("<static initializer>"))
									continue;
								if (methodName.contains("$"))
									continue;

								String[] split = methodName.split(" ");
								String simpleName = split[0];

								if (simpleName.equals(className)) {
									simpleName = "<init>";
								}
								String parameters = "";
								if (methodName.contains("("))
									parameters = methodName.substring(
											methodName.indexOf("(") + 1,
											methodName.indexOf(")"));
								String fullName = "";
								if (packageName.equals("default package")) {
									fullName = className + "." + simpleName;
								} else {
									fullName = packageName + "." + className
											+ "." + simpleName;
								}

								if (line.length() == 0)
									continue;
								line = line.substring(0, line.indexOf("%"));
								MethodCoverage mc = new MethodCoverage();
								Method method;
								if (simpleName.equals("<init>")) {
									method = new ConstructorImp();
									if (packageName.equals("default package"))
										method.setSimpleName(className);
									else
										method.setSimpleName(packageName + "."
												+ className);

								} else {
									method = new MethodImp();
									method.setSimpleName(simpleName);
								}
								List<String> parameterList = new ArrayList<String>();
								if (!parameters.equals("")) {
									String[] parameterArray = parameters
											.split(", ");
									for (String parameter : parameterArray) {
										//TODO hack
										if (parameter.equals("String"))
											parameter = "java.lang.String";
										parameterList.add(parameter);
									}
								}
								method.setParameterList(parameterList);
								if (packageName.equals("default package"))
									method.setDeclaringClass(className);
								else
									method.setDeclaringClass(packageName + "."
											+ className);
								mc.setMethod(method);
								mc.setLine_rate(Integer.parseInt(line));
								// System.out.println(fullName + " "
								// + Integer.parseInt(line));
								MethodCoveredByTests.add(mc);
							}
						}
					}
				}
			}
		}
		return MethodCoveredByTests;
	}

	public void checkTestCoverage(String testName) throws FileNotFoundException {
		URL buildFile = CoverageMeter.class.getResource("/build_coverage.xml");
		// File buildFile = new File("ant" + "/" + "build_coverage.xml");
		Project p = new Project();

		// propriedades
		p.setProperty("target", project.getProjectFolder().getAbsolutePath());
		p.setProperty("targetBin", project.getBuildFolder().getAbsolutePath());
		p.setProperty("targetSrc", project.getSrcFolder().getAbsolutePath());
		p.setProperty("test.name", testName);
		if (project.getLibFolder() != null)
			p.setProperty("lib", project.getLibFolder().getAbsolutePath());
		else
			p.setProperty("lib", project.getBuildFolder().getAbsolutePath());
		p.setProperty("tests.folder", testFolder);

		// log do ant no console
		DefaultLogger consoleLogger = new DefaultLogger();
		FileOutputStream fileOutputStream = new FileOutputStream(baseFolder
				+ Constants.SEPARATOR + "log_saferefactor_coverage.txt");
		PrintStream ps = new PrintStream(fileOutputStream);
		consoleLogger.setOutputPrintStream(ps);
		consoleLogger.setErrorPrintStream(ps);
		consoleLogger.setMessageOutputLevel(Project.MSG_INFO);
		p.addBuildListener(consoleLogger);

		// logar em arquivo//
		DefaultLogger consoleLogger2 = new DefaultLogger();
		File f = new File("log_coverage.txt");
		try {
			f.createNewFile();
			FileOutputStream myFile;
			PrintStream myStream;
			myFile = new FileOutputStream("log_coverage.txt");
			myStream = new PrintStream(myFile);
			consoleLogger2.setErrorPrintStream(myStream);
			consoleLogger2.setOutputPrintStream(myStream);
			consoleLogger2.setMessageOutputLevel(Project.MSG_INFO);
			p.addBuildListener(consoleLogger2);
		} catch (IOException ex) {
			Logger.getLogger(CoverageMeter.class.getName()).log(Level.SEVERE,
					null, ex);
		}

		p.init();
		ProjectHelper helper = ProjectHelper.getProjectHelper();
		p.addReference("ant.projectHelper", helper);
		helper.parse(p, buildFile);
		p.executeTarget(p.getDefaultTarget());

		coverageReport = CoverageDataReader.readCoverageData(new File(
				testFolder, "coverage/coverage.xml"));

	}

}
