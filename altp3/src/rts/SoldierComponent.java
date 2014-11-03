package rts;

public interface SoldierComponent {

	public int strike();
	
	public void parry(int strengthEnnemy);
	
	public int getHealthPoints();
	
	public SoldierComponent disarm();
}
