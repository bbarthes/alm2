package rts.facade;

import rts.soldier.Horseman;
import rts.visitor.IVisitorArmy;

public class HorsemanFacade extends AbstractSoldierFacade {
	
	/**
	 * @param man
	 */
	public HorsemanFacade() {
		super(new Horseman());
	}

	public HorsemanFacade(int health, int strength) {
		super(new Horseman(health,strength));
	}


	@Override
	public void accept(IVisitorArmy v) {
		v.visit(this);

	}

}
