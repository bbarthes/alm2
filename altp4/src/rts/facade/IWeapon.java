package rts.facade;

public interface IWeapon extends Cloneable {

	public int strike();

	public int parry(int strengthEnnemy);

	public int getHealthPoints();

	public void damage(int dammage);

	public Object clone();

}
