package saferefactor.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import saferefactor.SafeRefactorTest;
import saferefactor.core.comparator.ComparatorImpTest;
import saferefactor.core.execution.AntJunitRunnerTest;
import saferefactor.core.execution.CoverageMeterTest;
import saferefactor.core.generation.RandoopAdapterTest;
import saferefactor.util.CompilerTest;



@RunWith(Suite.class)
@SuiteClasses({
//	ComparatorImpTest.class,
//	AntJunitRunnerTest.class,
//	CoverageMeterTest.class,
//	RandoopAdapterTest.class,
	SafeRefactorTest.class,
//	CompilerTest.class
	})
public class FastTests {

}
