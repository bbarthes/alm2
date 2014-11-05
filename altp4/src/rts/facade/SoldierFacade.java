package rts.facade;

import rts.ISoldier;
import rts.weapon.Weapon;

public interface SoldierFacade extends ISoldier {
	
	public void addWeapon(Class<Weapon> weapon);


}
