package saferefactor.core.execution;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * A simple class to read the coverage data inside the file produced by
 * cobertura. We choose to not use a DOM strategy to load this file because it
 * tends to be a very large file, thus, this operation would be very slow and
 * memory consuming. The strategy employed in this class is just reading the
 * file (each line a time) and when the "coverage" element is found, its data is
 * gathered using regular expressions.
 * 
 * @author Bruno Gama Cat�o
 */
public class CoverageDataReader implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7197880326675982317L;

	public static CoverageReport readCoverageData(File file) {
		if (!file.exists())
			try {
				throw new Exception(" File not found!");
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		CoverageReport data = new CoverageReport();
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setNamespaceAware(false);
		DocumentBuilder docBuilder;
		try {
			docBuilder = dbf.newDocumentBuilder();
			Document srcDoc = docBuilder.parse(file);
			Node report = srcDoc.getChildNodes().item(1);
			NodeList childNodes = report.getChildNodes();
			Node dataNode = childNodes.item(3);
			Node allClasses = dataNode.getChildNodes().item(1);
			NodeList coverageData = allClasses.getChildNodes();

			Node classCoverage = coverageData.item(1);
			Node classCoveragePercent = classCoverage.getAttributes()
					.getNamedItem("value");
			Double classRate = Double.parseDouble(classCoveragePercent
					.getTextContent().split("%")[0]);
			data.setClassRate(classRate);
			// System.out.println(classRate);

			Node methodCoverage = coverageData.item(3);
			Node methodCoveragePercent = methodCoverage.getAttributes()
					.getNamedItem("value");
			Double methodRate = Double.parseDouble(methodCoveragePercent
					.getTextContent().split("%")[0]);
			data.setMethodRate(methodRate);
			// System.out.println(methodRate);

			Node blockCoverage = coverageData.item(5);
			Node blockCoveragePercent = blockCoverage.getAttributes()
					.getNamedItem("value");
			Double blockRate = Double.parseDouble(blockCoveragePercent
					.getTextContent().split("%")[0]);
			data.setBlockRate(blockRate);
			// System.out.println(blockRate);

			Node lineCoverage = coverageData.item(7);
			Node lineCoveragePercent = lineCoverage.getAttributes()
					.getNamedItem("value");
			Double lineRate = Double.parseDouble(lineCoveragePercent
					.getTextContent().split("%")[0]);
			data.setLineRate(lineRate);
			// System.out.println(lineRate);

		} catch (ParserConfigurationException e) {

			e.printStackTrace();
		} catch (SAXException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

		return data;
	}

	public static class CoverageReport implements Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = -7998610762817185646L;
		private double lineRate;
		private double classRate;
		private double methodRate;
		private double blockRate;
		private long complexity;

		public double getLineRate() {
			return lineRate;
		}

		public void setLineRate(double lineRate) {
			this.lineRate = lineRate;
		}

		public double getClassRate() {
			return classRate;
		}

		public void setClassRate(double classRate) {
			this.classRate = classRate;
		}

		public double getMethodRate() {
			return methodRate;
		}

		public void setMethodRate(double methodRate) {
			this.methodRate = methodRate;
		}

		public double getBlockRate() {
			return blockRate;
		}

		public void setBlockRate(double blockRate) {
			this.blockRate = blockRate;
		}

		public long getComplexity() {
			return complexity;
		}

		public void setComplexity(long complexity) {
			this.complexity = complexity;
		}

	}

	public static void main(String[] args) {
		CoverageDataReader
				.readCoverageData(new File(
						"/home/gustavo/repositorios/jhotdraw/768/jhotdraw7/coverage/coverage.xml"));
	}
}
