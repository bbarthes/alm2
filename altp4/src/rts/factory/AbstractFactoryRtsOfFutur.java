package rts.factory;

import rts.facade.HorsemanFacade;
import rts.facade.ISoldierFacade;
import rts.facade.InfantrymanFacade;
import rts.weapon.Dagger;
import rts.weapon.IWeapon;
import rts.weapon.Sword;

public class AbstractFactoryRtsOfFutur implements IAbstractFactoryRts {

	@Override
	public ISoldierFacade Infantryman() {
		return this.Infantryman(50, 50);
	}

	@Override
	public ISoldierFacade Infantryman(int health, int strength) {
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
		return new rts.weapon.Shield(strength, health);
	}

}
