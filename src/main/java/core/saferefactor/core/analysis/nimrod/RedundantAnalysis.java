package saferefactor.core.analysis.nimrod;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import saferefactor.core.NimrodImpl;
import saferefactor.core.Parameters;
import saferefactor.core.util.Project;

public class RedundantAnalysis {

	private static String srcPath = "";
	private static String binPath = "";
	private static String libPath = "";
	private static String source = "";
	private static List<String> targets;
	private static String timeout = "3";
	private static boolean quiet = false;

	public static void analysis(String[] args) {
		parseArguments(args);

		
	}

	private static void start() {
		File sourceFile = new File(source);

		try {
			if (!sourceFile.exists())
				throw new Throwable("Directory not found:" + sourceFile.getAbsolutePath());

			File binSource = new File(sourceFile, binPath);
			File srcSource = new File(sourceFile, srcPath);
			File libSource = new File(sourceFile, libPath);

			Project sourceProject = new Project();
			sourceProject.setProjectFolder(sourceFile.getAbsoluteFile());
			sourceProject.setSrcFolder(srcSource);
			sourceProject.setBuildFolder(binSource);
			sourceProject.setLibFolder(libSource);

			List<Project> targetProjects = new ArrayList<Project>();
			for (String target : targets) {
				File targetFile = new File(target);
				File binTarget = new File(targetFile, binPath);
				File srcTarget = new File(targetFile, srcPath);
				File libTarget = new File(targetFile, libPath);

				Project targetProject = new Project();
				targetProject.setProjectFolder(targetFile);
				targetProject.setBuildFolder(binTarget);
				targetProject.setSrcFolder(srcTarget);
				targetProject.setLibFolder(libTarget);
				targetProjects.add(targetProject);
			}

			Parameters parameters = new Parameters();
			parameters.setTimeLimit(Integer.parseInt(timeout));
			parameters.setCompileProjects(false);
			NimrodImpl sr = new NimrodImpl(sourceProject, targetProjects, parameters);

			sr.checkTransformations(targetProjects);
			sr.printMutantsListInfo();
		} catch (Throwable e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

	private static void parseArguments(String[] args) {
		boolean vflag = false;
		String arg;
		int i = 0;
		while (i < args.length && args[i].startsWith("-")) {
			arg = args[i++];

			if (arg.equals("-src")) {
				if (i < args.length)
					srcPath = args[i++];
				else
					System.err.println("-src requires a path");
				if (vflag)
					System.out.println("src path= " + srcPath);
			} else if (arg.equals("-bin")) {
				if (i < args.length)
					binPath = args[i++];
				else
					System.err.println("-bin requires a path");
				if (vflag)
					System.out.println("bin path= " + binPath);
			} else if (arg.equals("-lib")) {
				if (i < args.length)
					libPath = args[i++];
				else
					System.err.println("-lib requires a path");
				if (vflag)
					System.out.println("lib path= " + libPath);
			} else if (arg.equals("-timeout")) {
				if (i < args.length)
					timeout = args[i++];
				else
					System.err.println("-timeout requires a time");
				if (vflag)
					System.out.println("timeout= " + libPath);
			} 
		}

		if (i == args.length || i + 1 == args.length)
			System.err.println(
					"Usage: Main [-src path] [-bin path] [-lib path] [-timeout t] original_project_path refactored_project_path");

//		source = args[i];
//		targets = new ArrayList<String>();
//		for (int j = ++i; j < args.length; j++) {
//			targets.add(args[j]);
//
//		}
		
		setup(args[i]);
	}

	private static void setup(String path) {
		List<File> dirs = Utils.listDirectories(path);
		for (File testDir : dirs) {
			System.out.println("Analisando: " + testDir);
			source = testDir + "/original";
			String mutantsDir = testDir + "/mujava/mutants/ClassId_0/";
			List<File> mutants = Utils.listDirectories(mutantsDir);
			targets = new ArrayList<String>();
			for (File file : mutants) {
				targets.add(file.getAbsolutePath());
			}
			start();
//			source = args[i];
//			targets = new ArrayList<String>();
//			for (int j = ++i; j < args.length; j++) {
//				targets.add(args[j]);
//
//			}
		}
	}
}
