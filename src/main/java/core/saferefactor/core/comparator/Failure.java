package saferefactor.core.comparator;

import saferefactor.core.comparator.TestCase.TestCaseState;



public class Failure {
	
	private String fileName;
	private String testSimpleName;
	private int line;
	private TestCaseState sourceState;
	private TestCaseState targetState;
	
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getTestSimpleName() {
		return testSimpleName;
	}
	public void setTestSimpleName(String testSimpleName) {
		this.testSimpleName = testSimpleName;
	}
	public int getLine() {
		return line;
	}
	public void setLine(int line) {
		this.line = line;
	}
	public TestCaseState getSourceState() {
		return sourceState;
	}
	public void setSourceState(TestCaseState sourceState) {
		this.sourceState = sourceState;
	}
	public TestCaseState getTargetState() {
		return targetState;
	}
	public void setTargetState(TestCaseState targetState) {
		this.targetState = targetState;
	}
	
}
