package unit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import rts.Infantryman;
import rts.SoldierComponent;
import rts.Sword;

public class Disarm {

	private SoldierComponent soldier;
	private SoldierComponent soldierWithSword;

	@Before
	public void setUp() throws Exception {
		this.soldier = new Infantryman();
		this.soldierWithSword = new Sword(this.soldier, 60);
	}
	
		
	@Test
	public void testDisarm() {
		assertNotEquals(soldier, soldierWithSword);
		SoldierComponent soldierWithOutSword = soldierWithSword.disarm();
		assertEquals(soldier, soldierWithOutSword);
	}

}
