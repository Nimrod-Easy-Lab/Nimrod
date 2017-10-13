package saferefactor.core.execution;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.tools.ant.DefaultLogger;
import org.apache.tools.ant.ProjectHelper;

import saferefactor.core.util.Constants;
import saferefactor.core.util.Project;

public class AntJunitRunner implements TestExecutor {

	private final Project project;

	private String reportPath;
	private String tests;
	private final String tmpDir;

	public AntJunitRunner(Project project, String tmpDir) {
		this.project = project;
		this.tmpDir = tmpDir;
	}

	@Deprecated
	public void executeTests(String tests) throws FileNotFoundException {

		// File buildFile = new File("ant" + "/" + "build_run.xml");
		URL buildFile = AntJunitRunner.class.getResource("/build_run.xml");
		org.apache.tools.ant.Project p = new org.apache.tools.ant.Project();

		p.setProperty("binClasspath", project.getBuildFolder()
				.getAbsolutePath());

		if (project.getLibFolder() != null)
			p.setProperty("libClasspath", project.getLibFolder()
					.getAbsolutePath());
		else
			p.setProperty("libClasspath", project.getBuildFolder()
					.getAbsolutePath());

		p.setProperty("tests.dir", tests);
		p.setProperty("report.dir", reportPath);

		DefaultLogger consoleLogger = new DefaultLogger();
		consoleLogger
				.setMessageOutputLevel(org.apache.tools.ant.Project.MSG_INFO);
		FileOutputStream fileOutputStream = new FileOutputStream(tmpDir
				+ Constants.SEPARATOR + "log_saferefactor_testrunner.txt");
		PrintStream ps = new PrintStream(fileOutputStream);
		consoleLogger.setOutputPrintStream(ps);
		consoleLogger.setErrorPrintStream(ps);

		p.addBuildListener(consoleLogger);

		p.init();
		ProjectHelper helper = ProjectHelper.getProjectHelper();
		p.addReference("ant.projectHelper", helper);
		helper.parse(p, buildFile);

		p.executeTarget(p.getDefaultTarget());

	}

	public void setReportPath(String reportPath) {
		this.reportPath = reportPath;
	}

	public String getReportPath() {
		return reportPath;
	}

	public void run() {
		// File buildFile = new File("ant" + "/" + "build_run.xml");
//		URL buildFile = AntJunitRunner.class.getResource("/build_run.xml");
		String path = System.getProperty("user.dir");
		 URL buildFile = null;
			try {
				buildFile = new File(path
						+ "/src/" + "build_run.xml").toURL();
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		org.apache.tools.ant.Project p = new org.apache.tools.ant.Project();

		p.setProperty("binClasspath", project.getBuildFolder()
				.getAbsolutePath());

		if (project.getLibFolder() != null)
			p.setProperty("libClasspath", project.getLibFolder()
					.getAbsolutePath());
		else
			p.setProperty("libClasspath", project.getBuildFolder()
					.getAbsolutePath());
		p.setProperty("tests.dir", getTests());
		p.setProperty("report.dir", reportPath);
		DefaultLogger consoleLogger = new DefaultLogger();
		consoleLogger
				.setMessageOutputLevel(org.apache.tools.ant.Project.MSG_INFO);
		FileOutputStream fileOutputStream;
		try {
			fileOutputStream = new FileOutputStream(tmpDir
					+ Constants.SEPARATOR + "log_saferefactor_testrunner" + System.currentTimeMillis() + ".txt");

			PrintStream ps = new PrintStream(fileOutputStream);
			consoleLogger.setOutputPrintStream(ps);
			consoleLogger.setErrorPrintStream(ps);
			p.addBuildListener(consoleLogger);
			p.init();
			ProjectHelper helper = ProjectHelper.getProjectHelper();
			p.addReference("ant.projectHelper", helper);
			helper.parse(p, buildFile);
			p.executeTarget(p.getDefaultTarget());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public String getTests() {
		return tests;
	}

	public void setTests(String tests) {
		this.tests = tests;
	}

}
