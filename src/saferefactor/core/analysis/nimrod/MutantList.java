package saferefactor.core.analysis.nimrod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.jgrapht.experimental.dag.DirectedAcyclicGraph;
import org.jgrapht.graph.DefaultEdge;

public class MutantList{

	private List<Mutant> mutants;

	public MutantList() {
		super();
		this.mutants = new ArrayList<Mutant>();
	}

	public List<Mutant> getMutants() {
		return mutants;
	}

	public void addMutant(Mutant mutant) {
		this.mutants.add(mutant);
	}

	public void printDuplicateds() {
		for (int i = 0; i < mutants.size(); i++) {
			Mutant mi = mutants.get(i);
			if (!mi.getTestFailures().isEmpty()) {
				for (int j = i + 1; j < mutants.size(); j++) {
					Mutant mj = mutants.get(j);
					if (!mj.getTestFailures().isEmpty()) {
						if (mi.getTestFailures().equals(mj.getTestFailures())) {
							System.out.println(mi.getName() + " can be duplicated to " + mj.getName());
						}
					}
				}
			}
		}
	}

	public void printDominants() {
		for (int i = 0; i < mutants.size(); i++) {
			Mutant mi = mutants.get(i);
			if (!mi.getTestFailures().isEmpty()) {
				for (int j = i + 1; j < mutants.size(); j++) {
					Mutant mj = mutants.get(j);
					if (!mj.getTestFailures().isEmpty()) {
						if (mi.isSubset(mj.getTestFailures())) {
							System.out.println("All tests that kill " + mi.getName() + " also kill " + mj.getName());
						} else if (mj.isSubset(mi.getTestFailures())) {
							System.out.println("All tests that kill " + mj.getName() + " also kill " + mi.getName());
						}
					}
				}
			}
		}
	}

	public void printEquivalents() {
		for (int i = 0; i < mutants.size(); i++) {
			Mutant mi = mutants.get(i);
			if (mi.getTestFailures().isEmpty()) {
				System.out.println(mi.getFolder() + " can be equivalent");
			}
		}
	}

	public List<String> getEquivalents() {
		List<String> equivalents = new ArrayList<String>();
		for (int i = 0; i < mutants.size(); i++) {
			Mutant mi = mutants.get(i);
			if (mi.getTestFailures().isEmpty()) {
				equivalents.add(mi.getFolder().getAbsolutePath());
			}
		}
		return equivalents;
	}

	public List<String> getDuplicateds() {
		List<String> duplicateds = new ArrayList<String>();
		for (int i = 0; i < mutants.size(); i++) {
			Mutant mi = mutants.get(i);
			if (!mi.getTestFailures().isEmpty()) {
				for (int j = i + 1; j < mutants.size(); j++) {
					Mutant mj = mutants.get(j);
					// Os duplicados não podem ter conjuntos vazios
					if (!mj.getTestFailures().isEmpty()) {
						if (mi.getTestFailures().equals(mj.getTestFailures())) {
							duplicateds.add(mi.getFolder().getAbsolutePath() + ":" + mj.getFolder().getAbsolutePath());
						}
					}
				}
			}
		}
		return duplicateds;
	}

	/**
	 * Used to organize duplicated mutants as a Map. Where a leader will be the
	 * key and all others (including the Leader) are the values.
	 * 
	 * @return
	 */
	public Map<Mutant, Set<Mutant>> getDuplicatedMap() {

		Set<Mutant> duplicateds = new HashSet<Mutant>();
		Map<Mutant, Set<Mutant>> duplicatedMap = new HashMap<Mutant, Set<Mutant>>();

		for (int i = 0; i < mutants.size(); i++) {
			Mutant mi = mutants.get(i);
			if (!mi.getTestFailures().isEmpty()) {
				for (int j = i + 1; j < mutants.size(); j++) {
					Mutant mj = mutants.get(j);
					// Os duplicados não podem ter conjuntos vazios
					if (!mj.getTestFailures().isEmpty()) {
						if (mi.getTestFailures().equals(mj.getTestFailures())) {
							if (duplicatedMap.containsKey(mi)) {
								duplicatedMap.get(mi).add(mj);
							} else {
								duplicateds.add(mi);
								duplicateds.add(mj);
								duplicatedMap.put(mi, duplicateds);
							}
						}
					}
				}
			}
		}
		return duplicatedMap;
	}

	public void printDSMG() {
		DirectedAcyclicGraph<Mutant, DefaultEdge> g = new DirectedAcyclicGraph<Mutant, DefaultEdge>(DefaultEdge.class);
		Map<Mutant, Set<Mutant>> duplicatedMap = getDuplicatedMap();
		List<Mutant> keys = new ArrayList<Mutant>();
		keys.addAll(duplicatedMap.keySet());
		for (int i = 0; i < mutants.size(); i++) {
			// add the vertices
			g.addVertex(mutants.get(i));
		}
		for (int i = 0; i < mutants.size(); i++) {
			Mutant mi = mutants.get(i);
			if (!mi.getTestFailures().isEmpty()) {
				for (int j = i + 1; j < mutants.size(); j++) {
					Mutant mj = mutants.get(j);
					if (!mj.getTestFailures().isEmpty()) {
						if (mi.isSubset(mj.getTestFailures())) {
							g.addEdge(mi, mj);
						} else if (mj.isSubset(mi.getTestFailures())) {
							g.addEdge(mj, mi);
						}
					}
				}
			}
		}

		for (Mutant mutant : mutants) {
			Set<Mutant> mySet = g.getDescendants(g, mutant);			
			String descendents = "{ ";
			for (Mutant mutant2 : mySet) {
				descendents += mutant2.getName() + ", ";
			}
			descendents += "}";
			System.out.println("Root: " + mutant.getName() + " -> " + descendents);
		}

//		System.out.println(g.toString());

	}

		
}
