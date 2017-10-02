package saferefactor.experiments.scp2013;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.io.FileUtils;
import org.jdom.JDOMException;

import saferefactor.core.Report;
import saferefactor.core.execution.CoverageDataReader.CoverageReport;
import saferefactor.core.execution.CoverageImpactedMethodReport;
import saferefactor.core.execution.CoverageMeter;
import saferefactor.core.util.FileUtil;
import saferefactor.core.util.Project;
import saferefactor.core.util.ast.Method;

public class Main {

	private static final String ORIGINAL = "original";

	private static final String NEW_TECHNIQUE = "occ";

	private static final String LOG_DIR = "/Users/gustavoas/Dropbox/scp_results";

	private static final boolean RUN_METRIC2 = false;

	private static String workspace = "/Users/gustavoas/workspaces/scp2013/";

	private static int numberofexecutions = 1;

	private static boolean runOCC = true;

	private static boolean runOriginal = true;

	public static List<Result> runSubjects(String[] subjects, String bin,
			String src, double timelimit, String sourceSuffix,
			String targetSuffix) throws Exception {

		List<Result> results = new ArrayList<Result>();

		for (String subject : subjects) {
			Result result = new Result();
			String id = subject + sourceSuffix + "_" + targetSuffix;
			result.setSubject(id);
			if (runOriginal)
				result.getTechniqueReports().put(ORIGINAL,
						new ArrayList<Report>());
			if (runOCC)
				result.getTechniqueReports().put(NEW_TECHNIQUE,
						new ArrayList<Report>());

			for (int i = 0; i < Main.numberofexecutions; i++) {
				Report saferefactor = new Report();
				if (runOriginal) {
					saferefactor = runSubject(subject, bin, src, timelimit,
							false, sourceSuffix, targetSuffix);
					System.out.println("Original. Is refactoring? "
							+ saferefactor.isRefactoring());
					log(saferefactor, ORIGINAL, timelimit, id);
					if (!saferefactor.isRefactoring())
						System.out.println(saferefactor.getChanges());
				}
				result.getTechniqueReports().get(ORIGINAL).add(saferefactor);
				Report saferefactorImp = new Report();
				if (runOCC) {
					saferefactorImp = runSubject(subject, bin, src, timelimit,
							true, sourceSuffix, targetSuffix);
				}
				result.getTechniqueReports().get(NEW_TECHNIQUE)
						.add(saferefactorImp);
				System.out.println("Occ. Is refactoring? "
						+ saferefactorImp.isRefactoring());
				log(saferefactorImp, NEW_TECHNIQUE, timelimit, id);
				if (!saferefactorImp.isRefactoring())
					System.out.println(saferefactorImp.getChanges());
				if (RUN_METRIC2) {
					List<Method> impactedMethods = saferefactorImp
							.getMethodsToTest();
					calculateUsefulTests(saferefactorImp, impactedMethods);
					calculateUsefulTests(saferefactor, impactedMethods);
				}
			}
			results.add(result);
		}

		return results;
	}

	private static void calculateUsefulTests(Report report,
			List<Method> impactedMethods) throws FileNotFoundException,
			JDOMException, IOException {
		List<File> generatedTestFiles = report.getGeneratedTestFiles();
		double totalTests = generatedTestFiles.size();
		double usefulTests = 0;
		List<String> testesNotUseful = new ArrayList<String>();
		for (File file : generatedTestFiles) {
			if (file.getName().equals("RandoopTest5.java"))
				System.out.println("para");
			// run this test case and get coverage
			CoverageMeter m = new CoverageMeter(report.getSourceProject(),
					report.getTmpFolder() + "/tests/tests/bin_source/");
			m.checkTestCoverage(file.getName().replaceAll("java", "class"));
			CoverageReport coverageReport2 = m.getCoverageReport();
			// File reportFile;
			// check coverage
			CoverageImpactedMethodReport checkCoverageImpactedMethod = CoverageMeter
					.checkCoverageImpactedMethod(impactedMethods, new File(
							report.getTmpFolder(),
							"tests/tests/bin_source/coverage/coverage.xml"));
			if (checkCoverageImpactedMethod.getMethodCoverage() > 0)
				usefulTests++;
			else
				testesNotUseful.add(file.getName());
		}

		double percent = usefulTests / totalTests;
		report.setTestsThatCoverTheChange(percent);
	}

	private static void log(Report report, String technique, double timelimit,
			String id) throws IOException {
		String time = String.valueOf(timelimit);
		time = time.replace(".", "_");
		String folderName = id + "_" + technique + "_" + time;

		File dest = new File(LOG_DIR, folderName);
		if (dest.exists())
			FileUtils.deleteDirectory(dest);

		String tmpFolder = report.getTmpFolder();
		FileUtil.copyFolder(new File(tmpFolder), dest);
		if (!report.isRefactoring()) {
			FileUtil.makeFile(dest.getAbsolutePath() + "/changes.txt",
					report.getChanges());
		}

	}

	private static void printResults(List<Result> results)
			throws JDOMException, IOException {
		// System.out.println("Subject\tTechnique\tMethods\tResult\tTimeLimit\tTotalTime");

		for (Result result : results) {
			printSubjectResult(result);
		}
	}

	private static void printSubjectResult(Result result) throws JDOMException,
			IOException {

		Map<String, List<Report>> techniqueReports = result
				.getTechniqueReports();

		List<Report> originalResults = techniqueReports.get(ORIGINAL);
		List<Report> v2Results = techniqueReports.get(NEW_TECHNIQUE);

		List<Method> impactedMethods = v2Results.get(0).getMethodsToTest();

		System.out.print(result.getSubject() + "\tV1\t");
		System.out.print(originalResults.get(0).getTotalMethodsToTest() + "\t");
		System.out.print(v2Results.get(0).getTotalMethodsToTest() + "\t");

		for (Report report : originalResults) {
			print(report, impactedMethods);

		}
		System.out.print(result.getSubject() + "\tV2\t");

		for (Report report : v2Results) {
			print(report, impactedMethods);
		}
		System.out.println();

	}

	private static void print(Report report, List<Method> impactedMethods)
			throws JDOMException, IOException {

		// List<File> generatedTestFiles = report.getGeneratedTestFiles();
		// double totalTests = generatedTestFiles.size();
		// double usefulTests = 0;
		// List<String> testesNotUseful = new ArrayList<String>();
		// for (File file : generatedTestFiles) {
		// if (file.getName().equals("RandoopTest5.java"))
		// System.out.println("para");
		// // run this test case and get coverage
		// CoverageMeter m = new CoverageMeter(report.getSourceProject(),
		// report.getTmpFolder() + "/tests/tests/bin_source/");
		// m.checkTestCoverage(file.getName().replaceAll("java", "class"));
		// CoverageReport coverageReport2 = m.getCoverageReport();
		// File reportFile;
		// // check coverage
		// CoverageImpactedMethodReport checkCoverageImpactedMethod =
		// CoverageMeter
		// .checkCoverageImpactedMethod(impactedMethods, new File(
		// report.getTmpFolder(),
		// "tests/tests/bin_source/coverage/coverage.xml"));
		// if (checkCoverageImpactedMethod.getMethodCoverage() > 0)
		// usefulTests++;
		// else
		// testesNotUseful.add(file.getName());
		// }

		System.out.print(report.isRefactoring() + "\t");
		 File file = new File(report.getTmpFolder(),
		 "tests/tests/bin_source/coverage/coverage.xml");
		 CoverageImpactedMethodReport coverageReport = CoverageMeter
		 .checkCoverageImpactedMethod(impactedMethods, file);
		 System.out.print(coverageReport.getMethodCoverage());
		 System.out.print("\t");
		if (RUN_METRIC2) {
			System.out.print(report.getTestsThatCoverTheChange());
			System.out.print("\t");
		}
		System.out.print(report.getTotalTime() + "\t");
		System.out.print(report.getTimelimit() + "\t");
	}

	private static Report runSubject(String subjectName, String bin,
			String src, double timelimit, boolean occ, String sourceSuffix,
			String targetSuffix) throws Exception {
		Report report = SafeRefactorFacade.checkTransformation(workspace
				+ subjectName + sourceSuffix, workspace + subjectName
				+ targetSuffix, bin, src, "lib", false, timelimit, occ);
		return report;
	}

	public static void main(String[] args) {

		if (args.length < 1)
			throw new IllegalArgumentException("Usage: main option");

		int option = Integer.parseInt(args[0]);
////
//		String[] patterns = { "abstractfactory", "adapter", "bridge",
//				"builder", "chain", "command", "composite", "decorator",
//				"facade", "factorymethod", "flyweight", "interpreter",
//				"iterator", "mediator", "memento", "observer", "prototype",
//				"proxy", "singleton", "state", "strategy", "template",
//				"visitor" };

		String[] patterns = { "bridge"};

		// String[] patterns = { "abstractfactory" };

		 String[] eclipse = { "subject1", "subject2", "subject3", "subject4",
		 "subject5", "subject6", "subject7", "subject8" };
//		String[] eclipse = { "subject1" };
		String[] jhotdraw = { "JHotDraw" };
		String[] checkstyle = { "CheckstylePlugin" };
		String[] ajml = { "jaccounting-", "jspider-" };
		String[] jss = { "JHotDraw_650_" };
		String[] motivating = { "motivating_" };
		String[] jss2 = { "JHotDraw_344_" };
		String[] mobilemedia = { "MobileMedia01_", "MobileMedia02_",
				"MobileMedia03_", "MobileMedia04_" };

		Map<Double, List<Result>> results = new HashMap<Double, List<Result>>();
		// List<Result> results = new ArrayList<Result>();
		try {
			switch (option) {
			case 1:
				if (true) {
					double timelimit = 0.1;
					List<Result> runSubjects = Main.runSubjects(eclipse, "bin",
							"src", timelimit, "source", "target");

					results.put(timelimit, runSubjects);
				}
				if (true) {
					double timelimit = 0.2;
					List<Result> runSubjects = Main.runSubjects(eclipse, "bin",
							"src", timelimit, "source", "target");
					results.put(timelimit, runSubjects);
				}
				if (true) {
					double timelimit = 0.5;
					List<Result> runSubjects = Main.runSubjects(eclipse, "bin",
							"src", timelimit, "source", "target");

					results.put(timelimit, runSubjects);
				}
				break;
			case 2:
				if (true) {
					int timelimit = 2;
					List<Result> runSubjects2 = new ArrayList<Result>();
					runSubjects2.addAll(Main.runSubjects(jhotdraw, "bin",
							"src", timelimit, "_OO", "_AO"));
					runSubjects2.addAll(Main.runSubjects(jhotdraw, "bin",
							"src", timelimit, "_Original", "_AO"));
					// printResults(runSubjects2);
					results.put(Double.valueOf(timelimit), runSubjects2);
				}
				if (false) {
					int timelimit = 5;
					List<Result> runSubjects2 = new ArrayList<Result>();
					runSubjects2.addAll(Main.runSubjects(jhotdraw, "bin",
							"src", timelimit, "_OO", "_AO"));
					runSubjects2.addAll(Main.runSubjects(jhotdraw, "bin",
							"src", timelimit, "_Original", "_AO"));
					// printResults(runSubjects2);
					results.put(Double.valueOf(timelimit), runSubjects2);
				}
				if (true) {
					int timelimit = 10;
					List<Result> runSubjects2 = new ArrayList<Result>();
					runSubjects2.addAll(Main.runSubjects(jhotdraw, "bin",
							"src", timelimit, "_OO", "_AO"));
					runSubjects2.addAll(Main.runSubjects(jhotdraw, "bin",
							"src", timelimit, "_Original", "_AO"));
					// printResults(runSubjects2);
					results.put(Double.valueOf(timelimit), runSubjects2);
				}
				break;
			case 3:
				if (true) {
					double timelimit = 0.1;
					List<Result> runSubjects = Main.runSubjects(patterns,
							"bin", "src", timelimit, "OO", "AO");
					results.put(Double.valueOf(timelimit), runSubjects);
				}
				if (false) {
					double timelimit = 0.2;
					List<Result> runSubjects = Main.runSubjects(patterns,
							"bin", "src", timelimit, "OO", "AO");
					results.put(Double.valueOf(timelimit), runSubjects);
					printResults(runSubjects);
				}
				if (false) {
					double timelimit = 0.5;
					List<Result> runSubjects = Main.runSubjects(patterns,
							"bin", "src", timelimit, "OO", "AO");
					results.put(Double.valueOf(timelimit), runSubjects);
				}
				break;
			case 4:
				if (true) {
					double timelimit = 0.1;
					List<Result> runSubjects = Main.runSubjects(ajml, "bin",
							"src", timelimit, "non-opt", "opt");
					results.put(Double.valueOf(timelimit), runSubjects);
					printResults(runSubjects);
				}
				if (true) {
					double timelimit = 0.2;
					List<Result> runSubjects = Main.runSubjects(ajml, "bin",
							"src", timelimit, "non-opt", "opt");
					results.put(Double.valueOf(timelimit), runSubjects);
					printResults(runSubjects);
				}
				if (true) {
					double timelimit = 0.5;
					List<Result> runSubjects = Main.runSubjects(ajml, "bin",
							"src", timelimit, "non-opt", "opt");
					results.put(Double.valueOf(timelimit), runSubjects);
				}

				break;
			case 5:
				if (false) {
					double timelimit = 2;

					List<Result> runSubjects = new ArrayList<Result>();
					String bin = "bin";
					String src = "src/main/java";
//					runSubjects.addAll(Main.runSubjects(jss2, bin, src,
//							timelimit, "BEFORE", "AFTER"));

					bin = "build/classes";
					src = "src/main/java";
					runSubjects.addAll(Main.runSubjects(jss, bin, src,
							timelimit, "BEFORE", "AFTER"));
					//
					bin = "bin";
					src = "src";
//					runSubjects.addAll(Main.runSubjects(checkstyle, bin, src,
//							timelimit, "Source", "AO"));
//					runSubjects.addAll(Main.runSubjects(checkstyle, bin, src,
//							timelimit, "OO", "AO"));

					results.put(timelimit, runSubjects);
				}
				if (true) {
					double timelimit = 5;
					List<Result> runSubjects = new ArrayList<Result>();
					String bin = "bin";
					String src = "src/main/java";
					runSubjects.addAll(Main.runSubjects(jss2, bin, src,
							timelimit, "BEFORE", "AFTER"));

					bin = "build/classes";
					src = "src/main/java";
					runSubjects.addAll(Main.runSubjects(jss, bin, src,
							timelimit, "BEFORE", "AFTER"));

					bin = "bin";
					src = "src";
					runSubjects.addAll(Main.runSubjects(checkstyle, bin, src,
							timelimit, "Source", "AO"));
					runSubjects.addAll(Main.runSubjects(checkstyle, bin, src,
							timelimit, "OO", "AO"));

					results.put(timelimit, runSubjects);
				}
				if (false) {
					double timelimit = 10;
					List<Result> runSubjects = new ArrayList<Result>();
					String bin = "bin";
					String src = "src/main/java";
					runSubjects.addAll(Main.runSubjects(jss2, bin, src,
							timelimit, "BEFORE", "AFTER"));

					bin = "build/classes";
					src = "src/main/java";
					runSubjects.addAll(Main.runSubjects(jss, bin, src,
							timelimit, "BEFORE", "AFTER"));
					bin = "bin";
					src = "src";
					runSubjects.addAll(Main.runSubjects(checkstyle, bin, src,
							timelimit, "OO", "AO"));
					runSubjects.addAll(Main.runSubjects(checkstyle, bin, src,
							timelimit, "Source", "AO"));
					// printResults(runSubjects);
					results.put(timelimit, runSubjects);

				}

				break;
			case 6:
				if (true) {
					double timelimit = 10;
					String bin = "bin";
					String src = "src/main/java";
					List<Result> runSubjects = Main.runSubjects(jss2, bin, src,
							timelimit, "BEFORE", "AFTER");
					System.out.println("Time Limit: " + timelimit);
					results.put(timelimit, runSubjects);
					printResults(runSubjects);
				}
				if (true) {
					double timelimit = 20;
					String bin = "bin";
					String src = "src/main/java";
					List<Result> runSubjects = Main.runSubjects(jss2, bin, src,
							timelimit, "BEFORE", "AFTER");
					System.out.println("Time Limit: " + timelimit);
					results.put(timelimit, runSubjects);
					printResults(runSubjects);
				}
				if (true) {
					double timelimit = 30;
					String bin = "bin";
					String src = "src/main/java";
					List<Result> runSubjects = Main.runSubjects(jss2, bin, src,
							timelimit, "BEFORE", "AFTER");
					System.out.println("Time Limit: " + timelimit);
					results.put(timelimit, runSubjects);
					printResults(runSubjects);
				}
				break;
			case 7:
				if (true) {
					double timelimit = 0.2;
					String bin = "bin";
					String src = "src";
					List<Result> runSubjects = Main.runSubjects(mobilemedia,
							bin, src, timelimit, "OO", "AO");
					results.put(timelimit, runSubjects);
					printResults(runSubjects);
				}
				if (true) {
					double timelimit = 0.5;
					String bin = "bin";
					String src = "src";
					List<Result> runSubjects = Main.runSubjects(mobilemedia,
							bin, src, timelimit, "OO", "AO");
					results.put(timelimit, runSubjects);
					printResults(runSubjects);
				}
				if (true) {
					double timelimit = 1;
					String bin = "bin";
					String src = "src";
					List<Result> runSubjects = Main.runSubjects(mobilemedia,
							bin, src, timelimit, "OO", "AO");
					results.put(timelimit, runSubjects);
					printResults(runSubjects);
				}
				break;
			case 8:
				double timelimit = 1;
				String bin = "bin";
				String src = "src";
				List<Result> runSubjects = Main.runSubjects(motivating, bin,
						src, timelimit, "source", "target");
				results.put(timelimit, runSubjects);
				break;
			default:
				break;
			}
			if (true) {
				for (Entry<Double, List<Result>> result : results.entrySet()) {
					printResults(result.getValue());
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
