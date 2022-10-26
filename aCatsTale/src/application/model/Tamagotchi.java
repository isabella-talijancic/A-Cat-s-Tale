package application.model;

/**
 * Tamagotchi is a Java class.
 * 
 * @author Isabella Talijancic (juu530)
 * UTSA CS 3443 - A Cat's Tale
 * Fall 2022
 */

public class Tamagotchi {

	// set up all of tamagotchi's values
	private String name;
	private int age;
	private int happiness;
	private int hunger;
	private boolean isSick;
	
	/**
	 * Class constructor for the Tamagotchi class to initialize a new Tamagotchi with a name, age, happiness, hunger, and isSick.
	 * 
	 * @param name
	 * @param age
	 * @param happiness
	 * @param hunger
	 * @param isSick
	 */
	public Tamagotchi(String name) {
		this.name = name;
		age= 0 ;
		happiness = 1;
		hunger = 1;
		isSick = false;
	}
	
	/**
	 *  getter method
	 * 
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * setter method
	 * 
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 *  getter method
	 * 
	 * @return the age
	 */
	public int getAge() {
		return this.age;
	}
	
	/**
	 * setter method
	 * 
	 * @param age the age to set
	 */
	public void setAge(int newAge) {
		this.age = newAge;
	}

	/**
	 *  getter method
	 * 
	 * @return the happiness
	 */
	public int getHappiness() {
		return this.happiness;
	}
	
	/**
	 * setter method
	 * 
	 * @param happiness the happiness to set
	 */
	public void setHappiness(int newHappiness) {
		this.happiness = newHappiness;
	}
	
	/**
	 *  getter method
	 * 
	 * @return the hunger
	 */
	public int getHunger() {
		return this.hunger;
	}
	
	/**
	 * setter method
	 * 
	 * @param hunger the hunger to set
	 */
	public void setHunger(int newHunger) {
		this.hunger = newHunger;
	}

	/**
	 *  getter method
	 * 
	 * @return the sick
	 */
	public boolean getIsSick() {
		return this.isSick;
	}
	
	/**
	 * setter method
	 * 
	 * @param sick the sick to set
	 */
	public void setIsSick(boolean isSick) {
		this.isSick = isSick;
	}
	
	/**
	 * toString() method to represent any object as a string, in this case -- the cat's name, age, happiness, hunger, and whether or not sick. Does not take in parameters and returns given values in string format.
	 * 
	 * @return this.getName()
	 * @return this.getAge()
	 * @return this.getHappiness()
	 * @return this.getHunger()
	 * @return this.isSick()
	 * 
	 * in string format
	 */
	public String toString()
	{
		return "Name: " + this.getName() + "\nAge: " + this.getAge() + "\nHappiness: " + this.getHappiness() + "\nHunger: " + this.getHunger() + "\nSick: " + this.getIsSick();
		
	}
	
}