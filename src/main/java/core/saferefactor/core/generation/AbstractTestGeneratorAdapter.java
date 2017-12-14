package saferefactor.core.generation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

import saferefactor.core.util.Project;
import saferefactor.core.util.ast.Method;

public abstract class AbstractTestGeneratorAdapter {

	


	protected Project project;

	public abstract void generateTestsForMethodList(
			List<Method> methods, double timeLimit, List<String> additionalParameters, String impactedList) throws FileNotFoundException;

	public abstract List<File> getTestFiles();

	public AbstractTestGeneratorAdapter(Project projectToTest) {
		this.project = projectToTest;

	}

}
