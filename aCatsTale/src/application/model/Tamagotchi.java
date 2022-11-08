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
	 * calculateHappiness
	 * 
	 * called every "time cycle" to determine the overall happiness of the cat
	 * BAREBONE STATS: TESTING NEEDED, LOTS OF ROOM FOR EXPANSION
	 * 	if the cat is sick: -7 happiness
	 * 	hunger to happiness ratio (0-3:+5, 4-5:+0, 6-8:-3, 9-10:-6)
	 *	if the cat has been played with in the last 8 hours +5 happiness
	 *	happiness (0-3: hates you, 4-6: tolerates you, 7-9: likes you, 10: loves you)  
	 * 
	 */
	public void calculateHappiness() {
		
		//check sickness
		if(this.isSick)
			this.happiness -= 7;
		
		//check hunger
		if(this.hunger <= 3)
			this.happiness += 5;
		else if(this.hunger <= 5)
			this.happiness += 0;
		else if(this.hunger <= 8)
			this.happiness -= 2;
		else
		{
			this.happiness -= 7;
			//this.isSick = true;  potential feature aka starvation
		}
		//TODO: factor in play time, new toys, bathroom, etc
		if(this.happiness < 0)
			this.happiness = 0;
		else if(this.happiness > 10)
			this.happiness = 10;
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
	
//	public int getPassiveTime() {
//		return this.passiveTime);
//	}
	
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
	 *
	public String toString()
	{
		return "Name: " + this.getName() + "\nAge: " + this.getAge() + "\nHappiness: " + this.getHappiness() + "\nHunger: " + this.getHunger() + "\nSick: " + this.getIsSick();
		
	}*/
	
	public String toString() {
		String mood = "* ";
		if(this.isSick)
			mood += "sick ";
		
		if(this.happiness <= 3)
			mood += "hateful ";
		else if(this.happiness <= 9)
			mood += "happy ";
		else
			mood += "loving ";
		
		if(this.hunger >= 9)
			mood += "starving ";
		else if(this.hunger >= 4)
			mood += "hungry ";
		
		mood += "meow *";
		return mood;
	}
}