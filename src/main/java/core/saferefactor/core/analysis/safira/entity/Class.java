package saferefactor.core.analysis.safira.entity;

import java.util.ArrayList;
import java.util.List;

import saferefactor.core.analysis.safira.analyzer.Tools;




public class Class extends Entity{
	
	List<Method> methods = new ArrayList<Method>();
	
	List<Field> fields = new ArrayList<Field>();
	
	String superClass = "";
		
	List<Method> constructors = new ArrayList<Method>();
	
	List<Class> subClasses = new ArrayList<Class>();
	
	List<String> interfaces = new ArrayList<String>();
	
	List<Class> superClasses = new ArrayList<Class>();

	String modifier = null;
	
	boolean inner = false;
	
	List<Method> inheritedMethods = null;
	
	String package_ = "";
	
	//List<String> imports = new ArrayList<String>();
	
	public void addSubClass(Class sub) {
		this.subClasses.add(sub);
	}
	
	public boolean hasSuperClass() {
		if (superClass.equals("")) {
			return false;
		}
		return true;
	}
	
	public List<Method> getInheritedMethods() {
		if (inheritedMethods == null) {
			inheritedMethods = new ArrayList<Method>();
	 		for (Method m : methods) {
				if (m.inherited) {
					inheritedMethods.add(m);
				}
			}
		}
 		return inheritedMethods;
 	
	}
	
	public void addMethod(Method m) {
		this.methods.add(m);
	}
	
	public void addField(Field f) {
		this.fields.add(f);
	}
	public List<Method> getMethods() {
		return methods;
	}
	public void setMethods(List<Method> methods) {
		this.methods = methods;
	}
	public List<Field> getFields() {
		return fields;
	}
	public void setFields(List<Field> fields) {
		this.fields = fields;
	}

	public String getSuperClass() {
		return superClass;
	}

	public void setSuperClass(String superClass) {
		this.superClass = superClass.replace(Tools.cep, ".");
		this.superClass = this.superClass.replace(Tools.INNER_CLASS_CHARACTER, ".");
	}

	public List<Method> getConstructors() {
		return constructors;
	}

	public void setConstructors(List<Method> constructors) {
		this.constructors = constructors;
	}

	public List<Class> getSubClasses() {
		return subClasses;
	}

	public void setSubClasses(List<Class> subClasses) {
		this.subClasses = subClasses;
	}

	@Override
	public String getModifier() {
		return modifier;
	}

	@Override
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public boolean isInner() {
		return inner;
	}

	public void setInner(boolean inner) {
		this.inner = inner;
	}
	
	public void addInterface (String interf) {
			this.interfaces.add(interf);
	}
	
	public List<String> getInterfaces() {
		return interfaces;
	}

	public void setInterfaces(List<String> interfaces) {
		this.interfaces = interfaces;
	}

	public Method getMethod(String simpleName, String parametersSignature) {
		
		for (Method method : methods) {
			if (method.getSimpleName().equals(simpleName) && 
					method.getParametersSignature().equals(parametersSignature) &&
					!method.isInherited()) {
				return method;
			}
		}
		return null;
	}
	
	public Class getSuperClass(String fullName) {
		for (Class superC : superClasses) {
			if (superC.getFullName().equals(fullName)) {
				return superC;
			}
		}
		return null;
	}
	

	public void addAllInterfaces(List<String> interfaces) {
		
		for (String interf : interfaces) {
			if (!this.interfaces.contains(interf)) {
				this.interfaces.add(interf);
			}
		}
		
	}
	

	public void addAllSuperClasse(List<Class> classes) {
		
		for (Class c : classes) {
			addSuperClasse(c);
		}
		
	}
	
	public void addSuperClasse(Class c) {
		if (!superClasses.contains(c)) {
			superClasses.add(c);
		}
	}
	
	public List<Class> getSuperClasses() {
		return superClasses;
	}

	public void setSuperClasses(List<Class> superClasses) {
		this.superClasses = superClasses;
	}

	public String getPackage() {
		if (package_.equals("")) {
			if (fullName.contains(".")) {
				package_ = this.fullName.substring(0, this.fullName.lastIndexOf("."));
			}
		}
		return package_;
	}
//	public List<String> getImports() {
//		return imports;
//	}
//
//	public void setImports(List<String> imports) {
//		this.imports = imports;
//	}
	
	
}
