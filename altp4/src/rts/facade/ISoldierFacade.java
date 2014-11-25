package rts.facade;

import rts.ISoldier;
import rts.exception.ErrorHandsFull;
import rts.visitor.IVisitorArmy;
import rts.weapon.IWeapon;

public interface ISoldierFacade extends ISoldier {
	
	void addWeapon(IWeapon weapon) throws ErrorHandsFull;
	public void accept(IVisitorArmy v);


}
