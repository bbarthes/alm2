package rts.decorator;

import rts.ISoldier;

public interface SoldierComponent extends ISoldier{

	public SoldierComponent disarm();
	public SoldierComponent clearDeco();
}
