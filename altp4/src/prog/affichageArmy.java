package prog;

import rts.composite.Army;
import rts.composite.IArmy;
import rts.visitor.IVisitorArmy;
import rts.visitor.VisitorArmyCount;
import rts.visitor.VisitorArmyPrint;

public class affichageArmy {

	

	public static void main(String[] args) {
		int numberSoldier = 20;
		IArmy army = new Army(); 
		army.addSoldier(3, numberSoldier);
		army.addSoldier(12, numberSoldier);
		IVisitorArmy printa = new VisitorArmyPrint();
		VisitorArmyCount counta = new VisitorArmyCount();
		
		IArmy army2 = new Army(); 
		army2.addSoldier(3, numberSoldier);
		army.addArmy(army2);
		army.accept(printa);
		army.accept(counta);
		System.out.println("il y a " + counta.getNumSoldier() + " Soldiers");
		System.out.println("Dont "+ counta.getNumHorseman() +" Horsemans");
		System.out.println("Dont "+ counta.getNUmInfantryman() +" Infantrymans");
		System.out.println("Réparti dans " + counta.getNumArmy() + " Armées");

	}

}
