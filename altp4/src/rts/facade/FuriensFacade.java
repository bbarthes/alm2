package rts.facade;

import rts.soldier.Furiens;
import rts.visitor.IVisitorArmy;

public class FuriensFacade extends AbstractSoldierFacade {	
	
	/**
	 * @param soldier
	 */
	public FuriensFacade() {
		super(new Furiens(),"Riddick");
	}
	
	public FuriensFacade(int health, int strength) {
		super(new Furiens(health,strength),"Riddick");
	}
	
	public FuriensFacade(int health, int strength, String name) {
		super(new Furiens(health,strength),name);
	}

	@Override
	public void accept(IVisitorArmy v) {
		v.visit(this);
		
	}

}
