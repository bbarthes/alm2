package rts.decorator;

import rts.weapon.IWeapon;

public class SoldierWithHands extends AbstractDecorator {

	private IWeapon weapon;

	public SoldierWithHands(ISoldierComponent deco, IWeapon weapon) {
		super(deco);

		this.weapon = weapon;
	}

	protected void usure(int dammage) {
		this.weapon.damage(dammage);
	}
	protected boolean isBroken()
	{
		return this.weapon.getHealthPoints() <= 0;
	}

	@Override
	public int strike() {

		int strike = 0;
		if( ! this.isBroken())
		{
			strike =+ this.weapon.strike();
			this.usure(1);
		}
		return super.strike()+ strike;
	}

	@Override
	public void parry(int strengthEnnemy) {
		if(!this.isBroken())
		{
			strengthEnnemy = this.weapon.parry(strengthEnnemy);
			this.usure(1);
		}

		this.deco.parry(strengthEnnemy);

	}
}
