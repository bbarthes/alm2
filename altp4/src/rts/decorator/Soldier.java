package rts.decorator;


public abstract class Soldier implements SoldierComponent{
	
	private int health;
	private int strength;
	
	
	public Soldier(int health, int strength) {
		this.health = health;
		this.strength = strength;
	}

	public abstract int strike();
	
	public abstract void parry(int strengthEnnemy);
	
	public SoldierComponent disarm() {
		
		return this;
	}
	
	
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
	
	@Override
	public SoldierComponent clearDeco() {
		
		return this;
	}
	
}

