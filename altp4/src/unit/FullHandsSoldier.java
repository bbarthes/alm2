package unit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import rts.decorator.ISoldierComponent;
import rts.decorator.SoldierWithHands;
import rts.exception.ErrorDoctorWho;
import rts.facade.FactoryOfAbstractFactoryRts;
import rts.factory.IAbstractFactoryRts;
import rts.soldier.Infantryman;

public class FullHandsSoldier {

	private ISoldierComponent soldierWithSword;	
	private IAbstractFactoryRts fact;
	
	public FullHandsSoldier() {
		try {
			this.fact = FactoryOfAbstractFactoryRts.getInstanceOfFuture();
		} catch (ErrorDoctorWho e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Before
	public void setUp() throws Exception {
		this.soldierWithSword = new Infantryman();
	}


	@Test
	public void testDisarm() {
		for(int i =0 ; i <5 ; ++i)
		{
			try {
				this.soldierWithSword = new SoldierWithHands(this.soldierWithSword, fact.WeaponParry(10, 5));
			} catch (Exception e) { /*rien*/ }
		}

		boolean continu = true;
		int i =0;

		while(continu)
		{
			ISoldierComponent swap = this.soldierWithSword.disarm();
			if(swap == this.soldierWithSword)
				continu = false;
			else
			{
				++i;
				this.soldierWithSword = swap;
			}
		}
		assertEquals(i, 5);
	}
}