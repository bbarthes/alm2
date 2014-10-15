package rts;

public abstract class Soldier implements SoldierComponent{
	
	private int health;
	private int strength;
	
	
	public Soldier(int health, int strength) {
		this.health = health;
		this.strength = strength;
	}

	public abstract int strike();
	
	public abstract void parry(int strengthEnnemy);
	
	
	public int getHealthPoints(){
		return this.health;
	}
	protected void damage( int damage){
		
			this.health -= damage;
			if(this.health < 0)
				this.health =0;
	}
	protected void setHealthPoints(int health){
		this.health = health;
	}
	
	protected int getStrength(){
		return this.strength;
	}
	
	protected void setStregth(int strength){
		this.strength = strength;
	}
}

