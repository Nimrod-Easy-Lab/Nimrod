package saferefactor.core.analysis.analyzer.factory;

import saferefactor.core.analysis.analyzer.SafiraAnalyzer;
import saferefactor.core.analysis.analyzer.TransformationAnalyzer;
import saferefactor.core.util.Project;

public class SafiraAnalyzerFactory extends AnalyzerFactory {

	@Override
	public TransformationAnalyzer createAnalyzer(Project source,
			Project target, String tmpDir) {
		return new SafiraAnalyzer(source, target,tmpDir);
	}

}
