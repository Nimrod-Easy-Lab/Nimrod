package saferefactor.core.analysis;

import java.util.ArrayList;
import java.util.List;

import saferefactor.core.util.ast.Method;


public class Report {
	//In future: Change from "String" to "saferefactor.core.util.ast.Clazz".
	private List<String> requiredClassesToTest;
	private List<Method> methodsToTest;

	public List<Method> getMethodsToTest() {
		return methodsToTest;
	}

	public void setMethodsToTest(List<Method> methodsToTest) {
		this.methodsToTest = methodsToTest;
	}
	
	public void addMethodsToTest(List<Method> methodsToTest) {
		this.methodsToTest.addAll(methodsToTest);
	}
	
	public void addAMethodToTest(Method method) {
		this.methodsToTest.add(method);
	}

	public List<String> getRequiredClassesToTest() {		
//		requiredClassesToTest.add("java.util.Date");
		return requiredClassesToTest;
	}

	public void setRequiredClassesToTest(List<String> requiredClassesToTest) {
		this.requiredClassesToTest = requiredClassesToTest;
	}
	
	public void addARequiredClassToTest(String classToTest) {
		this.requiredClassesToTest.add(classToTest);
	}	

}
