package application.model;

/**
 * Tmagotchi is a Java class.
 * 
 * @author Isabella Talijancic (juu530)
 * UTSA CS 3443 - A Cat's Tale
 * Fall 2022
 */


//public Pet CreatePet(int petType, int gameType, String petName) {
//    return switch (petType) {
//        case 0 -> new Dog(gameType, petName);
//        case 1 -> new Cat(gameType, petName);
//        default -> new DefaultPet(gameType, petName);
//    };
//}


public class Tamagotchi {

	// set up all of tamagotchi's values
	String name;
	String color;
	int age;
	int happiness;
	int hunger;
	boolean sick;

	// create a new tamagotchi cat object
	public Tamagotchi(String name, String color){
	this.name = name;
	this.color = color;
	age = 0;
	happiness = 1;
	hunger = 1;
	sick = false;
	}
	
	

	// print out the tamagotchi's name, color, and starting values
	public void displayCatStats() {
	System.out.println("Tamogotchi's name: " + name);
	System.out.println("Tamogotchi's color: " + color);
	System.out.println("Tamogotchi's age: " + age);
	System.out.println("Tamogotchi's happiness: " + happiness);
	System.out.println("Tamogotchi's hunger: " + hunger);
	}
	
	/**
	 *  getter method
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
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
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * setter method
	 * 
	 * @param color the color to set
	 */
	public void setColor(String newColor) {
		this.color = newColor;
	}
	
	/**
	 *  getter method
	 * 
	 * @return the age
	 */
	public int getAge() {
		return age;
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
		return happiness;
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
		return hunger;
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
	public boolean getSick() {
		return sick;
	}
	
	/**
	 * setter method
	 * 
	 * @param sick the sick to set
	 */
	public void setSick(boolean sickness) {
		this.sick = sickness;
	}
}