package unit;

import org.junit.Before;
import org.junit.Test;

import rts.facade.AbstractSoldierFacade;
import rts.facade.InfantrymanFacade;
import rts.observer.DeathSoldierObserver;

public class TestObserver {
	
	private AbstractSoldierFacade soldierA;
	private AbstractSoldierFacade soldierB;
	private AbstractSoldierFacade soldierC;

	@Before
	public void setUp() throws Exception {
		this.soldierA = new InfantrymanFacade();
		this.soldierB = new InfantrymanFacade();
		this.soldierC = new InfantrymanFacade();
		
		
	}
	
	@Test
	public void testDuel() {
		DeathSoldierObserver deathCount = new DeathSoldierObserver();
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
