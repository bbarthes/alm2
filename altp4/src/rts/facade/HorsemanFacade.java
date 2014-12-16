package rts.facade;

import rts.soldier.Horseman;
import rts.visitor.IVisitorArmy;

public class HorsemanFacade extends AbstractSoldierFacade {
	
	public HorsemanFacade() {
		super(new Horseman(),"Chevalier Blanc");
	}
	
	public HorsemanFacade(String name) {
		super(new Horseman(),name);
	}

	public HorsemanFacade(int health, int strength) {
		super(new Horseman(health,strength), "Chevalier Blanc");
	}
	public HorsemanFacade(int health, int strength, String name) {
		super(new Horseman(health,strength), name);
	}

	@Override
	public void accept(IVisitorArmy v) {
		v.visit(this);

	}
}
