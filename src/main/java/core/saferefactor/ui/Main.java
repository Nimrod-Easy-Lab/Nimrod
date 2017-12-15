package saferefactor.ui;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import saferefactor.core.NimrodImpl;
import saferefactor.core.Parameters;
import saferefactor.core.Report;
import saferefactor.core.SafeRefactor;
import saferefactor.core.SafeRefactorImp;
import saferefactor.core.util.Project;

public class Main {

	private static String srcPath = "";
	private static String binPath = "";
	private static String libPath = "";
	private static String source = "";
	private static List<String> targets;
	private static String timeout = "10";
	private static boolean quiet = false;

	public static void main(String[] args) {

		parseArguments(args);

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
			parameters.setCompileProjects(true); // Caso eu queira executar
													// apenas com .class

			NimrodImpl sr = new NimrodImpl(sourceProject, targetProjects, parameters);
			if(parameters.isCompileProjects()){
				sr.compileTargets();
			}
			sr.checkTransformations(targetProjects);
			sr.printMutantsListInfo();

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
				parametersDup.setCompileProjects(true);

				SafeRefactor srDuplicateds = new SafeRefactorImp(sourceProjectDup, targetProjectDup, parametersDup);
				srDuplicateds.checkTransformation();
				Report report = srDuplicateds.getReport();
				if (report.isRefactoring()) {
					System.out.println(programs[0] + " == " + programs[1]);
					totalDuplicateds++;
				}
			}
			System.out.println("Total duplicateds after re-analysis: " + totalDuplicateds);

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

		source = args[i];
		targets = new ArrayList<String>();
		for (int j = ++i; j < args.length; j++) {
			targets.add(args[j]);

		}
	}

}
