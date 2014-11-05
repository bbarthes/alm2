package rts.facade;

import rts.decorator.SoldierComponent;
import rts.decorator.SoldierWithHands;
import rts.exception.ErrorHandsFull;
import rts.weapon.Weapon;



public class Soldier implements SoldierFacade {

	SoldierComponent soldier;
	int  weapons;
	//todo repasser au vector 
	public Soldier() {
		this.weapons = 0;
	}

	protected void clearDeco()
	{
		this.soldier = this.soldier.clearDeco();
	}

	@Override
	public int strike() {
		int strike = soldier.strike();
		this.clearDeco();
		return strike;
	}

	@Override
	public void parry(int strengthEnnemy) {
		soldier.parry(strengthEnnemy);;
		this.clearDeco();

	}

	@Override
	public int getHealthPoints() {
		return this.getHealthPoints();
	}

	@Override
	public void addWeapon(Weapon weapon) throws ErrorHandsFull {
		if(this.weapons > 2)
			throw new ErrorHandsFull(this.weapons);
		
		this.soldier = new SoldierWithHands(this.soldier, (Weapon)weapon.clone());
		++this.weapons;

	}

}
