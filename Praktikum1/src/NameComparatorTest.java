import static org.junit.Assert.*;

import org.junit.Test;


public class NameComparatorTest {

	@Test
	public void testNameComparator() {
		/**
		 * Erzeugung von Testobjekten
		 */
		Customer customer1 = new Customer("L�w", "Jogi");
		Customer customer2 = new Customer("Hoene�", "Uli");
		Customer customer3 = new Customer("Hoene�", "Dieter");
		  
		/**
		 * Erzeugung eines Comparator-Objektes
		 */
		NameComparator comparator = new NameComparator();
		
		/**
		 * Definition der Testf�lle
		 */
		assertEquals(comparator.compare(customer2, customer1), -4);
		assertEquals(comparator.compare(customer1, customer2), 4);
		assertEquals(comparator.compare(customer2, customer3), 17);
		assertEquals(comparator.compare(customer3, customer2), -17);
		
	}

}
