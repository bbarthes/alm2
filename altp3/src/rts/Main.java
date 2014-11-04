package rts;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		SoldierComponent s1 = new Infantryman();
		s1.strike();
		SoldierComponent s2 = new Sword(new Shield(new Dagger(new Horseman())));

	}

}
