package rts.composite;

import java.util.List;

import rts.facade.ISoldierFacade;
import rts.factory.IAbstractFactoryRts;
import rts.observer.Observer;

public interface IArmy extends ISoldierFacade{

	public void addArmy(IArmy a) ;
	//FIXME 	public void addSoldier(ISoldierFacade soldier, int number); solution actuel -> stub
	public void addSoldier (int typeSoldier, int number,IAbstractFactoryRts fact);
	//public void addSoldier(ISoldierFacade iSoldierFacade);
	public void addSoldier (int typeSoldier, int number, IAbstractFactoryRts fact ,List<Observer> lo);//stub solution
	//public void addObserverSoldiers(Observer o);
	//public void suppObserverSoldiers(Observer o);

	
}
