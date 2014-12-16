package rts.observer;

import rts.composite.Army;
import rts.composite.IArmy;
import rts.facade.ISoldierFacade;

public class FightReportObserver implements Observer {

	@Override
	public void update(Observable o) {
		System.out.println(o.getClass());
		if (o instanceof Army) {
			IArmy army = (IArmy) o;
			System.out.println("L'armée " + army.getName()+ " a été détruite.");
		} else {
			ISoldierFacade soldier = (ISoldierFacade) o;
			System.out.println("Le soldat " + soldier.getName() +" est mort.");
		}
		
	}

}
