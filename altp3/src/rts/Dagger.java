package rts;

public class Dagger extends WeaponAbstract{

	public Dagger() throws Exception {
		super(50,12);		
		
	}
	
	public Dagger(int strength, int health) throws Exception {
		super(strength, health);		
		
	}
	
	@Override
	public int strike() {
		return super.strength;
	}

	@Override
	public int parry(int strengthEnnemy) {
		return 0;
	}

	
	

}
