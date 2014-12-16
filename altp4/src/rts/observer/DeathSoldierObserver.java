package rts.observer;


public class DeathSoldierObserver implements MyObserver{
	
	private int nbDeath = 0;
	

	@Override
	public void update(MyObservable o) {
		++nbDeath;
		System.out.println(nbDeath + " soldiers have been killed, RIP.");
		
	}

}
