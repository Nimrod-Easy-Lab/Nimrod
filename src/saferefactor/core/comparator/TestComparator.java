package saferefactor.core.comparator;

import japa.parser.ParseException;

import java.io.IOException;
import java.util.Set;

import saferefactor.core.util.ast.Method;
import saferefactor.core.util.ast.MethodImp;

public interface TestComparator {
	
	public void compare();
	public Report getReport();
	public Set<Method> identifyMethodsWithBehavioralChanges(
			String pathToTestSources) throws ParseException, IOException;

}
