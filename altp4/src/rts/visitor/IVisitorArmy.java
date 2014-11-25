package rts.visitor;

import rts.composite.Army;
import rts.facade.HorsemanFacade;
import rts.facade.InfantrymanFacade;

public interface IVisitorArmy {
	
	void visite(Army army);
	void visite(HorsemanFacade horsmam);
	void visite(InfantrymanFacade infantryman);
	
}
