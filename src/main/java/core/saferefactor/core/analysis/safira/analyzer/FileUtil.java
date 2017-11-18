package saferefactor.core.analysis.safira.analyzer;


import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import util.Constants;





public class FileUtil {

	/**
	 * @param path
	 *            = diretorio base do projeto
	 * @param result
	 *            = armazenara o nome de todos os arquivos Java do diretorio
	 * @param base
	 *            = eh usado na recursao. Indica o nome base do pacote
	 */
	public static List<String> listClassNames(String path, String base) {
		
		List<String> result = new ArrayList<String>();
		
		try {
			File dir = new File(path);

			if (!dir.exists()) {
				throw new RuntimeException("Dir " + dir.getAbsolutePath()
						+ " does not exist.");
			}

			File[] arquivos = dir.listFiles();
			
			int tam = arquivos.length;
			
			for (int i = 0; i < tam; i++) {
				
				if (arquivos[i].isDirectory()) {
					
					// we add the subdirectories
					String baseTemp = base + arquivos[i].getName() + ".";
					result.addAll(listClassNames(arquivos[i].getAbsolutePath(), baseTemp));
					
				} else {
					// only .class files
					// TODO maybe, we need to consider aspectj files
					if (arquivos[i].getName().endsWith(".java")
							&& !arquivos[i].getName().equals(
									"SVGStorageFormat.java")) {
						// TODO Diego - TODEL
						// if(arquivos[i].getName().contains("LogFactory"))
						// continue;

						String temp = base + arquivos[i].getName();
						temp = trataNome(temp);

						if (!result.contains(temp))
							result.add(temp);
					}
				}
			}
		} catch (Exception e) {
			System.err.println("Error in FileUtil.getClasses()");
			e.printStackTrace();
		}
		return result; 
	}

	// remove a extensao Java (o \\b significa word boundary -- fim da palavra)
	private static String trataNome(String arquivo) {
		arquivo = arquivo.replaceAll(".java\\b", "");
		return arquivo;
	}
	
	public static File makeFile(String name, String texto) {
		File result = new File(name);
		try {			
			FileWriter fw = new FileWriter(result);
			fw.write(texto);
			fw.close();
		} catch (Exception e) {
			System.err.println("Erro no metodo FileUtil.gravaArquivo()");
			e.printStackTrace();
		}
		return result;
	}
	
	public static void createFolders() {
		String tempDir = System.getProperty("java.io.tmpdir") + Constants.FILE_SEPARATOR + "safeRefactorAJ";
		
		File build = new File(tempDir + Constants.FILE_SEPARATOR + "tests" +  Constants.FILE_SEPARATOR + "bin");
		File testsSource = new File(tempDir + Constants.FILE_SEPARATOR + "tests" + Constants.FILE_SEPARATOR + "source");
		File testsTarget = new File(tempDir + Constants.FILE_SEPARATOR +  "tests" + Constants.FILE_SEPARATOR + "target");
		
		build.mkdirs();	
		testsSource.mkdirs();
		testsTarget.mkdirs();
		

	}

}
