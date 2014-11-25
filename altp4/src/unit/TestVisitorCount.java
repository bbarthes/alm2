package unit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import rts.composite.Army;
import rts.composite.IArmy;
import rts.visitor.VisitorArmyCount;

public class TestVisitorCount {

	private VisitorArmyCount countArmy;
	private IArmy army;


	@Before
	public void setUp() throws Exception {
		this.countArmy = new VisitorArmyCount();
		this.army = new Army();
	}
	@Test
	public void CountArmyOfSoldier() {
		int numberSoldier = 20;
		this.army.addSoldier(3, numberSoldier);
		this.army.addSoldier(12, numberSoldier);
		this.army.accept(countArmy);
		assertEquals(this.countArmy.getNumSoldier(), numberSoldier*2);
		assertEquals(this.countArmy.getNumHorseman(), numberSoldier);
		assertEquals(this.countArmy.getNUmInfantryman(), numberSoldier);
		assertEquals(this.countArmy.getNumArmy(), 1);
	}
	
	@Test
	public void CountMultipleArmy() {
		int numberSoldier = 20;
		this.army.addSoldier(3, numberSoldier);
		this.army.addSoldier(12, numberSoldier);
		Army army2 = new Army();
		army2.addSoldier(4, numberSoldier*2);
		this.army.addArmy(army2);
		this.army.accept(countArmy);
		assertEquals(this.countArmy.getNumSoldier(), numberSoldier*4);
		assertEquals(this.countArmy.getNumHorseman(), numberSoldier*3);
		assertEquals(this.countArmy.getNUmInfantryman(), numberSoldier);
		assertEquals(this.countArmy.getNumArmy(), 2);
	}
	@Test
	public void CountEmptyArmy() {
		int numberArmy = 500;
		for(int i =0 ; i < numberArmy-1; ++i)
		{
			this.army.addArmy(new Army());
		}
		this.army.accept(countArmy);
		assertEquals(this.countArmy.getNumSoldier(), 0);
		assertEquals(this.countArmy.getNumHorseman(), 0);
		assertEquals(this.countArmy.getNUmInfantryman(), 0);
		assertEquals(this.countArmy.getNumArmy(), numberArmy);
	}

}