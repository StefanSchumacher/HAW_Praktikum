import static org.junit.Assert.*;

import org.junit.Test;


public class IdComparatorTest {

	@Test
	public void testIdComparator() {
		// Erzeugung von Testobjekten
		Customer customer1 = new Customer("Löw", "Jogi");
		Customer customer2 = new Customer("Hoeneß", "Uli");
		
		// Erzeugung eines Comparator-Objektes
		IdComparator comparator = new IdComparator();
		
		// Definition der Testfälle
		assertEquals(comparator.compare(customer1, customer2),-1);
		assertEquals(comparator.compare(customer2, customer1),1);
		assertEquals(comparator.compare(customer1, customer1),0);
		
	}

}
