package saferefactor.core.analysis.nimrod;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

public class Mutant {

	private String name;
	private File folder;
	private Set<String> testFailures;

	public Mutant(String name, File folder) {
		super();
		this.name = name;
		this.folder = folder;
		this.testFailures = new HashSet<String>();
	}

	public Mutant(String name, File folder, Set<String> failures) {
		super();
		this.name = name;
		this.folder = folder;
		this.testFailures = failures;
	}

	public String getName() {
		return name;
	}

	public File getFolder() {
		return folder;
	}

	public Set<String> getTestFailures() {
		return testFailures;
	}

	public void addTestFailures(String testFailure) {
		this.testFailures.add(testFailure);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Mutant) {
			Mutant mutantParam = (Mutant) obj;
			if (mutantParam.getName().equals(getName())
					&& mutantParam.getFolder().getAbsolutePath().equals(getFolder().getAbsolutePath())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
//		String result = getFolder().getAbsolutePath() + "\n";
//		for (String failure : testFailures) {
//			result += failure + "\n";
//		}
		String result = getFolder().getAbsolutePath();
		return result;
	}

	public boolean isSubset(Set<String> setB) {
		return setB.containsAll(this.testFailures);
	}

	public boolean isSuperset(Set<String> setB) {
		return this.testFailures.containsAll(setB);
	}

	public Set<String> union(Set<String> setB) {
		Set<String> tmp = new HashSet<String>(this.testFailures);
		tmp.addAll(setB);
		return tmp;
	}

	public Set<String> intersection(Set<String> setB) {
		Set<String> tmp = new HashSet<String>();
		for (String x : this.testFailures)
			if (setB.contains(x))
				tmp.add(x);
		return tmp;
	}

	public Set<String> difference(Set<String> setB) {
		Set<String> tmp = new HashSet<String>(this.testFailures);
		tmp.removeAll(setB);
		return tmp;
	}

}
