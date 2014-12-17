package unit;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import rts.composite.Army;
import rts.composite.IArmy;
import rts.exception.ErrorDoctorWho;
import rts.facade.FactoryOfAbstractFactoryRts;
import rts.facade.ISoldierFacade;
import rts.factory.IAbstractFactoryRts;
import rts.observer.DeathSoldierObserver;
import rts.observer.FightReportObserver;
import rts.observer.Observer;

public class TestObserver {

	private ISoldierFacade soldierA;
	private ISoldierFacade soldierB;
	private IArmy armyA;
	private IArmy armyB;

	private DeathSoldierObserver deathCount;
	private FightReportObserver report;
	private IAbstractFactoryRts fact;

	public TestObserver() {
		try {
			this.fact = FactoryOfAbstractFactoryRts.getInstanceOfFuture();
		} catch (ErrorDoctorWho e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Before
	public void setUp() throws Exception {
		int health = 30;
		int strength = 40;
		this.soldierA = fact.Infantryman(health, strength, "Superman");
		this.soldierB = fact.Infantryman(health, strength, "Batman");
		fact.Infantryman(health, strength);

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

		this.armyA.addSoldier(1, 5, fact, lo);
		this.armyB.addSoldier(1, 5, fact, lo);

		int damage = armyA.strike();
		armyB.parry(damage);
	}

}
