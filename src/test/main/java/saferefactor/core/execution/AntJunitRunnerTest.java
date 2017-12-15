package saferefactor.core.execution;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;

import org.junit.Test;

import saferefactor.core.execution.AntJunitRunner;
import saferefactor.core.execution.TestExecutor;
import saferefactor.core.util.Project;

public class AntJunitRunnerTest {

	@Test
	public void test() throws FileNotFoundException {
		Project project= new Project();
		project.setProjectFolder(new File("src/test/subjects/subject14source"));
		project.setBuildFolder(new File("src/test/subjects/subject14source/bin"));
		project.setSrcFolder(new File("src/test/subjects/subject14source/src"));
		
		String reportPath = "src/test/subjects/subject14source/report";
		String tests = "src/test/subjects/subject14source/test";
		TestExecutor testExecutor = new AntJunitRunner(project,tests);
		testExecutor.setReportPath(reportPath);
		testExecutor.executeTests(tests);
		
		File report = new File(reportPath,"TEST-RandoopTest0.xml");
		assertTrue(report.exists());
	}

}
