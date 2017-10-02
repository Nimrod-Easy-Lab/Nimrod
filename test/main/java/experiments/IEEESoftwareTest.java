package experiments;

//package br.edu.ufcg.saferefactor.test;

import static org.junit.Assert.*;

import java.io.File;
import java.text.DecimalFormat;

import org.junit.Test;




import saferefactor.core.SafeRefactor;
import saferefactor.core.Parameters;
import saferefactor.core.Report;
import saferefactor.core.SafeRefactorImp;
import saferefactor.core.util.Project;
import saferefactor.core.analysis.safira.analyzer.ImpactAnalysis;

/*
 * Author: Gustavo Soares
 * Tests using the subjects presented in the paper Making program refactoring safer (IEEE Software 2010)
 */
public class IEEESoftwareTest {

	@Test
	public void test1() throws Exception {
		Project source = new Project();
		source.setProjectFolder(new File("test/subjects/jhotdraw_source"));
		source.setBuildFolder(new File("test/subjects/jhotdraw_source/bin"));
		source.setSrcFolder(new File("test/subjects/jhotdraw_source/src"));
		source.setLibFolder(new File("test/subjects/jhotdraw_source/lib"));

		Project target = new Project();
		target.setProjectFolder(new File("test/subjects/jhotdraw_target"));
		target.setBuildFolder(new File("test/subjects/jhotdraw_target/bin"));
		target.setSrcFolder(new File("test/subjects/jhotdraw_target/src"));
		target.setLibFolder(new File("test/subjects/jhotdraw_source/lib"));

		Parameters parameters = new Parameters();
		parameters.setTimeLimit(30);
		parameters.setCheckCoverage(true);
		parameters.setCompileProjects(true);
		SafeRefactor saferefactor = new SafeRefactorImp(source, target,
				parameters);

		saferefactor.checkTransformation();
		Report report = saferefactor.getReport();
		assertEquals(false, report.isRefactoring());
		assertTrue(report.getCoverage().getLineRate() > 17.0);
	}
	
//	@Test
//	public void test2() throws Exception {
//		Project source = new Project();
//		
//		String sourceSub = "JHD176source";
//		String targetSub = "JHD176target";
//		sourceSub = "sub1.2.1source";
//		targetSub = "sub1.2.1target";
//		
//		source.setProjectFolder(new File("test/subjects/"+sourceSub));
//		source.setBin("bin");
//		source.setBuildFolder(new File("test/subjects/"+sourceSub+"/bin"));
//		source.setSrcFolder(new File("test/subjects/"+sourceSub+"/src"));
////		source.setLibFolder(new File("test/subjects/"+sourceSub+"/lib"));
//
//		Project target = new Project();
//		target.setProjectFolder(new File("test/subjects/"+targetSub));
//		source.setBin("bin");
//		target.setBuildFolder(new File("test/subjects/"+targetSub+"/bin"));
//		target.setSrcFolder(new File("test/subjects/"+targetSub+"/src"));
////		target.setLibFolder(new File("test/subjects/"+targetSub+"/lib"));
//
//		Parameters parameters = new Parameters();
//		parameters.setTimeLimit(1);
//		parameters.setCheckCoverage(false);
//		parameters.setCompileProjects(false);
//		parameters.setKind_of_analysis(Parameters.SAFIRA_ANALYSIS);
////		parameters.setKind_of_analysis(Parameters.REFLECTION_ANALYSIS);
////		parameters.setEnableImpactAnalysis(false);
//		SafeRefactor saferefactor = new SafeRefactorImp(source, target,
//				parameters);
//
//		saferefactor.checkTransformation();
//		Report report = saferefactor.getReport();
//		System.out.println(report.isRefactoring());
////		assertEquals(false, report.isRefactoring());
////		assertTrue(report.getCoverage().getLineRate() > 17.0);
//		
//		
//		
//		
//	}
//	public static void main(String[] args) throws Exception {
//	Project source = new Project();
//		
//		String sourceSub = "JHD176source";
//		String targetSub = "JHD176target";
//		sourceSub = "sub1.2.1source";
//		targetSub = "sub1.2.1target";
//		
//		source.setProjectFolder(new File("test/subjects/"+sourceSub));
//		source.setBin("bin");
//		source.setBuildFolder(new File("test/subjects/"+sourceSub+"/bin"));
//		source.setSrcFolder(new File("test/subjects/"+sourceSub+"/src"));
////		source.setLibFolder(new File("test/subjects/"+sourceSub+"/lib"));
//
//		Project target = new Project();
//		target.setProjectFolder(new File("test/subjects/"+targetSub));
//		source.setBin("bin");
//		target.setBuildFolder(new File("test/subjects/"+targetSub+"/bin"));
//		target.setSrcFolder(new File("test/subjects/"+targetSub+"/src"));
////		target.setLibFolder(new File("test/subjects/"+targetSub+"/lib"));
//
//		Parameters parameters = new Parameters();
//		parameters.setTimeLimit(1);
//		parameters.setCheckCoverage(false);
//		parameters.setCompileProjects(false);
//		parameters.setKind_of_analysis(Parameters.SAFIRA_ANALYSIS);
////		parameters.setKind_of_analysis(Parameters.REFLECTION_ANALYSIS);
////		parameters.setEnableImpactAnalysis(false);
//		SafeRefactor saferefactor = new SafeRefactorImp(source, target,
//				parameters);
//
//		saferefactor.checkTransformation();
//		Report report = saferefactor.getReport();
//		System.out.println(report.isRefactoring());
//	}

}
