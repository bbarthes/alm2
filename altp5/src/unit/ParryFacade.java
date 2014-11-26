package unit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import rts.facade.ISoldierFacade;
import rts.facade.InfantrymanFacade;
import rts.weapon.Shield;


public class ParryFacade {

	private ISoldierFacade soldier;
	private ISoldierFacade soldierWithSword;

	@Before
	public void setUp() throws Exception {
		this.soldier = new InfantrymanFacade(60,60);

		this.soldierWithSword = new InfantrymanFacade(60,60);
		this.soldierWithSword.addWeapon( new Shield(60, 5));
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
