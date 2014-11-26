package rts.observer;

import java.util.Observable;
import java.util.Observer;

public class DeathSoldierObserver implements Observer{
	
	private int nbDeath = 0;
	
	

	@Override
	public void update(Observable arg0, Object arg1) {
		++nbDeath;
		System.out.println(nbDeath + "soldiers have been killed, RIP.");
		
	}

}
