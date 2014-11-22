package rts.decorator;

import rts.ISoldier;

public interface ISoldierComponent extends ISoldier{

	public ISoldierComponent disarm();
	public ISoldierComponent clearDeco();
}
