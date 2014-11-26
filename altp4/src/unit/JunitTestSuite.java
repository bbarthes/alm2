package unit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
	ArmyTest.class,
	DisarmSoldier.class,
	FullHandsFacade.class,
	FullHandsSoldier.class,
	ParryFacade.class,
	ParrySoldier.class,
	StrikeFacade.class,
	StrikeSoldier.class,
	TestVisitorCount.class
	
})
public class JunitTestSuite {   
}  