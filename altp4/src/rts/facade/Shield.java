package rts.facade;


public class Shield extends WeaponAbstract {

	protected Shield() {
		super(100,15);
	}
	protected Shield(int strength) {
		super( strength,15);
	}
	protected Shield(int strength, int health) {
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
