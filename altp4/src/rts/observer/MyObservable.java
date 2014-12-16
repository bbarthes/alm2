package rts.observer;

public interface MyObservable{
	
	public void addObserver(MyObserver o);
	
	public void suppObserver(MyObserver o);
	
	public void notifyObservers();

}
