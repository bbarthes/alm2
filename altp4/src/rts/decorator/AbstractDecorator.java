package rts.decorator;


public abstract class AbstractDecorator implements ISoldierComponent {

	ISoldierComponent deco;


	public AbstractDecorator(ISoldierComponent deco){
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
	public ISoldierComponent disarm() {
		return this.deco;
	}
	
	@Override
	public ISoldierComponent clearDeco() {
		
		this.deco = this.deco.clearDeco();
		
		if(this.getHealthPoints() <= 0)
			return this.deco;

		return this;
	}
	

}
