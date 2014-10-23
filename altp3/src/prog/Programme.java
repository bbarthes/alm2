package prog;

import rts.Horseman;
import rts.Infantryman;
import rts.SoldierComponent;
import rts.Sword;

public class Programme {

	private Tuple<String ,SoldierComponent> soldatAtk, soldatDef ;
	
	public Programme() {
		soldatAtk = new Tuple<String, SoldierComponent>("gérard", new Horseman());
		soldatDef = new Tuple<String, SoldierComponent>("bernard",new Sword(new Infantryman()));
	}
	
	
	void invertAtkDeff()
	{
		Tuple<String ,SoldierComponent> swap;
		swap = this.soldatAtk;
		this.soldatAtk = this.soldatDef;
		this.soldatDef = swap;
		
	}
	
	int bataille()
	{
		int strength = this.soldatAtk.getValue().strike();
		this.soldatDef.getValue().parry(strength);
		
		return strength;
		
	}
	
	void raportBataille()
	{
		int bataille = this.bataille();
		int healthPoints = this.soldatDef.getValue().getHealthPoints();
		System.out.println("le " + this.soldatAtk.getName() + " frappe de " + bataille + " le " + this.soldatDef.getName() + " qui a " + healthPoints +"point de vie");
	}
	
	boolean endBataille()
	{
		return this.soldatAtk.getValue().getHealthPoints() <= 0 || this.soldatDef.getValue().getHealthPoints() <= 0;
	}
	
	
	public static void main(String[] args) {
		Programme p = new Programme();
	
		while (!p.endBataille()) {
			
			p.raportBataille();
			p.invertAtkDeff();

		}

	}
}

