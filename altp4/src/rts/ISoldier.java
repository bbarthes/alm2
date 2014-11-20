package rts;

import rts.composite.Visitor;


public interface ISoldier {

	public int strike();
	
	public void parry(int strengthEnnemy);
	
	public int getHealthPoints();
	
	
	
}
