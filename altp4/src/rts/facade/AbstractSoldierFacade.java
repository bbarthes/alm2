package rts.facade;

import java.util.ArrayList;
import java.util.List;

import rts.decorator.ISoldierComponent;
import rts.decorator.SoldierWithHands;
import rts.exception.ErrorHandsFull;
import rts.observer.Observer;
import rts.weapon.IWeapon;



public abstract class AbstractSoldierFacade implements ISoldierFacade {

	private ISoldierComponent soldier;
	private List<ISoldierComponent> weapons;
	private String name;
	
	private ArrayList<Observer> tabObservers;

	public AbstractSoldierFacade(ISoldierComponent soldier, String name) {
		this.weapons = new ArrayList<>();
		this.soldier = soldier;
		this.tabObservers = new ArrayList<Observer>();
		this.name = name;
	}

	protected void clearDeco()
	{
		this.soldier = this.soldier.clearDeco();
		for(ISoldierComponent sc : this.weapons)
		{
			if(sc.getHealthPoints()<=0)
			{
				this.weapons.remove(sc);
			}
		}
	}

	@Override
	public int strike() {
		int strike = soldier.strike();
		this.clearDeco();
		return strike;
	}

	@Override
	public void parry(int strengthEnnemy) {
		soldier.parry(strengthEnnemy);;
		this.clearDeco();
		if (soldier.getHealthPoints() == 0) {
			this.notifyObservers();
		}
	}

	@Override
	public int getHealthPoints() {
		return this.soldier.getHealthPoints();
	}

	@Override
	public void addWeapon(IWeapon weapon) throws ErrorHandsFull {
		if(this.weapons.size() >= 2)
		{
			throw new ErrorHandsFull(this.weapons.size());
		}
		this.soldier = new SoldierWithHands(this.soldier, (IWeapon)weapon.clone());
		this.weapons.add(this.soldier);
	}
	
	public void addObserver(Observer o) {
		tabObservers.add(o);
	}
	
	public void suppObserver(Observer o){
		tabObservers.remove(o);
	}
	
	public void notifyObservers(){
		for ( int i = 0; i<tabObservers.size(); i++){
			Observer o = tabObservers.get(i);
			o.update(this);
		}
	}
	
	@Override
	public String getName() {
		return this.name;
	}

}
