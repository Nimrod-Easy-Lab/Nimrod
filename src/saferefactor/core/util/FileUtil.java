package saferefactor.core.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;





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
					if (arquivos[i].getName().endsWith(".class")
							&& !arquivos[i].getName().equals(
									"SVGStorageFormat.class")) {


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
		arquivo = arquivo.replaceAll(".class\\b", "");
		
		return arquivo;
	}
	
	public static File makeFile(String name, String texto) {
		File result = new File(name);
		File dir = result.getParentFile();
		if (!dir.exists()) dir.mkdirs(); 
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
	
 
	public static String getTempPath() {
		return System.getProperty("java.io.tmpdir");
	}
	
	public static void copyFolder(File src, File dest)
	    	throws IOException{
	 
	    	if(src.isDirectory()){
	 
	    		//if directory not exists, create it
	    		if(!dest.exists()){
	    		   dest.mkdir();
//	    		   System.out.println("Directory copied from " 
//	                              + src + "  to " + dest);
	    		}
	 
	    		//list all the directory contents
	    		String files[] = src.list();
	 
	    		for (String file : files) {
	    		   //construct the src and dest file structure
	    		   File srcFile = new File(src, file);
	    		   File destFile = new File(dest, file);
	    		   //recursive copy
	    		   copyFolder(srcFile,destFile);
	    		}
	 
	    	}else{
	    		//if file, then copy it
	    		//Use bytes stream to support all file types
	    		InputStream in = new FileInputStream(src);
	    	        OutputStream out = new FileOutputStream(dest); 
	 
	    	        byte[] buffer = new byte[1024];
	 
	    	        int length;
	    	        //copy the file content in bytes 
	    	        while ((length = in.read(buffer)) > 0){
	    	    	   out.write(buffer, 0, length);
	    	        }
	 
	    	        in.close();
	    	        out.close();
//	    	        System.out.println("File copied from " + src + " to " + dest);
	    	}
	    }



}
