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
	public Sword(SoldierComponent next, int health) {
		super(next, health);
	}


	/* (non-Javadoc)
	 * @see rts.SoldierComponent#strike()
	 */
	@Override
	public int strike() {
		return super.strike()+super.strength;
	}

	/* (non-Javadoc)
	 * @see rts.SoldierComponent#parry(int)
	 */
	@Override
	public void parry(int strengthEnnemy) {
		if(super.rand.nextInt() % 10 == 0)
		{
			strengthEnnemy = 0;
		}
		
		super.parry(strengthEnnemy);

	}

}
