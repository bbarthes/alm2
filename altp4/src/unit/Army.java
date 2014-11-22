package unit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import rts.decorator.ISoldierComponent;
import rts.soldier.Infantryman;

public class Army {

	
	private ISoldierComponent soldierWithSword;

	@Before
	public void setUp() throws Exception {
		this.soldierWithSword = new Infantryman();
	}
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
