package saferefactor.core.util.ast;


public class ConstructorImp extends Method {
	
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5647872946168504042L;

	public void setDeclaringClass(String declaringClass) {
		this.declaringClass = declaringClass;
	}
	public String getDeclaringClass() {
		return declaringClass;
	}
	
	@Override
	public String toString() {
		
		String signature = this.getSimpleName();		
		signature = signature + ".<init>(";
		for (int j = 0; j < getParameterList().size(); j++) {
			signature = signature + this.getParameterList().get(j);
			if (j < (this.getParameterList().size() - 1))
				signature =  signature + ", ";					
		}
		signature = "cons : " + signature + ")";
		return signature;
	}


	
	

}
