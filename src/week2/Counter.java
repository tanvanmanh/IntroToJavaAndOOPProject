package week2;
/**
 * 
 * @author manhtan
 *
 */
public class Counter {
	/**
	 * Stores internal count
	 */
	int count;
	
	//methods
	public int increment() {
		this.count++;
		return this.count;
	}
	
	/**
	 * Decrements internal count
	 * @return new value of internal count
	 */
	public int decrement() {
		this.count--;
		return this.count;
	}
	
	public int getCount() {
		return this.count;
	}
}
