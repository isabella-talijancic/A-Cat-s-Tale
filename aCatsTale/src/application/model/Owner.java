package application.model;

import java.util.ArrayList;

/**
 * Owner is a Java class.
 * 
 * @author Isabella Talijancic (juu530)
 * UTSA CS 3443 - A Cat's Tale
 * Fall 2022
 */

public class Owner {

	// set up owner values
	private String ownerName;
	private ArrayList<Tamagotchi> pets;

	/**
	 * class constructor
	 * 
	 * @param ownerName
	 */
	public Owner( String ownerName ) {
		this.ownerName = ownerName;
		this.pets = new ArrayList<Tamagotchi>();
	}
	
	/**
	 * @param ownerName
	 * @param ArrayList<Tamagotchi> pets
	 */
	public Owner( String ownerName, ArrayList<Tamagotchi> pets ) {
		this.ownerName = ownerName;
		this.pets = pets;
	}
	
	/**
	 *  getter method
	 * 
	 * @return the ownerName
	 */
	public String getOwnerName() {
		return this.ownerName;
	}

	/**
	 * setter method
	 * 
	 * @param ownerName the ownerName to set
	 */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	/**
	 * getter method
	 * 
	 * @return the pets
	 */
	public ArrayList<Tamagotchi> getPets() {
		return pets;
	}

	/**
	 * setter method
	 * 
	 * @param pets the pets to set
	 */
	public void setPets(ArrayList<Tamagotchi> pets) {
		this.pets = pets;
	}
	
}