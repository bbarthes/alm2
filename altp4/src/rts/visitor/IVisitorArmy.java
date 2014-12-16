package rts.visitor;

import rts.composite.Army;
import rts.facade.FuriensFacade;
import rts.facade.HorsemanFacade;
import rts.facade.InfantrymanFacade;
import rts.facade.KnightriderFacade;

public interface IVisitorArmy {
	
	void visit(Army army);
	void visit(HorsemanFacade horsmam);
	void visit(InfantrymanFacade infantryman);
	void visit(FuriensFacade furiens);
	void visit(KnightriderFacade knightrider);
	
}
