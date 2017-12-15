package saferefactor.core.util.ast;

import java.io.Serializable;
import java.util.List;

public class Clazz implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6943788788492508467L;
	private String fullName;
	private String parent = "";

	private List<ConstructorImp> constructors;
	private List<MethodImp> methods;

	public Clazz() {

	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public List<ConstructorImp> getConstructors() {
		return constructors;
	}

	public void setConstructors(List<ConstructorImp> constructors) {
		this.constructors = constructors;
	}

	public List<MethodImp> getMethods() {
		return methods;
	}

	public void setMethods(List<MethodImp> methods) {
		this.methods = methods;
	}

	@Override
	public String toString() {

		String result;

		result = "Class: " + this.fullName + "\n" + "SuperClass: "
				+ this.parent + "\n Constructors: \n";
		for (ConstructorImp constructor : this.constructors) {
			result = result + constructor.toString() + "\n";
		}
		result = result + "methods: \n";

		for (Method method : this.methods) {
			result = result + method.toString() + "\n";
		}
		return result;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((constructors == null) ? 0 : constructors.hashCode());
		result = prime * result
				+ ((fullName == null) ? 0 : fullName.hashCode());
		result = prime * result + ((methods == null) ? 0 : methods.hashCode());
		result = prime * result + ((parent == null) ? 0 : parent.hashCode());
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
		Clazz other = (Clazz) obj;
		if (fullName == null) {
			if (other.fullName != null)
				return false;
		} else if (!fullName.equals(other.fullName))
			return false;
		return true;
	}

}
