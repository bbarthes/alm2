package rts;

import java.util.Random;

public abstract class Equipment extends Decorator{

	int strength;
	int numberEquipement;
	Random rand;

	public Equipment(SoldierComponent deco, int health) throws Exception {
		super(deco);
		this.numberEquipement = 0;
		Class<?> classe = deco.getClass();

		for(Class<?> superClass = classe.getSuperclass();superClass != null; superClass = classe.getSuperclass())
		{
			if(superClass.getName() == "Equipment")
			{
				Equipment eq = (Equipment)deco;
				this.numberEquipement = ++eq.numberEquipement;
			}
		}
		if(this.numberEquipement >= 3)
		{
			throw new Exception("trops d'équiment dans les mains");
		}
		this.strength = health;
		this.rand = new Random();
	}

	protected int getNumberEquipement() {
		return this.numberEquipement;
	}

	protected int reduceDamage(int reduce , int damage){

		int res = damage - reduce;
		if(res < 0)
			res =0;

		return res;
	}
}
