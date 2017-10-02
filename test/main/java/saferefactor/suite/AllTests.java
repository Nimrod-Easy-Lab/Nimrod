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
import experiments.IEEESoftwareTest;



@RunWith(Suite.class)
@SuiteClasses({
	IEEESoftwareTest.class,
	ComparatorImpTest.class,
	AntJunitRunnerTest.class,
	CoverageMeterTest.class,
	RandoopAdapterTest.class,
	SafeRefactorTest.class,
	CompilerTest.class
	}
)

public class AllTests {

}
