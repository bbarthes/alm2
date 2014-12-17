package unit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import rts.exception.ErrorDoctorWho;
import rts.facade.FactoryOfAbstractFactoryRts;
import rts.facade.ISoldierFacade;
import rts.factory.IAbstractFactoryRts;

public class StrikeFacade {

	private ISoldierFacade soldier;
	private ISoldierFacade soldierWithSword;
	private IAbstractFactoryRts fact;


	public StrikeFacade() {
		try {
			this.fact = FactoryOfAbstractFactoryRts.getInstanceOfFuture();
		} catch (ErrorDoctorWho e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	@Before
	public void setUp() throws Exception {
		this.soldier = fact.Infantryman();

		this.soldierWithSword = fact.Infantryman();
		this.soldierWithSword.addWeapon( fact.WeaponParry(60, 5));
	}


	@Test
	public void testSoldier() {
		assertNotNull(this.soldier);
		assertNotNull(this.soldierWithSword);

	}

	@Test
	public void testStrike() {
		assertEquals(100, soldier.strike());
		assertEquals(160, soldierWithSword.strike());
	}

}