package rts;

public class Dagger extends Equipment{

	public Dagger(SoldierComponent next) {
		super(next, 50);		
		
	}
	
	public Dagger(SoldierComponent next, int stronger) {
		super(next, stronger);		
		
	}
	
	@Override
	public int strike() {
		return super.strike()+super.strength;
	}

	
	

}
