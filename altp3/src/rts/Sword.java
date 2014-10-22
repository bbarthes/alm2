/**
 * 
 */
package rts;

/**
 * @author bbarthes
 *
 */
public class Sword extends Equipment {

	/**
	 * @param next
	 * @param health
	 */
	public Sword(SoldierComponent deco, int health) {
		super(deco, health);
	}
	public Sword(SoldierComponent deco) {
		super(deco, 100);
	}

	@Override
	public int strike() {
		return super.strike()+super.strength;
	}

	@Override
	public void parry(int strengthEnnemy) {
		if(super.rand.nextInt() % 10 == 0)
		{
			strengthEnnemy = 0;
		}

		super.parry(strengthEnnemy);

	}

}
