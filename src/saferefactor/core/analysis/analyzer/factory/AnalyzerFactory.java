package saferefactor.core.analysis.analyzer.factory;

import saferefactor.core.analysis.analyzer.ReflectionBasedAnalyzerFactory;
import saferefactor.core.analysis.analyzer.TransformationAnalyzer;
import saferefactor.core.util.Project;

public abstract class AnalyzerFactory {

	public static AnalyzerFactory getFactory() {
		if (AnalyzerConfiguration.getCurrentAnalyzer() == Analyzer.SAFIRA)
			return new SafiraAnalyzerFactory();
		else
			return new ReflectionBasedAnalyzerFactory();
	}

	enum Analyzer {
		REFLECTION_BASED, SAFIRA
	}

	static class AnalyzerConfiguration {

		static Analyzer getCurrentAnalyzer() {
			return Analyzer.SAFIRA;
		}
	}
	
	public abstract TransformationAnalyzer createAnalyzer(Project source, Project target, String tmpDir);

}
