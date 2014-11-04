package prog;

import rts.Infantryman;
import rts.SoldierComponent;
import rts.Sword;

public class ExempleTropDArme {

	public ExempleTropDArme() {
	}

	public static void main(String[] args) {

		SoldierComponent s1 = new Infantryman();
		System.out.println("Création d'un Infantryman.");
		boolean continu = true;
		while(continu)
		{

			try {
				System.out.println("Décoration de l'Infantryman  avec une nouvelle arme.");
				s1 = new Sword(s1);
			} catch (Exception e) {
				System.out.println("Erreur: Limite du nombre de décoration atteinte.");
				continu = false;
			}
		}
		for(int i = 0; i <2 ;++i)
		System.out.println("-------------");
		
		System.out.println("Création d'un nouvel Infantryman");
		System.out.println("Vérification du nombre d'armes.");
		s1 = new Infantryman();
		System.out.println("Tentative d'ajout de 5 armes.");		
		for(int i =0 ; i <5 ; ++i)
		{
			try {
				System.out.print("Décoration de l'Infantryman  avec une nouvelle arme.");
				s1 = new Sword(s1);
				System.out.println(" "+(i+1) +" décoration d'armes ajoutée.");
			} catch (Exception e) {
				System.out.println("Erreur: Limite du nombre de décoration atteinte.");			
				}
		}
		System.out.println("-------------");
		continu = true;
		int i =0;
		System.out.println("Maintenant désarmement"); 
		while(continu)
		{
			
			SoldierComponent swap = s1.disarm();
			if(swap == s1)
			{
				continu = false;
			}
			else
			{
				i++;
				System.out.println("on vient de retirer l'arme " + i);
				s1 = swap;
				
			}
			
		}
		if(i == 2)
		{
			System.out.println("Deux décorations retirées de l'Infantryman");
		}
		else
		{
			System.out.println("c'est impossibleu !!!!!!!!!!!!!!!!!!");
		}
		
	}

	

}
