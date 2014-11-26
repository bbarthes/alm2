package unit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import rts.facade.ISoldierFacade;
import rts.facade.InfantrymanFacade;
import rts.weapon.Sword;

public class StrikeFacade {
	
	private ISoldierFacade soldier;
	private ISoldierFacade soldierWithSword;

	@Before
	public void setUp() throws Exception {
		this.soldier = new InfantrymanFacade();

		this.soldierWithSword = new InfantrymanFacade();
		this.soldierWithSword.addWeapon( new Sword(60, 5));
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