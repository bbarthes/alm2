package rts.facade;

import rts.composite.Visitor;
import rts.soldier.Horseman;

public class HorsemanFacade extends AbstractSoldierFacade {
	
	/**
	 * @param man
	 */
	public HorsemanFacade() {
		super(new Horseman());
	}




	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub

	}

}
