package unit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import rts.exception.ErrorDoctorWho;
import rts.facade.FactoryOfAbstractFactoryRts;
import rts.facade.ISoldierFacade;
import rts.factory.IAbstractFactoryRts;

public class BrokeWeapon {

	private ISoldierFacade soldierWithSword;
	private IAbstractFactoryRts fact;
	private int healtSoldier;
	private int healtWeapon;

	public BrokeWeapon() {
		try {
			this.fact = FactoryOfAbstractFactoryRts.getInstanceOfFuture();
		} catch (ErrorDoctorWho e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Before
	public void setUp() throws Exception {
		this.healtSoldier = 60;
		this.healtWeapon = 5;
		this.soldierWithSword = fact.Infantryman(this.healtSoldier, 60);
		this.soldierWithSword.addWeapon( fact.Shield(60, healtWeapon));
	}

	@Test
	public void testBroke() {

		for(int i = 0; i < this.healtWeapon ; i++)
		{
			soldierWithSword.parry(60);

			assertEquals(this.healtSoldier, soldierWithSword.getHealthPoints());
		}
		//maintenant le bouclier est brisé
		this.soldierWithSword.parry(10);
		assertEquals(this.healtSoldier-10, soldierWithSword.getHealthPoints());
		
	}

}