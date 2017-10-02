package saferefactor.core.comparator;

import japa.parser.JavaParser;
import japa.parser.ParseException;
import japa.parser.ast.CompilationUnit;
import japa.parser.ast.body.MethodDeclaration;
import japa.parser.ast.expr.BinaryExpr;
import japa.parser.ast.expr.Expression;
import japa.parser.ast.expr.MethodCallExpr;
import japa.parser.ast.expr.NameExpr;
import japa.parser.ast.expr.VariableDeclarationExpr;
import japa.parser.ast.stmt.BlockStmt;
import japa.parser.ast.stmt.ExpressionStmt;
import japa.parser.ast.stmt.Statement;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import saferefactor.core.comparator.TestCase.TestCaseState;
import saferefactor.core.util.ast.Method;
import saferefactor.core.util.ast.MethodImp;

public class ComparatorImp implements TestComparator {

	private final String sourceReport;
	private final String sourceReportSecondExecution;
	private final String targetReport;
	private Report report;

	public ComparatorImp(String sourceReport, String targetReport) {
		this.sourceReport = sourceReport;
		this.targetReport = targetReport;
		this.sourceReportSecondExecution = null;
	}

	public ComparatorImp(String sourceReport, String secondExecutionReport,
			String targetReport) {
		this.sourceReport = sourceReport;
		sourceReportSecondExecution = secondExecutionReport;
		this.targetReport = targetReport;
	}

	public void compare() {

		report = new Report();
		report.setRefactoring(true);

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setNamespaceAware(false);
		DocumentBuilder docBuilder;

		File sourceDir = new File(sourceReport);
		File sourceDir2 = null;
		if (sourceReportSecondExecution != null) {
			sourceDir2 = new File(sourceReportSecondExecution);
		}

		File targetDir = new File(targetReport);

		File[] sourceResults = sourceDir.listFiles(new FileFilter() {

			public boolean accept(File arg0) {
				if (arg0.getName().endsWith(".xml"))
					return true;
				return false;
			}
		});

		for (int i = 0; i < sourceResults.length; i++) {
			File sourceResult = sourceResults[i];
			File targetResult = new File(targetDir, sourceResult.getName());
			File sourceResult2 = null;
			if (sourceDir2 != null) {
				sourceResult2 = new File(sourceDir2, sourceResult.getName());
			}

			try {
				docBuilder = dbf.newDocumentBuilder();
				Document srcDoc = docBuilder.parse(sourceResult);
				String tests = srcDoc.getDocumentElement()
						.getAttribute("tests");
				report.setTotalTests(Integer.parseInt(tests));
				
				String erros = srcDoc.getDocumentElement().getAttribute(
						"errors");
				String failures = srcDoc.getDocumentElement().getAttribute(
						"failures");

				Document tgtDoc = docBuilder.parse(targetResult);
				String testsTarget = tgtDoc.getDocumentElement().getAttribute(
						"tests");
				String errosTarget = tgtDoc.getDocumentElement().getAttribute(
						"errors");
				String failuresTarget = tgtDoc.getDocumentElement()
						.getAttribute("failures");

				List<String> invalidTests = new ArrayList<String>();
				// compara o resultado da execucao duas vezes no source
				if (sourceResult2 != null && sourceResult2.exists()) {
					Document srcDoc2 = docBuilder.parse(sourceResult2);
					invalidTests.addAll(getInvalidTests(srcDoc, srcDoc2));

				}
				// fim da comparacao

				boolean sameBehavior = !hasChanges(srcDoc, tgtDoc, invalidTests);

				if (!sameBehavior) {
					report.setRefactoring(sameBehavior);
					report.setChanges(getChanges(srcDoc, tgtDoc, invalidTests));
					report.setChangedTests(getFailingTests(srcDoc, tgtDoc,
							invalidTests));

				}

			} catch (ParserConfigurationException e) {

				e.printStackTrace();
			} catch (SAXException e) {

				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}

		}

	}

	private String getChanges(Document source, Document target,
			List<String> invalidTests) {
		StringBuilder changes = new StringBuilder();

		Map<String, TestCase> sourceMap = buildStateMap(source);
		Map<String, TestCase> targetMap = buildStateMap(target);

		for (String key : sourceMap.keySet()) {
			if (invalidTests.contains(key))
				continue;
			TestCase sourceTestCase = sourceMap.get(key);

			if (!targetMap.containsKey(key)) {
				changes.append("Target tests does not contains " + key + "\n");
			}

			TestCase targetTestCase = targetMap.get(key);
			if (targetTestCase == null)
				continue;

			if (sourceTestCase.getTestCaseState() != targetTestCase
					.getTestCaseState()) {
				changes.append(key + " in source is "
						+ sourceTestCase.getTestCaseState()
						+ " while in target is "
						+ targetTestCase.getTestCaseState() + "\n");
			}
		}

		return changes.toString();
	}

	private Set<Failure> getFailingTests(Document source, Document target,
			List<String> invalidTests) {

		Set<Failure> result = new HashSet<Failure>();

		Map<String, TestCase> sourceMap = buildStateMap(source);
		Map<String, TestCase> targetMap = buildStateMap(target);

		for (String key : sourceMap.keySet()) {
			if (invalidTests.contains(key))
				continue;

			Failure failure = new Failure();

			TestCase sourceTestCase = sourceMap.get(key);
			TestCase targetTestCase = targetMap.get(key);
			
			if (targetTestCase == null)
				continue;

			if (sourceTestCase.getTestCaseState() != targetTestCase
					.getTestCaseState()) {
				String[] packageAndName = key.split("\\.");
				failure.setFileName(packageAndName[0]);
				failure.setTestSimpleName(packageAndName[1]);
				failure.setSourceState(sourceTestCase.getTestCaseState());
				failure.setTargetState(targetTestCase.getTestCaseState());
//				failure.setLine(targetTestCase.getFailureLine());
				result.add(failure);
				// changes.append(key + " in source is " + sourceState
				// + " while in target is " + targetState + "\n");
			}
		}

		return result;
	}

	private List<String> getInvalidTests(Document source, Document target) {
		List<String> result = new ArrayList<String>();

		Map<String, TestCase> sourceMap = buildStateMap(source);
		Map<String, TestCase> targetMap = buildStateMap(target);

		for (String key : sourceMap.keySet()) {
			TestCase sourceTestCase = sourceMap.get(key);

			TestCase targetTestCase = targetMap.get(key);

			if (sourceTestCase.getTestCaseState() != targetTestCase
					.getTestCaseState()) {
				result.add(key);
			}
		}

		return result;
	}

	private boolean hasChanges(Document source, Document target,
			List<String> invalidTests) {
		Map<String, TestCase> sourceMap = buildStateMap(source);
		Map<String, TestCase> targetMap = buildStateMap(target);

		if (sourceMap.size() != targetMap.size()) {
			return true;
		}

		for (String key : sourceMap.keySet()) {
			if (invalidTests.contains(key))
				continue;

			TestCase sourceTestCase = sourceMap.get(key);

			if (!targetMap.containsKey(key)) {
				return true;
			}

			TestCase targetTestCase = targetMap.get(key);

			if (sourceTestCase.getTestCaseState() != targetTestCase
					.getTestCaseState()) {
				return true;
			}
		}

		return false;
	}

	private Map<String, TestCase> buildStateMap(Document source) {
		Map<String, TestCase> stateMap = new HashMap<String, TestCase>();
		NodeList list = source.getDocumentElement().getElementsByTagName(
				"testcase");

		for (int i = 0; i < list.getLength(); i++) {
			Element testcase = (Element) list.item(i);
			String tcName = testcase.getAttribute("classname") + "."
					+ testcase.getAttribute("name");

			TestCase testCase = new TestCase();
			boolean hasProblems = false;
			if (testcase.hasChildNodes()) {
				NodeList subNodes = testcase.getChildNodes();
				for (int j = 0; j < subNodes.getLength(); j++) {
					if (subNodes.item(j) instanceof Element) {

						Element problem = (Element) subNodes.item(j);
						String errorMessage = problem.getFirstChild()
								.getTextContent();
//						int line = identifyLineNumber(errorMessage);
//						testCase.setFailureLine(line);
						if (problem.getTagName().equals("error")) {
							hasProblems = true;
							testCase.setTestCaseState(TestCaseState.ERROR);

						} else if (problem.getTagName().equals("failure")) {
							hasProblems = true;
							testCase.setTestCaseState(TestCaseState.FAILURE);
						}

					}
				}
			}

			if (!hasProblems) {
				testCase.setTestCaseState(TestCaseState.SUCCESS);
			}
			stateMap.put(tcName, testCase);
		}

		return stateMap;
	}

	private int identifyLineNumber(String errorMessage) {

		Pattern pattern = Pattern.compile(":\\d+\\)");
		Matcher matcher = pattern.matcher(errorMessage);
		matcher.find();
		String subString = matcher.group();

		CharSequence sequence = subString
				.subSequence(1, subString.length() - 1);
		return Integer.parseInt(String.valueOf(sequence));
	}

	public Report getReport() {

		return report;
	}

	public Set<Method> identifyMethodsWithBehavioralChanges(
			String pathToTestSources) throws ParseException, IOException {
		Set<Method> result = new HashSet<Method>();
		if (this.report == null)
			compare();
		if (!this.report.isRefactoring()) {
			Set<Failure> tests = this.report.getChangedTests();
			for (Failure failure : tests) {
				String file = pathToTestSources + failure.getFileName()
						+ ".java";
				String testCase = failure.getTestSimpleName();
				Method changedMethod = identifyChangedMethod(file, testCase,
						failure.getLine());
				result.add(changedMethod);
			}

		}
		return result;
	}

	private Method identifyChangedMethod(String fileName, String testCase,
			int line) throws ParseException, IOException {
		Method result = new MethodImp();

		File file = new File(fileName);

		// parse file
		CompilationUnit cu = JavaParser.parse(file);

		// get test case
		MethodVisitor visitor = new MethodVisitor(testCase);
		cu.accept(visitor, null);
		MethodDeclaration testMethod = visitor.getMethod();

		// get statements
		BlockStmt body = testMethod.getBody();
		List<Statement> stmts = body.getStmts();

		// get assertion at line X
		ExpressionStmt assertionStmt = null;
		for (Statement statement : stmts) {
			if (statement.getBeginLine() == line)
				assertionStmt = (ExpressionStmt) statement;
		}
		// get accessed variable
		Expression expression = assertionStmt.getExpression();
		
		
		if (expression instanceof VariableDeclarationExpr) {
			VariableDeclarationExpr expression2 = (VariableDeclarationExpr) expression;
			
			
		}
		
		if (expression instanceof MethodCallExpr) {
			MethodCallExpr expression2 = (MethodCallExpr) expression;
		}
			
		MethodCallExpr expression2 = (MethodCallExpr) expression;
		
			
		List<Expression> args = expression2.getArgs();
		BinaryExpr binaryExpression = (BinaryExpr) args.get(0);
		NameExpr left = (NameExpr) binaryExpression.getLeft();
		String targetVar = left.getName();

		// track back to assignment statment to that variable
		ExpressionVisitor expressionVisitor = new ExpressionVisitor();
		testMethod.accept(expressionVisitor, targetVar);

		// get method call
		TypeAnalysisVisitor analysis = new TypeAnalysisVisitor();
		testMethod.accept(analysis, expressionVisitor.getTargetVar());

		// return method implementation
		result.setSimpleName(expressionVisitor.getMethodName());
		result.setDeclaringClass(analysis.getTypeName());

		return result;
	}

}
