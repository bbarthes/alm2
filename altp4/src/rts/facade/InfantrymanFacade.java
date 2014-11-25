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
	
	public InfantrymanFacade(int health, int strength) {
		super(new Infantryman(health,strength));
	}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}

}
