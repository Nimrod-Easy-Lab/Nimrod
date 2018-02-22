package saferefactor.core.generation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import randoop.main.Main;

import org.apache.commons.lang.ArrayUtils;
import org.apache.tools.ant.DefaultLogger;
import org.apache.tools.ant.ProjectHelper;

import saferefactor.core.Parameters;
import saferefactor.core.util.Constants;
import saferefactor.core.util.FileUtil;
import saferefactor.core.util.Project;
import saferefactor.core.util.ast.Method;
import saferefactor.core.util.ast.ConstructorImp;
import saferefactor.core.util.ast.MethodImp;

public class RandoopAntAdapter extends AbstractTestGeneratorAdapter {

	public static String methodsToTest = "methodToTest.txt";
	private final String tmpDir;
	private List<String> additionalParameters;
	private double timeLimit;
	protected String impactedList = "";
	

	public RandoopAntAdapter(Project projectToTest, String tmpDir) {
		super(projectToTest);
		this.tmpDir = tmpDir;
		

	}


	public void generateTestsForMethodList(List<Method> methods,
			double timeLimit, List<String> additionalParameters, String impactedList)
			throws FileNotFoundException
	{

		this.timeLimit = timeLimit;
		this.additionalParameters = additionalParameters;
		this.impactedList = impactedList;
		generateMethodListFile(methods);
		
		runRandoopThroughAnt();

	}

	private void runRandoopThroughAnt() throws FileNotFoundException {

		String path = System.getProperty("user.dir");
		File buildFile = null;
		
		String apath = path + "/src/" + "build_generator.xml";
		buildFile = new File(apath);
			
		org.apache.tools.ant.Project p = new org.apache.tools.ant.Project();

		p.setProperty("projectBin", project.getBuildFolder().getAbsolutePath());

		if (project.getLibFolder() != null) {
			p.setProperty("sourceLib", project.getLibFolder().getAbsolutePath());
		}
		else {
			p.setProperty("sourceLib", project.getProjectFolder()
					.getAbsolutePath());
		}
		p.setProperty("timeout", String.valueOf(timeLimit));
		
		impactedList = "";
		p.setProperty("impactedMethods", this.impactedList);

		String isFork = "true";

		StringBuffer randoopParametersForAnt = new StringBuffer();
		for (String parameter : additionalParameters) {
			if (parameter.startsWith("fork")) {
				String[] forkParameter = parameter.split("=");
				isFork = forkParameter[1];
			} else {
				randoopParametersForAnt.append(parameter);
				randoopParametersForAnt.append(";");
			}

		}

		p.setProperty("fork", isFork);
		p.setProperty("test.folder", tmpDir);
		p.setProperty("randoopParameters", randoopParametersForAnt.toString());

		DefaultLogger consoleLogger = new DefaultLogger();
		consoleLogger
				.setMessageOutputLevel(org.apache.tools.ant.Project.MSG_INFO);

		FileOutputStream fileOutputStream = new FileOutputStream(tmpDir  + Constants.SEPARATOR + 
				"log_saferefactor_generation.txt");
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

	private void generateMethodListFile(List<Method> methods) {

		Random random = new Random();
		StringBuffer lines = new StringBuffer();
			for (Method method : methods) {
				if (method instanceof ConstructorImp)
					lines.append(method + "\n");
			}
			for (Method method : methods) {
				if (method instanceof MethodImp)
					lines.append(method + "\n");
			}
		FileUtil.makeFile(tmpDir + Constants.SEPARATOR + methodsToTest, lines.toString());

	}

	@Override
	public List<File> getTestFiles() {
		List<File> result = new ArrayList<File>();

		return result;

	}

	public static void main(String[] args) {
			
		String timeout = args[0];
		String tmpDir = args[1];
		
		String randoopParameters = "";
		if (args.length > 2) randoopParameters = args[2];
		String impactedList  = args[3];

		Main main2 = new Main();
		String[] argsRandoop = {
				"gentests",
				"--methodlist=" + tmpDir + Constants.SEPARATOR + methodsToTest,
				"--timelimit=" + timeout,
				"--log=filewriter",
				"--junit-output-dir="
						+ tmpDir,
				"--output-nonexec=true" };

		if (randoopParameters.length() > 0) {
			String[] listRandoopParameters = randoopParameters.split(";");

			if (listRandoopParameters.length > 0)
				argsRandoop = (String[]) ArrayUtils.addAll(argsRandoop,
						listRandoopParameters);

		}
		ArrayList<String> impactedMethods = new ArrayList<String>();
		String[] split = impactedList.split(" ");
		for (String string : split) {
			if (!string.equals("")) {
				impactedMethods.add(string);
				System.out.println("impacted Method "+string);
			}
		}
		//main2.nonStaticMainAJ(argsRandoop, impactedMethods);
		main2.nonStaticMain(argsRandoop);
		System.exit(0);
	}

}
