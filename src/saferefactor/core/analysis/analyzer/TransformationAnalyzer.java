package saferefactor.core.analysis.analyzer;

import java.io.IOException;
import java.util.List;

import saferefactor.core.analysis.Report;
import saferefactor.core.util.Project;

public interface TransformationAnalyzer {
	
	
	
	public Report analyze() throws Exception;

	

}
