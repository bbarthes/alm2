package rts.facade;


public class Dagger extends WeaponAbstract{

	protected Dagger() {
		super(50,12);		
		
	}
	
	protected Dagger(int strength, int health){
		super(strength, health);		
		
	}

	@Override
	public int parry(int strengthEnnemy) {
		return 0;
	}

	
	

}
