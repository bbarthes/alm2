package rts;

import java.util.Random;

public abstract class Decorator implements SoldierComponent {

	SoldierComponent deco;
	int strength;
	Random rand;

	public Decorator(SoldierComponent next){
		this.deco = next;
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

}
