package saferefactor.core.analysis.safira.entity;

import java.util.ArrayList;
import java.util.List;

public class Field extends Entity{
	
	String type;
	
	/**
	 * Classe que contém o field, se inherited = false , entao containsCLass = c
	 */
	Class declaringClass;
	
	Class c;
	
	
	String modifier = "";
	
	List<Object> text = new ArrayList<Object>();
	
	//apenas para fieldAccessVisitor
	boolean isWritten = false;
	
	boolean isRead = false;

	private List<Method> methodThatCall = new ArrayList<Method>();
	
	
	
	public boolean equals(Field f) {
		if (this.getFullName().equals(f.getFullName()) && this.isInherited() == f.isInherited()) {
			return true;
		}
		return false;
			
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Class getDeclaringClass() {
		return declaringClass;
	}

	public void setDeclaringClass(Class containsClass) {
		this.declaringClass = containsClass;
	}

	public Class getC() {
		return c;
	}

	public void setC(Class c) {
		this.c = c;
	}

	@Override
	public boolean isInherited() {
		return inherited;
	}

	@Override
	public void setInherited(boolean inherited) {
		this.inherited = inherited;
	}

	@Override
	public String getModifier() {
		return modifier;
	}

	@Override
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}
	
	public boolean equalsText(List<Object> text) {
		
		if (text.size() == this.text.size()) {
			for (int i = 0; i < text.size(); i++) {
				String text1 = text.get(i).toString();
				String text2 = this.text.get(i).toString();
				if (!text1.equals(text2)) {
					return false;
				}
			}
		} else
			return false;
		
		return true;
	}
	
	public List<Object> getText() {
		return text;
	}


	public void setText(List<Object> text) {
		this.text = text;
	}

	public boolean isWritten() {
		return isWritten;
	}

	public void setWritten(boolean isWritten) {
		this.isWritten = isWritten;
	}

	public boolean isRead() {
		return isRead;
	}

	public void setRead(boolean isRead) {
		this.isRead = isRead;
	}
	
	public List<Method> getMethodThatCall() {
		return methodThatCall;
	}


	public void setMethodThatCall(List<Method> methodThatCall) {
		this.methodThatCall  = methodThatCall;
	}
	
	public void addMethodThatCall(Method m) {
		if (!this.methodThatCall.contains(m))
			this.methodThatCall.add(m);
	}
	
	public void addAllMethodThatCall(List<Method> m) {
		for (Method method : m) {
			addMethodThatCall(method);
		}
	}

}
