package saferefactor.core.analysis.safira.analyzer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import saferefactor.core.analysis.safira.analyzer.Tools;

//import saferefactor.Constants;


import saferefactor.core.analysis.safira.entity.Class;
import saferefactor.core.analysis.safira.entity.*;
//import executor.SRImpact;

public class ImpactAnalysis {
	
	private HashMap<String, Class> sourceClasses = new HashMap<String, Class>();
	private HashMap<String, Class> targetClasses = new HashMap<String, Class>();
	
	private HashMap<String, Method> sourceMethods = new HashMap<String, Method>();


	private HashMap<String,Method> targetMethods = new HashMap<String,Method>();
	
	private List<Method> newMethods = new ArrayList<Method>();
	private List<Method> removedMethods = new ArrayList<Method>();
	
	private HashMap<String, Field> sourceFields = new HashMap<String, Field>();
	private HashMap<String, Field> targetFields = new HashMap<String, Field>();
	
	private List<Field> newFields = new ArrayList<Field>();
	private List<Field> removedFields = new ArrayList<Field>();
	
	private List<Method> changedMethods = new ArrayList<Method>();
	private List<Field> changedFields = new ArrayList<Field>();
	
	private List<String> fileIntersection = new ArrayList<String>();
	
	private List<Method> gets = new ArrayList<Method>();
	//---------------so pode ter metodo do source------------------
	private HashMap<String, Method> listIntersection = new HashMap<String, Method>();
	
	private HashMap<String, Method> exitList = new HashMap<String, Method>();
	
	private List<String> impactedFields = new ArrayList<String>();
	
	//metodos em comum impactados (target)
	private List<Method> listIntersectionTarget = new ArrayList<Method>();
	//métodos impactados (target)
	private HashMap<String, Method> impactedMethodsTarget = new HashMap<String, Method>();
	//métodos impactados (source)
	private HashMap<String, Method> impactedMethodsSource = new HashMap<String, Method>();

	
	//public Map<Method,Method> commonMethods = new HashMap<Method,Method>();
	/**
	 * target, source
	 */
	//private Map<Method,Method> commonMethodsTS = new HashMap<Method,Method>();
	private Map<Field, Field> commonFields = new HashMap<Field, Field>();
	
	private Map<String, Class> classes = new HashMap<String, Class>();
	
	private Map<String, String> types = new HashMap<String, String>();
	
	private Map<String, List<Class>> interfaces = new HashMap<String, List<Class>>();
	
	public String sourcePath;
	public String targetPath;
	
	String bin = "bin";
	String testPath;
	private int methodsToGenerateTests;
	private int impactedMethods;
	public String removeMethod = "";
	
	private HashMap<String,Method> fileIntersectionAux;
	
	String impactedList = "";
	
	List<saferefactor.core.util.ast.Method> methods_to_test = new ArrayList<saferefactor.core.util.ast.Method>();
	
	public ImpactAnalysis(String sourcePath, String targetPath, String bin) throws IOException {
		this.bin = bin;
		this.init(sourcePath, targetPath);
		
	}
	
	public ImpactAnalysis(String sourcePath, String targetPath, String bin, String removeMethod) throws IOException {
		this.bin = bin;
		this.removeMethod = removeMethod;
		this.init(sourcePath, targetPath);
		
	}
	
	public ImpactAnalysis(String testPath) throws IOException {
		this.sourcePath = testPath;
		getSourceClasses();
		walkingInASourceProgram();
		getSourceMethods();
	}

	private void init(String sourcePath, String targetPath) throws IOException {
		
		this.sourcePath = sourcePath;
		this.targetPath = targetPath;
		
		getSourceClasses();
		getTargetClasses();	
		
		initializeTypes();
		
		putAllInterfaces(sourceClasses);
		putAllInterfaces(targetClasses);
		
		walkingInASourceProgram();
		walkingInATargetProgram();
		

		
		getSourceMethods();
		getTargetMethods();
		
		getSourceFields();
		getTargetFields();
		
		makeSourceGraph();
		makeTargetGraph();
		
		
		getNewMethods();
		getRemovedMethods();
		getNewField();
		getRemovedField();
		getChangedFields();
		
		getChangedMethods();
		
		putInFileIntersection();
//		print();
		
		impactedList = Tools.getImpactedMethods(getImpactedMethodsSource(), getImpactedMethodsTarget(), getFileIntersection());
	}
	
	private void makeTargetGraph() {
		ArrayList<Method> tm= new ArrayList<Method>();
		tm.addAll(targetMethods.values());
		
		for (Method m : tm) {
			if (!m.isInherited()) {
				if (containsMethodNotInherited(sourceMethods, m) == null) {
					newMethods.add(m);
				}
			}
			targetMethods = makeGraph(targetMethods, m);
		}
	}

	private void makeSourceGraph() {
		ArrayList<Method> sm= new ArrayList<Method>();
		sm.addAll(sourceMethods.values());
		ArrayList<Method> tm= new ArrayList<Method>();
		tm.addAll(targetMethods.values());
		
		for (Method m : sm) {
			if (!m.isInherited()) {
				if (containsMethodNotInherited(targetMethods, m) == null) {
					
					removedMethods.add(m);
				}
			}
			
			sourceMethods = makeGraph(sourceMethods, m);
		}
		
	}

	private void initializeTypes() {
		
		types.put("long", "");
		types.put("int", "");
		types.put("short", "");
		types.put("double", "");
		types.put("float", "");
		types.put("char", "");
		
	}
	
	private void putAllInterfaces(HashMap<String,Class> classes) {
		
		for (Class c : classes.values()) {
			addInterface(classes, c, c);
		}
		
	}
	
	private void addInterfaceHashMap(Class c, String interf) {
		if (interfaces.get(interf) == null) {
			List<Class> classes = new ArrayList<Class>();
			classes.add(c);
			interfaces.put(interf, classes);
		} else {
			interfaces.get(interf).add(c);
		}
	}
	
	private void addInterface(HashMap<String,Class> classes,  Class c, Class interfac) {
		
		List<String> interfaces = new ArrayList<String>();
			
		interfaces.addAll(interfac.getInterfaces());
		
		for (String interf : interfaces) {
			Class i = classes.get(interf);
			if (i != null) {
				addInterfaceHashMap(c, interf);
				List<String> interfaces2 = i.getInterfaces();
				for (String i2 : interfaces2) {
					Class interface2 = classes.get(i2);
					if (interface2 != null && !c.getInterfaces().contains(i2)) {
						c.addInterface(i2);
						addInterfaceHashMap(c, i2);
						addInterface(classes, c, interface2);
					}
				}
			}
		}
	}
	
	private void getSourceClasses() throws IOException {
		
		ClassExtractor ce = new ClassExtractor();
		String binPath = Tools.getBinPath(sourcePath, bin);
		if (binPath == null) {
			binPath = sourcePath;
		}
		ce.processDir(binPath);
		sourceClasses = ce.getClasses();
	
	}
	
	private void getTargetClasses() throws IOException {
		
		ClassExtractor ce = new ClassExtractor();
		String binPath = Tools.getBinPath(targetPath, bin);
		if (binPath == null) {
			binPath = targetPath;
		}
		ce.processDir(binPath);
		targetClasses = ce.getClasses();
		
	}
	
	public void walkingInASourceProgram() {
		
		Hierarchy h = new Hierarchy(sourceClasses, interfaces);
		for (Class sc : sourceClasses.values()) {
			h.setC(sc);
			h.putC();
		}
		sourceClasses = h.getClasses();
		
		fixMetAndFieldSource();
		
		//seta os methodInv que são do tipo This.
		for (Class sc : sourceClasses.values()) {
			List<Method> methods = sc.getMethods();
			for (Method method : methods) {
				List<Method> methodInvoc = method.getMethodInvoc();
				for (Method mi : methodInvoc) {
					
					//Colocar o This
					if (mi.getClassFullName().equals(sc.getFullName())) {
						mi.setThis(true);
					} else {
						
						Method m = containsMethod(methods, mi.getSimpleName(), mi.getParametersSignature());
						if (m != null) {
							if (m.isInherited() == true && m.getDeclaringClass().getFullName().equals(mi.getClassFullName())) {
								mi.setThis(true);
							}
						}
					}	
				}
			}
		}
		
	}
	
	private void walkingInATargetProgram() {
	
		Hierarchy h = new Hierarchy(targetClasses, interfaces);
		for (Class sc : targetClasses.values()) {
			h.setC(sc);
			h.putC();
		}
		targetClasses = h.getClasses();
		
		
		fixMetAndFieldTarget();
		//seta os methodInv que são do tipo This.
		for (Class sc : targetClasses.values()) {
			List<Method> methods = sc.getMethods();
			for (Method method : methods) {
			
				List<Method> methodInvoc = method.getMethodInvoc();
				for (Method mi : methodInvoc) {
					if (mi.getClassFullName().equals(sc.getFullName())) {
						mi.setThis(true);
					} else {
						Method m = containsMethod(methods, mi.getSimpleName(), mi.getParametersSignature());
						if (m != null) {
							if (m.isInherited() == true && m.getDeclaringClass().getFullName().equals(mi.getClassFullName())) {
								mi.setThis(true);
							}
						}
					}
				}
			}
		}

	}
	
	public void fixMetAndFieldSource() {
		
		//Ajeitar as chamadas de métodos 
		for (Class sc : sourceClasses.values()) {
			List<Method> methods = sc.getMethods();
			for (Method method : methods) {
				List<Method> methodInvoc = method.getMethodInvoc();
				for (Method mi : methodInvoc) {
					//verificar se o método chamado está na mesma classe
				//	if (mi.getClassFullName().equals(method.getContainsClass().getFullName())) {
					
						//verificar se a classe contem o método e ele é herdado
						
						Class miClass = sourceClasses.get(mi.getClassFullName());
						if (miClass != null) {
							Method inheritedMethod = getInheritedMethod(miClass, mi.getFullName());
							if (inheritedMethod != null) {
								String containsClass = inheritedMethod.getDeclaringClass().getFullName();
								mi.setFullName(containsClass+"."+mi.getSimpleName()+"("+mi.getParametersSignature()+")");
								mi.setClassFullName(containsClass);
							}
						}
				}
				List<Field> fieldInvoc = method.getFieldInvoc();
				for (Field fi : fieldInvoc) {
					//if (fi.getClassFullName().equals(method.getContainsClass().getFullName())) {
						//verificar se a classe contem o método e ele é herdado
					
						Class fiClass = sourceClasses.get(fi.getClassFullName());
						if (fiClass != null) {
							Field inheritedField = getInheritedField(fiClass, fi.getFullName());
							if (inheritedField != null) {
								String containsClass = inheritedField.getDeclaringClass().getFullName();
								fi.setFullName(containsClass+"."+fi.getSimpleName());
								fi.setClassFullName(containsClass);
							}
						}
				}
			}
		}
	}
	
	public void fixMetAndFieldTarget() {
		
		//Ajeitar as chamadas de métodos 
		for (Class sc : targetClasses.values()) {
			List<Method> methods = sc.getMethods();
			for (Method method : methods) {
				List<Method> methodInvoc = method.getMethodInvoc();
				for (Method mi : methodInvoc) {
					//verificar se o método chamado está na mesma classe
				//	if (mi.getClassFullName().equals(method.getContainsClass().getFullName())) {
						//verificar se a classe contem o método e ele é herdado
						Class miClass = targetClasses.get(mi.getClassFullName());
						if (miClass != null) {
							Method inheritedMethod = getInheritedMethod(miClass, mi.getFullName());
							if (inheritedMethod != null) {
								String containsClass = inheritedMethod.getDeclaringClass().getFullName();
								mi.setFullName(containsClass+"."+mi.getSimpleName()+"("+mi.getParametersSignature()+")");
								mi.setClassFullName(containsClass);
							}
						}
				}
				List<Field> fieldInvoc = method.getFieldInvoc();
				for (Field fi : fieldInvoc) {
					//if (fi.getClassFullName().equals(method.getContainsClass().getFullName())) {
						//verificar se a classe contem o método e ele é herdado
						Class fiClass = targetClasses.get(fi.getClassFullName());
						if (fiClass != null) {
							Field inheritedField = getInheritedField(fiClass, fi.getFullName());
							if (inheritedField != null) {
								String containsClass = inheritedField.getDeclaringClass().getFullName();
								fi.setFullName(containsClass+"."+fi.getSimpleName());
								fi.setClassFullName(containsClass);
							}
						}
				}
			}
		}
	}
	
	private Method containsMethod(List<Method> list, String simpleName, String parameters ) {
		for (Method method : list) {
			if (method.getSimpleName().equals(simpleName) &&
					method.getParametersSignature().equals(parameters)) {
				return method;
			}
		}
		return null;
	}
	
	private Method getInheritedMethod(Class c, String fullName) {
		
		List<Method> methods = c.getMethods();
		for (Method method : methods) {
			if (method.getFullName().equals(fullName) && method.isInherited() == true) {
				return method;
			}
		}
		return null;
	}
	
	private Field getInheritedField(Class c, String fullName) {
		
		List<Field> fields = c.getFields();
		for (Field field : fields) {
			if (field.getFullName().equals(fullName) && field.isInherited() == true) {
				return field;
			}
		}
		
		return null;
	}
	
	private void getSourceMethods() {
		
		for (Class c : sourceClasses.values()) {
			for (String interf :c.getInterfaces()) {
				addInterfaceHashMap(c, interf);
			}
			
			List<Method> methods = c.getMethods();
			//descomentar
			List<Method> methodsAux = new ArrayList<Method>();
			methodsAux.addAll(methods);
			for (Method method : methodsAux) {
				if (method.getText().size() == 0) {
					c.getMethods().remove(method);
				}
				
				//Incluir gets----------------------------------
//				if (method.getSimpleName().startsWith("get")) {
//					gets.add(method);
//					Class cs = method.getC();
//					
//					if (classes.get(cs.getFullName()) == null) {
//						classes.put(cs.getFullName(), cs);
//					}
//					
//				}
				//Incluir gets----------------------------------
			}
			for (Method method : methods) {
				Method m = putInheritedMethodsInvocationsForThis(method); 
				sourceMethods.put(m.getFullName(), m);
			}
			
			List<Method> constructors = c.getConstructors();
			for (Method constructor : constructors) {
				sourceMethods.put(constructor.getFullName(), constructor);
			}
		}
		
	}
	
	private Method putInheritedMethodsInvocationsForThis(Method m) {
		
		List<Method> mi = m.getMethodInvoc();
		List<Method> result = new ArrayList<Method>();
		for (Method methodInvocationVisitor : mi) {
			if (methodInvocationVisitor.isThis()) {
				Class c = m.getC();
				List<Method> subMethods = new ArrayList<Method>();
				subMethods = getSubMethods(c, subMethods, methodInvocationVisitor);
				for (Method method : subMethods) {
					Method miv = new Method();
					miv.setFullName(method.getFullName());
					if (!containsMethodInvocationVisitor(result, miv)) {
						miv.setC(method.getC());
						miv.setSimpleName(method.getSimpleName());
						miv.setThis(true);
						miv.setClassFullName(method.getClassFullName());
						miv.setParametersSignature(method.getParametersSignature());
						miv.setType(method.getType());
						miv.setVisibility(method.getVisibility());
						result.add(miv);
					}
				}
			}
		}
		for (Method methodInvocationVisitor : result) {
			m.addMethodInvoc(methodInvocationVisitor);
		}
		return m;
	}
	
	
	private List<Method> getSubMethods(Class c, List<Method> l, Method m) {
		List<Class> sub = c.getSubClasses();
		for (Class class1 : sub) {
			Method mt = containsMethod(class1.getMethods(), m.getSimpleName(), m.getParametersSignature());
			if (mt != null ) {
					l.add(mt);
					getSubMethods(class1, l, m);
			}
		}
		return l;
	}
	
	private boolean containsMethodInvocationVisitor(List<Method> l, Method m) {
		for (Method methodInvocationVisitor : l) {
			if (m.getFullName().equals(methodInvocationVisitor.getFullName())) {
				return true;
			}
		}
		return false;
	}
	
private void getTargetMethods() {
		
		for (Class c : targetClasses.values()) {
			
			for (String interf :c.getInterfaces()) {
				addInterfaceHashMap(c, interf);
			}
			
			List<Method> methods = c.getMethods();
			List<Method> methodsAux = new ArrayList<Method>();
			methodsAux.addAll(methods);
			for (Method method : methodsAux) {
				if (method.getText().size() == 0) {
					c.getMethods().remove(method);
				}
			}
			for (Method method : methods) {
			
				Method m = putInheritedMethodsInvocationsForThis(method); 
				targetMethods.put(m.getFullName(), m);
				Method sm = sourceMethods.get(method.getFullName());
//				if (sm != null) {
//					commonMethods.put(sm, method);
//					commonMethodsTS.put(method, sm);
//				}
			}
			List<Method> constructors = c.getConstructors();
				for (Method constructor : constructors) {
					targetMethods.put(constructor.getFullName(), constructor);
//					Method sc = sourceMethods.get(constructor.getFullName());
//					if (sc != null) {
//						commonMethods.put(sc, constructor);
//						commonMethodsTS.put(constructor, sc);
//					}
			}
		}
	}

	private void getSourceFields() {
		for (Class c : sourceClasses.values()) {
			List<Field> fields = c.getFields();
			for (Field field : fields) {
				sourceFields.put(field.getFullName(), field);
			}
		}
	}

	private void getTargetFields() {
		for (Class c : targetClasses.values()) {
			List<Field> fields = c.getFields();
			for (Field field : fields) {
				targetFields.put(field.getFullName(), field);
				Field sf = sourceFields.get(field.getFullName());
				if (sf != null) {
					commonFields.put(sf, field);
				}
			}
		}
	}
	
	private HashMap<String, Method> makeGraph(HashMap<String, Method> list, Method m) {
		
		List<Method> methodInvoc = m.getMethodInvoc();
		for (Method method : methodInvoc) {
			
			Method mi = list.get(method.getFullName());
			if (mi != null) {
				List<Method> subMethods = new ArrayList<Method>();
				subMethods = getSubMethods(mi.getC(), subMethods, mi);
				mi.addMethodThatCall(m);
				list.put(mi.getFullName(), mi);
				
				//também chama os métodos herdados
				for (Method sm : subMethods) {
					sm.addMethodThatCall(m);
					list.put(sm.getFullName(), sm);
				}
				
			} else {
				//interfaces
				String simpleName = method.getSimpleName();
				String fullName = method.getFullName();
				String interfaceName = fullName.substring(0, fullName.indexOf(simpleName + "(")-1);
				String signature = fullName.substring(fullName.indexOf(simpleName+ "("));
				List<Class> classes = interfaces.get(interfaceName);
				if (classes != null) {
					for (Class c : classes) {
						Method methodInterf = list.get(c.getFullName() +"." +signature);
						if (methodInterf != null) {
							methodInterf.addMethodThatCall(m);
							list.put(methodInterf.getFullName(), methodInterf);
						}
					}
				}				
			}
		}
		return list;
	}
	
	
//	public List<Method> getMethodsThatImplement(Method m,HashMap<String, Method> list) {
//		
//		List<Method> result = new ArrayList<Method>();
//		
//		for (Method method : list.values()) {
//			List<String> interfaces = method.getC().getInterfaces();
//			if (interfaces != null){
//				for (String interf : interfaces) {
//					if (m.getFullName().contains(interf) && m.getSimpleName().equals(method.getSimpleName())) {
//						result.add(method);
//					}
//				}
//				
//			}
//		}
//		
//		return result;
//		
//	}
	
	private List<Method> getMethodsExerciseTheChange (HashMap<String, Method> l, List<Method> methods) {
		
		List<Method> result = new ArrayList<Method>();
		
		for (Method method : methods) {
			result.add(method);
			result.addAll(getMethodsThatCall(l, method, new ArrayList<Method>()));
		}
		return result;
		
	}
	
	private List<Method> getMethodsThatCall(HashMap<String, Method> l, Method method, 
			List<Method> result) {
			
			if (!method.getMethodThatCall().isEmpty()) {
				List<Method> methodThatCall = method.getMethodThatCall();
				for (Method mtc : methodThatCall) {
					if (!result.contains(mtc)) {
						result.add(mtc);
						getMethodsThatCall(l, mtc, result);
					}
				}
			}
			
			return result;
	}
	
	
	private void putInListIntersection(Method m, HashMap<String, Method> l) {
			
			
		
			List<Method> inheritedMethods = new ArrayList<Method>();
			Class c = m.getC();
			
			if (listIntersection.get(m.getFullName()) == null) {

					inheritedMethods.add(m);
					
					//O(c)
					inheritedMethods = getInheritedMethods(c, inheritedMethods, m);
					
					//O(m)
					inheritedMethods = getMethodsExerciseTheChange(l, inheritedMethods);
					
					m.addAllMethodThatCall(inheritedMethods);

			} else {
				inheritedMethods = m.getMethodThatCall();
			}
			inheritedMethods.add(m);
			boolean isTarget = l.equals(targetMethods);
			if (isTarget) {
				for (Method method : inheritedMethods) {
					
					//-------------------cobertura---------------------
					if (impactedMethodsTarget.get(method.getFullName()) == null) {
						impactedMethodsTarget.put(method.getFullName(),method);
					}
					//------------------------------------------------
	//				Method methodSource = containsMethod(sourceMethods, method);
					
					Method methodSource = sourceMethods.get(method.getFullName());
					if (methodSource != null) {
						if (listIntersection.get(methodSource.getFullName()) == null) {
							listIntersection.put(methodSource.getFullName(),methodSource);
							
							//-----------------cobertura-----------------
							listIntersectionTarget.add(method);
							//------------------------------------------------
							
							Class cs = methodSource.getC();
							if (methodSource.isConstructor()) {
								Class clas = new Class();
								clas.setFullName("CONSTRUTOR");
								clas.setVisibility(c.getVisibility());
								clas.setModifier(c.getModifier());
								classes.put(cs.getFullName(), clas);
							} else {
								if (classes.get(cs.getFullName()) == null) {
									classes.put(cs.getFullName(), cs);
								}
							}
						}
					}
				}
			} else {
				for (Method method : inheritedMethods) {
					//-------------------cobertura---------------------
					if (impactedMethodsSource.get(method.getFullName()) == null){
						impactedMethodsSource.put(method.getFullName(),method);
					}
					//------------------------------------------------
	//				Method methodTarget = containsMethod(targetMethods, method);
					Method methodTarget = targetMethods.get(method.getFullName()); 
//						commonMethods.get(method);
					if (methodTarget != null) {
						if (listIntersection.get(method.getFullName()) == null) {
							listIntersection.put(method.getFullName(),method);
							
							//-----------------cobertura--------------------
							listIntersectionTarget.add(methodTarget);
	//						if (containsMethod(impactedMethodsTarget, method) == null) {
	//							impactedMethodsTarget.add(method);
	//						}
							//------------------------------------------------
							try {
							Class cs = method.getC();
							if (method.isConstructor()) {
								Class clas = new Class();
								clas.setFullName("CONSTRUTOR");
								clas.setVisibility(c.getVisibility());
								clas.setModifier(c.getModifier());
								classes.put(cs.getFullName(), clas);
							} else {
								if (classes.get(cs.getFullName()) == null) {
									classes.put(cs.getFullName(), cs);
								}
							}
							} catch(Exception e) {
							}
							
						}
					}
				}
			}
	}
	
	public List<Method> getInheritedMethods(Class c, List<Method> l, Method m) {
		List<Class> sub = c.getSubClasses();
		for (Class class1 : sub) {
			
			Method mt = containsMethod(class1.getMethods(),m.getSimpleName(), m.getParametersSignature()); 
			if (mt != null ) {
				if (mt.isInherited() && (listIntersection.get(mt.getFullName()) == null)) {
					l.add(mt);
					getInheritedMethods(class1, l, m);
				} else {
					return l;
				}
			}
		}
		return l;
	}
	
	private void getNewMethods() {
		
		for (Method m: newMethods) {
			putInListIntersection(m, targetMethods);
		}
		
//		for (Method m : targetMethods.values()) {
//			
//			if (!m.isInherited()) {
//				if (containsMethodNotInherited(sourceMethods, m) == null) {
//					targetMethods = makeGraph(targetMethods, m);
//					newMethods.add(m);
//					putInListIntersection(m, targetMethods);
//				}
//			}
//		}
//		
		List<Method> widening = new ArrayList<Method>();
		for (Method m : newMethods) {
			Class c = m.getC();
			List<Method> inheritedMethods = c.getInheritedMethods();
			Method wideningMethodSameClass = containsWideningConversion(c.getMethods(), m);
			if (wideningMethodSameClass != null) {
				widening.add(wideningMethodSameClass);
			}
			Method wideningMethod = containsWideningConversion(inheritedMethods, m);
			if (wideningMethod != null) {
				widening.add(wideningMethod);
			}
		}
		for (Method wideningMethod : widening) {
			Method method = sourceMethods.get(wideningMethod.getFullName());
			if (method != null) {
				putInListIntersection(method, sourceMethods);
				putInListIntersection(targetMethods.get(method.getFullName()), targetMethods);
			}
		}
		
	}
	
	public Method containsMethodNotInherited(HashMap<String, Method> l, Method m) {
		
		Method method = l.get(m.getFullName());
		if (method != null && !method.isInherited()) {
			return method;
		}
		return null;
	}
	
	
	
	
	private Method containsWideningConversion(List<Method> l, Method m) {

		for (Method method : l) {
				if (method.getModifier().equals(m.getModifier()) && method.getVisibility().equals(m.getVisibility())
						&& method.getSimpleName().equals(m.getSimpleName()) && method.getClassFullName().equals(m.getClassFullName())
						&& !method.getParametersSignature().equals(m.getParametersSignature())) {
							if (analyzeWidening(m, method)){
								return method;
							}
				}
		}
		return null;
	}
	
	private boolean analyzeWidening(Method m1, Method m2) {
		
		List<String> parameters1 = m1.getParameters();
		List<String> parameters2 = m2.getParameters();
		if (parameters1.size() == parameters2.size()) {
			for(int i = 0; i < parameters1.size(); i++) {
				String param1 = parameters1.get(i);
				String param2 = parameters2.get(i);
				if (!analyzeTypes(param1, param2)) {
					return false;
				}
			}
		}
		return true;
	}
	
	private boolean analyzeTypes(String param1, String param2) {
		
		 if (types.get(param1) != null && types.get(param2) != null) {
			 return true;
		 }
		 return false;
		
	}
	
	private void getRemovedMethods() {
		
		for (Method m: removedMethods) {
			putInListIntersection(m, sourceMethods);
		}
		
		
//		for (Method m : sourceMethods.values()) {
//
//			//			List<Method> methodThatCall = makeGraph(sourceMethods, m);
//			//m.addAllMethodThatCall(methodThatCall);
//			//pq eu nao considero os herdados? e no caso de uma mudança de hierarquia? (ver paper de chianti)
//			if (!m.isInherited()) {
//				if (containsMethodNotInherited(targetMethods, m) == null) {
//					removedMethods.add(m);
//					putInListIntersection(m, sourceMethods);
//				}
//			}
//		}
		
		List<Method> widening = new ArrayList<Method>();
		for (Method m : removedMethods) {
			Class c = m.getC();
			List<Method> inheritedMethods = c.getInheritedMethods();
			Method wideningMethodSameClass = containsWideningConversion(c.getMethods(), m);
			if (wideningMethodSameClass != null) {
				widening.add(wideningMethodSameClass);
			}
			Method wideningMethod = containsWideningConversion(inheritedMethods, m);
			if (wideningMethod != null) {
				widening.add(wideningMethod);
			}
		}
		
		for (Method wideningMethod : widening) {
			Method method = targetMethods.get(wideningMethod.getFullName()); 
			if (method != null) {
				putInListIntersection(method, targetMethods);
				putInListIntersection(sourceMethods.get(method.getFullName()), sourceMethods);
			}
//			removedMethods.add(wideningMethod);
		}
	}
	
	private void putInListIntersectionAllFields(Field f, HashMap<String,Method> l) {
		Class c = f.getC();
		List<Field> inheritedFields = new ArrayList<Field>();
		inheritedFields.add(f);
		inheritedFields = getInheritedFields(c, inheritedFields, f);
		for (Field field : inheritedFields) {
			putInListIntersection(field, l);				
				 
		}
	}
	
	private void putInListIntersection(Field f, HashMap<String,Method> l) {
		
		List<Method> impactedMethods = new ArrayList<Method>();
		
		boolean isTarget = l.equals(targetMethods);
		
		if (f.getMethodThatCall().isEmpty()) {
		
			for (Method method : l.values()) {
				if (containsMethod(impactedMethods, method) == null) {
					List<Field> fa = method.getFieldInvoc();
					for (Field fieldAccessVisitor : fa) {
						if (fieldAccessVisitor.getFullName().equals(f.getFullName())) {
							if (listIntersection.get(method.getFullName()) == null) {
								putInListIntersection(method, l);
								impactedMethods.add(method);
								break;
							}
						}	
					}
				}
			}
			
			impactedMethods = getMethodsExerciseTheChange(l, impactedMethods);
			f.addAllMethodThatCall(impactedMethods);
		} else {
			impactedMethods = f.getMethodThatCall();
		}
		
		
		if (isTarget) {
			for (Method method : impactedMethods) {
				
				//-------------------cobertura---------------------
				if (impactedMethodsTarget.get(method.getFullName()) == null) {
					impactedMethodsTarget.put(method.getFullName(),method);
				}
				//------------------------------------------------
				
				Method methodSource = sourceMethods.get(method.getFullName()); 
//				Method methodSource = targetMethods.get(method.getFullName());
				if (methodSource != null) {
					if (listIntersection.get(methodSource.getFullName()) == null) {
						listIntersection.put(methodSource.getFullName(),methodSource);
						//-------------------cobertura---------------------
						listIntersectionTarget.add(method);
						//------------------------------------------------
						
						Class c = methodSource.getC();
						if (methodSource.isConstructor()) {
							Class clas = new Class();
							clas.setVisibility(c.getVisibility());
							clas.setModifier(c.getModifier());
							clas.setFullName("CONSTRUTOR");
							classes.put(c.getFullName(), clas);
						} else {
							if (classes.get(c.getFullName()) == null) {
								classes.put(c.getFullName(), c);
							}
						}
					}
				}
			}
		} else {
			for (Method method : impactedMethods) {
				
				//-------------------cobertura---------------------
				if (impactedMethodsSource.get(method.getFullName()) == null) {
					impactedMethodsSource.put(method.getFullName(),method);
				}
				//------------------------------------------------
				
				Method methodTarget =  targetMethods.get(method.getFullName());
				if (methodTarget != null) {
					if (listIntersection.get(method.getFullName()) == null) {
						Class c = method.getC();
						listIntersection.put(method.getFullName(),method);
						
						//-------------------cobertura---------------------
						listIntersectionTarget.add(methodTarget);
						
						
						if (method.isConstructor()) {
							Class clas = new Class();
							clas.setFullName("CONSTRUTOR");
							clas.setVisibility(c.getVisibility());
							clas.setModifier(c.getModifier());
							classes.put(c.getFullName(), clas);
						} else {
							if (classes.get(c.getFullName()) == null) {
								classes.put(c.getFullName(), c);
							}
						}
					}
				}
			}
		}
	}
	
	public List<Field> getInheritedFields(Class c, List<Field> l, Field f) {
		List<Class> sub = c.getSubClasses();
		
		for (Class class1 : sub) {
			Field ft = containsField(class1.getFields(), f.getSimpleName());
			if (ft != null ) {
				if (ft.isInherited()) {
					l.add(ft);
					return getInheritedFields(class1, l, f);
				} else {
					return l;
				}
			}
		}
		return l;
	}
	
	public Field containsField(List<Field> l, String name) {
		
		for (Field field : l) {
				if (field.getSimpleName().equals(name)) {
					return field;
				}
		}
		return null;
	}
	
	private void getNewField() {
		
		for (Field f : targetFields.values()) {
			Field sourceF = sourceFields.get(f.getFullName()); 
			if ( sourceF == null || (sourceF.isInherited() && !f.isInherited())) {
				newFields.add(f);
				impactedFields.add(f.getFullName());
				putInListIntersectionAllFields(f, targetMethods);
				
			} 
			
		}
	}
	
	private void getRemovedField() {
		
		for (Field f : sourceFields.values()) {
			Field targetF = targetFields.get(f.getFullName());
			if (targetF == null || (targetF.isInherited() && !f.isInherited())) {
				removedFields.add(f);
				impactedFields.add(f.getFullName());
				putInListIntersectionAllFields(f, sourceMethods);
			}
		}
	}
	
	private void getChangedFields() {
		
		Set<Field> source = commonFields.keySet();
		for (Field field : source) {
			Field targetField = commonFields.get(field);
			if (field.getDeclaringClass().getFullName().equals(targetField.getDeclaringClass().getFullName()) &&
					!field.isInherited() && !targetField.isInherited()) {
				if (!field.equalsText(targetField.getText()) ||
						!field.getModifier().equals(targetField.getModifier()) ||
						!field.getVisibility().equals(targetField.getVisibility())) {
					changedFields.add(field);
					impactedFields.add(field.getFullName());
					putInListIntersection(field, sourceMethods);
					putInListIntersection(targetField, targetMethods);
				}
			}
		}
	}
	
	private void getChangedMethods() {
		
		List<Method> changed = new ArrayList<Method>();
		//Set<Method> source = commonMethods.keySet();
		
		
		int i = 0;
		
		for (Method method : sourceMethods.values()) {
				
				if (method.getFullName().contains("healthwatcher.data.rdb.HealthUnitRepositoryRDB.getHealthUnitListBySpeciality")) {
					System.out.println();
				}
				if (targetMethods.get(method.getFullName())!= null) {
				//descomentar
				boolean verifyExit = verifyExit(method) || verifyExit(targetMethods.get(method.getFullName()));
				if (verifyExit) {
					continue;
				}
				i++;
				Method targetMethod = targetMethods.get(method.getFullName());
				if (method.getDeclaringClass().getFullName().equals(targetMethod.getDeclaringClass().getFullName()) &&
						!method.isInherited() && !targetMethod.isInherited()) {
					boolean changeMethodBody = !(method.equalsText(targetMethod.getText()));
					if (changeMethodBody ||
							!method.getVisibility().equals(targetMethod.getVisibility()) ||
								!method.getModifier().equals(targetMethod.getModifier())) {
//						System.out.println("changed: "+i+" "+method.toString());
						changed.add(method);
						changedMethods.add(method);
						putInListIntersection(method, sourceMethods);
						putInListIntersection(targetMethod, targetMethods);
						
						if (changeMethodBody) {
//							System.out.println(method.toString());
							getChangesInFieldAssignment(method, targetMethod);
							getChangesInFieldAssignment(targetMethod,method);
						}
					}
				}
			}
		}
	}
	
	public boolean verifyExit(Method method) {
		
		List<Object> texts = method.getText();
		for (Object text : texts) {
			String text1 = text.toString();
			if (text1.contains("java/lang/System.exit (I)V")) {
				putInExitList(method, sourceMethods);
				return true;
			}
		}
		return false;
	}
	
	private void putInExitList(Method m, HashMap<String,Method> l) {
		if (exitList.get(m.getFullName()) == null) {
			
			Class c = m.getC();
			List<Method> inheritedMethods = new ArrayList<Method>();
			inheritedMethods.add(m);
			
			inheritedMethods = getInheritedMethods(c, inheritedMethods, m);
			
			inheritedMethods = getMethodsExerciseTheChange(l, inheritedMethods);
			
			boolean isTarget = l.equals(targetMethods);
			if (isTarget) {
				for (Method method : inheritedMethods) {
					
					
	//				Method methodSource = containsMethod(sourceMethods, method);
					Method methodSource = sourceMethods.get(method.getFullName());
					if (methodSource != null) {
						if (exitList.get(methodSource) == null) {
							//System.out.println(method.getFullName() + " : "+method.getSignatureRandoop());
							exitList.put(methodSource.getFullName(),methodSource);
						
						}
					}
				}
			} else {
				for (Method method : inheritedMethods) {
				
	//				Method methodTarget = containsMethod(targetMethods, method);
					Method methodTarget = targetMethods.get(method.getFullName());
					if (methodTarget != null) {
						if (exitList.get(method.getFullName()) == null) {
							exitList.put(method.getFullName(),method);
						}
					}
				}
			}
		}
	}
	
private void getChangesInFieldAssignment(Method methodSource, Method methodTarget) {
		
		List<Field> fieldInvocSource = methodSource.getFieldInvoc();

		
		for (Field fieldSource : fieldInvocSource) {
			boolean isChanged = false;
			if (!impactedFields.contains(fieldSource.getFullName()) ) {
				Field fieldTarget = methodTarget.getFieldInvocation(fieldSource.getFullName());
				if (fieldTarget == null) {
					isChanged = true;
				} else {
					if (fieldSource.isWritten() && !fieldTarget.isWritten() ||
							!fieldSource.isWritten() && fieldTarget.isWritten() ) {
							isChanged = true;
					} else {
						if (fieldSource.isWritten() && fieldTarget.isWritten()) {
							String fieldInstructionSource = methodSource.getFieldInstruction(fieldSource.getFullName());
							String fieldInstructionTarget = methodTarget.getFieldInstruction(fieldTarget.getFullName());
							if (fieldInstructionSource != null && fieldInstructionTarget != null) {
								if (!fieldInstructionSource.equals(fieldInstructionTarget)) {
									isChanged = true;
								}
							}
						}
					}
				}
			}
			
			if (isChanged) {
				impactedFields.add(fieldSource.getFullName());
				Field fieldS = sourceFields.get(fieldSource.getFullName()); 
				if (fieldS != null) {
					Field fieldT = commonFields.get(fieldS);
					if (fieldT != null) {
						changedFields.add(fieldS);
						putInListIntersection(fieldS, sourceMethods);
						putInListIntersection(fieldT, targetMethods);
					}
				}
			}
		}
		
	}

	public Method containsMethod(List<Method> l, Method m) {
	
		for (Method method : l) {
				if (method.equals(m)) {
					return method;
				}
		}
		return null;
	}
	
	private void putInFileIntersection() {
		
		Set<String> c = classes.keySet();
		for (String className : c) {
			Class cs = classes.get(className);
			if (!cs.getFullName().equals("CONSTRUTOR")) {
				List<Method> constructors = cs.getConstructors();
				boolean ok = false;
				for (Method method : constructors) {
					Method cons = targetMethods.get(method.getFullName());
					if (cons != null) {
							if (cons.getVisibility().equals(Tools.PUBLIC)) {
								listIntersection.put(method.getFullName(), method);						
								ok = true;
							}
					}
				}
//				if (!ok) {
//					if (constructors.size() > 0 ) {
//						
//						listIntersection.put(constructors.get(0).getFullName(), constructors.get(0));
//					}
//				}
			}
			
		}
		for (Method get : gets) {
			listIntersection.put(get.getFullName(), get);
		}
		
		fileIntersectionAux = new HashMap<String,Method>();
		
		for (Method m : listIntersection.values()) {
//			if (m.getFullName().contains("com.atlassw.tools.eclipse.checkstyle.util.table.EnhancedTableViewer.<clinit>")) {
//				System.out.println();
//			}
			Class class1 =  sourceClasses.get(m.getType());
			if (class1 != null) {
				if (!class1.isInner() && class1.getVisibility().equals(Tools.PUBLIC)) {
					if (isSafeMethod(m))
						fileIntersectionAux.put(m.getFullName(),m);
//						fileIntersection.add((m.getSignatureRandoop()));
				}
			//se o retorno não for um objeto do projeto, e sim um tipo primitivo ou objeto de um jar:
			}else {
				if (isSafeMethod(m))
					fileIntersectionAux.put(m.getFullName(),m);
//					fileIntersection.add((m.getSignatureRandoop()));
			}
			
		}
		int i  = 0;
	//	System.out.println("Dependencias------");
		Set<Method> dependecies = new HashSet<Method>();
		for (Method method : fileIntersectionAux.values()) {
			List<Method> d = getDependecies(method, fileIntersectionAux);
			for (Method methodD : d) {
//				if (!contains(dependecies, methodD.getFullName())) {
					if (isSafeMethod(methodD))
						dependecies.add(methodD);
//				}
			}
		}
		
		for (Method method : dependecies) {
			fileIntersectionAux.put(method.getFullName(),method);
		}
		for (Method method : fileIntersectionAux.values()) {
			
			if (!removeMethod.equals("")) {
				if (method.getSimpleName().contains(removeMethod)) {
//					String sig = "method : "+method.getClassFullName() + "."+method.getSimpleName() + "("+ method.getParametersSignature()+ ") : "+
//					method.getClassFullName();
//					fileIntersection.add(sig);
					continue;
				}
			}
			
			if (exitList.get(method.getFullName()) != null) {
				continue;
			}
//			if (method.getFullName().contains("ImpactAnalysis.<init>(java.lang.String)")) {
//				method.setFullName("analyzer.ImpactAnalysis.<init>(java.lang.String, java.lang.String)");
//				method.doSignatureRandoop();
//				System.out.println(method.getSignatureRandoop());
//				
////				continue;
//			}
			
		
			
			if (method.getFullName().contains("java.awt.geom.Point2D.Double")) {
				continue;
			}
			if (method.getFullName().contains("runAndWait")) continue;
//			if (method.getFullName().equals("junit2.samples.money.MoneyTest.run(junit2.framework.TestResult)")) {
////				System.out.println();
//			}
			i++;
			if (method.isConstructor()) {
				fileIntersection.add(method.getSignatureRandoop());
				addMethodInMethodsToTestList(method);
			} else {	
				
				boolean contains = false;
				for (String signatures : fileIntersection) {
					if ((signatures.contains(method.getDeclaringClass().getFullName() + "."+
							method.getSimpleName()+"("+method.getParametersSignature()+")") )) {
						contains = true;
						break;
					}
				}
				if (!contains) {
					fileIntersection.add(methodSignatures(fileIntersectionAux, method));
					addMethodInMethodsToTestList(method);
				} 
//				}
			}
		}
//		Collections.shuffle(fileIntersection);
		
	//	System.out.println(" -----------------------------------------------");
	//	System.out.println("Quantidade de metodos: "+i);
		this.methodsToGenerateTests = i;
//		System.out.println("Quantidade de metodos: "+ fileIntersection.size());
	}

	private void addMethodInMethodsToTestList(Method method) {
		saferefactor.core.util.ast.Method mtt;
		if (method.isConstructor()) {
			mtt = new saferefactor.core.util.ast.ConstructorImp();
			mtt.setSimpleName(method.getDeclaringClass().getFullName());
		} else {
			mtt = new saferefactor.core.util.ast.MethodImp();
			mtt.setSimpleName(method.getSimpleName());
		}
		mtt.setDeclaringClass(method.getDeclaringClass().getFullName());
		List<String> parameters = new ArrayList<String>();
		String[] split = method.getParametersSignature().split(",");
		for (String string : split) {
			if (!string.equals("")) {
				parameters.add(string);
			}
		}
		mtt.setParameterList(parameters);
		mtt.setAllowedClasses(method.getAllowedClasses());
		methods_to_test.add(mtt);
	}
	
	private String methodSignatures(HashMap<String,Method> fileIntersenction, Method m) {
		String result = m.getSignatureRandoop();
		for (Method method : fileIntersenction.values()) {
			if (method.getSimpleName().equals(m.getSimpleName()) 
					&& method.getParametersSignature().equals(m.getParametersSignature())
					&& method.getDeclaringClass().getFullName().equals(m.getDeclaringClass().getFullName())) {
				if (!m.getClassFullName().equals(method.getClassFullName())) {
					result += ";"+method.getClassFullName();
					m.addAllowedClass(method.getClassFullName());
				}
			}
		}
		return result;
	}

	
	
	private boolean isSafeMethod(Method m) {
		
		Method targetm = targetMethods.get(m.getFullName());
		if (targetm != null) {
			if (!m.getType().equals(targetm.getType())) {
				return false;
			}
			return canGenerateTests(targetm) && canGenerateTests(m) && isReturnTypeACommonClass(m); 
		} else
			return canGenerateTests(m) && isReturnTypeACommonClass(m);
	}
	
	boolean isReturnTypeACommonClass(Method m) {
		
		String type = m.getType();
//		System.out.println(type);
		boolean isSource = false;
		boolean isTarget = false;
		for (String c : sourceClasses.keySet()) {
			if (type.contains(c)) {
				isSource = true;
			}
		}
		
		for (String c : targetClasses.keySet()) {
				if (type.contains(c)) {
					isTarget = true;
				}
			}
//		Class ctarget = targetClasses.get(type);
		if (isSource && isTarget) return true;
		if (!isSource && !isTarget) return true;
		return false;
	}
	
	
	private List<Method> getDependecies(Method m, HashMap<String,Method> fileIntersection) {
		List<Method> dependecies = new ArrayList<Method>();
		List<String> parameters = m.getParameters();
		
		//o tipo de retorno também é uma dependência para o Randoop gerar testes
		parameters.add(m.getType());
	
		for (String p : parameters) {
			boolean ok = false;
			for (Method method : fileIntersection.values()) {
				if (method.getFullName().contains(p+".<init>")) {
					ok = true;
					break;
				} 
				
			}
			if (!ok) {
				
				List<Method> constructors = getMethod(p);
				for (Method constructor : constructors) {
					if (!contains(dependecies, constructor.getClassFullName())) {
						Method method = targetMethods.get(constructor.getFullName()); 
						if (method != null)
							dependecies.add(constructor);
					}
				}
			}
		}
		return dependecies;
	}
	
	public boolean contains(List<Method> l, String fullName) {
		for (Method method : l) {
			if (method.getFullName().equals(fullName)) {
				return true;
			}
		}
		return false;
	}
	
	private List<Method> getMethod(String name) {
		
		List<Method> constructorsResult = new ArrayList<Method>();
//		Class c = sourceClasses.get(name);
		
		//adicionei
		name = name.replaceAll(";", "");
		Class c = sourceClasses.get(name);
		if (c == null) {
			c = sourceClasses.get(name.substring(1));
		}
		//adicionei
		
		if (c != null) {
//		for (Class c : sourceClasses.values()) {
//			if (c.getFullName().equals(name) ) {
				List<Method> constructors = c.getConstructors();
				for (Method constructor : constructors) {
					constructorsResult.add(constructor);
				}
				//descomentar
				//se nao tiver construtor é pq é interface
				if (constructors.size() == 0) {
					List<Class> subClasses = c.getSubClasses();
					for (Class subClass : subClasses) {
						if (subClass.getModifier().contains("abstract")) {
							List<Class> subClasses2 = subClass.getSubClasses();
							for (Class subClass2 : subClasses2) {
								List<Method> constructorsSub = subClass2.getConstructors();
								if (constructorsSub.size() != 0) {
									for (Method constructor : constructorsSub) {
										constructorsResult.add(constructor);
									}
//									break;
								}
							}
						} else {
							List<Method> constructorsSub = subClass.getConstructors();
							if (constructorsSub.size() != 0) {
								for (Method constructor : constructorsSub) {
									constructorsResult.add(constructor);
								}
//								break;
							}
						}
						
					}
					
				}
			}
//		}
		return constructorsResult;
	}
	
	private boolean canGenerateTests(Method m) {
		String className = m.getFullName();
//							if (className.contains("netscape.javascript.JSObject")) {
//			/*     */           return false;
//			/*     */         }
// checkstyle - copiado do SR, problema de compilacao do subject - classes nao compiladas corretamente
//			/*  60 */         if (className.contains("com.atlassw.tools.eclipse.checkstyle.util.table.EnhancedCheckBoxTableViewer"))
//			/*     */           return false;
//			/*  62 */         if (className.contains("com.atlassw.tools.eclipse.checkstyle.util.table.EnhancedTableViewer"))
//			/*     */           return false;
//			/*  64 */         if (className.contains("com.atlassw.tools.eclipse.checkstyle.config.configtypes.ConfigurationTypes"))
//			/*     */           return false;
//			/*  66 */         if (className.contains("com.atlassw.tools.eclipse.checkstyle.config.meta.MetadataFactory"))
//			/*     */           return false;
//			/*  68 */         if (className.contains("com.atlassw.tools.eclipse.checkstyle.projectconfig.PluginFilters"))
//			/*     */           return false;
//			/*  70 */         if (className.contains("com.atlassw.tools.eclipse.checkstyle.config.CheckConfigurationFactory"))
//			/*     */           return false;
//			/*  72 */         if (className.contains("com.atlassw.tools.eclipse.checkstyle.util.CheckstyleLog"))
//			/*     */           return false;
//			/*  74 */         if (className.contains("com.atlassw.tools.eclipse.checkstyle.config.savefilter.SaveFilters")) {
//			/*     */           return false;
//			/*     */         }
//			/*     */ 
		return !m.getC().isInner() && 
		!m.getC().getModifier().equals(Tools.ABSTRACT) &&
		 m.getC().getVisibility().equals(Tools.PUBLIC) && 
		!m.getDeclaringClass().isInner() && 
		m.getDeclaringClass().getVisibility().equals(Tools.PUBLIC) && m.getVisibility().equals(Tools.PUBLIC) ;
	}
	
	
	
	private boolean hasStaticConstructor(List<Method> constructors) {
		for (Method method : constructors) {
			if (method.getFullName().contains("clinit") && method.getVisibility().equals(Tools.PUBLIC)) {
				return true;
			}
		}
		return false;
	}
	private boolean isConstructorsSafe(List<Method> constructors) {
		for (Method method : constructors) {
			if (method.getVisibility().equals(Tools.PUBLIC)) {
				return true;
			}
		}
		return false;
	}
	
	public void print() {
		System.out.println("Métodos impactados");
		System.out.println("Source");
		for (Method impS: impactedMethodsSource.values()) {
			System.out.println(impS.toString());
		}
		System.out.println("target");
		for (Method impT: impactedMethodsTarget.values()) {
//			if (impactedMethodsSource.get(impT.getFullName()) == null) {
				System.out.println(impT.toString());
//			}
		}
		System.out.println();
		System.out.println("Métodos adicionados");
		for (Method method : newMethods) {
			System.out.println(method.toString());
		}
		System.out.println();
		System.out.println("Métodos removidos");
		for (Method method : removedMethods) {
			System.out.println(method.toString());
		}
		System.out.println();
		System.out.println("Métodos modificados");
		for (Method method : changedMethods) {
			System.out.println(method.toString());
		}
		System.out.println();
		System.out.println("Atributos adicionados");
		for (Field field : newFields) {
			System.out.println(field.toString());
		}
		System.out.println();
		System.out.println("Atributos removidos");
		for (Field field : removedFields) {
			System.out.println(field.toString());
		}
		System.out.println();
		System.out.println("Atributos modificados");
		for (Field field : changedFields) {
			System.out.println(field.toString());
		}
		
		System.out.println("lista para geracao de testes");
		List<String> fileIntersection2 = this.fileIntersection;
		for (String string : fileIntersection2) {
			System.out.println(string);
		}
		System.out.println(fileIntersection2.size());
	}
	public List<String> getFileIntersection() {
		return fileIntersection;
	}

	public void setFileIntersection(List<String> fileIntersection) {
		this.fileIntersection = fileIntersection;
	}

	public int getMethodsToGenerateTests() {
		return methodsToGenerateTests;
	}

	public void setMethods(int methods) {
		this.methodsToGenerateTests = methods;
	}

	public HashMap<String,Method> getFileIntersectionAux() {
		return fileIntersectionAux;
	}

	public void setFileIntersectionAux(HashMap<String,Method> fileIntersectionAux) {
		this.fileIntersectionAux = fileIntersectionAux;
	}

	public List<Field> getNewFields() {
		return newFields;
	}

	public List<Field> getRemovedFields() {
		return removedFields;
	}

	public void setNewMethods(List<Method> newMethods) {
		this.newMethods = newMethods;
	}
	
	public List<Method> getNewMethodss() {
		return this.newMethods;
	}

	public void setRemovedMethods(List<Method> removedMethods) {
		this.removedMethods = removedMethods;
	}
	
	public List<Method> getRemovedMethodss() {
		return this.removedMethods;
	}
	
	public void setNewFields(List<Field> newFields) {
		this.newFields = newFields;
	}

	public void setRemovedFields(List<Field> removedFields) {
		this.removedFields = removedFields;
	}

	public void setChangedMethods(List<Method> changedMethods) {
		this.changedMethods = changedMethods;
	}
	
	public List<Method> getChangedMethodss() {
		return this.changedMethods;
	}
	
	public HashMap<String, Method> getSourceMethodss() {
		return this.sourceMethods;
	}
	
	public void setChangedFields(List<Field> changedFields) {
		this.changedFields = changedFields;
	}
	
	public List<Field> getChangedFieldss() {
		return this.changedFields;
	}

	public HashMap<String, Method> getImpactedMethodsTarget() {
		return impactedMethodsTarget;
	}

	public HashMap<String, Method> getImpactedMethodsSource() {
		return impactedMethodsSource;
	}

	public void setImpactedMethodsTarget(
			HashMap<String, Method> impactedMethodsTarget) {
		this.impactedMethodsTarget = impactedMethodsTarget;
	}

	public void setImpactedMethodsSource(
			HashMap<String, Method> impactedMethodsSource) {
		this.impactedMethodsSource = impactedMethodsSource;
	}

	public void setSourceMethods(HashMap<String, Method> sourceMethods) {
		this.sourceMethods = sourceMethods;
	}

	public int getImpactedMethods() {
		impactedMethods = impactedMethodsSource.size();
		for (Method impT: impactedMethodsTarget.values()) {
			if (impactedMethodsSource.get(impT.getFullName()) == null) {
				impactedMethods++;
//				System.out.println(impT.toString());
			}
		}
		
		return impactedMethods;
	}

	public void setImpactedMethods(int impactedMethods) {
		this.impactedMethods = impactedMethods;
	}
	
	

	public String getBin() {
		return bin;
	}

	public void setBin(String bin) {
		this.bin = bin;
	}

	public  HashMap<String, Method> getTargetMethodss() {
		return this.targetMethods;
	}

	public HashMap<String, Class> getSourceClassess() {
		return this.sourceClasses;
	}
	
	public HashMap<String, Class> getTargetClassess() {
		return this.targetClasses;
	}
	
	public void setSourceClasses(HashMap<String, Class> sourceClasses) {
		this.sourceClasses = sourceClasses;
	}

	public void setTargetClasses(HashMap<String, Class> targetClasses) {
		this.targetClasses = targetClasses;
	}

	public void setMethodsToGenerateTests(int methodsToGenerateTests) {
		this.methodsToGenerateTests = methodsToGenerateTests;
	}

	public List<saferefactor.core.util.ast.Method> getMethods_to_test() {
		return methods_to_test;
	}

	public void setMethods_to_test(
			List<saferefactor.core.util.ast.Method> methods_to_test) {
		this.methods_to_test = methods_to_test;
	}

	public String getImpactedList() {
		return impactedList;
	}

	public void setImpactedList(String impactedList) {
		this.impactedList = impactedList;
	}

	public static void main(String[] args) throws IOException {
		
		
		
//		String source = "/Users/melmongiovi/Documents/workspace4/addParameterS";
//		String target = "/Users/melmongiovi/Documents/workspace4/addParameterT";
		
//		String source = "/Users/melmongiovi/Documents/workspace3/JHD"+503+"source";
//		String target = "/Users/melmongiovi/Documents/workspace3/JHD"+503+"target";
		int sub = 650;
		
//		String source = "/Users/melmongiovi/Downloads/subjects/"+sub+"/JHotDraw_"+sub+"_BEFORE/";
//		String target = "/Users/melmongiovi/Downloads/subjects/"+sub+"/JHotDraw_"+sub+"_AFTER/";
		
		String source = "/Users/melmongiovi/Documents/resultados/T476BEFORERENAME";
		String target = "/Users/melmongiovi/Documents/resultados/T476AFTERRENAME";
		
//		String source = "/Users/melmongiovi/Documents/workspace4/AnalisadorASMOpt/subjects/addMethodS2";
//		String target = "/Users/melmongiovi/Documents/workspace4/AnalisadorASMOpt/subjects/addMethodT2";
		
//		String source = "/Users/melmongiovi/Documents/workspace4/changeMethodS3";
//		String target = "/Users/melmongiovi/Documents/workspace4/changeMethodT3";
		
//		String source = "/Users/melmongiovi/Documents/workspace4/removeFieldS1";
//		String target = "/Users/melmongiovi/Documents/workspace4/removeFieldT1";
		
		long time = System.currentTimeMillis();
//		SRImpact sri = new SRImpact("", source, target, "", "1", "");
//		SRImpact sri = new SRImpact("", source, target, "lib", "6", "bin"+Constants.FILE_SEPARATOR+"main"+Constants.FILE_SEPARATOR+"java");
		time = System.currentTimeMillis() - time;
		System.out.println(time/1000);
//		ImpactAnalysis ia = new ImpactAnalysis(source, target);
//		ia.print();
//		System.out.println(ia.methods);
		

	}

}
