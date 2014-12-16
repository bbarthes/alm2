package rts.facade;


public class Krull extends WeaponAbstract{

	protected Krull() {
		super(50,12);		
		
	}
	
	protected Krull(int strength, int health){
		super(strength, health);		
		
	}
	
	@Override
	public int strike() {
		return super.strike()*3;
	}

	@Override
	public int parry(int strengthEnnemy) {
		return 0;
	}

	
	

}
