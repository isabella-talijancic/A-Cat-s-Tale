package application.model;

/**
 * Toy is a Java class.
 * 
 * @author Isabella Talijancic (juu530)
 * UTSA CS 3443 - A Cat's Tale
 * Fall 2022
 */

public class Toy {

	// set up toy values
	private String toyName;
	private int joy;
	/**
	 * Class constructor for the Toy class to initialize toy with a toyName and joy amount.
	 * 
	 * @param toyName
	 * @param joy
	 */
	public Toy(String toyName) {
		this.toyName = toyName;
		joy= 0;
	}
	
	/**
	 *  getter method
	 * 
	 * @return the toyName
	 */
	public String getToyName() {
		return this.toyName;
	}

	/**
	 * setter method
	 * 
	 * @param toyName the toyName to set
	 */
	public void setToyName(String toyName) {
		this.toyName = toyName;
	}
	
	/**
	 *  getter method
	 * 
	 * @return the joy value
	 */
	public int getJoy() {
		return this.joy;
	}
	
	/**
	 * setter method
	 * 
	 * @param joy the joy to set
	 */
	public void setJoy(int joy) {
		this.joy = joy;
	}
	
}