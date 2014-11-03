package prog;

import rts.Horseman;
import rts.Infantryman;
import rts.Shield;
import rts.SoldierComponent;
import rts.Sword;

public class Programme {

	private Tuple<String ,SoldierComponent> soldatAtk, soldatDef ;
	
	public Programme() {
		soldatAtk = new Tuple<String, SoldierComponent>("chevalier", new Shield(new Horseman(100,80),60));
		soldatDef = new Tuple<String, SoldierComponent>("héro",new Shield( new Sword(new Infantryman(),15),70));
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
		int strength = this.bataille();
		int healthPoints = this.soldatDef.getValue().getHealthPoints();
		System.out.println("le " + this.soldatAtk.getName() + " frappe de " + strength + " le " + this.soldatDef.getName() + " qui a " + healthPoints +"point de vie");
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

