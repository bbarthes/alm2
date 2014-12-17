package prog;

import rts.composite.Army;
import rts.composite.IArmy;
import rts.exception.ErrorDoctorWho;
import rts.facade.FactoryOfAbstractFactoryRts;
import rts.factory.IAbstractFactoryRts;
import rts.visitor.IVisitorArmy;
import rts.visitor.VisitorArmyCount;
import rts.visitor.VisitorArmyPrint;

public class affichageArmy {

	

	public static void main(String[] args) throws ErrorDoctorWho {
		IAbstractFactoryRts fact = FactoryOfAbstractFactoryRts.getInstanceOfPast();
		int numberSoldier = 20;
		IArmy army = new Army(); 
		army.addSoldier(3, numberSoldier, fact);
		army.addSoldier(12, numberSoldier, fact);
		IVisitorArmy printa = new VisitorArmyPrint();
		VisitorArmyCount counta = new VisitorArmyCount();
		
		IArmy army2 = new Army(); 
		army2.addSoldier(3, numberSoldier, fact);
		army.addArmy(army2);
		army.accept(printa);
		army.accept(counta);
		System.out.println("il y a " + counta.getNumSoldier() + " Soldiers");
		System.out.println("Dont "+ counta.getNumHorseman() +" Horsemen");
		System.out.println("Dont "+ counta.getNumInfantryman() +" Infantrymen");
		System.out.println("Réparti dans " + counta.getNumArmy() + " Armées");

	}

}
