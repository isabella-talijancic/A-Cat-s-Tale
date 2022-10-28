package application.model;

/**
 * Food is a Java class.
 * 
 * @author Isabella Talijancic (juu530)
 * UTSA CS 3443 - A Cat's Tale
 * Fall 2022
 */

public class Food {

	// set up food values
	private String foodName;
	private int nutrition;
	/**
	 * Class constructor for the Food class to initialize food with a foodName and nutrition.
	 * 
	 * @param foodName
	 * @param nutrition
	 */
	public Food(String foodName) {
		this.foodName = foodName;
		nutrition= 0;
	}
	
	/**
	 *  getter method
	 * 
	 * @return the foodName
	 */
	public String getFoodName() {
		return this.foodName;
	}

	/**
	 * setter method
	 * 
	 * @param foodName the foodName to set
	 */
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	
	/**
	 *  getter method
	 * 
	 * @return the nutrition value
	 */
	public int getNutrition() {
		return this.nutrition;
	}
	
	/**
	 * setter method
	 * 
	 * @param nutrition the nutrition to set
	 */
	public void setNutrition(int nutrition) {
		this.nutrition = nutrition;
	}
	
}