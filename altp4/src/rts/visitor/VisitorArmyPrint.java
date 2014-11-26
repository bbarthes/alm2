package rts.visitor;

import rts.composite.Army;
import rts.facade.HorsemanFacade;
import rts.facade.InfantrymanFacade;

public class VisitorArmyPrint implements IVisitorArmy {

	@Override
	public void visit(Army army) {
		System.out.println("Visite d'une armée");

	}

	@Override
	public void visit(HorsemanFacade horsmam) {
		System.out.println("\t visite d'un horseman");

	}

	@Override
	public void visit(InfantrymanFacade infantryman) {
		System.out.println("\t visite d'un infantryman");

	}


}
