package saferefactor.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.IOFileFilter;

import saferefactor.core.analysis.analyzer.factory.AnalyzerFactory;
import saferefactor.core.comparator.ComparatorImp;
import saferefactor.core.comparator.Report;
import saferefactor.core.execution.AntJunitRunner;
import saferefactor.core.execution.CoverageDataReader.CoverageReport;
import saferefactor.core.execution.CoverageMeter;
import saferefactor.core.generation.TestGeneratorFactory;
import saferefactor.core.generation.TestGeneratorType;
import saferefactor.core.util.AntJavaCompiler;
import saferefactor.core.util.Constants;
import saferefactor.core.util.Project;
import saferefactor.core.util.ast.ConstructorImp;
import saferefactor.core.util.ast.Method;
import saferefactor.core.util.ast.MethodImp;

public class NimrodImpl extends SafeRefactor {
	private List<Project> targets;

	public NimrodImpl(Project source, List<Project> targets, Parameters parameters, TestGeneratorType tg)
			throws Exception {
		super(source, source, parameters, tg);
		this.targets = targets;
		init();
	}

	private void init() throws Exception {

		// define tmp folder
		int counter = 0;
		String tmpFolder2 = Constants.SAFEREFACTOR_DIR + Constants.SEPARATOR + "SafeRefactor" + counter
				+ Constants.SEPARATOR;
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
		FileHandler fh = new FileHandler(getTestPath().getAbsolutePath() + Constants.SEPARATOR + "log_saferefactor");
		fh.setFormatter(new SimpleFormatter());
		logger.addHandler(fh);

		analyzer = AnalyzerFactory.getFactory().createAnalyzer(this.source, this.target, this.tmpFolder);

		generator = TestGeneratorFactory.create(this.testGenerator, this.source, this.getTestPath().getAbsolutePath());

		sourceCompiler = new AntJavaCompiler(this.tmpFolder);
		targetCompiler = new AntJavaCompiler(this.tmpFolder);
		sourceTestCompiler = new AntJavaCompiler(this.tmpFolder);
		targetTestCompiler = new AntJavaCompiler(this.tmpFolder);

		testSourceTask = new AntJunitRunner(this.source, this.tmpFolder);
		testTargetTask = new AntJunitRunner(this.target, this.tmpFolder);

		if (this.parameters.isExecuteTwiceOnSource()) {
			testAgainSourceTask = new AntJunitRunner(this.source, this.tmpFolder);
		}

		testTargetTask = new AntJunitRunner(this.target, this.tmpFolder);
		sourceReport = new File(this.getTestPath(), SafeRefactor.SOURCE_REPORT);
		sourceSecondReport = new File(this.getTestPath(), SafeRefactor.SOURCE_SECOND_REPORT);
		targetReport = new File(this.getTestPath(), SafeRefactor.TARGET_REPORT);

		comparator = new ComparatorImp(sourceReport.getAbsolutePath(), targetReport.getAbsolutePath());

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
			File tmp = new File(tmpFolder, "tests");
			
			String[] sufix = {"java"};
			Collection<File> testFiles = FileUtils.listFiles(tmp, sufix, false);

			if (testFiles == null || testFiles.size() == 0) {
				testFiles = FileUtils.listFiles(new File(tmp.getAbsolutePath(), "evosuite-tests"), sufix, true);
			}

			for (File file : testFiles) {
				if (!report.getGeneratedTestFiles().contains(file))
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

	public void logEquivalents(String path) throws IOException {
		mList.logEquivalents(path);
	}

	public void logDuplicated(String path) throws IOException {
		mList.logDuplicateds(path);
	}

	public List<String> getEquivalents() {
		return mList.getEquivalents();
	}

	public List<String> getDuplicateds() {
		return mList.getDuplicateds();
	}

	public void compileTargets() throws MalformedURLException, FileNotFoundException, SafeRefactorException {
		List<Project> targetsWithCompilerError = new ArrayList<Project>();
		for (Project target : targets) {
			double start = System.currentTimeMillis();
			if (target.getLibFolder() != null)
				targetCompiler.setLibClasspath(target.getLibFolder().getAbsolutePath());
			try {
				targetCompiler.compile(target.getSrcFolder().getAbsolutePath(),
						target.getBuildFolder().getAbsolutePath());
			} catch (Exception cex) {
				// Caso ocorra um erro de compilação. Loga o erro, remove o
				// target e continua execução
				logger.info("Compilation error in: " + target.getProjectFolder().getAbsolutePath());
				targetsWithCompilerError.add(target);
			}
			double stop = System.currentTimeMillis();
			double total = ((stop - start) / 1000);
			logger.info("time to compile only the target (s): " + total + "->" + target.getProjectFolder());
		}
		// Remove os targets com falha.
		targets.removeAll(targetsWithCompilerError);
	}

	@Override
	public void checkTransformations(List<Project> targets) throws Exception {
		super.checkTransformations(targets);
	}

	public void logRedundantInfo(String path) throws IOException {
		mList.logRedundantInfo(path);
	}

	public void evaluateRedundants() {
		mList.evaluateRedundants();
	}
}
