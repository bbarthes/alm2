package rts.facade;

import rts.composite.Visitor;
import soldier.Horseman;

public class HorsemanFacade extends SoldierFacade {

	Horseman soldier;

	
	/**
	 * @param man
	 */
	public HorsemanFacade(Horseman soldier) {
		super();
		this.soldier = soldier;
	}




	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub

	}

}
