package saferefactor.core;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import saferefactor.core.execution.CoverageDataReader.CoverageReport;
import saferefactor.core.util.Project;
import saferefactor.core.util.ast.Method;



public class Report implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 544998766186149737L;

	private boolean refactoring;
	
	private boolean problemDuringAnalysis = false;
	
	private boolean compilationError;
	
	private String tmpFolder;
	
	private int numberTests;
	
	private Project sourceProject;

	private String changes;
	
	private int totalMethodsToTest;
	
	private double timelimit;
	
	private double totalTime;
	
	private double testsThatCoverTheChange;
	
	private List<File> generatedTestFiles = new ArrayList<File>();
	
	private List<Method> methodsToTest = new ArrayList<Method>();
	
	private List<Method> changedMethods = new ArrayList<Method>();
	
	private List<String> changedMethods2 = new ArrayList<String>();
	
	private CoverageReport coverage;
	
	public boolean isRefactoring() {
		return refactoring;
	}

	public void setRefactoring(boolean refactoring) {
		this.refactoring = refactoring;
	}

	public String getChanges() {
		return changes;
	}

	public void setChanges(String changes) {
		this.changes = changes;
	}

	public CoverageReport getCoverage() {
		return coverage;
	}

	public void setCoverage(CoverageReport coverage) {
		this.coverage = coverage;
	}
	
	public boolean hasCompilationError() {
		return compilationError;
	}

	public void setCompilationError(boolean compilationError) {
		this.compilationError = compilationError;
	}

	public boolean hasProblemDuringAnalysis() {
		return problemDuringAnalysis;
	}

	public void setProblemDuringAnalysis(boolean problemDuringAnalysis) {
		this.problemDuringAnalysis = problemDuringAnalysis;
	}

	public int getTotalMethodsToTest() {
		return totalMethodsToTest;
	}

	public void setTotalMethodsToTest(int totalMethodsToTest) {
		this.totalMethodsToTest = totalMethodsToTest;
	}

	public List<Method> getChangedMethods() {
		return changedMethods;
	}

	public void setChangedMethods(List<Method> changedMethods) {
		this.changedMethods = changedMethods;
	}

	public List<String> getChangedMethods2() {
		return changedMethods2;
	}

	public void setChangedMethods2(List<String> changedMethods2) {
		this.changedMethods2 = changedMethods2;
	}

	public double getTimelimit() {
		return timelimit;
	}

	public void setTimelimit(double timelimit) {
		this.timelimit = timelimit;
	}

	public double getTotalTime() {
		return totalTime;
	}

	public void setTotalTime(double totalTime) {
		this.totalTime = totalTime;
	}

	public String getTmpFolder() {
		return tmpFolder;
	}

	public void setTmpFolder(String tmpFolder) {
		this.tmpFolder = tmpFolder;
	}

	public int getNumberTests() {
		return numberTests;
	}

	public void setNumberTests(int numberTests) {
		this.numberTests = numberTests;
	}

	public List<Method> getMethodsToTest() {
		return methodsToTest;
	}

	public void setMethodsToTest(List<Method> methodsToTest) {
		this.methodsToTest = methodsToTest;
	}

	public List<File> getGeneratedTestFiles() {
		return generatedTestFiles;
	}

	public void setGeneratedTestFiles(List<File> generatedTestFiles) {
		this.generatedTestFiles = generatedTestFiles;
	}

	public Project getSourceProject() {
		return sourceProject;
	}

	public void setSourceProject(Project sourceProject) {
		this.sourceProject = sourceProject;
	}

	public double getTestsThatCoverTheChange() {
		return testsThatCoverTheChange;
	}

	public void setTestsThatCoverTheChange(double testsThatCoverTheChange) {
		this.testsThatCoverTheChange = testsThatCoverTheChange;
	}

}

