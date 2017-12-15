package saferefactor.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import saferefactor.core.comparator.ComparatorImpTest;
import saferefactor.core.execution.AntJunitRunnerTest;
import saferefactor.core.execution.CoverageMeterTest;
import saferefactor.core.generation.RandoopAdapterTest;



@RunWith(Suite.class)
@SuiteClasses({
//	IEEESoftwareTest.class,
	ComparatorImpTest.class,
	AntJunitRunnerTest.class,
	CoverageMeterTest.class,
	RandoopAdapterTest.class,
//	CompilerTest.class
	}
)

public class AllTests {

}
