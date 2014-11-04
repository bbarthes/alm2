package prog;

import rts.Infantryman;
import rts.SoldierComponent;
import rts.Sword;

public class ExempleTropDArme {

	public ExempleTropDArme() {
	}

	public static void main(String[] args) {

		SoldierComponent s1 = new Infantryman();
		System.out.println("on crée un Infantryman");
		boolean continu = true;
		while(continu)
		{

			try {
				System.out.println("on donne une arme au Infantryman");
				s1 = new Sword(s1);
			} catch (Exception e) {
				continu = false;
				System.out.println("on à donnée trop d'armes au Infantryman");
				s1 = s1.disarm();
			}
		}
		System.out.println("avec cette implémentation il faut bien faire attention à retirer l'arme suplèmentaire");
		
	}

}
