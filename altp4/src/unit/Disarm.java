package unit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import rts.decorator.ISoldierComponent;
import rts.decorator.SoldierWithHands;
import rts.weapon.Sword;
import soldier.Infantryman;

public class Disarm {

	private ISoldierComponent soldier;
	private ISoldierComponent soldierWithSword;

	@Before
	public void setUp() throws Exception {
		this.soldier = new Infantryman();
		this.soldierWithSword = new SoldierWithHands ( new SoldierWithHands(this.soldier, new Sword(10, 5)),new Sword(10, 5)) ;
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
