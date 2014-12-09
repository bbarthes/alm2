package rts.factory;

import rts.facade.ISoldierFacade;
import rts.weapon.IWeapon;

public interface IAbstractFactoryRts {
		
	ISoldierFacade Infantryman();
	ISoldierFacade Infantryman(int health, int strength);
	
	ISoldierFacade Knight();
	ISoldierFacade Knight(int health, int strength); //
	
	IWeapon WeaponParry();
	IWeapon WeaponParry(int strength, int health);
	
	IWeapon Weapon();
	IWeapon Weapon(int strength, int health);
	
	IWeapon Shield();
	IWeapon Shield(int strength, int health);
	

}
