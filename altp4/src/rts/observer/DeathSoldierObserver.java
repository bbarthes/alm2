package rts.observer;


public class DeathSoldierObserver implements MyObserver{
	
	private int nbDeath = 0;
	
	

	@Override
	public void update(MyObservable arg0, Object arg1) {
		++nbDeath;
		System.out.println(nbDeath + "soldiers have been killed, RIP.");
		
	}

}
