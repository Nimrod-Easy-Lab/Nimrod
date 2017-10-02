package io;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Esta classe cria um arquivo no formato zip
 * @author Melina Mongiovi
 *
 */

public class ZipFiles {
	
	/**
	 * Variável responsável por finalizar uma linha no arquivo de saída.
	 */
	private static String FIM_DE_LINHA = System
	.getProperty("line.separator");
	
	/**
	 * Path do arquivo no formato zip a ser criado
	 */
	private String zipFilePath;
	
	/**
	 * Lista com os paths dos arquivos a serem zipados
	 */
	List<String> files;
	
	/**
	 * Construtor
	 * @param zipFilePath
	 */
	public ZipFiles(String zipFilePath) {
		this.zipFilePath = zipFilePath;	
	}
	
	/**
	 * Este método faz a compactação de uma lista de arquivos
	 * @param files
	 * @throws IOException
	 */
	public void zip(List<String> files, String outt) throws Exception {
		File resultsFolder = new File(this.zipFilePath);
		String[] folders = resultsFolder.list();
		String outFilename = outt;
		byte[] buf = new byte[1024];
		try {
			// Create the ZIP file
			ZipOutputStream out = new ZipOutputStream(new FileOutputStream(this.zipFilePath
					+ outFilename));
		
			// Compress the files
			//for (int i = 0; i < folders.length; i++) {
			for (String st:  files) {
				//String currentFile = folders[i];
				String currentFile = st;
				System.out.println(currentFile);
				//if (currentFile.startsWith("Resultados") && currentFile.endsWith(".txt")) {

					System.out.println("zipando arquivo: " + currentFile);

					FileInputStream in = new FileInputStream(this.zipFilePath + currentFile);
					// Add ZIP entry to output stream.
					out.putNextEntry(new ZipEntry(currentFile));
					// Transfer bytes from the file to the ZIP file
					int len;
					while ((len = in.read(buf)) > 0) {
						out.write(buf, 0, len);
					}
					// Complete the entry
					out.closeEntry();
					in.close();
//				}

			}

			// Complete the ZIP file
			out.close();
		} catch (IOException e) {
		}
		
		
		
		
		
		
//		this.files = files;
//		byte b[] = new byte[512];
//		ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(this.zipFilePath));
//		//zout.setLevel(Deflater.BEST_COMPRESSION);
//		
//		String contentFile;
//		
//		for (String file : files) {
//			
//			contentFile = this.getContentFile(file);
//			InputStream in = new ByteArrayInputStream(contentFile.getBytes());
//			ZipEntry e = new ZipEntry(file);
//			zout.putNextEntry(e);
//			int len = 0;
//			while ((len = in.read(b)) != -1) {
//				zout.write(b, 0, len);
//			}
//			zout.closeEntry();
//		}
//		
//		zout.flush();
//		zout.close();
	}
	
	/**
	 * Este método retorna o conteúdo de um arquivo
	 * @param filePath
	 * @return
	 * @throws IOException
	 */
	private String getContentFile(String filePath) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		String content = "";
		while (br.ready()) {
			content += br.readLine();
			content += FIM_DE_LINHA;
		}
		return content;
	}
	
	public static void main(String[] args) throws Exception {
		
		List<String> arquivos = new ArrayList<String>();
		arquivos.add("H:\\eclipse-jee-galileo-SR1-win32\\workspace-svn\\Cheias\\tomcat\\webapps\\ROOT\\data\\sessions\\16139216\\rel1.txt");
		arquivos.add("H:\\eclipse-jee-galileo-SR1-win32\\workspace-svn\\Cheias\\tomcat\\webapps\\ROOT\\data\\sessions\\16139216\\rel2.txt");
		arquivos.add("H:\\eclipse-jee-galileo-SR1-win32\\workspace-svn\\Cheias\\tomcat\\webapps\\ROOT\\data\\sessions\\16139216\\rel3.txt");
		
		
		ZipFiles zf = new ZipFiles("H:\\eclipse-jee-galileo-SR1-win32\\workspace-svn\\Cheias\\tomcat\\webapps\\ROOT\\data\\sessions\\16139216\\");
		zf.zip(arquivos, "output.zip");

	}
}
