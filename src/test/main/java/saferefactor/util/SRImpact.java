package saferefactor.util;


import java.io.File;

import saferefactor.core.Parameters;
import saferefactor.core.Report;
import saferefactor.core.SafeRefactor;
import saferefactor.core.SafeRefactorImp;
import saferefactor.core.util.Project;
import saferefactor.core.analysis.safira.Constants;
import saferefactor.core.analysis.safira.analyzer.ImpactAnalysis;
import saferefactor.core.generation.TestGeneratorType;





public class SRImpact {
	boolean isRefactoring;
	int tests;
	long analysisTime;
	long randoopTime;
	long totalTime;
	boolean testCompilationError = false;
	Report report;
	private ImpactAnalysis ia;
	
	public SRImpact(String tests, String source, String target, 
			String lib, String timeLimit) {
		try {
			init(tests, source, target, lib, timeLimit, "bin", true, "");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public SRImpact(String tests, String source, String target, 
			String lib, String timeLimit, String bin, boolean randoop) {
		try {
			init(tests, source, target, lib, timeLimit, bin, randoop, "");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void init(String tests, String sourceSub, String targetSub, 
			String lib, String timeLimit, String bin, boolean randoop, String removeMethod) throws Exception {
		
		totalTime = System.currentTimeMillis();
		
		Project source = new Project();
		source.setProjectFolder(new File(sourceSub));
		source.setBin(bin);
		source.setBuildFolder(new File(sourceSub+Constants.FILE_SEPARATOR + bin));
		source.setSrcFolder(new File(sourceSub+Constants.FILE_SEPARATOR +"/src"));
		

		Project target = new Project();
		target.setProjectFolder(new File(targetSub));
		source.setBin(bin);
		target.setBuildFolder(new File(targetSub+Constants.FILE_SEPARATOR +"/"+bin));
		target.setSrcFolder(new File(targetSub+Constants.FILE_SEPARATOR +"/src"));

		if (!lib.equals("")) {
			source.setLibFolder(new File("src/test/subjects/"+sourceSub+"/"+lib));
			target.setLibFolder(new File("src/test/subjects/"+targetSub+"/"+lib));
		}
		
		Parameters parameters = new Parameters();
		parameters.setTimeLimit(Double.valueOf(timeLimit));
		parameters.setCheckCoverage(false);
		parameters.setCompileProjects(false);
		parameters.setKind_of_analysis(Parameters.SAFIRA_ANALYSIS);
		SafeRefactor saferefactor = new SafeRefactorImp(source, target,
				parameters, TestGeneratorType.RANDOOP_ANT);

		saferefactor.checkTransformation();
		ia = saferefactor.getIa();
		report = saferefactor.getReport();
		
		isRefactoring = report.isRefactoring();
		totalTime = System.currentTimeMillis() - totalTime;
	}
	
	
	public boolean isRefactoring() {
		return isRefactoring;
	}

	public int getTests() {
		return tests;
	}

	public long getAnalysisTime() {
		return analysisTime;
	}

	public long getRandoopTime() {
		return randoopTime;
	}

	public long getTotalTime() {
		return totalTime;
	}

	public void setRefactoring(boolean isRefactoring) {
		this.isRefactoring = isRefactoring;
	}

	public void setTests(int tests) {
		this.tests = tests;
	}

	public void setAnalysisTime(long analysisTime) {
		this.analysisTime = analysisTime;
	}

	public void setRandoopTime(long randoopTime) {
		this.randoopTime = randoopTime;
	}

	public void setTotalTime(long totalTime) {
		this.totalTime = totalTime;
	}

	
	
	public boolean isTestCompilationError() {
		return testCompilationError;
	}



	public Report getReport() {
		return report;
	}



	public void setReport(Report report) {
		this.report = report;
	}



	public ImpactAnalysis getIa() {
		return ia;
	}



	public void setIa(ImpactAnalysis ia) {
		this.ia = ia;
	}

	
}
