package rts;

import java.util.Random;

public abstract class Equipment extends Decorator{

	int strength;
	Random rand;

	public Equipment(SoldierComponent deco, int health) {
		super(deco);
		this.strength = health;
		this.rand = new Random();
	}

	protected int reduceDamage(int reduce , int damage){

		int res = damage - reduce;
		if(res < 0)
			res =0;

		return res;
	}
}
