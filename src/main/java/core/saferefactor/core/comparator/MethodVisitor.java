package saferefactor.core.comparator;

import japa.parser.ast.body.MethodDeclaration;
import japa.parser.ast.visitor.VoidVisitorAdapter;

public class MethodVisitor extends VoidVisitorAdapter {
	
	private MethodDeclaration method;
	private final String testName;
	
	public MethodVisitor(String testName) {
		this.testName = testName;
		
	}
	
	public void visit(MethodDeclaration n, Object arg) {
		
		if (n.getName().equals(testName)) {
			
			method = n;
		}
	}

	public MethodDeclaration getMethod() {
		return method;
	}

	public void setMethod(MethodDeclaration method) {
		this.method = method;
	}
}