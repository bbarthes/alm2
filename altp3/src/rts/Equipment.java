package rts;

import java.util.Random;

public abstract class Equipment extends Decorator{

	int strength;
	int numberEquipement;
	Random rand;

	public Equipment(SoldierComponent deco, int health) throws ErrorHandsFull {
		super(deco);

		this.rand = new Random();
		this.numberEquipement = 1;

		Class<?> classe = deco.getClass();
		for(Class<?> superClass = classe.getSuperclass();superClass != null; superClass = superClass.getSuperclass())
		{
			
			if(superClass.getName().equals("rts.Equipment"))
			{
				Equipment eq = (Equipment)deco;
				this.numberEquipement = 1+eq.numberEquipement;
				break;
			}
		}
		if(this.numberEquipement >= 3)
		{
			this.strength = 0;
			throw new ErrorHandsFull("3");
		}


		this.strength = health;

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
