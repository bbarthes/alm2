package prog;

import rts.Horseman;
import rts.Infantryman;
import rts.Shield;
import rts.SoldierComponent;
import rts.SoldierWithHands;
import rts.Sword;

public class Programme {

	private Tuple<String ,SoldierComponent> soldatAtk, soldatDef ;
	
	public Programme() throws Exception {
		soldatAtk = new Tuple<String, SoldierComponent>("chevalier", new SoldierWithHands(new SoldierWithHands(new Horseman(100,80) ,new Shield(90)),new Sword(10, 10)));
		soldatDef = new Tuple<String, SoldierComponent>("héro",new SoldierWithHands(new SoldierWithHands(new Infantryman() ,new Shield(90)), new Sword(30,10)));
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
	
	
	public static void main(String[] args) throws Exception {
		Programme p = new Programme();
	
		while (!p.endBataille()) {
			
			p.raportBataille();
			p.invertAtkDeff();

		}

	}
}

