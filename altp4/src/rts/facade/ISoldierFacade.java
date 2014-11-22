package rts.facade;

import rts.ISoldier;
import rts.composite.Visitor;
import rts.exception.ErrorHandsFull;
import rts.weapon.IWeapon;

public interface ISoldierFacade extends ISoldier {
	
	void addWeapon(IWeapon weapon) throws ErrorHandsFull;
	public void accept(Visitor v);


}
