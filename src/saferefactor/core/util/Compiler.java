package saferefactor.core.util;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

import saferefactor.core.SafeRefactorException;

public interface Compiler {
	
	public void compile(String src, String dest) throws MalformedURLException, FileNotFoundException, SafeRefactorException;

	public void setBinClasspath(String binClasspath);

	public void setLibClasspath(String libClasspath);
	
//	public void setCompilerPath(String path);

//	public void setBuildPath(String buildPath);

}
