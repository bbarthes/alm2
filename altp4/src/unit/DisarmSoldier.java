package unit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

import rts.decorator.ISoldierComponent;
import rts.decorator.SoldierWithHands;
import rts.exception.ErrorDoctorWho;
import rts.facade.FactoryOfAbstractFactoryRts;
import rts.factory.IAbstractFactoryRts;
import rts.soldier.Infantryman;

public class DisarmSoldier {

	private ISoldierComponent soldier;
	private ISoldierComponent soldierWithSword;
	private IAbstractFactoryRts fact;
	
	public DisarmSoldier() {
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
		this.soldierWithSword = new SoldierWithHands ( new SoldierWithHands(this.soldier, fact.WeaponParry(10, 5)),fact.WeaponParry(10, 5)) ;
	}
		
	@Test
	public void testDisarm() {
		assertNotEquals(soldier, soldierWithSword);
		ISoldierComponent soldierWithOutSword = soldierWithSword.disarm();
		assertNotEquals(soldier, soldierWithOutSword);
		soldierWithOutSword = soldierWithOutSword.disarm();
		assertEquals(soldier, soldierWithOutSword);
	}

}
