package unit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import rts.Infantryman;
import rts.SoldierComponent;
import rts.SoldierWithHands;
import rts.Sword;

public class Disarm {

	private SoldierComponent soldier;
	private SoldierComponent soldierWithSword;

	@Before
	public void setUp() throws Exception {
		this.soldier = new Infantryman();
		this.soldierWithSword = new SoldierWithHands ( new SoldierWithHands(this.soldier, new Sword(10, 5)),new Sword(10, 5)) ;
	}
		
	@Test
	public void testDisarm() {
		assertNotEquals(soldier, soldierWithSword);
		SoldierComponent soldierWithOutSword = soldierWithSword.disarm();
		assertNotEquals(soldier, soldierWithOutSword);
		soldierWithOutSword = soldierWithOutSword.disarm();
		assertEquals(soldier, soldierWithOutSword);
	}

}
