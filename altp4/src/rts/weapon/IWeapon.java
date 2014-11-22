package rts.weapon;

public interface IWeapon extends Cloneable {

	public int strike();

	public int parry(int strengthEnnemy);

	public int getHealthPoints();

	void damage(int dammage);

	public Object clone();

}
