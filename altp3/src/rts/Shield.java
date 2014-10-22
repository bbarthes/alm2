package rts;

public class Shield extends Equipment {

	public Shield(SoldierComponent deco) {
		super(deco, 100);
	}

	@Override
	public void parry(int strengthEnnemy) {
		super.parry(this.reduceDamage(strength, strengthEnnemy));

	}

}
