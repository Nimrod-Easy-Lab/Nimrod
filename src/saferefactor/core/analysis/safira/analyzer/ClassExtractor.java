package saferefactor.core.analysis.safira.analyzer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.util.TraceClassVisitor;
import org.objectweb.asm.util.TraceFieldVisitor;
import org.objectweb.asm.util.TraceMethodVisitor;

import saferefactor.core.analysis.safira.visitor.ClassNode;
import saferefactor.core.analysis.safira.entity.Class;
import saferefactor.core.analysis.safira.entity.Field;
import saferefactor.core.analysis.safira.entity.Method;

public class ClassExtractor {
	
	HashMap<String, Class> classes = new HashMap<String, Class>();
	
	
	public void processClass(String classFilePath) throws IOException {
		URLClassLoader classLoader = new URLClassLoader(
				new URL[] { new File(classFilePath).toURL() });
		//classFilePath = removeDirectoryName(classFilePath);
		processClass(classFilePath, classLoader);
	}
	
//	private String removeDirectoryName(String fileName) {
//		int pos = fileName.indexOf(Tools.cep);
//
//		
//		if (pos > 0) {
//
//			return fileName.substring(pos + 1);
//
//		}
//
//		return "";
//
//	}
	
	public void processClass(String className, URLClassLoader loader) throws IOException {
		
		if (className.contains("Test")) {
//			System.out.println();
		}
		String toPut = className.replace(".class", "");

		InputStream in = loader.getResourceAsStream(toPut.replace('.',File.separatorChar) + ".class");

		if (in == null)	in = new FileInputStream(new File(className).getAbsoluteFile());
		ClassReader cr = new ClassReader(in);
				
		TraceClassVisitor tc = new TraceClassVisitor(
				new PrintWriter( System.out ));

		ClassNode cv = new ClassNode();
		cr.accept(cv, 0);
		cr.accept(tc, 0);
		String name = cv.c.getFullName();
		
		//tirando as classes anonimas: rever isso.
		if (!(name.contains(".1") || name.contains(".2") || name.contains(".3") || name.contains(".4") || name.contains(".5") ||
				name.contains(".6") || name.contains(".7") || name.contains(".8") || name.contains(".9"))) {
			Class c = cv.c;
			List<Method> methods = c.getMethods();
			methods.addAll(c.getConstructors());
			List<TraceMethodVisitor> traceMethods = tc.traceMethods;
			for (TraceMethodVisitor traceMethodVisitor : traceMethods) {
				Method method = 
					Tools.getMethod(methods, traceMethodVisitor.name, traceMethodVisitor.parameters);
				if (method != null) {
					method.setText(traceMethodVisitor.text);
				}
				
			}
			List<Field> fields = c.getFields();
			List<TraceFieldVisitor> traceFields = tc.traceFields;
			for (TraceFieldVisitor traceFieldVisitor : traceFields) {
				Field field = Tools.getField(fields, traceFieldVisitor.name);
				if (field != null) {
					field.setText(traceFieldVisitor.text);
				}
			}
			classes.put(cv.c.getFullName(), cv.c);
		}
			
		in.close();
	}
	

	
	public void processDir(String binPath) throws IOException {
//		System.out.println(binPath);
		if (binPath != null) {
			File f = new File(binPath);
			String[] list = f.list();
			for (String c : list) {
//				if (c.endsWith(".class")) {
				//apenas para o experimento----------------------------------
				//DESCOMENTAR
				if (c.endsWith(".class") && !c.contains("coverage")&& !c.contains("tests") && !c.contains("Randoop") && !c.contains("asm")) {
//				if (c.endsWith(".class") && !c.contains("coverage") && !c.contains("randoop") && !c.contains("asm")) {
					//System.out.println(binPath +"/"+ c);
					processClass(binPath +"/"+ c);
//					System.out.println(binPath +"/"+ c);
				} else {
				//DESCOMENTAR
					if (new File(binPath +"/"+ c).isDirectory() && !c.startsWith(".") && !c.contains("tests") && !c.contains("Randoop") && !c.contains("asm"))
						processDir(binPath +"/"+ c);
				}
			}
		}
		
	}

	public HashMap<String, Class> getClasses() {
		return classes;
	}

	public void setClasses(HashMap<String, Class> classes) {
		this.classes = classes;
	}
	
//	public void cleanClasses() {
//		this.classes = new ArrayList<Class>();
//	}
}
