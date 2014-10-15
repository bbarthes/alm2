package rts;

public abstract class Soldier implements SoldierComponent{
	
	int health;
	int strength;
	
	public abstract int strike();
	
	public abstract void parry(int strengthEnnemy);
	
	
	public int getHealthPoints(){
		return this.health;
	}
	
	public void setHealthPoints(int health){
		this.health = health;
	}
	
	public int getStrength(){
		return this.strength;
	}
	
	public void setStregth(int strength){
		this.strength = strength;
	}
}

