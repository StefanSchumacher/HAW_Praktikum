/**
 * Praktikum WI-PR2, SS 2014
 * Gruppe: Stefan Schumacher (stefan.schumacher@haw-hamburg.de),
 * Aufgabe: Aufgabenblatt 1
 */
import java.util.*;

public class WebShop {

	/**
	 * ArrayList zur Repräsentation der Kundenliste
	 */
	public ArrayList<Customer> customerList = new ArrayList<Customer>();
	
	
	// -------------------------------------------------------------------------------------------------------------------------------------------------------
	
	
	/**
	 * Hinzufügen von neuen Kunden zum WebShop
	 */
	public void addCustomer (String firstName, String lastName) {
		customerList.add(new Customer(lastName, firstName));
	}
	
	
	/**
	 * Entfernen von Kunden aus dem WebShop
	 */
	public void removeCustomer (String firstName, String lastName) {
		for (int i = 0; i < customerList.size(); i++) {
			if (customerList.get(i).getLastName().equals(lastName) && customerList.get(i).getFirstName().equals(firstName)) {
				customerList.remove(customerList.get(i));
			}
		}
	}
	
	
	/**
	 * Gibt eine Liste von Kunden nach vorgegebener Sortierung aus
	 */
	public void printListOfCustomers(SortingCriterion criterion) {
		List<Customer> list = customerList;
		
		/**
		 * Auswahl des Comparators in Abhängigkeit vom Suchkriterium
		 */
		if (criterion.equals(SortingCriterion.SORT_BY_LASTNAME_FIRSTNAME)) {
			Comparator<Customer> c = new NameComparator();
			Collections.sort(list, c);
		} else if (criterion.equals(SortingCriterion.SORT_BY_ID)) {
			Comparator<Customer> c = new IdComparator();
			Collections.sort(list, c);			
		}
		
		/**
		 * Ausgabe der sortierten Liste
		 */
		for (Customer printList: customerList) {
			System.out.println(printList.getLastName() + ", " + printList.getFirstName() + " (id: " + printList.getCustomerId() + ")");
		}
		System.out.println();
	}
	
}
