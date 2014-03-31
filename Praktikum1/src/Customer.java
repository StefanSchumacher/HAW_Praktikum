/**
 * Praktikum WI-PR2, SS 2014
 * Gruppe: Stefan Schumacher (stefan.schumacher@haw-hamburg.de),
 * Aufgabe: Aufgabenblatt 1
 */

public class Customer {

	/**
	 * Klassenvariable mit statischem Zähler zur Erzeugung von Customer-IDs.
	 */
	private static int idCounter = 0;
	
	
	/**
	 * Objektvariablen für Customer
	 */
	private String lastName;	
	private String firstName;
	private int customerId;
	
	
	/**
	 * Constructor
	 */
	public Customer ( String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
		customerId = idCounter;
		idCounter++;
	}
	
	
	// -------------------------------------------------------------------------------------------------------------------------------------------------------
	
	/**
	 * Getter
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Getter
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Getter
	 */
	public int getCustomerId () {
		return customerId;
	}
	
}

