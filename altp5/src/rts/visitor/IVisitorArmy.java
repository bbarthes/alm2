package rts.visitor;

import rts.composite.Army;
import rts.facade.HorsemanFacade;
import rts.facade.InfantrymanFacade;

public interface IVisitorArmy {
	
	void visit(Army army);
	void visit(HorsemanFacade horsmam);
	void visit(InfantrymanFacade infantryman);
	
}
