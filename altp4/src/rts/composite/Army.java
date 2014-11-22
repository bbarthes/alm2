package rts.composite;

import java.util.Vector;

import rts.exception.ErrorHandsFull;
import rts.facade.ISoldierFacade;
import rts.weapon.Weapon;

public class Army implements GroupArmy{
	Vector<ISoldierFacade> army;

	public Army() {
		this.army = new Vector<>();
			
	}
	
	@Override
	public int strike() {
		int strike = 0;
		for(ISoldierFacade soldat : this.army)
		{
			strike = soldat.strike();
		}
		return strike;
	}

	@Override
	public void parry(int strengthEnnemy) {
		int strengthEnnemySoldat =   strengthEnnemy/this.army.capacity();
		for(ISoldierFacade soldat : this.army)
		{
			soldat.parry(strengthEnnemySoldat);
		}
		
	}

	@Override
	public int getHealthPoints() {
		int healthPoints = 0;
		for(ISoldierFacade soldat : this.army)
		{
			healthPoints = soldat.getHealthPoints();
		}
		return healthPoints;
	}

	@Override
	public void addWeapon(Weapon weapon) throws ErrorHandsFull {
		
		for(ISoldierFacade soldat : this.army)
		{
			soldat.addWeapon(weapon);
		}
	}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}
	
	

}
