package rts.decorator;

import rts.weapon.Weapon;

public class SoldierWithHands extends AbstractDecorator {

	private Weapon weapon;

	public SoldierWithHands(SoldierComponent deco, Weapon weapon) {
		super(deco);

		this.weapon = weapon;
	}

	/*	public void addWeapon(Weapon weapon ) throws ErrorHandsFull
	{
		if ( < numberHands)
		{
			this.weapons.add(weapon);
		}
		else
		{
			throw new ErrorHandsFull(this.weapons.capacity());
		}
	}*/

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
