package rts.weapon;


public class Krull extends WeaponAbstract{

	public Krull() {
		super(50,12);		
		
	}
	
	public Krull(int strength, int health){
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
