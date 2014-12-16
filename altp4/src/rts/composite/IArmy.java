package rts.composite;

import rts.facade.ISoldierFacade;
import rts.observer.Observer;

public interface IArmy extends ISoldierFacade{

	public void addArmy(IArmy a) ;
	//FIXME 	public void addSoldier(ISoldierFacade soldier, int number); solution actuel -> stub
	public void addSoldier (int typeSoldier, int number);
	//public void addSoldier(ISoldierFacade iSoldierFacade);
	public void addSoldier (int typeSoldier, int number,Observer o );//stub solution
	//public void addObserverSoldiers(Observer o);
	//public void suppObserverSoldiers(Observer o);

	
}
