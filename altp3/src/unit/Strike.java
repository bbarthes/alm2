package unit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import rts.*;

public class Strike {
	
	private SoldierComponent soldier;
	private SoldierComponent soldierWithSword;

	@Before
	public void setUp() throws Exception {
		this.soldier = new Infantryman();
		this.soldierWithSword = new Sword(new Infantryman(), 60);
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