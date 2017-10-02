package experiments;

import java.io.File;

import saferefactor.core.Parameters;
import saferefactor.core.Report;
import saferefactor.core.SafeRefactor;
import saferefactor.core.SafeRefactorImp;
import saferefactor.core.util.Project;

public class SubjectsHenrique {
	
	public void runSubject(String sourceSub, String targetSub) throws Exception {
		Project source = new Project();
	
		source.setProjectFolder(new File(sourceSub));
		source.setBin("bin");
		source.setBuildFolder(new File(sourceSub+"/bin"));
		source.setSrcFolder(new File(sourceSub+"/src"));
		source.setLibFolder(new File(sourceSub+"/lib"));

		Project target = new Project();
		target.setProjectFolder(new File(targetSub));
		source.setBin("bin");
		target.setBuildFolder(new File(targetSub+"/bin"));
		target.setSrcFolder(new File(targetSub+"/src"));
		target.setLibFolder(new File(targetSub+"/lib"));

		Parameters parameters = new Parameters();
		parameters.setTimeLimit(10);
		parameters.setCheckCoverage(false);
		parameters.setCompileProjects(false);
		parameters.setKind_of_analysis(Parameters.SAFIRA_ANALYSIS);
//		parameters.setKind_of_analysis(Parameters.REFLECTION_ANALYSIS);
		SafeRefactor saferefactor = new SafeRefactorImp(source, target,
				parameters);

		saferefactor.checkTransformation();
		Report report = saferefactor.getReport();
		System.out.println(report.isRefactoring());
	}
	
	public static void main(String[] args) throws Exception {
		
		String path = "/Users/melmongiovi/Documents/doutorado/projetos-phd-safe-refactor/";
		
		String source1 = "HealthCard-AspectJJML-version";
		String target1 = "HealthCard-JML-version";
		
		String source2 = "HealthWatcherOO_01_Base-AspectJML-version";
		String target2 = "HealthWatcherOO_01_Base-JML-version";
		
		String source3 = "javacardapi-2.2.1-AspectJML-version";
		String target3 = "javacardapi-2.2.1-JML-version";
		
		SubjectsHenrique sh = new SubjectsHenrique();
		sh.runSubject(path+source1, path+target1);
//		sh.runSubject(path+source2, path+target2);
//		sh.runSubject(path+source3, path+target3);
	}
}
