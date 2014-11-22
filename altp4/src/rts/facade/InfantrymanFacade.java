package rts.facade;

import rts.composite.Visitor;
import rts.soldier.Infantryman;

public class InfantrymanFacade extends AbstractSoldierFacade {	
	
	/**
	 * @param soldier
	 */
	public InfantrymanFacade() {
		super(new Infantryman());
	}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}

}
