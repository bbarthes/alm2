package rts.soldier;


public class Furiens extends AbstractSoldier{


	public Furiens (int health, int strength){
		super(health, strength);
	}

	public Furiens() {
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
