package rts.facade;

import rts.soldier.Infantryman;
import rts.visitor.IVisitorArmy;

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
	public void accept(IVisitorArmy v) {
		v.visit(this);
		
	}

}
