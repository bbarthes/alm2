package unit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import rts.decorator.ISoldierComponent;
import rts.decorator.SoldierWithHands;
import rts.exception.ErrorDoctorWho;
import rts.facade.FactoryOfAbstractFactoryRts;
import rts.factory.IAbstractFactoryRts;
import rts.soldier.Infantryman;

public class StrikeSoldier {

	private ISoldierComponent soldier;
	private ISoldierComponent soldierWithSword;
	private IAbstractFactoryRts fact;
	public StrikeSoldier() {
		try {
			this.fact = FactoryOfAbstractFactoryRts.getInstanceOfFuture();
		} catch (ErrorDoctorWho e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Before
	public void setUp() throws Exception {
		this.soldier = new Infantryman();

		this.soldierWithSword = new SoldierWithHands(new Infantryman(), fact.WeaponParry(60, 5));
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