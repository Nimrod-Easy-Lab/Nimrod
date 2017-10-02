package toys;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import junit.framework.TestCase;

import org.junit.AfterClass;
import org.junit.Test;

import saferefactor.util.SRImpact;




public class ToyExamples extends TestCase{
	
	static Map<String, List<String>> methods = new HashMap<String, List<String>>();
	
	String time = "1";
	
	String path = System.getProperty("user.dir");
	
	//Rename Class -> shadow declaration
	@Test
	public void test1() throws IOException {
		
		String source = path + "/test/subjects/sub1.2.1source//";
		String target = path +"/test/subjects/sub1.2.1target//";
		
		SRImpact c = new SRImpact("",source, target, "", time);
		
		assertEquals(false, c.isRefactoring());
		
//		Coverage coverage = new Coverage(c);
		
//		assertEquals(100, coverage.getChangeCovered());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		assertTrue( fileIntersection.contains("method : b.C.k() : a.B"));
		assertTrue( fileIntersection.contains("method : a.B.test() : a.B"));
		assertTrue( fileIntersection.contains("cons : a.B.<init>()"));
		
		assertEquals(3, fileIntersection.size());
		
		
		methods.put("1", fileIntersection);
	}
	
	
	@Test
	public void test2() throws IOException {
		
		String source = path + "/test/subjects/sub4.2.5source/";
		String target = path + "/test/subjects/sub4.2.5target/";
		
		SRImpact c = new SRImpact("",source, target, "", time);
		
		assertEquals(false, c.isRefactoring());
		
//		Coverage coverage = new Coverage(c);
		
//		assertEquals(100, coverage.getChangeCovered());
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		assertTrue( fileIntersection.contains("method : A.m() : B"));
		assertTrue( fileIntersection.contains("method : B.test() : B"));
		assertTrue( fileIntersection.contains("cons : B.<init>()"));
		
		assertEquals(3, fileIntersection.size());
		
		methods.put("2", fileIntersection);
		
	}
	
	
	@Test
	public void test3() throws IOException {
		
		String source =path + "/test/subjects/sub4.2.6source/";
		String target = path + "/test/subjects/sub4.2.6target/";
		
		SRImpact c = new SRImpact("",source, target, "", time);
		
		assertEquals(false, c.isRefactoring());
		
//		Coverage coverage = new Coverage(c);
		
//		assertEquals(100, coverage.getChangeCovered());
		
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		assertTrue( fileIntersection.contains("method : A.m() : B"));
		assertTrue( fileIntersection.contains("method : B.test() : B"));
		assertTrue( fileIntersection.contains("cons : B.<init>()"));
		
		assertEquals(3, fileIntersection.size());
		
		methods.put("3", fileIntersection);
	}
	
	
	@Test
	public void test4() throws IOException {
		
		String source = path + "/test/subjects/sub6.2.1source/";
		String target = path + "/test/subjects/sub6.2.1target/";
		
		SRImpact c = new SRImpact("",source, target, "", time);
		
		assertEquals(false, c.isRefactoring());
		
//		Coverage coverage = new Coverage(c);
		
//		assertEquals(100, coverage.getChangeCovered());
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		methods.put("4", fileIntersection);
		
	
		
		assertTrue( fileIntersection.contains("method : B.k(int) : B"));
		assertTrue( fileIntersection.contains("method : B.test() : B"));
		assertTrue( fileIntersection.contains("method : A.k(long) : B;A") || fileIntersection.contains("method : A.k(long) : A;B"));
		assertTrue( fileIntersection.contains("cons : B.<init>()"));
		assertTrue( fileIntersection.contains("cons : A.<init>()"));
		
		
		assertEquals(5, fileIntersection.size());
		

		
	}
	
	@Test
	public void test5() throws IOException {
		
		String source = path + "/test/subjects/sub6.2.2source/";
		String target = path + "/test/subjects/sub6.2.2target/";
		
		SRImpact c = new SRImpact("",source, target, "", time);
		
		assertEquals(false, c.isRefactoring());
		
//		Coverage coverage = new Coverage(c);
		
//		assertEquals(100, coverage.getChangeCovered());
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		assertTrue( fileIntersection.contains("method : B.m() : B"));
		assertTrue( fileIntersection.contains("method : B.test() : B"));
		assertTrue( fileIntersection.contains("cons : B.<init>()"));
		
		assertEquals(3, fileIntersection.size());
		
		methods.put("5", fileIntersection);
		
	}
	
	//olhar pq acrescente os construtores de A e B
	@Test
	public void test6() throws IOException {
		
		String source = path + "/test/subjects/sub7.2.2source/";
		String target = path + "/test/subjects/sub7.2.2target/";
		
		SRImpact c = new SRImpact("",source, target, "", time);
		
		assertEquals(false, c.isRefactoring());
		
//		Coverage coverage = new Coverage(c);
		
//		assertEquals(100, coverage.getChangeCovered());
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		methods.put("6", fileIntersection);
		
		assertTrue( fileIntersection.contains("method : C.test() : C"));
		assertTrue( fileIntersection.contains("cons : C.<init>()"));
		assertTrue( fileIntersection.contains("cons : B.<init>()"));
		assertTrue( fileIntersection.contains("cons : A.<init>()"));
		
		assertEquals(4, fileIntersection.size());
		

		
	}
	
	@Test
	public void test7() throws IOException {
		
		String source = path + "/test/subjects/sub9.2.1source/";
		String target = path + "/test/subjects/sub9.2.1target/";
		
		SRImpact c = new SRImpact("",source, target, "", time);
		
		
		assertEquals(false, c.isRefactoring());
		
//		Coverage coverage = new Coverage(c);
		
//		assertEquals(100, coverage.getChangeCovered());
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		methods.put("7", fileIntersection);
		
		assertTrue( fileIntersection.contains("method : C.test() : C"));
		assertTrue( fileIntersection.contains("cons : C.<init>()"));
		
		assertEquals(2, fileIntersection.size());
		
		
	}
	
	@Test
	public void test8() throws IOException {
		
		String source = path + "/test/subjects/sub10.2.1source/";
		String target = path + "/test/subjects/sub10.2.1target/";
		
		SRImpact c = new SRImpact("",source, target, "", time);
		
		assertEquals(false, c.isRefactoring());
		
//		Coverage coverage = new Coverage(c);
		
//		assertEquals(100, coverage.getChangeCovered());
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		assertTrue( fileIntersection.contains("method : A.k(int) : B"));
		assertTrue( fileIntersection.contains("method : B.test() : B"));
		assertTrue( fileIntersection.contains("cons : B.<init>()"));
		
		assertEquals(3, fileIntersection.size());
		
		methods.put("8", fileIntersection);
		
	}
	
	@Test
	public void test9() throws IOException {
		
		String source = path + "/test/subjects/sub11.2.1source/";
		String target = path + "/test/subjects/sub11.2.1target/";
		
		SRImpact c = new SRImpact("",source, target, "", time);
		List<String> fileIntersection = c.getIa().getFileIntersection();
		methods.put("9", fileIntersection);
		assertEquals(false, c.isRefactoring());
		
//		Coverage coverage = new Coverage(c);
		
//		assertEquals(100, coverage.getChangeCovered());
		
		assertTrue( fileIntersection.contains("method : A.k() : C"));
		assertTrue( fileIntersection.contains("method : B.m() : C;B"));
		assertTrue( fileIntersection.contains("method : C.test() : C"));
		assertTrue( fileIntersection.contains("cons : B.<init>()"));
		assertTrue( fileIntersection.contains("cons : C.<init>()"));
		
		assertEquals(5, fileIntersection.size());
		
		
	}
	
	@Test
	public void test10() throws IOException {
		
		String source = path + "/test/subjects/sub12.2.1source/";
		String target = path + "/test/subjects/sub12.2.1target/";
		
		SRImpact c = new SRImpact("",source, target, "", time);
		
		assertEquals(false, c.isRefactoring());
		
//		Coverage coverage = new Coverage(c);
		
//		assertEquals(100, coverage.getChangeCovered());
		List<String> fileIntersection = c.getIa().getFileIntersection();
		
		methods.put("10", fileIntersection);
		
		assertTrue( fileIntersection.contains("method : A.m() : B;A"));
		assertTrue( fileIntersection.contains("method : B.test() : B"));
		assertTrue( fileIntersection.contains("cons : A.<init>()"));
		assertTrue( fileIntersection.contains("cons : B.<init>()"));
		
		assertEquals(4, fileIntersection.size());
		
		
	}
	
	@Test
	public void test11() throws IOException {
		
		String source = path + "/test/subjects/subsource/";
		String target = path + "/test/subjects/subtarget/";
		
		SRImpact c = new SRImpact("",source, target, "", time);
		
		methods.put("11", c.getIa().getFileIntersection());
		assertEquals(false, c.isRefactoring());
		
//		Coverage coverage = new Coverage(c);
		
//		assertEquals(100, coverage.getChangeCovered());
		
		
	}
	
	@Test
	public void test12() throws IOException {
		
		//neste exemplo tem que colocar dependências de parâmetros de métodos impactados. (ja foi feito)
		
		String source = path + "/test/subjects/subParameterS/";
		String target = path + "/test/subjects/subParameterT/";
		
		SRImpact c = new SRImpact("",source, target, "", time);
		
		methods.put("11", c.getIa().getFileIntersection());
		assertEquals(false, c.isRefactoring());
		
//		Coverage coverage = new Coverage(c);
		
//		assertEquals(100, coverage.getChangeCovered());
		
		
	}
	
	@AfterClass
	public static void TearDown() {
		
		Set<String> keySet = methods.keySet();
		for (String subject : keySet) {
			List<String> list = methods.get(subject);
			System.out.println(subject);
			for (String method : list) {
				System.out.println(method);
			}
			System.out.println("-----------------------");
			
			
		}
	}
	
}
