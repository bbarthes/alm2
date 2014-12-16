package rts.visitor;

import rts.composite.Army;
import rts.facade.FuriensFacade;
import rts.facade.HorsemanFacade;
import rts.facade.InfantrymanFacade;
import rts.facade.KnightriderFacade;

public interface IVisitorArmy {
	
	public void visit(Army army);
	public void visit(HorsemanFacade horsmam);
	public void visit(InfantrymanFacade infantryman);
	public void visit(FuriensFacade furiens);
	public void visit(KnightriderFacade knightrider);
	
}
