package rts.facade;

import rts.soldier.Knightrider;
import rts.visitor.IVisitorArmy;

public class KnightriderFacade extends AbstractSoldierFacade {
	
	/**
	 * @param man
	 */
	public KnightriderFacade() {
		super(new Knightrider(),"david hasselhoff");
	}

	public KnightriderFacade(int health, int strength) {
		super(new Knightrider(health,strength), "david hasselhoff");
	}
	public KnightriderFacade(int health, int strength, String name) {
		super(new Knightrider(health,strength), name);
	}

	@Override
	public void accept(IVisitorArmy v) {
		v.visit(this);

	}
}
