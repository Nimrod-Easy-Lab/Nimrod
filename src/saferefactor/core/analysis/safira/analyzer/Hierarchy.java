package saferefactor.core.analysis.safira.analyzer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import saferefactor.core.analysis.safira.entity.*;
import saferefactor.core.analysis.safira.entity.Class;;


public class Hierarchy {

	Class c;
	HashMap<String,Class> classes = new HashMap<String,Class>();
	Map<String, List<Class>> interfaces = new HashMap<String, List<Class>>();
	
	public Hierarchy (HashMap<String,Class> classes, Map<String, List<Class>> interfaces) {
		this.classes = classes;
		this.interfaces = interfaces;
		//this.c = c;
	}
	
	public Class addInheritedMetodsAndFields(Class c, Class superC) {
		
		
		//mutante-----------
		c.addAllSuperClasse(superC.getSuperClasses());
		c.addSuperClasse(superC);
		c.addAllInterfaces(superC.getInterfaces());
		
		//-----------------
		
		List<Method> superm = superC.getMethods();
		List<Method> m = c.getMethods();
		for (Method method : superm) {
			boolean containsClassIsInterface = false;
			Method containsMethod = containsMethod(m, method); 
			if (containsMethod != null) {
				Class containsClass = containsMethod.getDeclaringClass();
				if (interfaces.get(containsClass.getFullName()) != null) {
					containsClassIsInterface= true;
				}
			}
			if ((((containsMethod != null) && containsClassIsInterface) || (containsMethod == null)) && !method.isConstructor()) {
//			if ((containsMethod != null) && !method.isConstructor()) {
				Method newMethod = new Method();
				newMethod.setInherited(true);
				newMethod.setC(c);
				if (!method.isInherited()) {
					newMethod.setDeclaringClass(superC);
				} else {
					newMethod.setDeclaringClass(method.getDeclaringClass());
				}
				newMethod.setMethodInvoc(method.getMethodInvoc());
				newMethod.setFieldInvoc(method.getFieldInvoc());
				newMethod.setFullName(c.getFullName()+"."+method.getSimpleName()+"("+method.getParametersSignature()+")");
				newMethod.setDesc(method.getDesc());
				newMethod.setParameters(method.getParameters());
				newMethod.setClassFullName(c.getFullName());
				newMethod.setParametersSignature(method.getParametersSignature());
				newMethod.setType(method.getType());
				newMethod.setSimpleName(method.getSimpleName());
				newMethod.setText(method.getText());
				newMethod.setInstructionNodes(method.getInstructionNodes());
				newMethod.setVisibility(method.getVisibility());
				newMethod.doSignatureRandoop();
				c.addMethod(newMethod);
			}
		}
		
		List<Field> superf = superC.getFields();
		List<Field> f = c.getFields();
		
		for (Field field : superf) {
			if (!containsField(f, field)) {
				Field newField = new Field();
				newField.setInherited(true);
				newField.setC(c);
				if (!field.isInherited()) {
					newField.setDeclaringClass(superC);
				} else {
					newField.setDeclaringClass(field.getDeclaringClass());
				}
				
				newField.setFullName(c.getFullName()+"."+field.getSimpleName());
		//		newMethod.setPackageName(c.getPackagePath());
				//no lugar do package colocar o classFullName?
				newField.setClassFullName(c.getFullName());
//				newMethod.setParameters_randoop(method.getParameters_randoop());
				newField.setType(field.getType());
				newField.setSimpleName(field.getSimpleName());
//				newMethod.setStatements(method.getStatements());
				newField.setVisibility(field.getVisibility());
				c.addField(newField);
			}
		}
		

		return c;
		
	}
	
	public boolean containsField(List<Field> l, Field f) {
		for (Field field : l) {
			if (field.getSimpleName().equals(f.getSimpleName())) {
				return true;
			}
		}
		return false;
	}
	
	public Method containsMethod(List<Method> l, Method m) {
		
		for (Method method : l) {
//			if (!method.isConstructor())
				if (method.getSimpleName().equals(m.getSimpleName()) && 
						method.getParametersSignature().equals(m.getParametersSignature())) {
					return method;
				}
		}
		return null;
	}
	

	
	
//	public void getAllSubClassesInTheHierarchy(Class c) {
//		List<Class> subclassesC = c.getSubClasses();
//		for(Class sub: subclassesC) {
//			subClasses.add(sub);
//			getAllSubClassesInTheHierarchy(sub);
//		}
//	
//	}
	
	
	
	
	//colocar todos os filhos de uma classe e vai descendo na hierarquia
	public void putChildrenInTheCLass( Class c) {
		//o que o mÈtodo procura eh: algum typeVisitor È filho de c?
		for (Class typeVisitor : classes.values()) {
			if (typeVisitor.hasSuperClass()) {
				if (typeVisitor.getSuperClass().equals(c.getFullName())) {
					if (!containsClass(c.getSubClasses(), typeVisitor)) {
						this.c.addSubClass(typeVisitor);
						c.addSubClass(typeVisitor);
					}
						Class cc = addInheritedMetodsAndFields(typeVisitor, c);
						typeVisitor.setMethods(cc.getMethods());
						putChildrenInTheCLass( typeVisitor);
					

				}
			}
			
			//descomentar
			if (typeVisitor.getInterfaces().size() >0) {
				//mutante-------------
				List<String> interfaces = new ArrayList<String>();
				interfaces.addAll(typeVisitor.getInterfaces());
				//------------ desfazer e colocar diretamente no loop o typeVisitor.getInterfaces() ao invés de interfaces
				
				for (String interf : interfaces) {
					if (interf.equals(c.getFullName())) {
						if (!containsClass(c.getSubClasses(), typeVisitor)) {
							this.c.addSubClass(typeVisitor);
							c.addSubClass(typeVisitor);
						}
							Class cc = addInheritedMetodsAndFields(typeVisitor, c);
							typeVisitor.setMethods(cc.getMethods());
							putChildrenInTheCLass(typeVisitor);
					}
				}
//				
			}
		}
	}

	public boolean containsClass(List<Class> list, Class c) {
		for (Class class1 : list) {
			if (class1.getFullName().equals(c.getFullName())) {
				return true;
			}
		}
		return false;
	}
	
	public Class getC() {
		return c;
	}

	public void setC(Class c) {
		this.c = c;
		putChildrenInTheCLass(c);
	}
	
	public HashMap<String, Class> getClasses() {
		return classes;
	}

	public void setClasses(HashMap<String, Class> classes) {
		this.classes = classes;
	}

	public void putC() {
		this.classes.put(c.getFullName(), c);
	}
}
