package saferefactor.core.generation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Random;

import org.evosuite.EvoSuite;
import org.evosuite.ga.metaheuristics.GeneticAlgorithm;

import saferefactor.core.util.Constants;
import saferefactor.core.util.FileUtil;
import saferefactor.core.util.Project;
import saferefactor.core.util.ast.ConstructorImp;
import saferefactor.core.util.ast.Method;
import saferefactor.core.util.ast.MethodImp;

public class EvoSuiteAdapter extends AbstractTestGeneratorAdapter {

	public static String methodsToTest = "methodToTest.txt";
	private final String tmpDir;
	private double timeLimit;
	private List<String> additionalParameters;
	protected String impactedList = "";

	public EvoSuiteAdapter(Project projectToTest, String tmpDir) {
		super(projectToTest);
		this.tmpDir = tmpDir;

	}

	@Override
	public void generateTestsForMethodList(List<Method> methods, double timeLimit, List<String> additionalParameters,
			String impactedList) throws FileNotFoundException {
		// TODO Auto-generated method stub

		this.timeLimit = timeLimit;
		this.additionalParameters = additionalParameters;
		this.impactedList = impactedList;
		generateMethodListFile(methods);

		// String[] command = new String[] { "-generateSuite", "-class", targetClass };
		String[] command = { "-target", project.getBuildFolder().getAbsolutePath(), "-projectCP",
				project.getBuildFolder().getAbsolutePath(), "-base_dir", this.tmpDir, "-Dsearch_budget",
				"" + new Double(timeLimit).intValue(), "-Dlog.level", "OFF", "-Dminimize", "false" };

		try {
			EvoSuite evosuite = new EvoSuite();
			evosuite.parseCommandLine(command);
			System.out.println("Passou!");

		} catch (Throwable t) {
			t.printStackTrace();
		}
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
		// TODO Auto-generated method stub
		return null;
	}

}
