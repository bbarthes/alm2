package unit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import rts.composite.Army;
import rts.composite.IArmy;
import rts.exception.ErrorDoctorWho;
import rts.exception.ErrorHandsFull;
import rts.facade.FactoryOfAbstractFactoryRts;
import rts.facade.ISoldierFacade;
import rts.factory.IAbstractFactoryRts;

public class ArmyTest {

	
	private ISoldierFacade soldier;
	private IArmy army;
	private IAbstractFactoryRts fact;
	
	
	public ArmyTest() {
		try {
			this.fact = FactoryOfAbstractFactoryRts.getInstanceOfFuture();
		} catch (ErrorDoctorWho e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Before
	public void setUp() throws Exception {
		this.soldier = fact.Infantryman();
		this.army = new Army();
	}
	@Test
	public void ArmyOfInfantryman() throws ErrorHandsFull {
		this.army.addSoldier(3, 1, fact);
		assertEquals(this.army.getHealthPoints(), this.soldier.getHealthPoints());
		assertEquals(this.army.strike(), this.soldier.strike());
		this.army.parry(13);
		this.soldier.parry(13);
		assertEquals(this.army.getHealthPoints(), this.soldier.getHealthPoints());
		this.army.addWeapon(fact.WeaponParry(50,10));
		this.soldier.addWeapon(fact.WeaponParry(50,10));
		assertEquals(this.army.strike(), this.soldier.strike());
		
	}
	@Test
	public void ArmyCompose() throws ErrorHandsFull {
		int forceSword= 50;
		int numberSoldier = 10;
		this.army.addSoldier(3, numberSoldier, fact);
		
		assertEquals(this.army.getHealthPoints(), this.soldier.getHealthPoints()*numberSoldier);
		assertEquals(this.army.strike(), this.soldier.strike()*numberSoldier);
		this.army.addWeapon(fact.WeaponParry(forceSword,10));
		
		assertEquals(this.army.strike(), (this.soldier.strike()+forceSword)*numberSoldier);
		
	}
	@Test
	public void EmptyArmy() throws ErrorHandsFull {
		int numberArmy = 500;
		for(int i =0 ; i < numberArmy-1; ++i)
		{
			this.army.addArmy(new Army());
		}
		this.army.addWeapon(fact.WeaponParry(40,10));
		
		assertEquals(this.army.strike(),0);
		
	}

}
