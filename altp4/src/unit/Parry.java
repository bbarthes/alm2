package unit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import rts.decorator.ISoldierComponent;
import rts.decorator.SoldierWithHands;
import rts.weapon.Shield;
import rts.soldier.Infantryman;


public class Parry {

	private ISoldierComponent soldier;
	private ISoldierComponent soldierWithSword;

	@Before
	public void setUp() throws Exception {
		this.soldier = new Infantryman(60,60);

		this.soldierWithSword = new SoldierWithHands(new Infantryman(60, 60), new Shield(60, 5));
	}
	
	@Test
	public void testSoldier() {
		assertNotNull(this.soldier);
		assertNotNull(this.soldierWithSword);

	}
	
	@Test
	public void testParry() {
		soldier.parry(50);
		soldierWithSword.parry(50);
		assertEquals(10, soldier.getHealthPoints());
		assertEquals(60, soldierWithSword.getHealthPoints());
	}
	@Test
	public void testParry2() {
		int vsws =  soldierWithSword.getHealthPoints() -10;
		soldier.parry(70);
		soldierWithSword.parry(70);

		assertEquals(0, soldier.getHealthPoints());
		assertEquals(vsws, soldierWithSword.getHealthPoints());
	}

}
