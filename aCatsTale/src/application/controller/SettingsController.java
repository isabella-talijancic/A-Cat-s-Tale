package application.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;

import application.Main;
import application.model.Tamagotchi;
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
 * MainController is a Java class that will need to implement the EventHandler interface,
 * and handle any events that occur when the user interacts with Main.fxml. 
 * 
 * @author Isabella Talijancic (juu530)
 * UTSA CS 3443 - A Cat's Tale
 * Fall 2022
 */
public class SettingsController implements EventHandler<ActionEvent>, Initializable {
	
	@FXML
	Button backButton;
	
	@FXML
    ImageView bannerImageView, logoImageView;
	
	@FXML
	Label settingsLabel;
	
	@FXML
    Image bannerImage, logoImage;
	
	@FXML
	MediaPlayer mediaPlayer, mediaPlayerSFX;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//backgroundMusic();
		
	}
	
	@Override
	public void handle(ActionEvent event) {
		
		Image bannerImage = new Image("file:src/application/images/pinkroom.png");
		bannerImageView.setImage(bannerImage);
		
		//check which button was pressed...
		Button sourceButton = (Button) event.getSource();
		String buttonText = sourceButton.getText();
				
		if(buttonText!=null && buttonText.contains("Go Back") ) {
			// move the user back to the main view
			try {
				Parent root = FXMLLoader.load(getClass().getResource("../view/LivingRoom.fxml"));
				Main.stage.setScene( new Scene(root, 600, 600) );
				Main.stage.show();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		else if(buttonText!=null && buttonText.contains("Strawberry Room") ) {
			// move the user back to the main view
			try {
				Parent root = FXMLLoader.load(getClass().getResource("../view/LivingRoom.fxml"));
				Main.stage.setScene( new Scene(root, 600, 600) );
				Main.stage.show();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	//Event listener to play a sound effect for when a user hovers over a button.
    public void buttonHovered() {
        playSound("cuteclick");
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

}
