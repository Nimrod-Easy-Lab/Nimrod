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
	// private static String target = "";
	private static List<String> targets;

	private static String timeout = "10";
	private static boolean quiet = false;

	public static void main(String[] args) {

		parseArguments(args);

		File sourceFile = new File(source);
		// File targetFile = new File(target);

		try {
			if (!sourceFile.exists())
				throw new Throwable("Directory not found:" + sourceFile.getAbsolutePath());
			// if (!targetFile.exists())
			// throw new Throwable("Directory not found:"
			// + targetFile.getAbsolutePath());

			// Saferefactor sr = new Saferefactor(sourceFile.getAbsolutePath(),
			// targetFile.getAbsolutePath(), binPath, srcPath, libPath);

			File binSource = new File(sourceFile, binPath);
			File srcSource = new File(sourceFile, srcPath);
			File libSource = new File(sourceFile, libPath);

			// File binTarget = new File(targetFile,binPath);
			// File srcTarget = new File(targetFile,srcPath);
			// File libTarget = new File(targetFile,libPath);

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

			// Project targetProject = new Project();
			// targetProject.setProjectFolder(targetFile);
			// targetProject.setBuildFolder(binTarget);
			// targetProject.setSrcFolder(srcTarget);
			// targetProject.setLibFolder(libTarget);

			Parameters parameters = new Parameters();
			// parameters.setKind_of_analysis(Parameters.SAFIRA_ANALYSIS);
			// //Ativando a análise de impacto
			// Leo adicionou esta linha
			parameters.setTimeLimit(Integer.parseInt(timeout));
			parameters.setCompileProjects(true); // Caso eu queira executar
													// apenas com .class

			// SafeRefactor sr = new SafeRefactorImp(sourceProject ,
			// targetProject, parameters );
			NimrodImpl sr = new NimrodImpl(sourceProject, targetProjects, parameters);
			if(parameters.isCompileProjects()){
				sr.compileTargets();
			}
			// sr.checkTransformation();
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
				// parameters.setKind_of_analysis(Parameters.SAFIRA_ANALYSIS);
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

			// Report report = sr.getReport();
			//
			// if (report.isRefactoring())
			// System.out.println("SafeRefactor found no behavioral changes");
			// else {
			// System.out.println("SafeRefactor found behavioral changes");
			// System.out.println("Different test results:\n" +
			// report.getChanges());
			// System.out.println("Tests' dir:" + sr.getTmpFolder());
			// }
			//
			// System.out.println("Testes: " + report.getNumberTests());
			// System.out.println("Métodos Testados: " +
			// report.getTotalMethodsToTest());
			// for (saferefactor.core.util.ast.Method method :
			// report.getMethodsToTest()) {
			// System.out.println("Metodo: "+ method.getSimpleName() + " ->
			// Classe: " + method.getDeclaringClass());
			// }

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
		// target = args[i + 1];
	}



}
