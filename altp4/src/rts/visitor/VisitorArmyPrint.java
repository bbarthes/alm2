package rts.visitor;

import rts.composite.Army;
import rts.facade.HorsemanFacade;
import rts.facade.InfantrymanFacade;

public class VisitorArmyPrint implements IVisitorArmy {

	@Override
	public void visite(Army army) {
		System.out.println("Visite d'une Armée");

	}

	@Override
	public void visite(HorsemanFacade horsmam) {
		System.out.println("\t visite d'un horsman");

	}

	@Override
	public void visite(InfantrymanFacade infantryman) {
		System.out.println("\t visite d'un infranryman");

	}


}
