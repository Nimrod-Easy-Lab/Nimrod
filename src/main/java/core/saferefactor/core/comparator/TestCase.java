package saferefactor.core.comparator;

public class TestCase {
	
	public enum TestCaseState {
		SUCCESS, FAILURE, ERROR
	}
	
	private int failureLine;
	private TestCaseState testCaseState;
	
	public TestCaseState getTestCaseState() {
		return testCaseState;
	}
	public void setTestCaseState(TestCaseState testCaseState) {
		this.testCaseState = testCaseState;
	}
	public int getFailureLine() {
		return failureLine;
	}
	public void setFailureLine(int failureLine) {
		this.failureLine = failureLine;
	}

}
