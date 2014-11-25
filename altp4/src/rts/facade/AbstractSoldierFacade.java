package rts.facade;

import java.util.ArrayList;
import java.util.List;
import rts.decorator.ISoldierComponent;
import rts.decorator.SoldierWithHands;
import rts.exception.ErrorHandsFull;
import rts.weapon.IWeapon;



public abstract class AbstractSoldierFacade implements ISoldierFacade {

	private ISoldierComponent soldier;
	private List<ISoldierComponent> weapons;

	public AbstractSoldierFacade(ISoldierComponent soldier) {
		this.weapons = new ArrayList<>();
		this.soldier = soldier;
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
		return this.soldier.getHealthPoints();
	}

	@Override
	public void addWeapon(IWeapon weapon) throws ErrorHandsFull {
		if(this.weapons.size() >= 2)
		{
			throw new ErrorHandsFull(this.weapons.size());
		}
		this.soldier = new SoldierWithHands(this.soldier, (IWeapon)weapon.clone());
		this.weapons.add(this.soldier);
	}

}
