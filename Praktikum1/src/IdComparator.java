/**
 * Praktikum WI-PR2, SS 2014
 * Gruppe: Stefan Schumacher (stefan.schumacher@haw-hamburg.de),
 * Aufgabe: Aufgabenblatt 1
 */
import java.util.*;

public class IdComparator implements Comparator<Customer>  {

	@Override
	public int compare(Customer customer1, Customer customer2) {
		int returnValue = 0;
		if (customer1.getCustomerId() < customer2.getCustomerId()) {
			returnValue = -1;
		} else if (customer1.getCustomerId() > customer2.getCustomerId()) {
			returnValue = 1;
		}
		return returnValue;
	}
	
}
