package rts.factory;

import rts.facade.ISoldierFacade;
import rts.facade.IWeapon;

public interface IAbstractFactoryRts {
		
	public ISoldierFacade Infantryman();
	public ISoldierFacade Infantryman(int health, int strength);
	public ISoldierFacade Infantryman(int health, int strength,String name);
	
	public ISoldierFacade Knight();
	public ISoldierFacade Knight(int health, int strength); 
	public ISoldierFacade Knight(int health, int strength,String name);
	
	public IWeapon WeaponParry();
	public IWeapon WeaponParry(int strength, int health);
	
	public IWeapon Weapon();
	public IWeapon Weapon(int strength, int health);
	
	public IWeapon Shield();
	public IWeapon Shield(int strength, int health);
	

}
