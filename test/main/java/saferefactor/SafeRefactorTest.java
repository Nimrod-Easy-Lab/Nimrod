package saferefactor;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.junit.Test;

import saferefactor.core.Parameters;
import saferefactor.core.Report;
import saferefactor.core.SafeRefactorException;
import saferefactor.core.SafeRefactorImp;
import saferefactor.core.SafeRefactor;
import saferefactor.core.util.Project;
import saferefactor.core.util.ast.Method;

public class SafeRefactorTest {
	
	@Test
	public void testCheckTransformationWithProjectsNotCompiled() throws Exception {
		Project source = new Project();
		source.setProjectFolder(new File("test/subjects/notCompiled_source"));
		source.setBuildFolder(new File("test/subjects/notCompiled_source/bin"));
		source.setSrcFolder(new File("test/subjects/notCompiled_source/src"));

		Project target = new Project();
		target.setProjectFolder(new File("test/subjects/notCompiled_target"));
		target.setBuildFolder(new File("test/subjects/notCompiled_target/bin"));
		target.setSrcFolder(new File("test/subjects/notCompiled_target/src"));

		SafeRefactor saferefactor = new SafeRefactorImp(source, target);
		saferefactor.checkTransformation();
		Report report = saferefactor.getReport();
		assertEquals(false, report.isRefactoring());
		
		
	}
	
	@Test(expected = SafeRefactorException.class)
	public void testCheckTransformationWithIncorrectClasspath() throws Exception {
		Project source = new Project();
		source.setProjectFolder(new File("test/subjects/subject14source"));
		source.setBuildFolder(new File("test/subjects/subject14source/bin2"));
		source.setSrcFolder(new File("test/subjects/subject14source/src"));

		Project target = new Project();
		target.setProjectFolder(new File("test/subjects/subject14target"));
		target.setBuildFolder(new File("test/subjects/subject14target/bin"));
		target.setSrcFolder(new File("test/subjects/subject14target/src"));

		Parameters parameters = new Parameters();
		parameters.setCompileProjects(false);		
		parameters.setTimeLimit(1);
		
		SafeRefactor saferefactor = new SafeRefactorImp(source, target, parameters);
		saferefactor.checkTransformation();		
	}
	
	public void testCheckTransformationWithProjectsWithCompilationErrors() throws Exception {
		Project source = new Project();
		source.setProjectFolder(new File("test/subjects/compilation_error_source"));
		source.setBuildFolder(new File("test/subjects/notcompilation_error_source/bin"));
		source.setSrcFolder(new File("test/subjects/compilation_error_source/src"));

		Project target = new Project();
		target.setProjectFolder(new File("test/subjects/compilation_error_target"));
		target.setBuildFolder(new File("test/subjects/compilation_error_target/bin"));
		target.setSrcFolder(new File("test/subjects/compilation_error_target/src"));

		SafeRefactor saferefactor = new SafeRefactorImp(source, target);
		saferefactor.checkTransformation();
		Report report = saferefactor.getReport();
		assertEquals(false, report.isRefactoring());
		assertEquals(true, report.hasCompilationError());
		
		
	}
	

	
	
	

	@Test
	public void testCheckTransformationWithProjectsCompiled() throws Exception {
		

		Project source = new Project();
		source.setProjectFolder(new File("test/subjects/subject14source"));
		source.setBuildFolder(new File("test/subjects/subject14source/bin"));
		source.setSrcFolder(new File("test/subjects/subject14source/src"));

		Project target = new Project();
		target.setProjectFolder(new File("test/subjects/subject14target"));
		target.setBuildFolder(new File("test/subjects/subject14target/bin"));
		target.setSrcFolder(new File("test/subjects/subject14target/src"));

		Parameters parameters = new Parameters();
		parameters.setCompileProjects(false);		
		parameters.setTimeLimit(1);
		
		SafeRefactor saferefactor = new SafeRefactorImp(source, target, parameters);
		saferefactor.checkTransformation();
		Report report = saferefactor.getReport();
		
		assertEquals(false, report.isRefactoring());
	}

	@Test
	public void testCheckTransformationWithProjectsCompiledForkFalse() throws Exception {
		Project source = new Project();
		source.setProjectFolder(new File("test/subjects/subject14source"));
		source.setBuildFolder(new File("test/subjects/subject14source/bin"));
		source.setSrcFolder(new File("test/subjects/subject14source/src"));

		Project target = new Project();
		target.setProjectFolder(new File("test/subjects/subject14target"));
		target.setBuildFolder(new File("test/subjects/subject14target/bin"));
		target.setSrcFolder(new File("test/subjects/subject14target/src"));

		Parameters parameters = new Parameters();
		parameters.setCompileProjects(false);
//		parameters.setAnalyzeChangeMethods(true);
		parameters.getTestGeneratorParameters().add("fork=false");
		
		SafeRefactor saferefactor = new SafeRefactorImp(source, target, parameters);
		saferefactor.checkTransformation();
		Report report = saferefactor.getReport();
		
		assertEquals(false, report.isRefactoring());
		
//		List<Method> methods =  report.getChangedMethods();
//		Method method = methods.get(0);
//		assertEquals("test", method.getSimpleName());
		
		
	}
	
	
	//feature removed
//	@Test
//	public void testCheckTransformationWithProjectsNotCompiledSetCompilerPath() throws Exception {
//		Project source = new Project();
//		source.setProjectFolder(new File("test/subjects/notCompiled_source"));
//		source.setBuildFolder(new File("test/subjects/notCompiled_source/bin"));
//		source.setSrcFolder(new File("test/subjects/notCompiled_source/src"));
//
//		Project target = new Project();
//		target.setProjectFolder(new File("test/subjects/notCompiled_target"));
//		target.setBuildFolder(new File("test/subjects/notCompiled_target/bin"));
//		target.setSrcFolder(new File("test/subjects/notCompiled_target/src"));
//		
//		
//		Properties config = new Properties();
//		File configFile = new File("test/subjects/compiler.properties");
//		config.load(new FileInputStream(configFile));
//		String path = config.getProperty("COMPILER_JAVA_5");
//		
//		Parameters parameters = new Parameters();
//		parameters.setCompilerPath(path); 
//
//		SafeRefactor saferefactor = new SafeRefactorImp(source, target,parameters);
//		saferefactor.checkTransformation();
//		Report report = saferefactor.getReport();
//		assertEquals(false, report.isRefactoring());
//		
//		
//	}
	
	
	//feature removed
//	@Test
//	public void testCheckTransformationWithProjectsNotCompiledSetBuildPath() throws Exception {
//		Project source = new Project();
//		source.setProjectFolder(new File("test/subjects/notCompiled_source"));
//		source.setBuildFolder(new File("test/subjects/notCompiled_source/bin"));
//		source.setSrcFolder(new File("test/subjects/notCompiled_source/src"));
//
//		Project target = new Project();
//		target.setProjectFolder(new File("test/subjects/notCompiled_target"));
//		target.setBuildFolder(new File("test/subjects/notCompiled_target/bin"));
//		target.setSrcFolder(new File("test/subjects/notCompiled_target/src"));
//		
//		
//		Properties config = new Properties();
//		File configFile = new File("test/subjects/compiler.properties");
//		config.load(new FileInputStream(configFile));
//		String path = config.getProperty("DIFFERENT_BUILDER");
//		
//		Parameters parameters = new Parameters();
//		parameters.setBuildPath(path); 
//		parameters.setTimeLimit(2);
//
//		SafeRefactor saferefactor = new SafeRefactorImp(source, target,parameters);
//		saferefactor.checkTransformation();
//		Report report = saferefactor.getReport();
//		assertEquals(false, report.isRefactoring());
//		
//		
//	}
	
	@Test
	public void testCheckTransformationWithCoverage() throws Exception {
		Project source = new Project();
		source.setProjectFolder(new File("test/subjects/subject14source"));
		source.setBuildFolder(new File("test/subjects/subject14source/bin"));
		source.setSrcFolder(new File("test/subjects/subject14source/src"));

		Project target = new Project();
		target.setProjectFolder(new File("test/subjects/subject14target"));
		target.setBuildFolder(new File("test/subjects/subject14target/bin"));
		target.setSrcFolder(new File("test/subjects/subject14target/src"));

		Parameters parameters = new Parameters();
		parameters.setCompileProjects(false);
		parameters.setCheckCoverage(true);
		
		SafeRefactor saferefactor = new SafeRefactorImp(source, target,parameters  );
		saferefactor.checkTransformation();
		Report report = saferefactor.getReport();
		assertEquals(false, report.isRefactoring());
		assertNotNull(report.getChanges());
		assertEquals(78.0, report.getCoverage().getLineRate(), 1);
//		assertEquals(90.0, report.getGeneratedTests);
		
	}

	@Test
	public void testSafeRefactorFailOnRandomSubject() throws Exception {
		Project source = new Project();
		source.setProjectFolder(new File("test/subjects/randomSubjectSource"));
		source.setBuildFolder(new File("test/subjects/randomSubjectSource/bin"));
		source.setSrcFolder(new File("test/subjects/randomSubjectSource/src"));

		Project target = new Project();
		target.setProjectFolder(new File("test/subjects/randomSubjectTarget"));
		target.setBuildFolder(new File("test/subjects/randomSubjectTarget/bin"));
		target.setSrcFolder(new File("test/subjects/randomSubjectTarget/src"));		


		Parameters parameters = new Parameters();
		parameters.setCompileProjects(false);
		SafeRefactor saferefactor = new SafeRefactorImp(source, target,parameters);

		saferefactor.checkTransformation();
		Report report = saferefactor.getReport();
		assertEquals(false, report.isRefactoring());
	}

	@Test
	public void testExecuteTwiceOnSourceToAvoidRandomResults() throws Exception {
		Project source = new Project();
		source.setProjectFolder(new File("test/subjects/randomSubjectSource"));
		source.setBuildFolder(new File("test/subjects/randomSubjectSource/bin"));
		source.setSrcFolder(new File("test/subjects/randomSubjectSource/src"));

		Project target = new Project();
		target.setProjectFolder(new File("test/subjects/randomSubjectTarget"));
		target.setBuildFolder(new File("test/subjects/randomSubjectTarget/bin"));
		target.setSrcFolder(new File("test/subjects/randomSubjectTarget/src"));		

				
		Parameters parameters = new Parameters();
		parameters.setCompileProjects(false);
		parameters.setExecuteTwiceOnSource(true);
		SafeRefactor saferefactor = new SafeRefactorImp(source, target, parameters );

		saferefactor.checkTransformation();
		Report report = saferefactor.getReport();
		assertEquals(false, report.isRefactoring());
	}
	
	
	@Test
	public void testCheckTransformationWithAbstractClass() throws Exception {
		

		Project source = new Project();
		File sourceFolder = new File("test/subjects/test37/in");
		source.setProjectFolder(sourceFolder);
		source.setBuildFolder(sourceFolder);
		source.setSrcFolder(sourceFolder);

		Project target = new Project();
		File targetFolder = new File("test/subjects/test37/out");
		target.setProjectFolder(targetFolder);
		target.setBuildFolder(targetFolder);
		target.setSrcFolder(targetFolder);

		Parameters parameters = new Parameters();
		parameters.setCompileProjects(true);		
		parameters.setTimeLimit(1);
		
		
		SafeRefactor saferefactor = new SafeRefactorImp(source, target, parameters);
		saferefactor.checkTransformation();
		Report report = saferefactor.getReport();
		
		assertEquals(true, report.isRefactoring());
	}


}
