package rts.facade;

import rts.soldier.Infantryman;
import rts.visitor.IVisitorArmy;

public class InfantrymanFacade extends AbstractSoldierFacade {	
	
	/**
	 * @param soldier
	 */
	protected InfantrymanFacade() {
		super(new Infantryman(),"Ryan");
	}
	
	protected InfantrymanFacade(String name) {
		super(new Infantryman(), name);
	}
	
	protected InfantrymanFacade(int health, int strength) {
		super(new Infantryman(health,strength),"Ryan");
	}
	
	protected InfantrymanFacade(int health, int strength, String name) {
		super(new Infantryman(health,strength),name);
	}

	@Override
	public void accept(IVisitorArmy v) {
		v.visit(this);
		
	}

}
