package rts.observer;


public class DeathSoldierObserver implements Observer{
	
	private int nbDeath = 0;
	

	@Override
	public void update(Observable o) {
		++nbDeath;
		System.out.println(nbDeath + " soldiers have been killed, RIP.");
		
	}

}
