package saferefactor.core.execution;

import java.io.FileNotFoundException;

public interface TestExecutor extends Runnable {
	
	public void executeTests(String tests) throws FileNotFoundException;
	
	public String getReportPath();

	public void setReportPath(String reportPath); 
	
	public void setTests(String tests);

}
