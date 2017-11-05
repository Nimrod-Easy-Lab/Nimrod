package saferefactor.core.util;

import java.io.File;
import java.io.Serializable;

public class Project implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3089522375937738103L;

	private File projectFolder;
	
	private File buildFolder;
	private File srcFolder;
	private File libFolder;
	private String bin;
	private boolean compile = true; 
	
	public File getProjectFolder() {
		return projectFolder;
	}
	public void setProjectFolder(File projectFolder) {
		this.projectFolder = projectFolder;
	}
	public File getBuildFolder() {
		return buildFolder;
	}
	public void setBuildFolder(File buildFolder) {
		this.buildFolder = buildFolder;
	}
	public File getSrcFolder() {
		return srcFolder;
	}
	public void setSrcFolder(File srcFolder) {
		this.srcFolder = srcFolder;
	}
	public File getLibFolder() {
		return libFolder;
	}
	public void setLibFolder(File libFolder) {
		this.libFolder = libFolder;
	}
	public boolean isCompile() {
		return compile;
	}
	public void setCompile(boolean compile) {
		this.compile = compile;
	}
	public String getBin() {
		return bin;
	}
	public void setBin(String bin) {
		this.bin = bin;
	}
	

}
