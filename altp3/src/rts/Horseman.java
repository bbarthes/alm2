package rts;

public class Horseman extends Soldier{

	
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
