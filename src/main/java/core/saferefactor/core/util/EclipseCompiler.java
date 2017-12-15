package saferefactor.core.util;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.MalformedURLException;

import saferefactor.core.SafeRefactorException;


public class EclipseCompiler implements Compiler {

	

	private String binClasspath;

	public void compile(String src, String dest)
			throws MalformedURLException, FileNotFoundException, SafeRefactorException {
		
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		ByteArrayOutputStream outError = new ByteArrayOutputStream();

		PrintWriter pw = new PrintWriter(out);
		PrintWriter pwerror = new PrintWriter(outError);

		String classpath = "-1.6 -classpath rt.jar:lib/junit-4.5.jar ";
		if (binClasspath != null)
			classpath = "-1.6 -classpath rt.jar:lib/junit-4.5.jar:" + binClasspath + " ";
		org.eclipse.jdt.internal.compiler.batch.Main.compile(
				classpath + src + " -d " + dest, pw, pwerror);

		// System.out.println(out.toString());

//		 System.out.println(outError.toString());
		if (outError.toString().length() > 0) 
			throw new SafeRefactorException("Problem during compilation: " + outError.toString());
	}

	public void setBinClasspath(String binClasspath) {
		this.binClasspath = binClasspath;
		

	}

	public void setLibClasspath(String libClasspath) {

	}

	public void setCompilerPath(String path) {

	}

	public void setBuildPath(String buildPath) {

	}

}
