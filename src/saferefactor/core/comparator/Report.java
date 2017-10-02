package saferefactor.core.comparator;

import java.util.HashSet;
import java.util.Set;

public class Report {
	
	private boolean isRefactoring;
	
	private int totalTests;
	
	private Set<Failure> changedTests = new HashSet<Failure>();
	
	private String changes;

	public boolean isRefactoring() {
		return isRefactoring;
	}

	public void setRefactoring(boolean isRefactoring) {
		this.isRefactoring = isRefactoring;
	}

	public String getChanges() {
		return changes;
	}

	public void setChanges(String changes) {
		this.changes = changes;
	}

	public Set<Failure> getChangedTests() {
		return changedTests;
	}

	public void setChangedTests(Set<Failure> changedTests) {
		this.changedTests = changedTests;
	}

	public int getTotalTests() {
		return totalTests;
	}

	public void setTotalTests(int totalTests) {
		this.totalTests = totalTests;
	}

	

}
