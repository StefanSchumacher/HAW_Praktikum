import static org.junit.Assert.*;

import org.junit.Test;


public class NameComparatorTest {

	@Test
	public void testNameComparator() {
		/**
		 * Erzeugung von Testobjekten
		 */
		Customer customer1 = new Customer("Löw", "Jogi");
		Customer customer2 = new Customer("Hoeneß", "Uli");
		Customer customer3 = new Customer("Hoeneß", "Dieter");
		  
		/**
		 * Erzeugung eines Comparator-Objektes
		 */
		NameComparator comparator = new NameComparator();
		
		/**
		 * Definition der Testfälle
		 */
		assertEquals(comparator.compare(customer2, customer1), -4);
		assertEquals(comparator.compare(customer1, customer2), 4);
		assertEquals(comparator.compare(customer2, customer3), 17);
		assertEquals(comparator.compare(customer3, customer2), -17);
		
	}

}
