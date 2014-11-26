package rts.composite;

import rts.facade.ISoldierFacade;

public interface IArmy extends ISoldierFacade{

	public void addArmy(IArmy a) ;
	//FIXME 	public void addSoldier(ISoldierFacade soldier, int number); solution actuel -> stub
	public void addSoldier (int typeSoldier, int number);
	

	
}
