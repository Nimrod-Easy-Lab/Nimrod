package saferefactor.core.util.ast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MethodImp extends Method {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2435365144935676292L;

	public MethodImp() {
		super();
	}
	
	@Override
	public String toString() {

		String methodSig = this.declaringClass + "." + this.simpleName + "(";

		for (int j = 0; j < this.parameterList.size(); j++) {
			methodSig = methodSig + parameterList.get(j);
			if (j < (parameterList.size() - 1))
				methodSig = methodSig + ", ";
		}
		methodSig = "method : " + methodSig + ") : ";
		if (getAllowedClasses().size() != 0) {
			for (String allowedClass : getAllowedClasses()) {
				methodSig = methodSig + allowedClass + ";";
			}
			methodSig = methodSig.substring(0, methodSig.length() -1);
		}
			
		return methodSig;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((declaringClass == null) ? 0 : declaringClass.hashCode());
		result = prime * result
				+ ((parameterList == null) ? 0 : parameterList.hashCode());
		result = prime * result
				+ ((simpleName == null) ? 0 : simpleName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Method other = (Method) obj;
		if (declaringClass == null) {
			if (other.declaringClass != null)
				return false;
		} else if (!declaringClass.equals(other.declaringClass))
			return false;
		if (parameterList == null) {
			if (other.parameterList != null)
				return false;
		} else if ((parameterList.size() > 0 || other.parameterList.size() > 0) && !parameterList.equals(other.parameterList))
			return false;
		if (simpleName == null) {
			if (other.simpleName != null)
				return false;
		} else if (!simpleName.equals(other.simpleName))
			return false;
		return true;
	}



}
