package saferefactor.core;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import saferefactor.core.analysis.analyzer.ReflectionBasedAnalyzer;
import saferefactor.core.analysis.analyzer.TransformationAnalyzer;
import saferefactor.core.analysis.analyzer.factory.AnalyzerFactory;
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

		// define tmp folder
		int counter = 0;
		String tmpFolder2 = Constants.SAFEREFACTOR_DIR + Constants.SEPARATOR + "SafeRefactor"
				+ counter + Constants.SEPARATOR;
		File tmpFile = new File(tmpFolder2);
		while (tmpFile.exists()) {
			counter++;
			tmpFolder2 = Constants.SAFEREFACTOR_DIR + Constants.SEPARATOR + "SafeRefactor" + counter
					+ Constants.SEPARATOR;
			tmpFile = new File(tmpFolder2);
		}
		tmpFile.mkdir();
		setTmpFolder(tmpFolder2);

		// create tmp folder
		setTestPath(new File(tmpFile, Constants.TESTS_DIR));
		getTestPath().mkdirs();

		logger = Logger.getLogger("SafeRefactorLogger");
		FileHandler fh = new FileHandler(getTestPath().getAbsolutePath()
				+ Constants.SEPARATOR + "log_saferefactor");
		fh.setFormatter(new SimpleFormatter());
		logger.addHandler(fh);

		analyzer = AnalyzerFactory.getFactory().createAnalyzer(this.source,
				this.target, this.tmpFolder);

		generator = new RandoopAntAdapter(this.source, this.getTestPath()
				.getAbsolutePath());

		sourceCompiler = new AntJavaCompiler(this.tmpFolder);
		targetCompiler = new AntJavaCompiler(this.tmpFolder);
		sourceTestCompiler = new AntJavaCompiler(this.tmpFolder);
		targetTestCompiler = new AntJavaCompiler(this.tmpFolder);

		testSourceTask = new AntJunitRunner(this.source, this.tmpFolder);
		testTargetTask = new AntJunitRunner(this.target, this.tmpFolder);

		if (this.parameters.isExecuteTwiceOnSource()) {
			testAgainSourceTask = new AntJunitRunner(this.source,
					this.tmpFolder);
		}

		testTargetTask = new AntJunitRunner(this.target, this.tmpFolder);
		sourceReport = new File(this.getTestPath(), SafeRefactor.SOURCE_REPORT);
		sourceSecondReport = new File(this.getTestPath(),
				SafeRefactor.SOURCE_SECOND_REPORT);
		targetReport = new File(this.getTestPath(), SafeRefactor.TARGET_REPORT);

		comparator = new ComparatorImp(sourceReport.getAbsolutePath(),
				targetReport.getAbsolutePath());

		bin_source = new File(getTestPath(), SafeRefactor.TESTS_BIN_SOURCE);
		bin_target = new File(getTestPath(), SafeRefactor.TESTS_BIN_TARGET);
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
			report.setTmpFolder(this.tmpFolder);
			report.setTotalMethodsToTest(methods);
			report.setTimelimit(parameters.getTimeLimit());
			report.setNumberTests(comparatorReport.getTotalTests());
			report.setMethodsToTest(this.methodsToTest);
			report.setSourceProject(this.target);
			File tmp = new File(tmpFolder, "tests/");
			File[] testFiles = tmp.listFiles(new FileFilter() {

				@Override
				public boolean accept(File file) {
					if (file.getName().equals("RandoopTest.java"))
						return false;
					if (file.getName().endsWith(".java"))
						return true;
					return false;
				}
			});
			for (File file : testFiles) {
				report.getGeneratedTestFiles().add(file);
			}

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
