package saferefactor.core.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.tools.ant.DefaultLogger;
import org.apache.tools.ant.ProjectHelper;

public class AntJavaCompiler implements Compiler {

	private String binClasspath = "";
	private String libClasspath = "";
	// private String path = System.getProperty("java.home") + "/bin/javac";
	// private String buildPath;
	private final String tmpDir;

	public AntJavaCompiler(String tmpDir) {
		this.tmpDir = tmpDir;

	}

	public void compile(String src, String dest) throws FileNotFoundException {

		// URL buildFile =
		// AntJavaCompiler.class.getResource("/build_compile.xml");

		String path = System.getProperty("user.dir");
		URL buildFile = null;
		try {
			buildFile = new File(path + "/src/" + "build_compile.xml").toURL();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		org.apache.tools.ant.Project p = new org.apache.tools.ant.Project();

		DefaultLogger consoleLogger = new DefaultLogger();
		consoleLogger.setMessageOutputLevel(org.apache.tools.ant.Project.MSG_INFO);
		FileOutputStream fileOutputStream = new FileOutputStream(tmpDir + Constants.SEPARATOR + "log_compile.txt");
		PrintStream ps = new PrintStream(fileOutputStream);
		consoleLogger.setOutputPrintStream(ps);
		consoleLogger.setErrorPrintStream(ps);
		// if (buildPath != null) {
		// buildFile = new File(buildPath).toURI().toURL() ;
		// }
		p.setProperty("binClasspath", binClasspath);
		// p.setProperty("compiler", path);

		if (libClasspath.equals(""))
			p.setProperty("libClasspath", binClasspath);
		else
			p.setProperty("libClasspath", libClasspath);
		p.setProperty("src", src);
		p.setProperty("dest", dest);

		p.addBuildListener(consoleLogger);
		p.init();
		ProjectHelper helper = ProjectHelper.getProjectHelper();
		p.addReference("ant.projectHelper", helper);
		helper.parse(p, buildFile);

		p.executeTarget(p.getDefaultTarget());

	}

	public String getLibClasspath() {
		return libClasspath;
	}

	public void setLibClasspath(String libClasspath) {
		this.libClasspath = libClasspath;
	}

	public String getBinClasspath() {
		return binClasspath;
	}

	public void setBinClasspath(String binClasspath) {
		this.binClasspath = binClasspath;
	}

	// public void setCompilerPath(String path) {
	// this.path = path;
	// }

	// public void setBuildPath(String buildPath) {
	// this.buildPath = buildPath;
	//
	// }

}
