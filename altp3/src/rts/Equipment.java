package rts;

import java.util.Random;

public abstract class Equipment extends Decorator{

	int strength;
	int numberEquipement;
	Random rand;

	public Equipment(SoldierComponent deco, int health) throws Exception {
		super(deco);
		this.numberEquipement = 1;
		Class<?> classe = deco.getClass();

		for(Class<?> superClass = classe.getSuperclass();superClass != null; superClass = superClass.getSuperclass())
		{
			System.out.println(superClass.getName());
			if(superClass.getName().equals("rts.Equipment"))
			{
				Equipment eq = (Equipment)deco;
				this.numberEquipement = 1+eq.numberEquipement;
			}
		}

		if(this.numberEquipement >= 3)
		{
			throw new Exception("trops d'équiment dans les mains");
		}
		//System.out.println("toto");
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
