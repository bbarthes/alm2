package rts.weapon;


public class HoltzmanShield extends WeaponAbstract {

	public HoltzmanShield() {
		super(100,15);
	}
	public HoltzmanShield(int strength) {
		super( strength,15);
	}
	public HoltzmanShield(int strength, int health) {
		super( strength,health);
	}

	@Override
	public int parry(int strengthEnnemy) {
		if(strengthEnnemy/super.strength >20)
			return this.reduceDamage(super.strength, strengthEnnemy);
	return strengthEnnemy;

	}
	@Override
	public int strike() {
		return 0;
	}

}
