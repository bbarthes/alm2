package rts.weapon;


public class Dagger extends WeaponAbstract{

	public Dagger() {
		super(50,12);		
		
	}
	
	public Dagger(int strength, int health){
		super(strength, health);		
		
	}

	@Override
	public int parry(int strengthEnnemy) {
		return 0;
	}

	
	

}
