package rts.decorator;


public abstract class AbstractDecorator implements SoldierComponent {

	SoldierComponent deco;


	public AbstractDecorator(SoldierComponent deco){
		this.deco = deco;
	}

	@Override
	public int strike() {
		return this.deco.strike();
	}

	@Override
	public void parry(int strengthEnnemy) {
		this.deco.parry(strengthEnnemy);

	}
	
	@Override
	public int getHealthPoints() {
		return this.deco.getHealthPoints();
	}

	@Override
	public SoldierComponent disarm() {
		return this.deco;
	}
	
	@Override
	public SoldierComponent clearDeco() {
		
		this.deco = this.deco.clearDeco();
		
		if(this.getHealthPoints() <= 0)
			return this.deco;

		return this;
	}
	

}
