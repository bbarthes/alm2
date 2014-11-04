package rts;

public class Shield extends WeaponAbstract {

	public Shield() {
		super(100,15);
	}
	public Shield(int health) throws Exception {
		super( health,15);
	}

	@Override
	public int parry(int strengthEnnemy) {
		return this.reduceDamage(strength, strengthEnnemy);

	}
	@Override
	public int strike() {
		return 0;
	}

}
