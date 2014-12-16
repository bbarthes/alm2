package unit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import rts.exception.ErrorDoctorWho;
import rts.facade.FactoryOfAbstractFactoryRts;
import rts.facade.ISoldierFacade;
import rts.facade.IWeapon;
import rts.factory.IAbstractFactoryRts;

public class FullHandsFacade {

	private ISoldierFacade soldierWithSword;
	private IAbstractFactoryRts fact;
	
	public FullHandsFacade() {
		try {
			this.fact = FactoryOfAbstractFactoryRts.getInstanceOfFuture();
		} catch (ErrorDoctorWho e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Before
	public void setUp() throws Exception {
		this.soldierWithSword = fact.Infantryman();
	}

	@Test
	public void testArm()
	{
		boolean continu = true;
		int i =0;
		IWeapon weapon = fact.WeaponParry(10, 5);
		while(continu)
		{
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