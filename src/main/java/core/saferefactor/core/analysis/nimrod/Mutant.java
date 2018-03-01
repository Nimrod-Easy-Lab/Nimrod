package saferefactor.core.analysis.nimrod;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

public class Mutant {

	private final String MUJAVA = "mujava";
	private final String MAJOR = "major";
	private final String PIT = "pitest";

	private String name;
	private String tool;
	private File folder;
	private Set<String> testFailures;
	// redundant fields
	private Set<Mutant> brothers;
	private Set<Mutant> children;
	private Set<Mutant> parents;
	private Set<Mutant> noRelation;
	private double dominatorStrength;

	public Mutant(String name, File folder) {
		this(name, folder, new HashSet<String>());
	}

	public Mutant(String name, File folder, Set<String> failures) {
		super();
		this.name = name;
		this.folder = folder;
		this.setTool(folder.getAbsolutePath());
		this.testFailures = failures;
		this.children = new HashSet<Mutant>();
		this.parents = new HashSet<Mutant>();
		this.brothers = new HashSet<Mutant>();
		this.noRelation = new HashSet<Mutant>();
	}

	private void setTool(String folder) {
		if (folder != null && !folder.trim().equals("")) {
			if (folder.contains(MUJAVA)) {
				this.tool = MUJAVA;
				return;
			} else if (folder.contains(MAJOR)) {
				this.tool = MAJOR;
				return;
			} else if (folder.contains(PIT)) {
				this.tool = PIT;
				return;
			}
		}
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

	public void setTestFailures(Set<String> testSet) {
		this.testFailures.addAll(testSet);
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
		// String result = getFolder().getAbsolutePath() + "\n";
		// for (String failure : testFailures) {
		// result += failure + "\n";
		// }
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

	public Set<Mutant> getChildren() {
		return children;
	}

	public void addChildren(Mutant child) {
		this.children.add(child);
	}

	public Set<Mutant> getParents() {
		return parents;
	}

	public void addParents(Mutant parent) {
		this.parents.add(parent);
	}

	public Set<Mutant> getBrothers() {
		return brothers;
	}

	public void addBrother(Mutant brother) {
		this.brothers.add(brother);
	}

	public Set<Mutant> getNoRelation() {
		return noRelation;
	}

	public void addNoRelationMutant(Mutant brother) {
		this.noRelation.add(brother);
	}

	public String getTool() {
		return tool;
	}

	public double getDominatorStrengh() {
		if (this.dominatorStrength == 0.0) {
			int numChildren = this.children.size();
			int numParents = this.parents.size();
			int sum = numChildren + numParents;
			if (sum > 0.0) {
				double r = numChildren / sum;
				return r;
			}
		}
		return this.dominatorStrength;
	}

	public String printLogLine() {
		StringBuilder result = new StringBuilder("");
		result.append(this.getTool()).append(":")
			.append(this.getName()).append(":")
			.append(this.getDominatorStrengh()).append(":")
			.append(this.getTestFailures().size()).append(":")
			.append(this.printBrothers()).append(":")
			.append(this.printDescendents()).append(":")
			.append(this.printAscendents());
		return result.toString();
	}

	public String printDescendents() {
		return buildPrintableList(children);
	}

	public String printAscendents() {
		return buildPrintableList(parents);
	}

	public String printBrothers() {
		return buildPrintableList(brothers);
	}

	private String buildPrintableList(Set<Mutant> list) {
		String result = "{";
		int i = 0;
		for (Mutant mutant : list) {
			if (i == 0) {
				result += mutant.getName();
			} else {
				result += "," + mutant.getName();
			}
			i++;
		}
		result += "}";
		return result;
	}
}
