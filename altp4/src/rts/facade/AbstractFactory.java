package rts.facade;



public class AbstractFactory {
	
	public InfantrymanFacade getSoldier()
	{
		return new InfantrymanFacade();
	}

}
