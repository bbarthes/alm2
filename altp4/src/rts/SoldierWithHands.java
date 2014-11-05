package rts;

import java.util.Vector;

public class SoldierWithHands extends Decorator {

	private int numberHands;
	private Vector<Weapon> weapons;

	public SoldierWithHands(SoldierComponent deco, Weapon weapon) throws ErrorHandsFull {
		super(deco);
		this.numberHands = 1;
		if(deco.getClass().getName().equals(this.getClass().getName()))
		{
			SoldierWithHands swh = (SoldierWithHands)deco;
			this.numberHands = 1+swh.numberHands;

		}

		if(this.numberHands >= 3)
		{
			throw new ErrorHandsFull("3");
		}
		this.weapons = new Vector<>();
		this.weapons.add(weapon);
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

	protected void usure(Weapon weapon, int dammage) {
		weapon.damage(dammage);
		if(weapon.getHealthPoints() == 0)
			this.weapons.remove(weapon);
	}

	@Override
	public int strike() {

		int strike = 0;

		//for(Weapon weapon : this.weapons)
		if(!this.weapons.isEmpty())
		{
			Weapon weapon = this.weapons.firstElement();
			strike =+ weapon.strike();
			this.usure(weapon,1);
		}
		return super.strike()+ strike;
	}

	@Override
	public void parry(int strengthEnnemy) {

		//for(Weapon weapon : this.weapons)
		if(!this.weapons.isEmpty())
		{
			Weapon weapon = this.weapons.firstElement();
			strengthEnnemy = weapon.parry(strengthEnnemy);
			this.usure(weapon,1);
		}

		this.deco.parry(strengthEnnemy);

	}
}
