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
	
	String catChosen;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//backgroundMusic();
		
	}
	
	@Override
	public void handle(ActionEvent event) {
		
		Image bannerImage = new Image("images/livingroombackground.gif");
		bannerImageView.setImage(bannerImage);
		
		//check which button was pressed...
		Button sourceButton = (Button) event.getSource();
		String buttonText = sourceButton.getText();
				
		if(buttonText!=null && buttonText.contains("Luna") ) {
			//LUNA - START GAME
			String catChosen = "Luna";
			getCatChosen(catChosen);
			
			// Initialize a new Tamagotchi cat using its name.
			Tamagotchi luna = new Tamagotchi( "Luna" );
			System.out.println(luna);
			
			// move the user to the LivingRoom view
			try {
				Parent root = FXMLLoader.load(getClass().getResource("../view/LivingRoom.fxml"));
				Main.stage.setScene( new Scene(root, 600, 600) );
				Main.stage.show();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		else if(buttonText!=null && buttonText.contains("Maple") ) {
			//MAPLE - START GAME
			String catChosen = "Maple";
			getCatChosen(catChosen);
			// move the user to the LivingRoom view
			try {
				Parent root = FXMLLoader.load(getClass().getResource("../view/LivingRoom.fxml"));
				Main.stage.setScene( new Scene(root, 600, 600) );
				Main.stage.show();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		else if(buttonText!=null && buttonText.contains("Cooper") ) {
			//Cooper - START GAME
			String catChosen = "Cooper";
			getCatChosen(catChosen);
			// move the user to the LivingRoom view
			try {
				Parent root = FXMLLoader.load(getClass().getResource("../view/LivingRoom.fxml"));
				Main.stage.setScene( new Scene(root, 600, 600) );
				Main.stage.show();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		else if(buttonText!=null && buttonText.contains("Ginger") ) {
			//Ginger - START GAME
			String catChosen = "Ginger";
			getCatChosen(catChosen);
			// move the user to the LivingRoom view
			try {
				Parent root = FXMLLoader.load(getClass().getResource("../view/LivingRoom.fxml"));
				Main.stage.setScene( new Scene(root, 600, 600) );
				Main.stage.show();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		else {
			//else
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
	
	public void getCatChosen( String catChosen ) {
		this.catChosen = catChosen;
	}


}
