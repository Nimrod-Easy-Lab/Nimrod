package saferefactor.core.comparator;

import japa.parser.ast.body.VariableDeclarator;
import japa.parser.ast.expr.MethodCallExpr;
import japa.parser.ast.expr.NameExpr;
import japa.parser.ast.expr.VariableDeclarationExpr;
import japa.parser.ast.type.ReferenceType;
import japa.parser.ast.type.Type;
import japa.parser.ast.visitor.VoidVisitorAdapter;

import java.util.List;

public class TypeAnalysisVisitor extends VoidVisitorAdapter {
	
	
	private String typeName;

	@Override
	public void visit(VariableDeclarationExpr n, Object arg) {
		String varName = (String) arg;
		List<VariableDeclarator> vars = n.getVars();
		for (VariableDeclarator variableDeclarator : vars) {
			if (variableDeclarator.getId().getName().equals(varName)) {
				ReferenceType type = (ReferenceType) n.getType();
				setTypeName(type.toString());
			}
			
		}
		
		
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

}
