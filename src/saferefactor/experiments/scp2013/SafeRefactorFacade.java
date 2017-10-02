package saferefactor.experiments.scp2013;

import java.io.File;
import java.util.List;

import saferefactor.core.Parameters;
import saferefactor.core.Report;
import saferefactor.core.SafeRefactor;
import saferefactor.core.SafeRefactorImp;
import saferefactor.core.execution.CoverageImpactedMethodReport;
import saferefactor.core.execution.CoverageMeter;
import saferefactor.core.execution.CoverageDataReader.CoverageReport;
import saferefactor.core.util.Project;

public class SafeRefactorFacade {

	public static Report checkTransformation(String sourcePath,
			String targetPath, double timelimit, boolean occ) throws Exception {

		File sourceFile = new File(sourcePath);
		File targetFile = new File(targetPath);
		Report result = new Report();
		Project source = new Project();
		source.setProjectFolder(sourceFile);
		source.setBuildFolder(new File(sourceFile, "bin"));
		source.setSrcFolder(new File(sourceFile, "src"));
		File libFolder = new File(sourceFile, "lib");
		if (libFolder.exists())
			source.setLibFolder(libFolder);

		Project target = new Project();
		target.setProjectFolder(targetFile);
		target.setBuildFolder(new File(targetFile, "bin"));
		target.setSrcFolder(new File(targetFile, "src"));
		File targetLibFolder = new File(targetFile, "lib");
		if (targetLibFolder.exists())
			target.setLibFolder(targetLibFolder);

		Parameters parameters = new Parameters();
		parameters.setCompileProjects(false);
		parameters.setTimeLimit(timelimit);
		parameters.getTestGeneratorParameters().add("--testsperfile=1");

		SafeRefactor saferefactor = new SafeRefactorImp(source, target,
				parameters);
		saferefactor.checkTransformation();
		result = saferefactor.getReport();

		return result;
	}

	public static void main(String[] args) {
		try {
			Report checkTransformation = SafeRefactorFacade
					.checkTransformation(
							"/Users/gustavoas/Downloads/workspace/ferramentaLPSSM/Products/Product2/",
							"/Users/gustavoas/Downloads/workspace/ferramentaLPSSM/Products/Product5/",
							"bin", "src/", "lib", false, 10, false);
			System.out.println(checkTransformation.isRefactoring());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Report checkTransformation(String sourcePath,
			String targetPath, String bin, String src, String lib,
			boolean needCompile, double timelimit, boolean occ)
			throws Exception {
		File sourceFile = new File(sourcePath);
		File targetFile = new File(targetPath);
		Report result = new Report();
		Project source = new Project();
		source.setProjectFolder(sourceFile);
		source.setBuildFolder(new File(sourceFile, bin));
		source.setSrcFolder(new File(sourceFile, src));
		File libFolder = new File(sourceFile, lib);
		if (libFolder.exists())
			source.setLibFolder(libFolder);

		Project target = new Project();
		target.setProjectFolder(targetFile);
		target.setBuildFolder(new File(targetFile, bin));
		target.setSrcFolder(new File(targetFile, src));
		File targetLibFolder = new File(targetFile, lib);
		if (targetLibFolder.exists())
			target.setLibFolder(targetLibFolder);

		Parameters parameters = new Parameters();
		parameters.setTimeLimit(timelimit);
		parameters.setCompileProjects(needCompile);
		parameters.setExecuteTwiceOnSource(true);
		parameters.setCheckCoverage(true);
		// To check relevant tests, comment next line
		// parameters.getTestGeneratorParameters().add("--testsperfile=1");
		SafeRefactor saferefactor = new SafeRefactorImp(source, target,
				parameters);
		saferefactor.checkTransformation();
		result = saferefactor.getReport();

		return result;
	}
}
