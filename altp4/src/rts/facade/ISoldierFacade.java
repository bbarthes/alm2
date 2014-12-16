package rts.facade;

import rts.ISoldier;
import rts.exception.ErrorHandsFull;
import rts.observer.Observable;
import rts.visitor.IVisitorArmy;
import rts.weapon.IWeapon;

public interface ISoldierFacade extends ISoldier , Observable {
	
	void addWeapon(IWeapon weapon) throws ErrorHandsFull;
	public void accept(IVisitorArmy v);
	public String getName();


}
