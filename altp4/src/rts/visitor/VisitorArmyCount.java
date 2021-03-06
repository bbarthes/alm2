package rts.visitor;

import rts.composite.Army;
import rts.facade.HorsemanFacade;
import rts.facade.InfantrymanFacade;

public class VisitorArmyCount implements IVisitorArmy{

	private int army,horseman,infantryman;

	public VisitorArmyCount() {
		this.reset();
	}
	
	public int getNumArmy() {
		return army;
	}

	public int getNumHorseman() {
		return horseman;
	}

	public int getNumInfantryman() {
		return infantryman;
	}

	public int getNumSoldier() {
		return this.horseman +this.infantryman;
	}

	public void reset() {
		this.army = 0;
		this.horseman = 0;
		this.infantryman = 0;
	}

	@Override
	public void visit(Army army) {
		++this.army;

	}

	@Override
	public void visit(HorsemanFacade horsmam) {
		++this.horseman;

	}

	@Override
	public void visit(InfantrymanFacade infantryman) {
		++this.infantryman;

	}

}
