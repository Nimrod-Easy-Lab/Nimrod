package saferefactor.core.execution;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jdom.JDOMException;
import org.junit.Test;

import saferefactor.core.execution.CoverageDataReader.CoverageReport;
import saferefactor.core.execution.CoverageImpactedMethodReport;
import saferefactor.core.execution.CoverageMeter;
import saferefactor.core.util.Project;
import saferefactor.core.util.ast.ConstructorImp;
import saferefactor.core.util.ast.Method;
import saferefactor.core.util.ast.MethodImp;

public class CoverageMeterTest {

	@Test
	public void testCheckCoverage() throws FileNotFoundException {
		Project project = new Project();
		project.setProjectFolder(new File("src/test/subjects/subject14target"));
		project.setBuildFolder(new File("src/test/subjects/subject14target/bin"));
		project.setSrcFolder(new File("src/test/subjects/subject14target/src"));
		String tests = "src/test/subjects/subject14source/test";

		CoverageMeter meter = new CoverageMeter(project, tests);
		meter.checkTestCoverage();
		CoverageReport coverageReport = meter.getCoverageReport();
		assertEquals(78.0, coverageReport.getLineRate(), 1);
		assertEquals(100.0, coverageReport.getClassRate(), 1);
		assertEquals(88.0, coverageReport.getMethodRate(), 1);
		assertEquals(76.0, coverageReport.getBlockRate(), 1);

		File testCoverage = new File(tests, "coverage");
		assertTrue(testCoverage.exists());

		File instrumentedCode = new File(project.getProjectFolder(), "outinstr");
		assertTrue(instrumentedCode.exists());

	}

	@Test
	public void testCheckCoverageImpactedMethod() throws JDOMException,
			IOException {
		Project project = new Project();
		project.setProjectFolder(new File("src/test/subjects/subject14target"));
		project.setBuildFolder(new File("src/test/subjects/subject14target/bin"));
		project.setSrcFolder(new File("src/test/subjects/subject14target/src"));
		String tests = "src/test/subjects/subject14source/test";

		CoverageMeter meter = new CoverageMeter(project, tests);
		Method methodK = new MethodImp();
		methodK.setDeclaringClass("B");
		methodK.setSimpleName("k");
		methodK.getAllowedClasses().add("B");
		methodK.setParameterList(new ArrayList<String>());
		
		Method methodMain = new MethodImp();
		methodMain.setDeclaringClass("C");
		methodMain.setSimpleName("main");
		methodMain.getAllowedClasses().add("C");
		methodMain.setParameterList(new ArrayList<String>());
		methodMain.getParameterList().add("Ljava.lang.String;");
		
		Method construtor = new ConstructorImp();
		construtor.setDeclaringClass("C");
		construtor.setSimpleName("<init>");
		construtor.getAllowedClasses().add("C");
		construtor.setParameterList(new ArrayList<String>());
		
		
		List<Method> impactedMethods = new ArrayList<Method>();
		impactedMethods.add(methodK);
		impactedMethods.add(methodMain);
		impactedMethods.add(construtor);
		
		
		File file = new File(tests, "coverage/coverage.xml");
		CoverageImpactedMethodReport report = CoverageMeter
				.checkCoverageImpactedMethod(impactedMethods,file);
		assertEquals(1.0, report.getMethodCoverage(), 1);

	}

}
