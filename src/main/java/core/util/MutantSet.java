package util;

import java.util.List;

import saferefactor.core.analysis.nimrod.Mutant;

public class MutantSet {
	private List<Mutant> node;

	public List<Mutant> getNode() {
		return node;
	}

	public void setNode(List<Mutant> node) {
		this.node = node;
	}
	
	public void addNode(Mutant m1) {
		this.node.add(m1);
	}
	
	public void addNode(MutantSet newMs) {
		for (Mutant mutant : newMs.getNode()) {
			this.node.add(mutant);
		}
	}
	
	public void incorporate(MutantSet mn) {
		this.node.addAll(mn.getNode());
	}

	public Mutant getRepresent() {
		if (node != null && !node.isEmpty()) {
			return node.get(0);
		}
		return null;
	}
	
	public boolean isBrotherOf(MutantSet newMutantSet) {
		Mutant actual = this.getRepresent();
		Mutant newMutant = newMutantSet.getRepresent();
		return actual.getTestFailures().equals(newMutant.getTestFailures());
	}
	
	public boolean isDominantOver(MutantSet newMutantSet) {
		Mutant actual = this.getRepresent();
		Mutant newMutant = newMutantSet.getRepresent();
		return actual.isSubset(newMutant.getTestFailures());
	}
	
	public boolean isDominatedBy(MutantSet newMutantSet) {
		Mutant actual = this.getRepresent();
		Mutant newMutant = newMutantSet.getRepresent();
		return newMutant.isSubset(actual.getTestFailures());
	}
}
