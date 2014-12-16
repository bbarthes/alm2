package rts.soldier;


public class Knightrider extends AbstractSoldier{


	public Knightrider (int health, int strength){
		super(health, strength);
	}

	public Knightrider() {
		super(100,100);
	}


	@Override
	public int strike() {

		return this.getStrength();
	}

	@Override
	public void parry(int strengthEnnemy) {
		this.damage(strengthEnnemy/2);

	}

}
