package saferefactor.core.generation;

import saferefactor.core.util.Project;

public class TestGeneratorFactory {

	private TestGeneratorFactory() {
		super();
	}

	private static AbstractTestGeneratorAdapter testGenerator;

	public static AbstractTestGeneratorAdapter create(TestGeneratorType t, Project projectToTest, String tmpDir) {
		if (testGenerator == null) {
			switch (t) {
			case RANDOOP_ANT:
				testGenerator = new RandoopAntAdapter(projectToTest, tmpDir);
				return testGenerator;
			case RANDOOP:
				testGenerator = new RandoopAdapter(projectToTest, tmpDir);
				return testGenerator;
			case EVO_SUITE:
				testGenerator = new EvoSuiteAdapter(projectToTest, tmpDir);
				return testGenerator;
			default:
				testGenerator = new RandoopAntAdapter(projectToTest, tmpDir);
				return testGenerator;
			}
		} else {
			return testGenerator;
		}
	}

}
