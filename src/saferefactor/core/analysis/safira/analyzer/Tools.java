package saferefactor.core.analysis.safira.analyzer;
import io.InputManager;
import io.InputManagerASCII;
import io.OutputManager;
import io.OutputManagerASCII;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

import saferefactor.core.analysis.safira.Constants;

import saferefactor.core.analysis.safira.entity.Class;
import saferefactor.core.analysis.safira.entity.Field;
import saferefactor.core.analysis.safira.entity.Method;


public class Tools {
	
	
	public static final String PUBLIC = "PUBLIC";
	public static final String PRIVATE = "PRIVATE";
	public static final String PROTECTED = "PROTECTED";
	public static final String PACKAGE = "PACKAGE";
	public static String cep = System.getProperty("file.separator");
	public static final String INNER_CLASS_CHARACTER = "$";
	public static final String INTERFACE = "interface";
	public static final String STATIC = "static";
	public static final String FINAL = "final";
	public static final String ABSTRACT = "abstract";
	public static final String array = "[";
	public static final String DOUBLE = "double";
	public static final String FLOAT = "float";
	public static final String INT = "int";
	public static final String SHORT = "short";
	public static final String BYTE = "byte";
	public static final String LONG = "long";

	
	public static String extractSimpleName(String path) {
		
		int pos = 0;
		while (pos>=0) {
			pos = path.indexOf(cep);
			path = path.substring(pos+1);
		}
		return path;
		
	}
	
	public static List<Method> putClassinMethods(List<Method> list,Class c) {
		
		for (Method method : list) {
			method.setC(c);
			method.setDeclaringClass(c);
			method.doSignatureRandoop();
		}
		return list;
	}
	
	public static boolean isTypeEquivalent(String type1, String type2) {
		if (type1.equals(SHORT) || type1.equals(LONG) || type1.equals(DOUBLE) ||
				type1.equals(INT) || type1.equals(FLOAT) || type1.equals(BYTE)) {
			if (type2.equals(SHORT) || type2.equals(LONG) || type2.equals(DOUBLE) ||
					type2.equals(INT) || type2.equals(FLOAT) || type2.equals(BYTE)) {
				return true;
			}
		}
		return false;
	}
	
	
	public static void copyTests(String from, String to) throws IOException {
		File dir = new File (from);
		String[] listDir = dir.list();
		for (String test : listDir) {
			if (test.contains("RandoopTest")) {
				FileChannel oriChannel = new FileInputStream(from+Constants.FILE_SEPARATOR+test).getChannel();
				FileChannel destChannel = new FileOutputStream(to+Constants.FILE_SEPARATOR+test).getChannel();;
				// Copia conteœdo da origem no destino
				destChannel.transferFrom(oriChannel, 0, oriChannel.size());
				// Fecha channels
				oriChannel.close();
				destChannel.close();
			}
		}
	}
	
	public static void deleteTestsAndAspect(String dir) {
		File f = new File(dir);
	
		String[] listDir = f.list();
		for (String file : listDir) {
			if (file.contains("RandoopTest")) {
				File test = new File(dir +Constants.FILE_SEPARATOR+file);
				if (test.exists()) {
					test.delete();
				}
			} 
		}
		
	}

	public static String getImpactedMethods(HashMap<String, Method> ims,HashMap<String, Method> imt, List<String> list) {
		
		StringBuffer impactedList = new StringBuffer();
		HashMap<String, String> l = new HashMap<String, String>();
		Collection<Method> imsM = ims.values();
		Collection<Method> imsT = imt.values();
		
		for (Method method : imsT) {
			String name = method.getFullName().replaceAll(" ", "");
			if (l.get(name) == null) {
				l.put(name, name);
				impactedList.append(name+" ");
			}
			
		}
		
		for (Method method : imsM) {
			String name = method.getFullName().replaceAll(" ", "");
			if (l.get(name) == null) {
				l.put(name, name);
				impactedList.append(name+" ");
			}
		}
		return impactedList.toString();
	}
	
	public static void saveMethods(HashMap<String, Method> ims,HashMap<String, Method> imt, List<String> list) throws IOException {
		OutputManager out = new OutputManagerASCII(Tools.getAspectPath() +"impact.txt");
		out.createFile();
		HashMap<String, String> l = new HashMap<String, String>();
		Collection<Method> imsM = ims.values();
		Collection<Method> imsT = imt.values();
		
		for (Method method : imsT) {
			String name = method.getFullName().replaceAll(" ", "");;
			if (l.get(name) == null) {
				l.put(name, name);
				out.writeLine(name);
			}
			
		}
		
		for (Method method : imsM) {
			String name = method.getFullName().replaceAll(" ", "");;
			if (l.get(name) == null) {
				l.put(name, name);
				out.writeLine(name);
			}
		}
			
	
		out.closeFile();
	}
	
	public static Method getMethod(List<Method> methods, String name, String parameters) {
		
		for (Method method : methods) {
			if (method.getSimpleName().equals(name) && 
					method.getParametersSignature().equals(parameters)) {
				return method;
			}
		}
		return null;
	}
	
	public static Field getField(List<Field> fields, String name) {
		
		for (Field field : fields) {
			if (field.getSimpleName().equals(name)) {
				return field;
			}
		}
		return null;
	}
	
	public static String extractOpcodes(int access) {
		
		if ( (access & Opcodes.ACC_INTERFACE) != 0 ) {
			return INTERFACE;
		}
		if ( (access & Opcodes.ACC_ABSTRACT) != 0 ) {
			return ABSTRACT;
		}
		if ( (access & Opcodes.ACC_STATIC) != 0 ) {
			return STATIC;
		}
		if ( (access & Opcodes.ACC_FINAL) != 0 ) {
			return FINAL;
		}
		return "";
	}
	
	public static List<Field> putClassInFields(List<Field> list, Class c) {
		
	
		for (Field field : list) {
			field.setC(c);
			field.setDeclaringClass(c);
		}
		return list;
	}
	
	
//	public static String removeDollar(String name) {
//		 
//		if (name.contains("$1")) 
//	        	name = name.replace("$1", "");
//	        
//		if (name.contains("$2"))
//	        		name = name.replace("$2", "");
//	     
//	            	if (name.contains("$3"))
//	            		name = name.replace("$3", "");
//	     
//	                	if (name.contains("$4"))
//	                		name = name.replace("$4", "");
//	     
//	                    	if (name.contains("$5"))
//	                    		name = name.replace("$5", "");
//	     
//	                        	if (name.contains("$6"))
//	                        		name = name.replace("$6", "");
//	     
//	                            	if (name.contains("$7"))
//	                            		name = name.replace("$7", "");
//	     
//	                                	if (name.contains("$8"))
//	                                		name = name.replace("$8", "");
//	     
//	                                    	if (name.contains("$9"))
//	                                    		name = name.replace("$9", "");
//	     
//	                                        	if (name.contains("$0"))
//	                                        		name = name.replace("$0", "");
//	                                        
//	        name = name.replace("$", ".");
//	        return name;
//	}
	
	public static String getParametersSignature(List<String> argumentTypes) {
		
		//depois saber se tira o nome completo dos tipos
		//ex: ele esta voltando: java.lang.String
		
		String parameters = "";
		for (int i = 0; i < argumentTypes.size(); i++) {
			parameters+= argumentTypes.get(i) + ", ";
		}
		if (!parameters.equals("")) {
			parameters = parameters.substring(0,parameters.length()-2);
		}
		return parameters;
	}
	
	public static List<String> getParameters(Type[] argumentTypes) {
		
		List<String> result = new ArrayList<String>();
		for (int i = 0; i < argumentTypes.length; i++) {
			if (argumentTypes[i].toString().contains(array))
				result.add(argumentTypes[i].toString().replace(cep, ".").replace(INNER_CLASS_CHARACTER, "."));
			else
				result.add(argumentTypes[i].getClassName());
			
		}
		return result;
	}
	
	public static String extractVisibility(int access) {
		
		if ((access & Opcodes.ACC_PUBLIC) != 0) {
			return PUBLIC;
		} else if ((access & Opcodes.ACC_PRIVATE) != 0) {
			return PRIVATE;
		} else if ((access & Opcodes.ACC_PROTECTED) != 0) {
			return PROTECTED;
		} else {
			return PACKAGE;
		}
	}
	
	public static String getAspectPath() throws IOException {
		
		String path = System.getProperty("user.dir") + Constants.FILE_SEPARATOR+ "aspect"+
		Constants.FILE_SEPARATOR + "aspect.properties";
		InputManager out = new InputManagerASCII(path);
		out.openFile();
		String aspectPath = "";
		while (!out.isEndOfFile()) {
			aspectPath = out.readLine();
			break;
		}
		return aspectPath;
		
	}
	
	public static String getBinPath(String path, String bin) {
		
		File f = new File(path);
		if (f.isDirectory()) {
			String[] list = f.list();
			for (String string : list) {
				if ((string).equals(bin)) {
//				if ((path+"/"+string).contains(bin)) {
//				if (string.equals("bin")) {
					return path+"/"+string;
				} else {
					if (new File(path+"/"+string).isDirectory() && !string.startsWith("."))
						return getBinPath(path+"/"+string, bin);
				}
			}
		}
		
		return null;

	}
	
	public static void teste() {
		System.out.println("okkkkk");
	}
}
