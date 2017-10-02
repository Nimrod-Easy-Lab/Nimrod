package saferefactor.core.execution;

import saferefactor.core.util.ast.Method;

public class MethodCoverage {
	
	
	private Method method;
	
	private int line_rate;

	public int getLine_rate() {
		return line_rate;
	}

	public Method getMethod() {
		return method;
	}

	public void setMethod(Method method) {
		this.method = method;
	}

	public void setLine_rate(int line_rate) {
		this.line_rate = line_rate;
	}

	


}
