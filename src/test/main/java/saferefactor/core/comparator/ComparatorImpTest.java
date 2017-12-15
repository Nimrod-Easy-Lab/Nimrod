package saferefactor.core.comparator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import saferefactor.core.comparator.ComparatorImp;
import saferefactor.core.comparator.Report;
import saferefactor.core.comparator.TestComparator;

public class ComparatorImpTest {

	@Test
	public void test1() {
		TestComparator comparator = new ComparatorImp("src/test/subjects/subject14source/fixedReport", "src/test/subjects/subject14target/fixedReport");
		comparator.compare();
		Report report = comparator.getReport();
		assertFalse(report.isRefactoring());		
		assertTrue(report.getChanges().startsWith("RandoopTest0.test2 in source is SUCCESS while in target is FAILURE"));
	}
	
	
	//TODO add this feature
//	@Test
//	public void test2() throws ParseException, IOException {
//		TestComparator comparator = new ComparatorImp("test/subjects/subject14source/fixedReport", "test/subjects/subject14target/fixedReport");
//		String pathToTestSources = "test/subjects/subject14target/fixedReport/";
//		Set<Method> methods = comparator.identifyMethodsWithBehavioralChanges(pathToTestSources);
//		Method methodImp = (Method) methods.toArray()[0];		
//		assertTrue(methodImp.getSimpleName().equals("test"));		
//	}	
	
	//TODO add this feature
//	@Test
//	public void test3() throws ParseException, IOException {
//		TestComparator comparator = new ComparatorImp("test/subjects/changedbehavior/tests/source", "test/subjects/changedbehavior/tests/target");
//		String pathToTestSources = "test/subjects/changedbehavior/tests/";
//		Set<Method> methods = comparator.identifyMethodsWithBehavioralChanges(pathToTestSources);
//		Method methodImp = (Method) methods.toArray()[0];		
//		assertTrue(methodImp.getSimpleName().equals("m"));		
//	}	
}
