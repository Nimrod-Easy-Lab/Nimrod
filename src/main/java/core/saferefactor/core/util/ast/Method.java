package saferefactor.core.util.ast;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Method implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3677258943057736980L;

	public Method() {
		this.allowedClasses = new HashSet<String>();
	}
	
	private Set<String> allowedClasses;
	protected String declaringClass;
	protected List<String> parameterList;
	protected String simpleName;

	public Set<String> getAllowedClasses() {
		return allowedClasses;
	}

	public void setAllowedClasses(Set<String> allowedClasses) {
		this.allowedClasses = allowedClasses;
	}

	public String getDeclaringClass() {
		return declaringClass;
	}

	public void setDeclaringClass(String declaringClass) {
		this.declaringClass = declaringClass;
	}

	public String getSimpleName() {
		return simpleName;
	}

	public void setSimpleName(String simpleName) {
		this.simpleName = simpleName;
	}

	public void setParameterList(List<String> parameterList) {
		this.parameterList = parameterList;
	}

	public List<String> getParameterList() {
		return parameterList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((allowedClasses == null) ? 0 : allowedClasses.hashCode());
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
		} else if (!parameterList.equals(other.parameterList))
			return false;
		if (simpleName == null) {
			if (other.simpleName != null)
				return false;
		} else if (!simpleName.equals(other.simpleName))
			return false;
		return true;
	}

	
}
