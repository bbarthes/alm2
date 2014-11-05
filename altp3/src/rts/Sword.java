/**
 * 
 */
package rts;

/**
 * @author bbarthes
 *
 */
public class Sword extends WeaponAbstract {

	public Sword(int strengh) {
		super(strengh, 10);
	}
	public Sword(int strength, int health) {
		super(strength, health);
	}

	@Override
	public int strike() {
		return super.strike();
	}

	@Override
	public int parry(int strengthEnnemy) {
		if(super.rand.nextInt() % 10 == 0)
		{
			strengthEnnemy = 0;
		}

		return strengthEnnemy;

	}

}
