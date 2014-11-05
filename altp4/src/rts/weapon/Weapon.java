package rts.weapon;

public interface Weapon {

	public int strike();

	public int parry(int strengthEnnemy);

	public int getHealthPoints();

	void damage(int dammage);

}
