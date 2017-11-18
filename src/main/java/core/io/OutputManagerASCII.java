package io;





import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OutputManagerASCII implements OutputManager {

	private String filePath;
	private BufferedWriter output;
	
	/**
	 * @param output Nome do arquivo a ser gravado
	 */
	public OutputManagerASCII(String saida) {
		this.setFilePath(saida);
	}
	
	/* (non-Javadoc)
	 * @see interfaces.io.InputManager#setFilePath(java.lang.String)
	 */
	@Override
	public void setFilePath(String path) {
		this.filePath = path;
	}

	/* (non-Javadoc)
	 * @see interfaces.io.OutputManager#createFile(java.lang.String)
	 */
	@Override
	public void createFile() throws IOException{
		boolean result = true;
		try {
			output = new BufferedWriter( new FileWriter(this.filePath) );
		} catch (IOException ioe) {
			System.out.println("OutputManagerASCII.createFile()");
			System.err.println("Erro ao criar o arquivo "+ filePath);
			System.err.println(ioe.getMessage());
			//ioe.printStackTrace();
			throw ioe;
		}		 
	}

	/* (non-Javadoc)
	 * @see interfaces.io.OutputManager#closeFile()
	 */
	@Override
	public void closeFile() throws IOException{
		try {
			output.flush();
			output.close();	
		} catch (IOException ioe) {
			System.out.println("OutputManagerASCII.closeFile()");
			System.err.println("Erro ao fechar o arquivo "+ filePath);
			System.err.println(ioe.getMessage());
			//ioe.printStackTrace();
			throw ioe;
		}		 
	}

	/* (non-Javadoc)
	 * @see interfaces.io.OutputManager#writeLine(java.lang.String)
	 */
	@Override
	public void writeLine(String line) throws IOException{
		try {
			output.write(line);
			output.newLine();			
		} catch (IOException ioe) {
			System.out.println("OutputManagerASCII.writeLine()");
			System.err.println("Erro ao gravar linha no arquivo "+ filePath);
			System.err.println(ioe.getMessage());
			//ioe.printStackTrace();
			throw ioe;
		}
	}

}

