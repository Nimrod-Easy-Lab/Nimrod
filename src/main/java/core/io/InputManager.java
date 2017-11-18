package io;




import java.io.FileNotFoundException;
import java.io.IOException;


public interface InputManager {
    
	/**
     * Define o caminho do arquivo a ser lido
     * 
     * @param fullyPath Caminho totalmente qualificado do arquivo
     */
	public void setFilePath(String fullyPath);
	public boolean isEndOfFile() throws IOException;
	/**
	 * Abre o arquivo
	 * 
	 * @return True se a operação for realizada com sucesso
	 */
	public void openFile() throws FileNotFoundException;
	
	/**
	 * Lê a linha corrente
	 * 
	 * @return String com o conteúdo referente a linha corrente
	 */
	public String readLine() throws IOException;
	
	/**
	 * Lê a linha especificada
	 * 
	 * @param lineNumber Número da linha a ser lida
	 * @return String com o conteúdo referente a linha especificada
	 */
	public String readLine(int lineNumber) throws FileNotFoundException, IOException;
	
    /**
     * Lê a próxima linha válida, desprezando linhas em branco e com comentários
     * 
     * @return Próxima linha válida
     * @throws IOException
     */
    public String readNextLine() throws IOException;
	
	/**
	 * Lê o conteúdo, da linha especificada, entre os pontos inicial e final especificados   
	 * 
	 * @param lineNumber Número da linha a ser lida
	 * @param startColumn Inicio da coluna a ser lida
	 * @param endColumn Final da coluna a ser lida
	 * @return String com o valor encontrado na linha e entre os pontos especificados 
	 */
	public String readColumn(int lineNumber, int startColumn, int endColumn) throws IOException;
	
	/**
	 * Fecha o arquivo
	 * 
	 * @return True se a operação for realizada com sucesso
	 */
	public void closeFile() throws IOException;
	
}

