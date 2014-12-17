package rts.facade;


public class HoltzmanShield extends WeaponAbstract {

	protected HoltzmanShield() {
		super(100,15);
	}
	protected HoltzmanShield(int strength) {
		super( strength,15);
	}
	protected HoltzmanShield(int strength, int health) {
		super( strength,health);
	}

	@Override
	public int parry(int strengthEnnemy) {
		if(strengthEnnemy >= this.health/2)
			return this.reduceDamage(super.strength, strengthEnnemy);
	return strengthEnnemy;

	}
	@Override
	public int strike() {
		return 0;
	}

}
