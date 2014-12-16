package rts.facade;

import rts.factory.IAbstractFactoryRts;

public class AbstractFactoryRtsOfPast implements IAbstractFactoryRts {

	
	protected AbstractFactoryRtsOfPast() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public ISoldierFacade Infantryman() {
		return this.Infantryman(50, 50);
	}

	@Override
	public ISoldierFacade Infantryman(int health, int strength) {
		return new InfantrymanFacade(health, strength);
	}
	
	@Override
	public ISoldierFacade Infantryman(int health, int strength, String name) {
		return new InfantrymanFacade(health, strength);
	}

	@Override
	public ISoldierFacade Knight() {
		return this.Knight(100, 100);
	}

	@Override
	public ISoldierFacade Knight(int health, int strength) {
		return new HorsemanFacade(health, strength);
	}
	
	@Override
	public ISoldierFacade Knight(int health, int strength,String name) {
		return new HorsemanFacade(health, strength, name);
	}

	@Override
	public IWeapon WeaponParry() {
		return this.WeaponParry(20, 10);
	}

	@Override
	public IWeapon WeaponParry(int strength, int health) {
		return new Sword(strength, health);
	}

	@Override
	public IWeapon Weapon() {
		return this.Weapon(20, 15);
	}

	@Override
	public IWeapon Weapon(int strength, int health) {
		return new Dagger(strength, health);
	}

	@Override
	public IWeapon Shield() {
		return this.Shield(100, 10);
	}

	@Override
	public IWeapon Shield(int strength, int health) {
		return new Shield(strength, health);
	}

}
