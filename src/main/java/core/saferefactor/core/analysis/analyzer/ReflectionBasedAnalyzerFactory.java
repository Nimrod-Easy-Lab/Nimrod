package saferefactor.core.analysis.analyzer;

import saferefactor.core.analysis.analyzer.factory.AnalyzerFactory;
import saferefactor.core.util.Project;

public class ReflectionBasedAnalyzerFactory extends AnalyzerFactory {

	@Override
	public TransformationAnalyzer createAnalyzer(Project source,
			Project target, String tmpDir) {
		return new ReflectionBasedAnalyzer(source, target,tmpDir);
	}

	
}
