package saferefactor.core.analysis.analyzer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

import saferefactor.core.util.ast.Clazz;
import saferefactor.core.util.ast.ConstructorImp;
import saferefactor.core.util.ast.MethodImp;

public class ProjectAnalyzer {

	static final String SERIALIZABLE_CLASSES = System
			.getProperty("java.io.tmpdir") + "/" + "classes.data";

	private static void serializeClassesInfo(String binPath)
			throws ClassNotFoundException, IOException {

		List<Clazz> classes = analyzeClasses(binPath);

		FileOutputStream f_out = new FileOutputStream(SERIALIZABLE_CLASSES);

		// Write object with ObjectOutputStream
		ObjectOutputStream obj_out = new ObjectOutputStream(f_out);

		// Write object out to disk
		obj_out.writeObject(classes);

	}

	private static List<Clazz> analyzeClasses(String sourcePath)
			throws ClassNotFoundException {

		List<Clazz> result = new ArrayList<Clazz>();

		List<String> listClassNames = listClassNames(sourcePath, "");

		List<String> uncheckedClasses = new ArrayList<String>();

		for (String className : listClassNames) {
			
			//hack jhotdraw
			if (className.equals("CH.ifa.draw.contrib.TriangleRotationHandle"))continue;
			if (className.contains("UndoActivity")) continue;

			// TODO: hack for BerkeleyDB. Make it generic.
			if (className.equals("com.memorybudget.MemoryBudget"))
				continue;
			if (className.equals("com.sleepycat.je.log.LogManager"))
				continue;
			if (className.equals("com.sleepycat.je.log.SyncedLogManager"))
				continue;
			
			if (className.equals("com.atlassw.tools.eclipse.checkstyle.util.table.EnhancedCheckBoxTableViewer"))
				continue;
			if (className.equals("com.atlassw.tools.eclipse.checkstyle.util.table.EnhancedTableViewer"))
				continue;
			if (className.equals("com.atlassw.tools.eclipse.checkstyle.config.configtypes.ConfigurationTypes"))
				continue;
			if (className.equals("com.atlassw.tools.eclipse.checkstyle.config.meta.MetadataFactory"))
				continue;
			if (className.equals("com.atlassw.tools.eclipse.checkstyle.projectconfig.PluginFilters"))
				continue;
			if (className.equals("com.atlassw.tools.eclipse.checkstyle.config.CheckConfigurationFactory"))
				continue;
			if (className.equals("com.atlassw.tools.eclipse.checkstyle.util.CheckstyleLog"))
				continue;				
			if (className.equals("com.atlassw.tools.eclipse.checkstyle.config.savefilter.SaveFilters"))
				continue;

			// jedit
			if (className.equals("org.gjt.sp.jedit.menu.EnhancedMenuItem"))
				continue;
			if (className.equals("org.gjt.sp.jedit.io.FileRootsVFS"))
				continue;
			if (className.equals("org.gjt.sp.jedit.io.FileRootsVFS"))
				continue;
			if (className.equals("doclet.GenerateTocXML"))
				continue;
			if (className.equals("installer.ConsoleInstall"))
				continue;

			// System.out.println("Class: " + className);
			try {
				Class<?> c = Class.forName(className);

				if (className
						.equals("org.apache.commons.collections.iterators.AbstractEmptyMapIterator")) {
					System.out.println("N�o teve problema!!!!!!!!!!!!!!: ");
				}

				// nao considera interface
				if (c.isInterface())
					continue;

				// nao considera classe abstrata
				int modifiers = c.getModifiers();

				// nao considera classe nao publica
				if (!Modifier.isPublic(modifiers))
					continue;

				Clazz sc = new Clazz();
				sc.setFullName(c.getName());
				sc.setParent(c.getSuperclass().getName());

				Constructor<?>[] constructors = c.getConstructors();
				List<ConstructorImp> sconsList = new ArrayList<ConstructorImp>(
						constructors.length);

				if (!Modifier.isAbstract(modifiers))
					for (Constructor<?> constructor : constructors) {
						ConstructorImp scons = new ConstructorImp();
						scons.setDeclaringClass(constructor.getDeclaringClass()
								.getName());
						scons.setSimpleName(constructor.getName());

						Class<?>[] parameterTypes = constructor
								.getParameterTypes();
						List<String> parameters = new ArrayList<String>(
								parameterTypes.length);
						boolean addMethod = true;
						for (Class<?> param : parameterTypes) {

							if (param.getName().equals(
									"com.memorybudget.MemoryBudget"))
								addMethod = false;
							if (param.getName().equals(
									"com.sleepycat.je.log.LogManager"))
								addMethod = false;
							if (param.getName().equals(
									"com.sleepycat.je.log.SyncedLogManager"))
								addMethod = false;
							parameters.add(param.getName());
						}
						scons.setParameterList(parameters);
						if (addMethod)
							sconsList.add(scons);
					}
				sc.setConstructors(sconsList);

				Method[] methods = c.getMethods();
				List<MethodImp> smList = new ArrayList<MethodImp>(
						methods.length);
				for (Method method : methods) {

					if (method.getDeclaringClass().getName()
							.equals("java.lang.Object"))
						continue;

					if (method.getDeclaringClass().getName()
							.equals("java.util.ArrayList"))
						continue;

					
					//hack jhotdraw ao
					if (method.getDeclaringClass().getName().contains("AbstractJavaEditorTextHover"))
						continue;
					//hack jhotdraw
					if (method.getReturnType().getName().endsWith("UndoActivity")) 
						continue;
					if (method.getName().equals("set") && className.equals("org.jhotdraw.geom.BezierPath")) 
						continue;
					if (method.getName().equals("set")) continue;
					if (method.getName().equals("add")) continue;
					if (method.getName().equals("addAll")) continue;
					
					if(method.getDeclaringClass().getName().equals("java.util.ArrayList"))
						continue;
					if(method.getDeclaringClass().getName().equals("java.util.HashSet"))
						continue;
					

					// hack para o collections

					if (method.getName().equals("transformingMap")
							&& className
									.equals("org.apache.commons.collections.splitmap.TransformedMap"))
						continue;

					if (method.getName().equals("uniqueIndexedCollection")
							&& className
									.equals("org.apache.commons.collections.IndexedCollection"))
						continue;
					if (method.getName().equals("decorate")
							&& className
									.equals("org.apache.commons.collections.splitmap.TransformedMap"))
						continue;

					if (method.getName().equals("defaultedMap")
							&& className
									.equals("org.apache.commons.collections.map.DefaultedMap"))
						continue;

					if (method.getName().equals("decorate")
							&& className
									.equals("org.apache.commons.collections.map.DefaultedMap"))
						continue;

					// boolean hasGenericParam = false;
					// Type[] genericParameterTypes = method
					// .getGenericParameterTypes();
					//
					// for (Type type : genericParameterTypes) {
					//
					// if (type instanceof ParameterizedType) {
					// System.out.println(type);
					// hasGenericParam = true;
					// break;
					// }
					// }
					// if (hasGenericParam)
					// continue;

					MethodImp sm = new MethodImp();
					sm.setDeclaringClass(method.getDeclaringClass().getName());
					sm.setSimpleName(method.getName());
					Class<?>[] parameterTypes = method.getParameterTypes();
					List<String> parameters = new ArrayList<String>(
							parameterTypes.length);

					boolean addMethod = true;
					for (Class<?> param : parameterTypes) {

						// TODO: hack for BerkeleyDB. Make it generic.
						if (param.getName().equals(
								"com.memorybudget.MemoryBudget"))
							addMethod = false;
						if (param.getName().equals(
								"com.sleepycat.je.log.LogManager"))
							addMethod = false;
						if (param.getName().equals(
								"com.sleepycat.je.log.SyncedLogManager"))
							addMethod = false;

						// jedit
						if (param.getName().equals("com.sun.javadoc.RootDoc"))
							addMethod = false;

						parameters.add(param.getName());
					}
					sm.setParameterList(parameters);
					if (addMethod)
						smList.add(sm);

				}
				sc.setMethods(smList);
				result.add(sc);

			} catch (ExceptionInInitializerError e) {
				uncheckedClasses.add(className);
				e.printStackTrace();
			} catch (java.lang.NoClassDefFoundError e) {
				uncheckedClasses.add(className);
				e.printStackTrace();
			}
			catch (VerifyError e) {
				uncheckedClasses.add(className);
				e.printStackTrace();
			}
		}

		System.out
				.println("Classes that throw exception and will be not included in the tests: ");
		for (String classe : uncheckedClasses) {
			System.out.println(classe);
		}
		// TODO fazer result filter para remover classes que lan�aram exce��o
		// result = resultFilter(result, uncheckedClasses);
		return result;

	}

	private static List<String> listClassNames(String path, String base) {

		
		List<String> result = new ArrayList<String>();

		File dir = new File(path);

		if (!dir.exists()) {
			throw new RuntimeException("Dir " + dir.getAbsolutePath()
					+ " does not exist.");
		}

		File[] arquivos = dir.listFiles();

		int tam = arquivos.length;

		for (int i = 0; i < tam; i++) {

			if (arquivos[i].isDirectory()) {

				// we add the subdirectories
				String baseTemp = base + arquivos[i].getName() + ".";
				result.addAll(listClassNames(arquivos[i].getAbsolutePath(),
						baseTemp));

			} else {

				if (arquivos[i].getName().endsWith(".class")
						&& !arquivos[i].getName().equals(
								"SVGStorageFormat.class")) {

					String temp = base + arquivos[i].getName();
					temp = trataNome(temp);

					if (!result.contains(temp))
						result.add(temp);
				}
			}
		}
		

		return result;
	}

	private static String trataNome(String arquivo) {
		arquivo = arquivo.replaceAll(".class\\b", "");
		return arquivo;
	}

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		String binPath = args[0];

		serializeClassesInfo(binPath);

	}

}
