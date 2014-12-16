package rts.soldier;


public class Furien extends AbstractSoldier{


	public Furien (int health, int strength){
		super(health, strength);
	}

	public Furien() {
		super(50, 50);
	}

	@Override
	public int strike() {
		return this.getStrength()*2;
	}

	@Override
	public void parry(int strengthEnnemy) {
		this.damage(strengthEnnemy);

	}

}
