package saferefactor.ui;

import java.io.File;

import saferefactor.core.Parameters;
import saferefactor.core.Report;
import saferefactor.core.SafeRefactor;
import saferefactor.core.SafeRefactorImp;
import saferefactor.core.util.Project;

public class Main_OLD {
	
	private static String srcPath = "";
	private static String binPath = "";
	private static String libPath = "";
	private static String source = "";
	private static String target = "";
	private static String timeout = "200";
	private static boolean quiet= false;
	

	public static void main(String[] args) {

		parseArguments(args);

		File sourceFile = new File(source);
		File targetFile = new File(target);
		
		try {
			if (!sourceFile.exists())
				throw new Throwable("Directory not found:"
						+ sourceFile.getAbsolutePath());
			if (!targetFile.exists())
				throw new Throwable("Directory not found:"
						+ targetFile.getAbsolutePath());
			
//			Saferefactor sr = new Saferefactor(sourceFile.getAbsolutePath(),
//					targetFile.getAbsolutePath(), binPath, srcPath, libPath);
			
			File binSource = new File(sourceFile,binPath);
			File srcSource = new File(sourceFile,srcPath);
			File libSource = new File(sourceFile,libPath);
			
			File binTarget = new File(targetFile,binPath);
			File srcTarget = new File(targetFile,srcPath);
			File libTarget = new File(targetFile,libPath);
			
			Project sourceProject = new Project();
			sourceProject.setProjectFolder(sourceFile.getAbsoluteFile());
			sourceProject.setSrcFolder(srcSource);
			sourceProject.setBuildFolder(binSource);
			sourceProject.setLibFolder(libSource);
			
			Project targetProject = new Project();
			targetProject.setProjectFolder(targetFile);
			targetProject.setBuildFolder(binTarget);
			targetProject.setSrcFolder(srcTarget);
			targetProject.setLibFolder(libTarget);
			

			Parameters parameters = new Parameters();
			parameters.setKind_of_analysis(Parameters.SAFIRA_ANALYSIS);
			parameters.setTimeLimit(Integer.parseInt(timeout));
			
			SafeRefactor sr = new SafeRefactorImp(sourceProject , targetProject, parameters );
			sr.checkTransformation();
			Report report = sr.getReport();
			
			if (report.isRefactoring())
				System.out.println("SafeRefactor found no behavioral changes");
			else { 
				System.out.println("SafeRefactor found behavioral changes");
				System.out.println("Different test results:" + report.getChanges());
				System.out.println("Tests' dir:" + sr.getTmpFolder());
			}
				
			
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
			System.err
					.println("Usage: Main [-src path] [-bin path] [-lib path] [-timeout t] original_project_path refactored_project_path");

		source = args[i];
		target = args[i + 1];
	}

}
