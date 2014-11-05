package rts.weapon;


public class Shield extends WeaponAbstract {

	public Shield() {
		super(100,15);
	}
	public Shield(int strength) throws Exception {
		super( strength,15);
	}
	public Shield(int strength, int healt) throws Exception {
		super( strength,healt);
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
