package rts.facade;

import java.util.ArrayList;
import java.util.List;
import rts.decorator.ISoldierComponent;
import rts.decorator.SoldierWithHands;
import rts.exception.ErrorHandsFull;
import rts.weapon.Weapon;



public abstract class SoldierFacade implements ISoldierFacade {

	ISoldierComponent soldier;
	List<ISoldierComponent> weapons;

	public SoldierFacade() {
		this.weapons = new ArrayList<>();
	}

	protected void clearDeco()
	{
		this.soldier = this.soldier.clearDeco();
		for(ISoldierComponent sc : this.weapons)
		{
			if(sc.getHealthPoints()<=0)
			{
				this.weapons.remove(sc);
			}
		}
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
		if(this.weapons.size() > 2)
		{
			throw new ErrorHandsFull(this.weapons.size());
		}
		this.soldier = new SoldierWithHands(this.soldier, (Weapon)weapon.clone());
		this.weapons.add(this.soldier);
	}

}
