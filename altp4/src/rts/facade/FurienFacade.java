package rts.facade;

import rts.soldier.Furien;
import rts.visitor.IVisitorArmy;

public class FurienFacade extends AbstractSoldierFacade {	
	
	/**
	 * @param soldier
	 */
	protected FurienFacade() {
		super(new Furien(),"Riddick");
	}
	
	protected FurienFacade(String name) {
		super(new Furien(), name);
	}
	
	protected FurienFacade(int health, int strength) {
		super(new Furien(health,strength),"Riddick");
	}
	
	protected FurienFacade(int health, int strength, String name) {
		super(new Furien(health,strength),name);
	}

	@Override
	public void accept(IVisitorArmy v) {
		v.visit(this);
		
	}

}
