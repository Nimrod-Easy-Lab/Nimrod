package saferefactor.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;

import saferefactor.core.analysis.analyzer.ReflectionBasedAnalyzer;
import saferefactor.core.analysis.analyzer.SafiraAnalyzer;
import saferefactor.core.analysis.analyzer.TransformationAnalyzer;
import saferefactor.core.analysis.analyzer.factory.AnalyzerFactory;
import saferefactor.core.analysis.nimrod.Mutant;
import saferefactor.core.analysis.nimrod.MutantList;
import saferefactor.core.analysis.safira.analyzer.ImpactAnalysis;
import saferefactor.core.comparator.ComparatorImp;
import saferefactor.core.comparator.Failure;
import saferefactor.core.comparator.TestComparator;
import saferefactor.core.execution.AntJunitRunner;
import saferefactor.core.execution.CoverageMeter;
import saferefactor.core.execution.TestExecutor;
import saferefactor.core.generation.AbstractTestGeneratorAdapter;
import saferefactor.core.generation.EvoSuiteAdapter;
import saferefactor.core.generation.RandoopAntAdapter;
import saferefactor.core.generation.TestGeneratorFactory;
import saferefactor.core.generation.TestGeneratorType;
import saferefactor.core.util.Compiler;
import saferefactor.core.util.Constants;
import saferefactor.core.util.EclipseCompiler;
import saferefactor.core.util.Project;
import saferefactor.core.util.ast.Method;

public abstract class SafeRefactor {

	private ImpactAnalysis ia;

	protected String tmpFolder = "";
	protected TransformationAnalyzer analyzer;
	protected AbstractTestGeneratorAdapter generator;
	protected Parameters parameters;
	protected Report report;
	protected Compiler sourceTestCompiler;
	protected Compiler targetTestCompiler;
	protected Compiler sourceCompiler;
	protected Compiler targetCompiler;
	protected TestExecutor testSourceTask;
	protected TestExecutor testAgainSourceTask;
	protected TestExecutor testTargetTask;
	protected TestComparator comparator;
	private saferefactor.core.analysis.Report analysisReport;
	protected List<Method> methodsToTest;
	protected List<String> requiredClassesToTest;
	protected Project source;
	protected Project target;
	protected CoverageMeter meter;
	protected TestGeneratorType testGenerator;

	protected Logger logger;
	protected File bin_target;
	protected File bin_source;
	protected File sourceReport;
	private File testPath;
	protected File targetReport;
	protected File sourceSecondReport;
	public static final String TARGET_REPORT = Constants.TESTS_DIR + "/target";
	public static final String SOURCE_SECOND_REPORT = Constants.TESTS_DIR + "/source2";
	public static final String SOURCE_REPORT = Constants.TESTS_DIR + "/source";

	protected static final String TESTS_BIN_TARGET = Constants.TESTS_DIR + "/bin_target";

	protected static final String TESTS_BIN_SOURCE = Constants.TESTS_DIR + "/bin_source";

	public SafeRefactor() {
		super();
		parameters = new Parameters();
		report = new Report();
	}

	public SafeRefactor(Project source, Parameters parameters, TestGeneratorType tg) {
		this();
		this.source = source;
		this.parameters = parameters;
		this.testGenerator = tg;
	}

	public SafeRefactor(Project source, Project target, TestGeneratorType tg) {
		this();
		this.source = source;
		this.target = target;
		this.testGenerator = tg;
	}

	public SafeRefactor(Project source, Project target, Parameters parameters, TestGeneratorType tg) {
		this(source, target, tg);
		this.parameters = parameters;

	}

	public void checkTransformation() throws SafeRefactorException {
		double start = System.currentTimeMillis();
		logger.info("check compilation? " + parameters.isCompileProjects());
		if (parameters.isCompileProjects()) {
			try {
				compileSourceAndTarget();
			} catch (MalformedURLException e) {
				throw new SafeRefactorException(e.getMessage());
			} catch (FileNotFoundException e) {
				throw new SafeRefactorException(e.getMessage());
			} catch (CompilationErrorException e) {
				target.setCompile(false);
			} catch (Exception e) {
				e.printStackTrace();
				throw new SafeRefactorException(e.getMessage());
			}
		}
		try {

			if (hasNoCompilationErrors())
				checkBehavioralChanges();
			else
				logger.info("has compilation error");
			generateReport();

			double stop = System.currentTimeMillis();
			double total = ((stop - start) / 1000);
			logger.info("time to check transformation (s): " + total);
			report.setTotalTime(total);
		} catch (Exception e) {
			e.printStackTrace();
			throw new SafeRefactorException(e.getMessage());
		}
	}

	public void checkTransformations(List<Project> targets) throws Exception {

		// Assign source to target, because the analysis check
		// common methods to generate randoop tests
		this.target = this.source;
		if (parameters.isCompileProjects()) {
			try {
				compileSource();
			} catch (MalformedURLException e) {
				throw new SafeRefactorException(e.getMessage());
			} catch (FileNotFoundException e) {
				throw new SafeRefactorException(e.getMessage());
			} catch (CompilationErrorException e) {
				throw new SafeRefactorException(e.getMessage());
			} catch (Exception e) {
				e.printStackTrace();
				throw new SafeRefactorException(e.getMessage());
			}

		}

		// Just generate tests once
		analyzeTransformation();
		generateTests();
		compileTests();
		// Run tests on source to get the values to compare
		runTestsOnSourceProjects();

		for (Project project : targets) {
			this.target = project;
			double start = System.currentTimeMillis();
			// logger.info("check compilation? " + parameters.isCompileProjects());
			// if (parameters.isCompileProjects()) {
			// try {
			// compileTarget();
			// } catch (MalformedURLException e) {
			// throw new SafeRefactorException(e.getMessage());
			// } catch (FileNotFoundException e) {
			// throw new SafeRefactorException(e.getMessage());
			// } catch (CompilationErrorException e) {
			// target.setCompile(false);
			// } catch (Exception e) {
			// e.printStackTrace();
			// throw new SafeRefactorException(e.getMessage());
			// }
			// }
			try {

				if (hasNoCompilationErrors()) {
					reInitTarget();
					checkTargetTests();
				} else
					logger.info("has compilation error");
				generateReport();

				double stop = System.currentTimeMillis();
				double total = ((stop - start) / 1000);
				logger.info("time to check transformation(s) of " + project.getSrcFolder().getName() + ":-> " + total);
				report.setTotalTime(total);

				// Salva o report com os testes que mataram o mutante
				saveMutantReport();

			} catch (Exception e) {
				e.printStackTrace();
				throw new SafeRefactorException(e.getMessage());
			}

		}

	}

	protected MutantList mList = new MutantList();

	/**
	 * Metodo para salvar o resultado do report do mutante, para depois comparar os
	 * resultados.
	 * 
	 * @throws IOException
	 * @author leofernandesmo
	 */
	private void saveMutantReport() throws IOException {
		// Cria o arquivo que vai guardar o log
		File mutantLogFile = new File(target.getProjectFolder().getAbsolutePath() + "/NimrodReport.log");
		String lines = comparator.getReport().getChanges();
		FileUtils.writeStringToFile(mutantLogFile, lines);

		// Copia os testes para a pasta do mutante
		List<File> testFiles = this.report.getGeneratedTestFiles();
		for (File generatedTestFile : testFiles) {
			String newName = generatedTestFile.getName().replace(".java", ".txt");
			File generatedFileCopy = new File(target.getProjectFolder().getAbsolutePath() + "/" + newName);
			FileUtils.copyFile(generatedTestFile, generatedFileCopy);
		}

		Set<String> testFailures = new HashSet<String>();
		for (Failure f : comparator.getReport().getChangedTests()) {
			testFailures.add(f.getFileName() + "." + f.getTestSimpleName());
		}

		Mutant mutant = new Mutant(target.getProjectFolder().getName(), target.getProjectFolder(), testFailures);
		mList.addMutant(mutant);

	}

	protected boolean hasNoCompilationErrors() {
		return target.isCompile() || !parameters.isCompileProjects();
	}

	private void compileSourceAndTarget()
			throws MalformedURLException, FileNotFoundException, SafeRefactorException, CompilationErrorException {

		double start = System.currentTimeMillis();

		if (source.getLibFolder() != null)
			sourceCompiler.setLibClasspath(source.getLibFolder().getAbsolutePath());
		// if (parameters.getCompilerPath() != null) {
		// sourceCompiler.setCompilerPath(parameters.getCompilerPath());
		// targetCompiler.setCompilerPath(parameters.getCompilerPath());
		// }
		// if (parameters.getBuildPath() != null) {
		// sourceCompiler.setBuildPath(parameters.getBuildPath());
		// targetCompiler.setBuildPath(parameters.getBuildPath());
		// }

		// boolean isSourceCompilable =
		sourceCompiler.compile(source.getSrcFolder().getAbsolutePath(), source.getBuildFolder().getAbsolutePath());
		// source.setCompile(isSourceCompilable);

		if (target.getLibFolder() != null)
			targetCompiler.setLibClasspath(target.getLibFolder().getAbsolutePath());
		// boolean isTargetCompilable =
		try {
			targetCompiler.compile(target.getSrcFolder().getAbsolutePath(), target.getBuildFolder().getAbsolutePath());
			// target.setCompile(isTargetCompilable);
		} catch (Exception e) {
			throw new CompilationErrorException(e);
		}
		double stop = System.currentTimeMillis();
		double total = ((stop - start) / 1000);
		logger.info("time to compile (s): " + total);
	}

	private void compileSource()
			throws MalformedURLException, FileNotFoundException, SafeRefactorException, CompilationErrorException {
		double start = System.currentTimeMillis();
		if (source.getLibFolder() != null)
			sourceCompiler.setLibClasspath(source.getLibFolder().getAbsolutePath());
		sourceCompiler.compile(source.getSrcFolder().getAbsolutePath(), source.getBuildFolder().getAbsolutePath());
		double stop = System.currentTimeMillis();
		double total = ((stop - start) / 1000);
		logger.info("time to compile only the source (s): " + total);
	}

	private void compileTarget()
			throws MalformedURLException, FileNotFoundException, SafeRefactorException, CompilationErrorException {
		double start = System.currentTimeMillis();
		if (target.getLibFolder() != null)
			targetCompiler.setLibClasspath(target.getLibFolder().getAbsolutePath());
		targetCompiler.compile(target.getSrcFolder().getAbsolutePath(), target.getBuildFolder().getAbsolutePath());
		double stop = System.currentTimeMillis();
		double total = ((stop - start) / 1000);
		logger.info("time to compile only the target (s): " + total);
	}

	private void checkBehavioralChanges() throws Exception {
		analyzeTransformation();
		generateTests();
		compileTests();
		runTestsOnSourceAndTargetProjects();
		comparator.compare();
		if (!comparator.getReport().isRefactoring() && parameters.analyzeChangeMethods()) {
			String testSourceDir = getTmpFolder() + Constants.SEPARATOR + Constants.TESTS_DIR + Constants.SEPARATOR;
			Set<Method> changedMethods = comparator.identifyMethodsWithBehavioralChanges(testSourceDir);
			report.setChangedMethods(new ArrayList<Method>(changedMethods));
		}

		if (parameters.checkCoverage())
			meter.checkTestCoverage();
	}

	private void reInitTarget() throws Exception {
		analyzer = AnalyzerFactory.getFactory().createAnalyzer(this.source, this.target, this.tmpFolder);

		generator = TestGeneratorFactory.create(this.testGenerator, this.source, this.getTestPath().getAbsolutePath());

		// targetCompiler = new AntJavaCompiler(this.tmpFolder);
		// targetTestCompiler = new AntJavaCompiler(this.tmpFolder);
		targetCompiler = new EclipseCompiler();
		targetTestCompiler = new EclipseCompiler();

		testTargetTask = new AntJunitRunner(this.target, this.tmpFolder);

		testTargetTask = new AntJunitRunner(this.target, this.tmpFolder);
		sourceReport = new File(this.getTestPath(), SafeRefactor.SOURCE_REPORT);
		sourceSecondReport = new File(this.getTestPath(), SafeRefactor.SOURCE_SECOND_REPORT);
		targetReport = new File(this.getTestPath(), SafeRefactor.TARGET_REPORT);

		comparator = new ComparatorImp(sourceReport.getAbsolutePath(), targetReport.getAbsolutePath());

		bin_target = new File(getTestPath(), SafeRefactor.TESTS_BIN_TARGET);
		meter = new CoverageMeter(this.target, bin_source.getAbsolutePath());
	}

	private void checkTargetTests() throws Exception {
		// analyzeTransformation();
		// generateTests();
		// compileTests();
		// runTestsOnSourceAndTargetProjects();

		runTestsOnTargetProjects();
		comparator.compare();
		if (!comparator.getReport().isRefactoring() && parameters.analyzeChangeMethods()) {
			String testSourceDir = getTmpFolder() + Constants.SEPARATOR + Constants.TESTS_DIR + Constants.SEPARATOR;
			Set<Method> changedMethods = comparator.identifyMethodsWithBehavioralChanges(testSourceDir);
			report.setChangedMethods(new ArrayList<Method>(changedMethods));
		}

		if (parameters.checkCoverage())
			meter.checkTestCoverage();
	}

	protected abstract void generateReport();

	private void runTestsOnSourceProjects() throws FileNotFoundException {
		double start = System.currentTimeMillis();

		// ExecutorService executor = Executors.newSingleThreadExecutor();
		ExecutorService executor = Executors.newFixedThreadPool(1);

		testSourceTask.setReportPath(this.sourceReport.getAbsolutePath());
		testSourceTask.setTests(this.bin_source.getAbsolutePath());
		executor.execute(testSourceTask);
		executor.shutdown();

		while (!executor.isTerminated()) {
		}
		double stop = System.currentTimeMillis();
		double total = ((stop - start) / 1000);
		// logger.info("time to run tests (s): " + total);
	}

	private void runTestsOnTargetProjects() throws FileNotFoundException {
		double start = System.currentTimeMillis();

		// ExecutorService executor = Executors.newSingleThreadExecutor();
		ExecutorService executor = Executors.newFixedThreadPool(1);
		testTargetTask.setReportPath(targetReport.getAbsolutePath());
		testTargetTask.setTests(this.bin_target.getAbsolutePath());
		executor.execute(testTargetTask);
		executor.shutdown();

		while (!executor.isTerminated()) {
		}
		double stop = System.currentTimeMillis();
		double total = ((stop - start) / 1000);
	}

	private void runTestsOnSourceAndTargetProjects() throws FileNotFoundException {

		double start = System.currentTimeMillis();

		// ExecutorService executor = Executors.newSingleThreadExecutor();
		ExecutorService executor = Executors.newFixedThreadPool(1);

		testSourceTask.setReportPath(this.sourceReport.getAbsolutePath());
		testSourceTask.setTests(this.bin_source.getAbsolutePath());
		executor.execute(testSourceTask);

		if (testAgainSourceTask != null) {
			testAgainSourceTask.setReportPath(this.sourceSecondReport.getAbsolutePath());
			testAgainSourceTask.setTests(this.bin_source.getAbsolutePath());
			executor.execute(testAgainSourceTask);

		}
		testTargetTask.setReportPath(targetReport.getAbsolutePath());
		testTargetTask.setTests(this.bin_target.getAbsolutePath());
		executor.execute(testTargetTask);
		executor.shutdown();

		while (!executor.isTerminated()) {
		}
		double stop = System.currentTimeMillis();
		double total = ((stop - start) / 1000);
		logger.info("time to run tests (s): " + total);

	}

	private void compileTests() throws MalformedURLException, FileNotFoundException, SafeRefactorException {
		double start = System.currentTimeMillis();

		sourceTestCompiler.setBinClasspath(source.getBuildFolder().getAbsolutePath());
		if (source.getLibFolder() != null)
			sourceTestCompiler.setLibClasspath(source.getLibFolder().getAbsolutePath());
		sourceTestCompiler.compile(getTestPath().getAbsolutePath(), bin_source.getAbsolutePath());

		targetTestCompiler.setBinClasspath(target.getBuildFolder().getAbsolutePath());

		if (target.getLibFolder() != null)
			targetTestCompiler.setLibClasspath(target.getLibFolder().getAbsolutePath());
		targetTestCompiler.compile(getTestPath().getAbsolutePath(), bin_target.getAbsolutePath());

		double stop = System.currentTimeMillis();
		double total = ((stop - start) / 1000);
		logger.info("time to compile tests (s): " + total);

	}

	private void generateTests() throws FileNotFoundException {
		double start = System.currentTimeMillis();

		String impactedList = "";
		if (ia != null) {
			impactedList = ia.getImpactedList();
		}

		generator.generateTestsForMethodList(methodsToTest, requiredClassesToTest, parameters.getTimeLimit(),
				parameters.getTestGeneratorParameters(), impactedList);

		double stop = System.currentTimeMillis();
		double total = ((stop - start) / 1000);
		logger.info("time to generate tests (s): " + total);
	}

	private void analyzeTransformation() throws Exception {
		double start = System.currentTimeMillis();

		String kind_of_analysis = parameters.getKind_of_analysis();

		if (kind_of_analysis.equals(Parameters.REFLECTION_ANALYSIS)) {
			analyzer = new ReflectionBasedAnalyzer(source, target, getTmpFolder());
			analysisReport = analyzer.analyze();
		} else if (kind_of_analysis.equals(Parameters.SAFIRA_ANALYSIS)) {
			analyzer = new SafiraAnalyzer(source, target, getTmpFolder());
			analysisReport = analyzer.analyze();
			ia = ((SafiraAnalyzer) analyzer).getIa();
		}

		methodsToTest = analysisReport.getMethodsToTest();
		requiredClassesToTest = analysisReport.getRequiredClassesToTest();

		double stop = System.currentTimeMillis();
		double total = ((stop - start) / 1000);
		logger.info("time to identify common methods (s): " + total);
	}

	public Report getReport() {
		return report;
	}

	public File getTestPath() {
		return testPath;
	}

	public void setTestPath(File testPath) {
		this.testPath = testPath;
	}

	public ImpactAnalysis getIa() {
		return ia;
	}

	public void setIa(ImpactAnalysis ia) {
		this.ia = ia;
	}

	public String getTmpFolder() {
		return tmpFolder;
	}

	public void setTmpFolder(String tmpFolder) {
		this.tmpFolder = tmpFolder;
	}
}