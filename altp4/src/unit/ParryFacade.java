package unit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import rts.exception.ErrorDoctorWho;
import rts.facade.FactoryOfAbstractFactoryRts;
import rts.facade.ISoldierFacade;
import rts.factory.IAbstractFactoryRts;


public class ParryFacade {

	private ISoldierFacade soldier;
	private ISoldierFacade soldierWithSword;
	private IAbstractFactoryRts fact;

	public ParryFacade() {
		try {
			this.fact = FactoryOfAbstractFactoryRts.getInstanceOfFuture();
		} catch (ErrorDoctorWho e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Before
	public void setUp() throws Exception {
		this.soldier = fact.Infantryman(60, 60);

		this.soldierWithSword = fact.Infantryman(60, 60);
		this.soldierWithSword.addWeapon( fact.Shield(60, 5));
	}

	@Test
	public void testSoldier() {
		assertNotNull(this.soldier);
		assertNotNull(this.soldierWithSword);

	}

	@Test
	public void testParry() {

		soldier.parry(50);
		soldierWithSword.parry(60);
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
