package unit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import rts.facade.ISoldierFacade;
import rts.facade.InfantrymanFacade;
import rts.weapon.IWeapon;
import rts.weapon.Sword;

public class FullHandsFacade {

	private ISoldierFacade soldierWithSword;

	@Before
	public void setUp() throws Exception {
		this.soldierWithSword = new InfantrymanFacade();
	}

	@Test
	public void testArm()
	{
		boolean continu = true;
		int i =0;
		IWeapon weapon = new Sword(10, 5);
		while(continu)
		{
			System.out.println("titi");
			try {
				this.soldierWithSword.addWeapon(weapon);
				i++;
			} catch (Exception e) {
				continu = false;
			}
		}
		assertEquals(i, 2);
	}
}