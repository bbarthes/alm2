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
		this.soldierA = new InfantrymanFacade("Superman");
		this.soldierB = new InfantrymanFacade("Batman");
		this.soldierC = new InfantrymanFacade();
		
		this.armyA = new Army();
		this.armyB = new Army();
		
		deathCount = new DeathSoldierObserver();
		report = new FightReportObserver();
	}
	
	@Test
	public void testDuel() {
		System.out.println("Début du duel:");
		
		soldierA.addObserver(report);
		soldierB.addObserver(report);
		
		soldierA.addObserver(deathCount);
		soldierB.addObserver(deathCount);
		
		int damage  = soldierA.strike();
		soldierB.parry(damage);
	}
	
	@Test
	public void testWar() {
		System.out.println("Début de la bataille:");
		
		ArrayList<Observer> lo = new ArrayList<>();
		lo.add(deathCount);
		lo.add(report);
		
		this.armyA.addSoldier(1, 5, lo);
		this.armyB.addSoldier(1, 5, lo);
		
		int damage = armyA.strike();
		armyB.parry(damage);
	}

}
