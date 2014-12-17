package rts.decorator;

import rts.facade.IWeapon;

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
			if(strike != 0)
				this.usure(1);
		}
		return super.strike()+ strike;
	}

	@Override
	public void parry(int strengthEnnemy) {

		int newStrengthEnnemy =strengthEnnemy;
		if(!this.isBroken())
		{
			newStrengthEnnemy = this.weapon.parry(strengthEnnemy);
			if(newStrengthEnnemy != strengthEnnemy)
				this.usure(1);
			
		}
		strengthEnnemy = newStrengthEnnemy;
		this.deco.parry(strengthEnnemy);

	}
	@Override
	public ISoldierComponent clearDeco() {
		
		this.deco = this.deco.clearDeco();
		
		if(this.isBroken())
			return this.deco;

		return this;
	}
	
}
