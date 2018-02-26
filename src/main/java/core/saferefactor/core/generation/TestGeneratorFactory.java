package saferefactor.core.generation;

import saferefactor.core.util.Project;

public class TestGeneratorFactory {

	private TestGeneratorFactory() {
		super();
	}

	private static AbstractTestGeneratorAdapter testGenerator;

	public static AbstractTestGeneratorAdapter create(TestGeneratorType t, Project projectToTest, String tmpDir) {
		switch (t) {
		case RANDOOP_ANT:
			testGenerator =  new RandoopAntAdapter(projectToTest, tmpDir);
		case RANDOOP:
			testGenerator =  new RandoopAdapter(projectToTest, tmpDir);
		case EVO_SUITE:
			testGenerator =  new EvoSuiteAdapter(projectToTest, tmpDir);
		default:
			testGenerator =  new RandoopAntAdapter(projectToTest, tmpDir);
		}
		return testGenerator;
	}

}
