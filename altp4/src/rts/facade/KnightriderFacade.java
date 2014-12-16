package rts.facade;

import rts.soldier.Knightrider;
import rts.visitor.IVisitorArmy;

public class KnightriderFacade extends AbstractSoldierFacade {
	
	protected KnightriderFacade() {
		super(new Knightrider(),"david hasselhoff");
	}
	
	protected KnightriderFacade(String name) {
		super(new Knightrider(), name);
	}

	protected KnightriderFacade(int health, int strength) {
		super(new Knightrider(health,strength), "david hasselhoff");
	}
	protected KnightriderFacade(int health, int strength, String name) {
		super(new Knightrider(health,strength), name);
	}

	@Override
	public void accept(IVisitorArmy v) {
		v.visit(this);

	}
}
