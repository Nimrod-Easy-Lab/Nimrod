package saferefactor.core;

import java.io.File;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import saferefactor.core.analysis.naive.ASMBasedAnalyzer;
import saferefactor.core.analysis.naive.ReflectionBasedAnalyzer;
import saferefactor.core.comparator.ComparatorImp;
import saferefactor.core.comparator.Report;
import saferefactor.core.execution.AntJunitRunner;
import saferefactor.core.execution.CoverageDataReader.CoverageReport;
import saferefactor.core.execution.CoverageMeter;
import saferefactor.core.generation.RandoopAdapter;
import saferefactor.core.generation.RandoopAntAdapter;
import saferefactor.core.util.AntJavaCompiler;
import saferefactor.core.util.Constants;
import saferefactor.core.util.EclipseCompiler;
import saferefactor.core.util.FileUtil;
import saferefactor.core.util.Project;
import saferefactor.core.util.ast.Method;
import saferefactor.core.util.ast.ConstructorImp;
import saferefactor.core.util.ast.MethodImp;

public class SafeRefactorImp extends SafeRefactor {
	
	public SafeRefactorImp(Project source, Project target) throws Exception {
		super(source, target);
		init();
	}

	public SafeRefactorImp(Project source, Project target, Parameters parameters)
			throws Exception {
		super(source, target, parameters);
		init();
	}

	private void init() throws Exception {

		//define tmp folder

		setTmpFolder(Constants.SAFEREFACTOR_DIR + Constants.SEPARATOR+ this.toString());
		File tmpFile = new File(getTmpFolder());
		
		//create tmp folder
		setTestPath(new File(tmpFile,Constants.TESTS_DIR));
		getTestPath().mkdirs();
		
		logger = Logger.getLogger("SafeRefactorLogger");
		FileHandler fh = new FileHandler(getTestPath().getAbsolutePath() + Constants.SEPARATOR + "log_saferefactor");
		fh.setFormatter(new SimpleFormatter());
		logger.addHandler(fh);

		analyzer = new ASMBasedAnalyzer(this.source, this.target,this.tmpFolder);
//		analyzer = new ReflectionBasedAnalyzer(this.source, this.target,this.tmpFolder);

		generator = new RandoopAntAdapter(this.source,this.getTestPath().getAbsolutePath());

		sourceCompiler = new AntJavaCompiler(this.tmpFolder);
		targetCompiler = new AntJavaCompiler(this.tmpFolder);
		sourceTestCompiler = new AntJavaCompiler(this.tmpFolder);
		targetTestCompiler = new AntJavaCompiler(this.tmpFolder);

		testSourceTask = new AntJunitRunner(this.source,this.tmpFolder);
		testTargetTask = new AntJunitRunner(this.target,this.tmpFolder);

		if (this.parameters.isExecuteTwiceOnSource()) {
			testAgainSourceTask = new AntJunitRunner(this.source,this.tmpFolder);
		}

		testTargetTask = new AntJunitRunner(this.target,this.tmpFolder);
		sourceReport = new File(this.getTestPath(),SafeRefactor.SOURCE_REPORT);
		sourceSecondReport = new File(this.getTestPath(),SafeRefactor.SOURCE_SECOND_REPORT);
		targetReport = new File(this.getTestPath(),SafeRefactor.TARGET_REPORT);
		
		comparator = new ComparatorImp(sourceReport.getAbsolutePath(),
				targetReport.getAbsolutePath());
		
		
		bin_source = new File(getTestPath(),SafeRefactor.TESTS_BIN_SOURCE);
		bin_target = new File(getTestPath(),SafeRefactor.TESTS_BIN_TARGET);
		meter = new CoverageMeter(this.target, bin_source.getAbsolutePath());
	}

	@Override
	protected void generateReport() {
		Report comparatorReport = comparator.getReport();

		if (!source.isCompile() || !target.isCompile()) {
			report.setRefactoring(false);
			report.setCompilationError(true);
		} else {
			report.setRefactoring(comparatorReport.isRefactoring());

			int methods = getTotalMethodsToTest();

			report.setTotalMethodsToTest(methods);

			if (!report.isRefactoring())
				report.setChanges(comparatorReport.getChanges());

			if (parameters.checkCoverage()) {
				CoverageReport coverageReport = meter.getCoverageReport();
				report.setCoverage(coverageReport);
			}
		}

	}

	private int getTotalMethodsToTest() {
		int methods = 0;
		for (Method method : methodsToTest) {
			if (method instanceof ConstructorImp)
				methods++;
		}
		for (Method method : methodsToTest) {
			if (method instanceof MethodImp) {
				methods += method.getAllowedClasses().size();
				if (method.getAllowedClasses().size() == 0) {
					methods++;
				}
			}
		}
		return methods;
	}
}