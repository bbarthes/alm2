package rts.facade;

import rts.ISoldier;
import rts.exception.ErrorHandsFull;
import rts.weapon.Weapon;

public interface SoldierFacade extends ISoldier {
	
	void addWeapon(Weapon weapon) throws ErrorHandsFull;


}
