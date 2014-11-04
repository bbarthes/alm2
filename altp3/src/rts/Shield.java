package rts;

public class Shield extends Equipment {

	public Shield(SoldierComponent deco) throws Exception {
		super(deco, 100);
	}
	public Shield(SoldierComponent deco, int health) throws Exception {
		super(deco, health);
	}

	@Override
	public void parry(int strengthEnnemy) {
		super.parry(this.reduceDamage(strength, strengthEnnemy));

	}

}
