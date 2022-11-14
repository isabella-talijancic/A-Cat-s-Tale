package application.controller;

import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.ResourceBundle;

import application.Main;
import application.model.Tamagotchi;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 * SelectorController is a Java class that will need to implement the EventHandler interface,
 * and handle any events that occur when the user interacts with Selector.fxml. 
 * 
 * @author Isabella Talijancic (juu530)
 * UTSA CS 3443 - A Cat's Tale
 * Fall 2022
 */

public class SelectorController implements EventHandler<ActionEvent>, Initializable {
	
	@FXML
	Button cat1, cat2, cat3, cat4;
	
	@FXML
	Label textOutput, welcome;
	
	@FXML
    ImageView bannerImageView, catImageView1, catImageView2, catImageView3, catImageView4;
	
	@FXML
    Image bannerImage, catImage1, catImage2, catImage3, catImage4;
	
	@FXML
	MediaPlayer mediaPlayer, mediaPlayerSFX;
	
	static String catChosen;
	static Tamagotchi Cat;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//backgroundMusic();
		
	}
	
	@Override
	public void handle(ActionEvent event) {
		
		Image bannerImage = new Image("file:src/application/images/livingroombackground.gif");
		bannerImageView.setImage(bannerImage);
		
		//check which button was pressed...
		Button sourceButton = (Button) event.getSource();
		String buttonText = sourceButton.getText();
				
		if(buttonText!=null && buttonText.contains("Luna") ) {
			//LUNA - START GAME
			catChosen = "Luna";
			
			// Initialize a new Tamagotchi cat using its name.
			Cat = new Tamagotchi( catChosen );
			System.out.println("You chose Luna!\n");
			
			// move the user to the LivingRoom view
			try {
				Parent root = FXMLLoader.load(getClass().getResource("../view/LoadPage.fxml"));
				Main.stage.setScene( new Scene(root, 600, 600) );
				Main.stage.show();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		else if(buttonText!=null && buttonText.contains("Maple") ) {
			//MAPLE - START GAME
			catChosen = "Maple";
			
			// Initialize a new Tamagotchi cat using its name.
			Cat = new Tamagotchi( catChosen );
			System.out.println("You chose Maple!");
						
			// move the user to the LivingRoom view
			try {
				Parent root = FXMLLoader.load(getClass().getResource("../view/LoadPage.fxml"));
				Main.stage.setScene( new Scene(root, 600, 600) );
				Main.stage.show();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		else if(buttonText!=null && buttonText.contains("Snowball") ) {
			//Snowball - START GAME
			catChosen = "Snowball";
			
			// Initialize a new Tamagotchi cat using its name.
			Cat = new Tamagotchi( catChosen );
			System.out.println("You chose Snowball!");
			
			// move the user to the LivingRoom view
			try {
				Parent root = FXMLLoader.load(getClass().getResource("../view/LoadPage.fxml"));
				Main.stage.setScene( new Scene(root, 600, 600) );
				Main.stage.show();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		else if(buttonText!=null && buttonText.contains("Pumpkin") ) {
			//Pumpkin - START GAME
			catChosen = "Pumpkin";
			
			// Initialize a new Tamagotchi cat using its name.
			Cat = new Tamagotchi( catChosen );
			System.out.println("You chose Pumpkin!");
			
			// move the user to the LivingRoom view
			try {
				Parent root = FXMLLoader.load(getClass().getResource("../view/LoadPage.fxml"));
				Main.stage.setScene( new Scene(root, 600, 600) );
				Main.stage.show();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	//Event listener to play a sound effect for when a user hovers over a button.
    public void buttonHovered() {
        playSound("deepmeow");
    }
	
    //Creates a new Media object to play sound effects.
    public void playSound(String soundName) {
        String s = "src/application/sounds/" + soundName + ".mp3";
        Media h = new Media(Paths.get(s).toUri().toString());
        mediaPlayerSFX = new MediaPlayer(h);
        mediaPlayerSFX.play();
    }
	
//	public void backgroundMusic() {
//        String s = "src/application/sounds/kawaii.mp3";
//        Media h = new Media(Paths.get(s).toUri().toString());
//        mediaPlayer = new MediaPlayer(h);
//        mediaPlayer.play();
//    }
	/* Not sure if we need this for anything
	 * 
	 *
	public void getCatChosen( String catChosen ) {
		this.catChosen = catChosen;
	}
	*/
	

}
