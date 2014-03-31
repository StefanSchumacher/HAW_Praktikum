/**
 * Praktikum WI-PR2, SS 2014
 * Gruppe: Stefan Schumacher (stefan.schumacher@haw-hamburg.de),
 * Aufgabe: Aufgabenblatt 1
 */

public class MainApplication {
	  public static void main(String[] args) {
		  
		  /**
		   * Ein neuer WebShop wird erzeugt
		   */
		  WebShop webShop = new WebShop(); 
		  
		  /**
		   * Kunden werden zum WebShop hinzugef�gt
		   */
		  webShop.addCustomer("Jogi", "L�w");
		  webShop.addCustomer("Uli", "Hoene�");
		  webShop.addCustomer("Hansi", "Flick");
		  webShop.addCustomer("Dieter", "Hoene�");
		  webShop.addCustomer("Hansi", "Flick");
		  webShop.addCustomer("Mehmet", "Scholl");
		  webShop.addCustomer("Marco", "Reus");
		  
		  /**
		   * Die Kundenliste wird nach unterschiedlichen Sortierkriterien ausgegeben
		   */
		  webShop.printListOfCustomers(SortingCriterion.SORT_BY_LASTNAME_FIRSTNAME);
		  webShop.printListOfCustomers(SortingCriterion.SORT_BY_ID);
		  
		  /**
		   * Zwei Kunden werden gel�scht
		   */
		  webShop.removeCustomer("Mehmet", "Scholl");
		  webShop.removeCustomer("Hansi", "Flick");
		  
		  /**
		   * Die Kundenliste wird erneut ausgegeben
		   */
		  webShop.printListOfCustomers(SortingCriterion.SORT_BY_ID);
		  
	  }
}
