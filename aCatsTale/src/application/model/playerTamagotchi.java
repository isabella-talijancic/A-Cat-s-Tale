package application.model;
import java.util.Scanner;

/**
 * playerTamagotchi is a Java class.
 * 
 * @author Isabella Talijancic (juu530)
 * UTSA CS 3443 - A Cat's Tale
 * Fall 2022
 */

public class playerTamagotchi{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("A Cat's Tale - Test -");
		// receives user input for the cat's name & color and print out all starting values.
		System.out.println("Enter the name of your new kitten: ");
		String catName = input.nextLine();
		System.out.println("What color would you like " + catName + " to be?");
		String catColor = input.nextLine();

		// a new tamagotchi cat object is created
		Tamagotchi newCat = new Tamagotchi(catName, catColor);

		// print out the tamagotchi's name, color, and starting values
		newCat.displayCatStats();
	}
}