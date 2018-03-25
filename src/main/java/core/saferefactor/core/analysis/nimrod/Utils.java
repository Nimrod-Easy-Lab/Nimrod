package saferefactor.core.analysis.nimrod;

import static java.nio.charset.StandardCharsets.UTF_8;
import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.WRITE;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Utils {
	public static final String LOGGER_NAME = "Nimrod";
	public static String session = "";

	public static void logAppend(String path, String fileName, List<String> lines) throws IOException {
		File f = new File(path + "/" + LOGGER_NAME + "_" + fileName + ".log");
		Files.write(f.toPath(), lines, UTF_8, APPEND, CREATE);
	}

	public static void logWrite(String path, String fileName, List<String> lines) throws IOException {
		new File(path).mkdirs();
		File f = new File(path + "/" + LOGGER_NAME + "_" + fileName + ".log");
		Files.write(f.toPath(), lines, UTF_8, WRITE, CREATE);
	}
	
	/**
	 * List all directories from a directory (not recursive)
	 * 
	 * @param directoryName
	 *            to be listed
	 */
	public static List<File> listDirectories(String directoryName) {
		List<File> result = new ArrayList<File>();
		File directory = new File(directoryName);
		// get all the files from a directory
		File[] fList = directory.listFiles();
		if (fList == null)
			fList = new File[0];
		for (File file : fList) {
			if (file.isDirectory()) {
				result.add(file);
			}
		}
		return result;
	}
}
