package saferefactor.core.comparator;

import java.util.List;

import japa.parser.ast.body.MethodDeclaration;
import japa.parser.ast.body.VariableDeclarator;
import japa.parser.ast.expr.AssignExpr;
import japa.parser.ast.expr.Expression;
import japa.parser.ast.expr.MethodCallExpr;
import japa.parser.ast.expr.NameExpr;
import japa.parser.ast.expr.VariableDeclarationExpr;
import japa.parser.ast.visitor.VoidVisitorAdapter;

public class ExpressionVisitor extends VoidVisitorAdapter {
	

	

	private String methodName;
	private String targetVar;

	public ExpressionVisitor() {
	
	}
	
	@Override
	public void visit(VariableDeclarationExpr n, Object arg) {
		String varName = (String) arg;
		List<VariableDeclarator> vars = n.getVars();
		for (VariableDeclarator variableDeclarator : vars) {
			if (variableDeclarator.getId().getName().equals(varName)) {
				MethodCallExpr callExpression = (MethodCallExpr) variableDeclarator.getInit();
				setMethodName(callExpression.getName());
				NameExpr scope = (NameExpr) callExpression.getScope();				
				setTargetVar(scope.getName());
				
				
			}
			
		}
		
		
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public String getTargetVar() {
		return targetVar;
	}

	public void setTargetVar(String targetVar) {
		this.targetVar = targetVar;
	}
}
