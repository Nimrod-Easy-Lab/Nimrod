package saferefactor.ui;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import saferefactor.core.NimrodImpl;
import saferefactor.core.Parameters;
import saferefactor.core.Report;
import saferefactor.core.SafeRefactor;
import saferefactor.core.SafeRefactorException;
import saferefactor.core.SafeRefactorImp;
import saferefactor.core.analysis.nimrod.AnalysisType;
import saferefactor.core.generation.TestGeneratorType;
import saferefactor.core.util.Project;

public class Main {

	public static final String DEFAULT_TIMEOUT = "10";
	public static final AnalysisType DEFAULT_ANALYSIS_TYPE = AnalysisType.ALL;
	public static final TestGeneratorType DEFAULT_TEST_GENERATOR_TYPE = TestGeneratorType.RANDOOP_ANT;

	private static String srcPath = "";
	private static String binPath = "";
	private static String libPath = "";
	private static String source = "";
	private static List<String> targets;
	private static String timeout = DEFAULT_TIMEOUT;
	private static AnalysisType analysisType = DEFAULT_ANALYSIS_TYPE;
	private static TestGeneratorType testGenerator = DEFAULT_TEST_GENERATOR_TYPE;
	private static boolean needCompile = false;
	
	private static boolean quiet = false;

	public static void main(String[] args) {
		parseArgs(args);
		startAnalysis();
	}
	
	public static SafeRefactor startAnalysis(String[] args) {
		parseArgs(args);
		return startAnalysis();
	}

	private static SafeRefactor startAnalysis() {
		File sourceFile = new File(source);

		try {
			if (!sourceFile.exists())
				throw new Throwable("Directory not found:" + sourceFile.getAbsolutePath());

			Project sourceProject = getProject(sourceFile);

			List<Project> targetProjects = new ArrayList<Project>();
			for (String target : targets) {
				File targetFile = new File(target);
				targetProjects.add(getProject(targetFile));
			}

			Parameters parameters = new Parameters();
			parameters.setTimeLimit(Integer.parseInt(timeout));
			parameters.setCompileProjects(needCompile); // Caso eu queira executar
													// apenas com .class
			// parameters.setKind_of_analysis(Parameters.SAFIRA_ANALYSIS);
			// parameters.setAnalyzeChangeMethods(true);

			NimrodImpl sr = new NimrodImpl(sourceProject, targetProjects, parameters, testGenerator);
			// SafeRefactor sr = new SafeRefactorImp(sourceProject, targetProjects.get(0),
			// parameters);
			if (parameters.isCompileProjects()) {
				sr.compileTargets();
			}
			// sr.checkTransformation();
			sr.checkTransformations(targetProjects);
			if (analysisType == AnalysisType.EQUIVALENTS || analysisType == AnalysisType.ALL) {
				sr.printEquivalents();
			}

			if (analysisType == AnalysisType.REDUNDANTS || analysisType == AnalysisType.ALL) {
				sr.logRedundantInfo();
			}

			if (analysisType == AnalysisType.DUPLICATED || analysisType == AnalysisType.ALL) {
				sr.printDuplicated();
//				reAnalysisDuplicated(sr);
			}
			
			return sr;

		} catch (Throwable e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
			return null;
		}
	}

	private static Project getProject(File sourceFile) {
		File binSource = new File(sourceFile, binPath);
		File srcSource = new File(sourceFile, srcPath);
		File libSource = new File(sourceFile, libPath);

		Project sourceProject = new Project();
		sourceProject.setProjectFolder(sourceFile.getAbsoluteFile());
		sourceProject.setSrcFolder(srcSource);
		sourceProject.setBuildFolder(binSource);
		sourceProject.setLibFolder(libSource);
		return sourceProject;
	}

	public static void reAnalysisDuplicated(NimrodImpl sr) throws Exception, SafeRefactorException {
		System.out.println("Checking false positives in Duplicated Mutants...");
		List<String> duplicateds = sr.getDuplicateds();
		System.out.println("Total duplicateds before re-analysis: " + duplicateds.size());
		int totalDuplicateds = 0;
		for (String duplicated : duplicateds) {
			String[] programs = duplicated.split(":");

			File binSourceDup = new File(programs[0], binPath);
			File srcSourceDup = new File(programs[0], srcPath);
			File libSourceDup = new File(programs[0], libPath);

			File binTargetDup = new File(programs[1], binPath);
			File srcTargetDup = new File(programs[1], srcPath);
			File libTargetDup = new File(programs[1], libPath);

			Project sourceProjectDup = new Project();
			sourceProjectDup.setProjectFolder(new File(programs[0]));
			sourceProjectDup.setSrcFolder(srcSourceDup);
			sourceProjectDup.setBuildFolder(binSourceDup);
			sourceProjectDup.setLibFolder(libSourceDup);

			Project targetProjectDup = new Project();
			targetProjectDup.setProjectFolder(new File(programs[1]));
			targetProjectDup.setBuildFolder(binTargetDup);
			targetProjectDup.setSrcFolder(srcTargetDup);
			targetProjectDup.setLibFolder(libTargetDup);

			Parameters parametersDup = new Parameters();
			parametersDup.setTimeLimit(Integer.parseInt(timeout));
			parametersDup.setCompileProjects(needCompile);

			SafeRefactor srDuplicateds = new SafeRefactorImp(sourceProjectDup, targetProjectDup, parametersDup,
					testGenerator);
			srDuplicateds.checkTransformation();
			Report report = srDuplicateds.getReport();
			if (report.isRefactoring()) {
				System.out.println(programs[0] + " == " + programs[1]);
				totalDuplicateds++;
			}
		}
		System.out.println("Total duplicateds after re-analysis: " + totalDuplicateds);
	}

	private static void parseArgs(String[] args) {
		Options options = new Options();
		// PARAMETER: original
		Option original = new Option("original", true, "original project path");
		original.setRequired(true);
		options.addOption(original);
		// PARAMETER: mutants
		Option mutants = new Option("mutants", true, "mutants path. Separete each mutant folder with a colon ':'");
		mutants.setRequired(true);
		options.addOption(mutants);
		// PARAMETER: timeout
		Option optTime = new Option("timeout", true, "timeout to generate the test suite");
		optTime.setRequired(false);
		options.addOption(optTime);
		// PARAMETER: type
		Option optType = new Option("type", true,
				"set the type of the analysis: equivalents | dulicated | redundants | ALL*");
		optType.setRequired(false);
		options.addOption(optType);
		// PARAMETER: testGenerator
		Option optTestGenerator = new Option("testGenerator", true,
				"set the test generator engine: randoop | randoop_ant* | evo_suite");
		optTestGenerator.setRequired(false);
		options.addOption(optTestGenerator);
		// PARAMETER: testGenerator
		Option optNeedCompile = new Option("compile", false, "set wether it is nenecessary to compile the projects");
		optNeedCompile.setRequired(false);
		options.addOption(optNeedCompile);

		CommandLineParser parser = new DefaultParser();
		HelpFormatter formatter = new HelpFormatter();
		CommandLine cmd;

		try {
			cmd = parser.parse(options, args);
		} catch (ParseException e) {
			System.out.println(e.getMessage());
			formatter.printHelp("$NIMROD [options]", "Search for Equivalent, Duplicated and Redundant Mutants.\n"
					+ "Example: $NIMROD -original /path/to/original \n -mutants /path/to/mutant01:/path/to/mutant02 \n\n",
					options, "Report bugs to: ... \n * Default properties.");
			System.exit(1);
			return;
		}

		String originalPath = cmd.getOptionValue("original");
		String mutantsPath = cmd.getOptionValue("mutants");

		if (originalPath != null && !originalPath.equals("")) {
			source = originalPath;
		}

		if (mutantsPath != null && !mutantsPath.equals("")) {
			targets = new ArrayList<String>();
			if (mutantsPath.contains(":")) {
				for (String path : mutantsPath.split(":")) {
					targets.add(path);
				}
			} else {
				targets.add(mutantsPath);
			}
		}

		timeout = cmd.hasOption("timeout") ? cmd.getOptionValue("timeout") : DEFAULT_TIMEOUT;
		needCompile = cmd.hasOption("compile") ? true : false;
		analysisType = AnalysisType.get(cmd.hasOption("type") ? cmd.getOptionValue("type") : "");
		testGenerator = TestGeneratorType
				.get(cmd.hasOption("testGenerator") ? cmd.getOptionValue("testGenerator") : "");

		System.out.println("Original: " + originalPath);
		System.out.println("Mutants: " + mutantsPath);
		System.out.println("Timeout: " + timeout);
		System.out.println("Analysis Type: " + analysisType);
		System.out.println("Test Generator: " + testGenerator);
		System.out.println("Compile: " + needCompile);
	}

	// private static void parseArguments(String[] args) {
	// boolean vflag = false;
	// String arg;
	// int i = 0;
	// while (i < args.length && args[i].startsWith("-")) {
	// arg = args[i++];
	//
	// if (arg.equals("-src")) {
	// if (i < args.length)
	// srcPath = args[i++];
	// else
	// System.err.println("-src requires a path");
	// if (vflag)
	// System.out.println("src path= " + srcPath);
	// } else if (arg.equals("-bin")) {
	// if (i < args.length)
	// binPath = args[i++];
	// else
	// System.err.println("-bin requires a path");
	// if (vflag)
	// System.out.println("bin path= " + binPath);
	// } else if (arg.equals("-lib")) {
	// if (i < args.length)
	// libPath = args[i++];
	// else
	// System.err.println("-lib requires a path");
	// if (vflag)
	// System.out.println("lib path= " + libPath);
	// } else if (arg.equals("-timeout")) {
	// if (i < args.length)
	// timeout = args[i++];
	// else
	// System.err.println("-timeout requires a time");
	// if (vflag)
	// System.out.println("timeout= " + libPath);
	// }
	// }
	//
	// if (i == args.length || i + 1 == args.length)
	// System.err.println(
	// "Usage: Main [-src path] [-bin path] [-lib path] [-timeout t]
	// original_project_path refactored_project_path");
	//
	// source = args[i];
	// targets = new ArrayList<String>();
	// for (int j = ++i; j < args.length; j++) {
	// targets.add(args[j]);
	//
	// }
	// }

}
