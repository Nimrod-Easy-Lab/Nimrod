package saferefactor.core.analysis;

import java.util.List;

import saferefactor.core.util.ast.Method;


public class Report {
	
	private List<Method> methodsToTest;

	public List<Method> getMethodsToTest() {
		return methodsToTest;
	}

	public void setMethodsToTest(List<Method> methodsToTest) {
		this.methodsToTest = methodsToTest;
	}
	
	

}
