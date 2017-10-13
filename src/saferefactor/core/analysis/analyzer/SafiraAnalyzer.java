package saferefactor.core.analysis.analyzer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.tools.ant.DefaultLogger;
import org.apache.tools.ant.ProjectHelper;

import saferefactor.core.analysis.Report;
import saferefactor.core.util.Constants;
import saferefactor.core.util.Project;
import saferefactor.core.util.ast.Method;
import saferefactor.core.util.ast.Clazz;
import saferefactor.core.util.ast.ConstructorImp;
import saferefactor.core.util.ast.MethodImp;
import saferefactor.core.analysis.naive.NaiveReport;
import saferefactor.core.analysis.safira.analyzer.ImpactAnalysis;

public class SafiraAnalyzer implements TransformationAnalyzer {

	private List<Clazz> sourceClasses;
	private List<Clazz> targetClasses;
	private final Project source;
	private final Project target;
	private final String tmpDir;
	private String bin = "";
	private ImpactAnalysis ia;

	public SafiraAnalyzer(Project source, Project target, String tmpDir) {
		this.source = source;
		this.target = target;
		this.tmpDir = tmpDir;
		this.bin = source.getBin();

	}

	public Report analyze() throws Exception {
		
		Report result = new NaiveReport();

		ia = new ImpactAnalysis(source.getProjectFolder().getAbsolutePath(), 
				target.getProjectFolder().getAbsolutePath(), bin);

		List<Method> methods_to_test = ia.getMethods_to_test();
		result.setMethodsToTest(methods_to_test);

		return result;
		
	}

	public ImpactAnalysis getIa() {
		return ia;
	}

	public void setIa(ImpactAnalysis ia) {
		this.ia = ia;
	}

	

	
}
