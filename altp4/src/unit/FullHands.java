package unit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import rts.decorator.Infantryman;
import rts.decorator.SoldierComponent;
import rts.decorator.SoldierWithHands;
import rts.weapon.Sword;

public class FullHands {

	private SoldierComponent soldierWithSword;

	@Before
	public void setUp() throws Exception {
		this.soldierWithSword = new Infantryman();
	}

	@Test
	public void testArm()
	{
		boolean continu = true;
		int i =0;
		
		while(continu)
		{

			try {
				this.soldierWithSword = new SoldierWithHands(this.soldierWithSword, new Sword(10, 5));
				i++;
			} catch (Exception e) {
				continu = false;
			}
		}//*/
		assertEquals(i, 2);
	}

	@Test
	public void testDisarm() {
		for(int i =0 ; i <5 ; ++i)
		{
			try {
				this.soldierWithSword = new SoldierWithHands(this.soldierWithSword, new Sword(10, 5));
			} catch (Exception e) { /*rien*/ }
		}

		boolean continu = true;
		int i =0;

		while(continu)
		{
			SoldierComponent swap = this.soldierWithSword.disarm();
			if(swap == this.soldierWithSword)
				continu = false;
			else
			{
				i++;
				this.soldierWithSword = swap;
			}
		}
		assertEquals(i, 2);
	}
}