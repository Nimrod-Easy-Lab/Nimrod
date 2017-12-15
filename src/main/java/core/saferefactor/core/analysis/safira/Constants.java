package saferefactor.core.analysis.safira;

import saferefactor.core.util.FileUtil;



public class Constants {

	public static final String FILE_SEPARATOR = System
	.getProperty("file.separator");
	// Nao alterar as constantes abaixo.
	// Alterar apenas a constante Identifychange.EXAMPLE_NUMBER
//	public static final String SOURCE_JAVA_PROJECT = "refactoringExamples/examples/example"+ IdentifyChange.EXAMPLE_NUMBER +"/source";
//	public static final String TARGET_JAVA_PROJECT = "refactoringExamples/examples/example"+ IdentifyChange.EXAMPLE_NUMBER +"/target";
	public static final String ARQUIVO_CLASSES= FileUtil.getTempPath()+"/classes.txt";
	
	
	public static final String ARQUIVO_BASE = FileUtil.getTempPath()+"/arquivobase.txt";
	
//	public static final String sourcePackageName = "examples.example"+ IdentifyChange.EXAMPLE_NUMBER +".source.";
//	public static final String targetPackageName = "examples.example"+ IdentifyChange.EXAMPLE_NUMBER +".target.";
//	public static final String JUNIT_FILENAME = "Example" + + "Test";
	public static final String TEMP = System.getProperty("java.io.tmpdir") + "/safeRefactorAJ";
	public static final String ARQUIVO_INTERSECAO = TEMP + FILE_SEPARATOR + "intersection.txt";
	public static final String TEST = TEMP + "/tests";
	public static final String TESTBIN = TEMP + "/tests/bin";
	public static final String TESTSRC = TEMP + "/tests/source";
	public static final String TESTTGT = TEMP + "/tests/target";
}
 