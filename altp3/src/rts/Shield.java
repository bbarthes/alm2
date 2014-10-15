package rts;

public class Shield extends Equipment {

	/**
	 * 
	 */
	public Shield(SoldierComponent next) {
		super(next, 100);
	}

	@Override
	public int strike() {

		return this.next.strike();
	}

	@Override
	public void parry(int strengthEnnemy) {
		this.next.parry(this.reduceDamage(health, strengthEnnemy));

	}

	@Override
	public int getHealthPoints() {

		return health;
	}

}
