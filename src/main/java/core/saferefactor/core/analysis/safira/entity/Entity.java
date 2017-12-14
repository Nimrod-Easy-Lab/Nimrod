package saferefactor.core.analysis.safira.entity;

public class Entity {
	
	String fullName;
	String simpleName;
	String classFullName;
	String visibility = "";
	boolean inherited = false;
	String modifier = "";
	
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getSimpleName() {
		return simpleName;
	}
	public void setSimpleName(String simpleName) {
		this.simpleName = simpleName;
	}
	public String getClassFullName() {
		return classFullName;
	}
	public void setClassFullName(String classFullName) {
		this.classFullName = classFullName;
	}
	public String getVisibility() {
		return visibility;
	}
	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}
	
	@Override
	public String toString(){
		return this.fullName;
	}
	public boolean isInherited() {
		return inherited;
	}
	public void setInherited(boolean inherited) {
		this.inherited = inherited;
	}
	public String getModifier() {
		return modifier;
	}
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}
}
