package rts.composite;

import java.util.ArrayList;
import java.util.List;

import rts.exception.ErrorHandsFull;
import rts.facade.ISoldierFacade;
import rts.facade.IWeapon;
import rts.factory.IAbstractFactoryRts;
import rts.observer.Observer;
import rts.visitor.IVisitorArmy;

public class Army implements IArmy{
	
	private List<ISoldierFacade> army;
	private List<Observer> tabObservers;
	private String name;

	public Army(String name)
	{
		
		this.army = new ArrayList<>();
		this.tabObservers = new ArrayList<>();
		this.name = name;
	}
	
	public Army() {
		this("la 125");

	}

	@Override
	public int strike() {
		int strike = 0;
		for(ISoldierFacade soldat : this.army)
		{
			strike += soldat.strike();
		}
		return strike;
	}

	@Override
	public void parry(int strengthEnnemy) {
		int strengthEnnemySoldat =   strengthEnnemy/this.army.size();
		for(ISoldierFacade soldat : this.army)
		{
			soldat.parry(strengthEnnemySoldat);
		}
		if (this.getHealthPoints() == 0) {
			this.notifyObservers();
		}
	}

	@Override
	public int getHealthPoints() {
		int healthPoints = 0;
		for(ISoldierFacade soldat : this.army)
		{
			healthPoints += soldat.getHealthPoints();
		}
		return healthPoints;
	}

	@Override
	public void addWeapon(IWeapon weapon) {

		for(ISoldierFacade soldat : this.army)
		{
			try{
				soldat.addWeapon(weapon);
			}catch (ErrorHandsFull e)
			{
				//TODO on ne fair rien 
			}

		}
	}

	@Override
	public void accept(IVisitorArmy v) {
		v.visit(this);
		for(ISoldierFacade soldat : this.army)
		{
				soldat.accept(v);	
		}
	}
	// FIXME 
	
	@Override
	public void addArmy(IArmy a) {
		if(!this.equals(a))
			this.army.add(a);
		
	}

	@Override
	public void addSoldier(int typeSoldier, int number,IAbstractFactoryRts fact) {
		this.addSoldier(typeSoldier, number, fact, new ArrayList<Observer>());
		
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

	@Override
	public void addSoldier(int typeSoldier, int number,  IAbstractFactoryRts fact, List<Observer> lo) {
		ISoldierFacade newSoldier = null;
		if(typeSoldier%2 == 0)
		{
			for(int i = 0; i < number; i++)
			{
				newSoldier = fact.Knight();
				for(Observer o : lo)
					newSoldier.addObserver(o);
				this.army.add(newSoldier);
			}
		}
		else
		{
			for(int i = 0; i < number; i++)
			{
				newSoldier = fact.Infantryman();
				for(Observer o : lo)
					newSoldier.addObserver(o);
				this.army.add(newSoldier);
				
			}
		}
		
	}

	/*
	@Override
	public void addSoldier(ISoldierFacade iSoldierFacade) {
		if(!this.army.contains(iSoldierFacade))
			this.army.add(iSoldierFacade);
		
	}*/



}
