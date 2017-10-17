package bug;

import java.io.IOException;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;

import saferefactor.util.SRImpact;




public class Bugs extends TestCase{
	
	String path = System.getProperty("user.dir");
	@Test
	public void testConstructors() {
		
		String source = path + "/test/subjects/bugConstrutoresS";
		String target = path + "/test/subjects/bugConstrutoresT";

		
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(true, c.isRefactoring());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		assertEquals("method : A.m() : A", fileIntersection.get(0));
		assertEquals(1,fileIntersection.size());
		
	}
	
	@Test
	public void testModifiedFields()  {
		
		String source = path + "/test/subjects/bugModifiedFieldS";
		String target = path + "/test/subjects/bugModifiedFieldT";

		
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(false, c.isRefactoring());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		assertTrue(fileIntersection.contains("cons : A.<init>()"));
		assertTrue(fileIntersection.contains("method : B.m() : B"));
		assertTrue(fileIntersection.contains("cons : B.<init>()"));
		assertEquals(3,fileIntersection.size());
		
	}
	
	@Test
	public void testImplementerClasses() throws IOException {
		String source = path + "/test/subjects/bugImplementerClassesS";
		String target = path + "/test/subjects/bugImplementerClassesT";

		
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(false, c.isRefactoring());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		assertTrue(fileIntersection.contains("cons : A.<init>()"));
		assertTrue(fileIntersection.contains("cons : C.<init>()"));
		assertTrue(fileIntersection.contains("cons : B.<init>()"));
		assertTrue(fileIntersection.contains("method : C.m(I) : C"));
		assertEquals(4,fileIntersection.size());
		
	}
	
	@Test
	public void testCallInheritedMethods() throws IOException {
		String source = path + "/test/subjects/mutantS";
		String target = path + "/test/subjects/mutantT";

		
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(false, c.isRefactoring());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		assertTrue(fileIntersection.contains("cons : B.<init>()"));
		assertTrue(fileIntersection.contains("method : A.m() : C;B"));
		assertTrue(fileIntersection.contains("cons : C.<init>()"));
		assertEquals(3,fileIntersection.size());
		
	}
	
	@Test
	public void testBugSR() throws IOException {
		String source = path + "/test/subjects/bugSRS";
		String target = path + "/test/subjects/bugSRT";

		
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(false, c.isRefactoring());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		assertTrue(fileIntersection.contains("method : C.get() : C"));
		assertTrue(fileIntersection.contains("cons : C.<init>()"));
		assertEquals(2,fileIntersection.size());
		
	}
	
	@Test
	public void testBugRefactoring() throws IOException {
		String source = path + "/test/subjects/bugRefactS";
		String target = path + "/test/subjects/bugRefactT";

		
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(false, c.isRefactoring());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		assertTrue(fileIntersection.contains("cons : A.<init>()"));
		assertTrue(fileIntersection.contains("cons : B.<init>()"));
		assertTrue(fileIntersection.contains("method : B.z() : B"));
		assertTrue(fileIntersection.contains("method : B.k() : B"));
		assertTrue(fileIntersection.contains("method : C.m() : A"));
		
		assertEquals(5,fileIntersection.size());
		
	}
	
	@Test
	public void testBugExercisedMethods() throws IOException {
		String source = path + "/test/subjects/bugExercisedMethodsS";
		String target = path + "/test/subjects/bugExercisedMethodsT";

		
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(false, c.isRefactoring());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		assertTrue(fileIntersection.contains("cons : C.<init>()"));
		assertTrue(fileIntersection.contains("cons : B.<init>()"));
		assertTrue(fileIntersection.contains("method : C.z() : C"));
		assertTrue(fileIntersection.contains("method : A.m() : B"));
		assertEquals(4,fileIntersection.size());
		
	}
	
	@Test
	public void testBugModifiedFields() throws IOException {
		String source = path + "/test/subjects/bugModifiedFieldsS";
		String target = path + "/test/subjects/bugModifiedFieldsT";

		
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(false, c.isRefactoring());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		assertTrue(fileIntersection.contains("cons : A.<init>()"));
		assertTrue(fileIntersection.contains("method : A.getF() : A"));
		assertTrue(fileIntersection.contains("method : A.m() : A"));
		assertEquals(3,fileIntersection.size());
		
	}
	
	
	@Test
	public void testBugDataFlow() throws IOException {
		String source = path + "/test/subjects/bugDataFlowS";
		String target = path + "/test/subjects/bugDataFlowT";

		
		SRImpact c = new SRImpact("", source, target, "", "1");;
		
		assertEquals(false, c.isRefactoring());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		assertTrue(fileIntersection.contains("cons : A.<init>()"));
		assertTrue(fileIntersection.contains("method : A.getF() : A"));
		assertTrue(fileIntersection.contains("method : A.setF(I) : A"));
		assertEquals(3,fileIntersection.size());
		
	}
	
	@Test
	public void testBugLibary() throws IOException {
		String source = path + "/test/subjects/bugLibraryS";
		String target = path + "/test/subjects/bugLibraryT";

		
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(false, c.isRefactoring());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		assertTrue(fileIntersection.contains("cons : A.<init>()"));
		assertTrue(fileIntersection.contains("cons : C.<init>()"));
		assertTrue(fileIntersection.contains("method : A.m(Collection<String>) : A"));
		assertTrue(fileIntersection.contains("method : A.teste() : A"));
		assertEquals(4,fileIntersection.size());
		
	}
	
	@Test
	public void testBugAnonymousClass() throws IOException {
		String source = path + "/test/subjects/bugAnonymousClassS";
		String target = path + "/test/subjects/bugAnonymousClassT";
		SRImpact c = new SRImpact("", source, target, "", "1");
		
		assertEquals(false, c.isRefactoring());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		assertTrue(fileIntersection.contains("cons : A.<init>()"));
		assertTrue(fileIntersection.contains("method : A.m() : A"));
		assertTrue(fileIntersection.contains("method : A.setF(I) : A"));
		assertTrue(fileIntersection.contains("method : A.getF() : A"));
		assertEquals(4,fileIntersection.size());
		
	}
	
}
