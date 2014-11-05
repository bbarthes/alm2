package rts;

import java.util.Random;

public abstract class WeaponAbstract implements Weapon{

	int strength;
	int health;
	Random rand;

	public WeaponAbstract(int strength, int health) {
		this.rand = new Random();
		this.strength = strength;
		this.health = health;
	}

	protected int reduceDamage(int reduce , int damage){
		int res = damage - reduce;
		if(res < 0)
			res =0;

		return res;
	}
	
	@Override
	public int strike() {
		return this.strength;
	}

	@Override
	public int parry(int strengthEnnemy) {
		return this.strength;
	}

	@Override
	public int getHealthPoints() {
		return this.health;
	}
	@Override
	public void damage(int dammage) {
		this.health -= dammage;
		if(this.health < 0)
			this.health = 0;
		
	}
	
	
}
