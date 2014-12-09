package rts.weapon;


public class Shield extends WeaponAbstract {

	public Shield() {
		super(100,15);
	}
	public Shield(int strength) {
		super( strength,15);
	}
	public Shield(int strength, int health) {
		super( strength,health);
	}

	@Override
	public int parry(int strengthEnnemy) {
		return this.reduceDamage(super.strength, strengthEnnemy);

	}
	@Override
	public int strike() {
		return 0;
	}

}
