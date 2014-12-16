package unit;

import org.junit.Before;
import org.junit.Test;

import rts.facade.AbstractSoldierFacade;
import rts.facade.ISoldierFacade;
import rts.facade.InfantrymanFacade;
import rts.observer.DeathSoldierObserver;
import rts.observer.FightReportObserver;

public class TestObserver {
	
	private ISoldierFacade soldierA;
	private ISoldierFacade soldierB;
	private ISoldierFacade soldierC;

	@Before
	public void setUp() throws Exception {
		this.soldierA = new InfantrymanFacade();
		this.soldierB = new InfantrymanFacade();
		this.soldierC = new InfantrymanFacade();

		
	}
	
	@Test
	public void testDuel() {
		DeathSoldierObserver deathCount = new DeathSoldierObserver();
		FightReportObserver report = new FightReportObserver();
		soldierB.addObserver(report);
		soldierC.addObserver(report);
		soldierB.addObserver(deathCount);
		soldierC.addObserver(deathCount);
		
		int damage  = soldierA.strike();
		soldierB.parry(damage);
		soldierC.parry(damage);
	}
	
	@Test
	public void testWar() {

	}

}
