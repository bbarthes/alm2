package rts;

import java.util.Random;

public abstract class Equipment implements SoldierComponent {

	SoldierComponent next;
	int health;
	Random rand;

	public Equipment(SoldierComponent next, int health) {
		this.next = next;
		this.health = health;
		this.rand = new Random();
	}

	@Override
	public int strike() {
		return this.strike();
	}

	@Override
	public void parry(int strengthEnnemy) {
		this.next.parry(strengthEnnemy);

	}

	protected int reduceDamage(int reduce , int damage){

		int res = damage - reduce;
		if(res < 0)
			res =0;

		return res;
	}

	@Override
	public int getHealthPoints() {
		return this.health;
	}

}
