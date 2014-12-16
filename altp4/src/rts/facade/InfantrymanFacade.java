package rts.facade;

import rts.soldier.Infantryman;
import rts.visitor.IVisitorArmy;

public class InfantrymanFacade extends AbstractSoldierFacade {	
	
	/**
	 * @param soldier
	 */
	public InfantrymanFacade() {
		super(new Infantryman(),"Ryan");
	}
	
	public InfantrymanFacade(String name) {
		super(new Infantryman(), name);
	}
	
	public InfantrymanFacade(int health, int strength) {
		super(new Infantryman(health,strength),"Ryan");
	}
	
	public InfantrymanFacade(int health, int strength, String name) {
		super(new Infantryman(health,strength),name);
	}

	@Override
	public void accept(IVisitorArmy v) {
		v.visit(this);
		
	}

}
