package saferefactor.core.generation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Random;

import saferefactor.core.util.Constants;
import saferefactor.core.util.FileUtil;
import saferefactor.core.util.Project;
import saferefactor.core.util.ast.ConstructorImp;
import saferefactor.core.util.ast.Method;
import saferefactor.core.util.ast.MethodImp;
import saferefactor.localrandoop.main.Main;

public class RandoopAdapter extends AbstractTestGeneratorAdapter {

	public static String methodsToTest = "methodToTest.txt";
	private final String tmpDir;

	private List<String> additionalParameters;
	private double timeLimit;

	protected RandoopAdapter(Project projectToTest, String tmpDir) {
		super(projectToTest);
		this.tmpDir = tmpDir;

	}

	@Override
	public void generateTestsForMethodList(List<Method> methods, double timeLimit,
			List<String> additionalParameters, String impactedList) throws FileNotFoundException {

		this.timeLimit = timeLimit;
		this.additionalParameters = additionalParameters;
		generateMethodListFile(methods);

		Main main2 = new Main();
		String[] argsRandoop = { "gentests",
				"--methodlist=" + tmpDir + Constants.SEPARATOR + methodsToTest,
				"--timelimit=" + timeLimit, "--log=filewriter",
				"--junit-output-dir=" + tmpDir, "--output-nonexec=true" };

		main2.nonStaticMain(argsRandoop);
//		ArrayList<String> impactedMethods = new ArrayList<String>();
//		main2.nonStaticMainAJ(argsRandoop, impactedMethods);
	}

	private void generateMethodListFile(List<Method> methods) {

		Random random = new Random();
		int choice = random.nextInt(2);
		System.out.println(choice);
		StringBuffer lines = new StringBuffer();
		if (choice == 0) {
			for (Method method : methods) {
				lines.append(method + "\n");
			}
		} else {
			for (Method method : methods) {
				if (method instanceof ConstructorImp)
					lines.append(method + "\n");
			}
			for (Method method : methods) {
				if (method instanceof MethodImp)
					lines.append(method + "\n");
			}

		}

		FileUtil.makeFile(tmpDir + Constants.SEPARATOR + methodsToTest,
				lines.toString());

	}

	@Override
	public List<File> getTestFiles() {
		// TODO Auto-generated method stub
		return null;
	}

}
