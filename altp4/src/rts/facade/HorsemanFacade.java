package rts.facade;

import rts.soldier.Horseman;
import rts.visitor.IVisitorArmy;

public class HorsemanFacade extends AbstractSoldierFacade {
	
	protected HorsemanFacade() {
		super(new Horseman(),"Chevalier Blanc");
	}
	
	protected HorsemanFacade(String name) {
		super(new Horseman(),name);
	}

	protected HorsemanFacade(int health, int strength) {
		super(new Horseman(health,strength), "Chevalier Blanc");
	}
	protected HorsemanFacade(int health, int strength, String name) {
		super(new Horseman(health,strength), name);
	}

	@Override
	public void accept(IVisitorArmy v) {
		v.visit(this);

	}
}
