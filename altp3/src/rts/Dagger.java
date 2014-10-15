package rts;

public class Dagger extends Equipment{

	public Dagger(SoldierComponent next) {
		super(next, 50);
		// TODO Auto-generated constructor stub
		
		
	}

	@Override
	public int strike() {
		return super.strike()+super.health;
	}

	
	

}
