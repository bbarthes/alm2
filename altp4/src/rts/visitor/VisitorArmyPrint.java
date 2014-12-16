package rts.visitor;

import rts.composite.Army;
import rts.facade.FuriensFacade;
import rts.facade.HorsemanFacade;
import rts.facade.InfantrymanFacade;
import rts.facade.KnightriderFacade;

public class VisitorArmyPrint implements IVisitorArmy {

	@Override
	public void visit(Army army) {
		System.out.println("Visite d'une armée");

	}

	@Override
	public void visit(HorsemanFacade horseman) {
		System.out.println("\t visite d'un horseman");

	}

	@Override
	public void visit(InfantrymanFacade infantryman) {
		System.out.println("\t visite d'un infantryman");

	}

	@Override
	public void visit(FuriensFacade furiens) {
		System.out.println("\t visite d'un furiens");
		
	}

	@Override
	public void visit(KnightriderFacade knightrider) {
		System.out.println("\t visite d'un knightrider");
		
	}


}
