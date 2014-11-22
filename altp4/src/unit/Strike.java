package unit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import rts.decorator.ISoldierComponent;
import rts.decorator.SoldierWithHands;
import rts.weapon.Sword;
import soldier.Infantryman;

public class Strike {
	
	private ISoldierComponent soldier;
	private ISoldierComponent soldierWithSword;

	@Before
	public void setUp() throws Exception {
		this.soldier = new Infantryman();

		this.soldierWithSword = new SoldierWithHands(new Infantryman(), new Sword(60, 5));
	}
	
	@Test
	public void testSoldier() {
		assertNotNull(this.soldier);
		assertNotNull(this.soldierWithSword);

	}
	
	@Test
	public void testStrike() {
		assertEquals(50, soldier.strike());
		assertEquals(110, soldierWithSword.strike());
	}

}