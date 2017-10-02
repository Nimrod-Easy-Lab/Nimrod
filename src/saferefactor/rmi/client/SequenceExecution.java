package saferefactor.rmi.client;

//import compute.Task;
import java.io.Serializable;

//import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import randoop.main.GenInputsAbstract;




import randoop.ContractCheckingVisitor;
import randoop.EqualsHashcode;
import randoop.EqualsReflexive;
import randoop.EqualsSymmetric;
import randoop.EqualsToNullRetFalse;
import randoop.ExecutableSequence;
import randoop.ExecutionVisitor;
import randoop.MultiVisitor;
import randoop.ObjectContract;
import randoop.RegressionCaptureVisitor;
import saferefactor.rmi.common.Task;

public class SequenceExecution implements Task<List<ExecutableSequence>>, Serializable {

    
	/**
	 * 
	 */
	private static final long serialVersionUID = -2037599463104347558L;




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((sequences == null) ? 0 : sequences.hashCode());
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SequenceExecution other = (SequenceExecution) obj;
		if (sequences == null) {
			if (other.sequences != null) 
				return false;
		} else if (!sequences.equals(other.sequences))
			return false;
		return true;
	}




	private final List<ExecutableSequence> sequences;
	private String projectId;


  

    public SequenceExecution(String projectId, List<ExecutableSequence> sequences) {
		this.projectId = projectId;
		this.sequences = sequences;

	}




	public List<ExecutableSequence> execute() {

		System.out.println("Running tests on snapshot: " + projectId);
    	
		List<ExecutionVisitor> visitors = new ArrayList<ExecutionVisitor>();
		List<ObjectContract> contracts = new ArrayList<ObjectContract>(); 

		// Now add all of Randoop's default contracts.
		contracts.add(new EqualsReflexive());
		contracts.add(new EqualsToNullRetFalse());
		contracts.add(new EqualsHashcode());
		contracts.add(new EqualsSymmetric());
		ContractCheckingVisitor contractVisitor = new ContractCheckingVisitor(
				contracts, GenInputsAbstract.offline ? false : true);
		visitors.add(contractVisitor);

		visitors.add(new RegressionCaptureVisitor());
		MultiVisitor visitor = new MultiVisitor(visitors);
		
//		List<ExecutableSequence> sequences = new ArrayList<ExecutableSequence>();
		for (ExecutableSequence executableSequence : sequences) {
			executableSequence.execute(visitor);
		}
    	return sequences;
    }

  
}
