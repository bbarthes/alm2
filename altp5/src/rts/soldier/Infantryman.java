package rts.soldier;


public class Infantryman extends AbstractSoldier{


	public Infantryman (int health, int strength){
		super(health, strength);
	}

	public Infantryman() {
		super(50, 50);
	}

	@Override
	public int strike() {
		return this.getStrength();
	}

	@Override
	public void parry(int strengthEnnemy) {
		this.damage(strengthEnnemy);

	}

}
