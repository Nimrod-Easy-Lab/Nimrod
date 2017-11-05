import java.util.List;

import randoop.Statement;
import randoop.ExecutableSequence;
import randoop.util.SimpleList;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;


public aspect Aspect {
	
	public static ArrayList impactedMethods = new ArrayList();
	private List affectedTests = new ArrayList();
	private int test = 0;
	private final String RANDOOP = "Randoop";
	

	
	public Aspect()  {

	}

	public void randoop.main.Main.nonStaticMainAJ(String[] args, ArrayList impactedList) {
		
		
		int size = impactedList.size();
		for (int i = 0; i < size; i++) {
			Aspect.impactedMethods.add(impactedList.get(i));
		}				
		new randoop.main.Main().nonStaticMain(args);
	}
	
	pointcut advice (java.util.List sequencesForOneFile, java.lang.String junitTestsClassName) :  execution (* *.writeSubSuite(java.util.List, java.lang.String))
	&&  args(sequencesForOneFile,junitTestsClassName);

	File around (java.util.List sequencesForOneFile, java.lang.String junitTestsClassName) : advice(sequencesForOneFile,junitTestsClassName) {
		
		if (Aspect.impactedMethods.size() > 0) {
			System.out.println("entrou around"+junitTestsClassName);
			int size = sequencesForOneFile.size();
			List impactedSequences = new ArrayList();
			boolean containsMethod = true;
			for (int i = 0; i < size; i++) {
				containsMethod = false;
				ExecutableSequence s = (ExecutableSequence)sequencesForOneFile.get(i);
				SimpleList statements = s.sequence.statements;
	    		List jdkList = statements.toJDKList();
	    		int sizeStatements = jdkList.size();
	    		for (int j = 0; j < sizeStatements; j++) {
	    			Statement statement = (Statement)jdkList.get(j);
	    			if (impactedMethods.contains(statement.statement.toString())) {
	    				containsMethod = true;
	    				break;
	    			} 
	    		}
	    		if (containsMethod && !s.toCodeString().contains("randoop.util.ReflectionExecutor.TimeoutExceeded")) {
	    			impactedSequences.add(s);
	    		} 
			}
			
			return proceed(impactedSequences,junitTestsClassName);
		} else {
			return proceed(sequencesForOneFile,junitTestsClassName);
		}
	}
	
	


}
