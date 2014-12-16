package rts.observer;

import rts.composite.Army;

public class FightReportObserver implements MyObserver {

	@Override
	public void update(MyObservable o) {
		if (o instanceof Army) {
			System.out.println("L'arm�e a �t� d�truite");
		} else {
			System.out.println("Le soldat est mort");
		}
		
	}

}
