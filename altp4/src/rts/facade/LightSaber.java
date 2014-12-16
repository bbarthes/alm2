/**
 * 
 */
package rts.facade;


/**
 * @author bbarthes
 *
 */
public class LightSaber extends WeaponAbstract {

	protected LightSaber(int strengh) {
		super(strengh, 10);
	}
	protected LightSaber(int strength, int health) {
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
