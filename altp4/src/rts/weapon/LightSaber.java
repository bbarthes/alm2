/**
 * 
 */
package rts.weapon;


/**
 * @author bbarthes
 *
 */
public class LightSaber extends WeaponAbstract {

	public LightSaber(int strengh) {
		super(strengh, 10);
	}
	public LightSaber(int strength, int health) {
		super(strength, health);
	}

	@Override
	public int parry(int strengthEnnemy) {
		if(super.rand.nextInt() % 2 == 0)
		{
			strengthEnnemy = 0;
		}

		return strengthEnnemy;

	}

}
