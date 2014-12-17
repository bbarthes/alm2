package unit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import rts.composite.Army;
import rts.composite.IArmy;
import rts.exception.ErrorDoctorWho;
import rts.exception.ErrorHandsFull;
import rts.facade.FactoryOfAbstractFactoryRts;
import rts.factory.IAbstractFactoryRts;
import rts.visitor.VisitorArmyCount;

public class TestVisitorCount {

	private VisitorArmyCount countArmy;
	private IArmy army;
	private IAbstractFactoryRts fact;

	public TestVisitorCount() {
		try {
			this.fact = FactoryOfAbstractFactoryRts.getInstanceOfFuture();
		} catch (ErrorDoctorWho e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Before
	public void setUp() throws Exception {
		this.countArmy = new VisitorArmyCount();
		this.army = new Army();
	}
	@Test
	public void CountArmyOfSoldier() {
		int numberSoldier = 20;
		this.army.addSoldier(3, numberSoldier, fact);
		this.army.addSoldier(12, numberSoldier, fact);
		this.army.accept(countArmy);
		assertEquals(this.countArmy.getNumSoldier(), numberSoldier*2);
		assertEquals(this.countArmy.getNumKnightrider(), numberSoldier);
		assertEquals(this.countArmy.getNumFuriens(), numberSoldier);
		assertEquals(this.countArmy.getNumArmy(), 1);
	}

	@Test
	public void CountMultipleArmy() {
		int numberSoldier = 20;
		this.army.addSoldier(3, numberSoldier, fact);
		this.army.addSoldier(12, numberSoldier, fact);
		Army army2 = new Army();
		army2.addSoldier(4, numberSoldier*2, fact);
		this.army.addArmy(army2);
		this.army.accept(countArmy);
		assertEquals(this.countArmy.getNumSoldier(), numberSoldier*4);
		assertEquals(this.countArmy.getNumKnightrider(), numberSoldier*3);
		assertEquals(this.countArmy.getNumFuriens(), numberSoldier);
		assertEquals(this.countArmy.getNumArmy(), 2);
	}
	@Test
	public void CountEmptyArmy() throws ErrorHandsFull {
		int numberArmy = 500;
		for(int i =0 ; i < numberArmy-1; ++i)
		{
			this.army.addArmy(new Army());
		}
		this.army.accept(countArmy);
		assertEquals(this.countArmy.getNumSoldier(), 0);
		assertEquals(this.countArmy.getNumHorseman(), 0);
		assertEquals(this.countArmy.getNumInfantryman(), 0);
		assertEquals(this.countArmy.getNumArmy(), numberArmy);
	}

}