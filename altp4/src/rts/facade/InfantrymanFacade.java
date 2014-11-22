package rts.facade;

import rts.composite.Visitor;
import rts.soldier.Infantryman;

public class InfantrymanFacade extends SoldierFacade {

	Infantryman soldier;	
	
	/**
	 * @param soldier
	 */
	public InfantrymanFacade(Infantryman soldier) {
		super();
		this.soldier = soldier;
	}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}

}
