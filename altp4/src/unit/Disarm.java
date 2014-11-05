package unit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import rts.decorator.Infantryman;
import rts.decorator.SoldierComponent;
import rts.decorator.SoldierWithHands;
import rts.weapon.Sword;

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
