package saferefactor.core.generation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Random;

import org.evosuite.EvoSuite;
import org.evosuite.Properties;
import org.evosuite.utils.Randomness;

import randoop.main.Main;
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
//		generateMethodListFile(methods);
		String[] args = { 
				"-class", "org.joda.time.LocalDate",
				"projectCP", "/home/leofernandesmo/workspace/test-data/mutants-benchmark/joda-time-2.4/target/classes"				
				};
		
		 try {
	            EvoSuite evosuite = new EvoSuite();
	            evosuite.parseCommandLine(args);
	        } catch (Throwable t) {	        
	            System.out.println("Ver o que acontece e corrigir depois...");
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
