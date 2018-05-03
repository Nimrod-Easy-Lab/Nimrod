package saferefactor.core.generation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Random;

import randoop.main.Main;
import saferefactor.core.util.Constants;
import saferefactor.core.util.FileUtil;
import saferefactor.core.util.Project;
import saferefactor.core.util.ast.ConstructorImp;
import saferefactor.core.util.ast.Method;
import saferefactor.core.util.ast.MethodImp;

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
	public void generateTestsForMethodList(List<Method> methods, double timeLimit, List<String> additionalParameters,
			String impactedList) throws FileNotFoundException {
		this.generateTestsForMethodList(methods, null, timeLimit, additionalParameters, impactedList);
	}

	private void generateMethodListFile(List<Method> methods) {
		StringBuffer lines = new StringBuffer();
		for (Method method : methods) {
			if (method instanceof ConstructorImp) {
				// lines.append(method + "\n");
				String strParams = String.join(",", method.getParameterList());
				lines.append(method.getSimpleName() + "(" + strParams + ")" + "\n");
			}
		}
		for (Method method : methods) {
			if (method instanceof MethodImp) {
				// lines.append(method + "\n");
				String strParams = String.join(",", method.getParameterList());
				lines.append(method.getDeclaringClass() + "." + method.getSimpleName() + "(" + strParams + ")" + "\n");
			}
		}
		FileUtil.makeFile(tmpDir + Constants.SEPARATOR + methodsToTest, lines.toString());
	}

	@Override
	public List<File> getTestFiles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void generateTestsForMethodList(List<Method> methods, List<String> requiredClassesToTest, double timeLimit,
			List<String> additionalParameters, String impactedList) throws FileNotFoundException {

		this.timeLimit = timeLimit;
		this.additionalParameters = additionalParameters;
		generateMethodListFile(methods);

		Main main2 = new Main();
		String[] argsRandoop = { "gentests", "--methodlist=" + tmpDir + Constants.SEPARATOR + methodsToTest,
				// "--testclass=" + "butterknife.compiler.QualifiedId",
				"--time-limit=" + (int) timeLimit, "--log=filewriter", "--junit-output-dir=" + tmpDir
				// LEO: Limita os testes aos que tiverem uma referência a classe XXX.
//				(requiredClassesToTest != null)?"--require-classname-in-test=" + String.join(",", requiredClassesToTest):""
				// "--require-classname-in-test=" + "butterknife.compiler.QualifiedId",
				// "--output-nonexec=true"
		};

		main2.nonStaticMain(argsRandoop);
		// ArrayList<String> impactedMethods = new ArrayList<String>();
		// main2.nonStaticMainAJ(argsRandoop, impactedMethods);

	}

}
