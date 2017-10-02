package saferefactor.rmi.client;

//import compute.Task;
import java.io.Serializable;
//import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import randoop.main.GenInputsAbstract;
import randoop.main.GenTests;
import randoop.main.RandoopTextuiException;

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

public class TestGeneration implements Task<List<ExecutableSequence>>,
		Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6581330767303740097L;
	private String methodsToTest;

	public TestGeneration(String methodsToTest) {
		this.methodsToTest = methodsToTest;
	}

	public List<ExecutableSequence> execute() {
		List<ExecutableSequence> result = new ArrayList<ExecutableSequence>();

		GenTests generator = new GenTests();
		String[] command = { "--methodlist=" + methodsToTest, "--timelimit=1",
				"--log=filewriter", "--output-nonexec=true" };
		try {
			generator.handle(command);
			result = generator.getSequences();
		} catch (RandoopTextuiException e) {
			e.printStackTrace();
		}

		return result;
	}

}
