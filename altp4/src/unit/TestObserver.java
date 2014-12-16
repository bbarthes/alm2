package unit;

import java.util.ArrayList;
import rts.observer.Observer;

import org.junit.Before;
import org.junit.Test;

import rts.composite.Army;
import rts.composite.IArmy;
import rts.facade.ISoldierFacade;
import rts.facade.InfantrymanFacade;
import rts.observer.DeathSoldierObserver;
import rts.observer.FightReportObserver;

public class TestObserver {
	
	private ISoldierFacade soldierA;
	private ISoldierFacade soldierB;
	private ISoldierFacade soldierC;
	
	private IArmy armyA;
	private IArmy armyB;
	
	private DeathSoldierObserver deathCount;
	private FightReportObserver report;

	@Before
	public void setUp() throws Exception {
		this.soldierA = new InfantrymanFacade();
		this.soldierB = new InfantrymanFacade();
		this.soldierC = new InfantrymanFacade();
		
		this.armyA = new Army();
		this.armyB = new Army();
		
		deathCount = new DeathSoldierObserver();
		report = new FightReportObserver();
	}
	
//	@Test
//	public void testDuel() {
//		soldierB.addObserver(report);
//		soldierC.addObserver(report);
//		soldierB.addObserver(deathCount);
//		soldierC.addObserver(deathCount);
//		
//		int damage  = soldierA.strike();
//		soldierB.parry(damage);
//		soldierC.parry(damage);
//	}
	
	@Test
	public void testWar() {
		
		ArrayList<Observer> lo = new ArrayList<>();
		lo.add(deathCount);
		lo.add(report);
		
		this.armyA.addSoldier(1, 5, lo);
		this.armyB.addSoldier(1, 5, lo);
		
		int damage = armyA.strike();
		armyB.parry(damage);
	}

}
