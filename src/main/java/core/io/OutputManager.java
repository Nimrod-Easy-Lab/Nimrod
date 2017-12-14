package io;




import java.io.IOException;


public interface OutputManager {
	
	/**
     * Define o caminho do arquivo a ser gravado.
     * 
     * @param saida Caminho totalmente qualificado do arquivo a ser gravado.
     */
	public void setFilePath(String saida);

	/**
     * Cria o arquivo que vai ser gravado.
     * 
	 * @return True se a operação for realizada com sucesso.
     */
	public void createFile() throws IOException;

	/**
	 * Grava uma linha na posição corrente.
	 * 
	 * @param line String com o conteúdo a ser gravado na linha corrente.
	 */
	public void writeLine(String line) throws IOException;
	
	/**
	 * Fecha o arquivo.
	 * 
	 * @return True se a operação for realizada com sucesso.
	 */
	public void closeFile() throws IOException;

}
