package week1.banking;

/**
 * Represents a customer of a bank
 * @author manhtan
 *
 */
public class Customer {

	// instance vars
	
	/**
	 * Name of customer
	 */
	String name;
	
	/**
	 * Address of customer
	 */
	String address;
	
	// constructor
	
	/**
	 * Create a customer with the given name
	 * @param name name of customer
	 */
	public Customer(String name) {
		// sets instance var name to given name
		this.name = name;
		
	}
	
	// methods
	/**
	 * Sets the address of customer to be given addess
	 * @param address for customer
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * Gets customer's name
	 * @return name of customer
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Gets customer's address
	 * @return address of customer
	 */
	public String getAddress() {
		return this.address;
	}
}
