package rts.soldier;


public class Horseman extends AbstractSoldier{


	public Horseman (int health, int strength){
		super(health, strength);
	}

	public Horseman() {
		super(100,100);
	}


	@Override
	public int strike() {

		return this.getStrength();
	}

	@Override
	public void parry(int strengthEnnemy) {
		this.damage(strengthEnnemy*2);

	}

}
