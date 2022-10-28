package application.model;

import java.util.ArrayList;

/**
 * Backpack is a Java class.
 * 
 * @author Isabella Talijancic (juu530)
 * UTSA CS 3443 - A Cat's Tale
 * Fall 2022
 */

public class Backpack {

	private final int maxCapacity = 10;
	private ArrayList<Toy>toyBox;
	private ArrayList<Food>fridge;
	private int numOfItems;

	/**
	 * class constructor
	 * @param maxCapacity
	 * @param numOfItems
	 */
	public Backpack(final int maxCapacity, int numOfItems) {
		this.toyBox = new ArrayList<Toy>();
		this.fridge = new ArrayList<Food>();
		this.numOfItems = numOfItems;
	}
	
	/**
	 * @param maxCapacity
	 * @param ArrayList<Toy>toyBox
	 * @param ArrayList<Food>fridge
	 * @param numOfItems
	 */
	public Backpack( final int maxCapacity, int numOfItems, ArrayList<Toy> toyBox, ArrayList<Food> fridge ) {
		this.toyBox = new ArrayList<Toy>();
		this.fridge = new ArrayList<Food>();
		this.numOfItems = numOfItems;
	}
	
	/**
	 *  getter method
	 * 
	 * @return the maxCapacity
	 */
	public final int getMaxCapacity() {
		return this.maxCapacity;
	}
	
	/**
	 * getter method
	 * 
	 * @return the toyBox
	 */
	public ArrayList<Toy> getToyBox() {
		return toyBox;
	}

	/**
	 * setter method
	 * 
	 * @param toyBox the toyBox to set
	 */
	public void setToyBox(ArrayList<Toy> toyBox) {
		this.toyBox = toyBox;
	}
	
	/**
	 * getter method
	 * 
	 * @return the fridge
	 */
	public ArrayList<Food> getFridge() {
		return fridge;
	}

	/**
	 * setter method
	 * 
	 * @param fridge the fridge to set
	 */
	public void setFridge(ArrayList<Food> fridge) {
		this.fridge = fridge;
	}
	
	/**
	 * getter method
	 * 
	 * @return the numOfItems
	 */
	public int getNumOfItems() {
		return numOfItems;
	}

	/**
	 * setter method
	 * 
	 * @param numOfItems the numOfItems to set
	 */
	public void setNumOfItems(int numOfItems) {
		this.numOfItems = numOfItems;
	}
	
}