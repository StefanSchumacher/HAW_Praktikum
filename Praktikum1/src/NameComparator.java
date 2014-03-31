/**
 * Praktikum WI-PR2, SS 2014
 * Gruppe: Stefan Schumacher (stefan.schumacher@haw-hamburg.de),
 * Aufgabe: Aufgabenblatt 1
 */
import java.util.*;

public class NameComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer customer1, Customer customer2) {	
		int returnValue = 0;
		if (customer1.getLastName().compareTo(customer2.getLastName()) != 0) {
			return customer1.getLastName().compareTo(customer2.getLastName());
		} else if (customer1.getLastName().compareTo(customer2.getLastName()) == 0) {
			return customer1.getFirstName().compareTo(customer2.getFirstName());
		}
		return returnValue;
	}

}
