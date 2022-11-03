package application.controller;

import javafx.animation.Animation;
import javafx.animation.Transition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.io.File;
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
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * MainController is a Java class that will need to implement the EventHandler interface,
 * and handle any events that occur when the user interacts with Main.fxml. 
 * 
 * @author Isabella Talijancic (juu530)
 * UTSA CS 3443 - A Cat's Tale
 * Fall 2022
 */
public class MainController implements EventHandler<ActionEvent>, Initializable{
	
	@FXML
	Button playButton, exitButton;
	
	@FXML
    ImageView bannerImageView, logoImageView;
	
	@FXML
    Image bannerImage, logoImage;
	
	@FXML
	MediaPlayer mediaPlayer, mediaPlayerSFX;
	
	@FXML
	Label namesLabel;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		backgroundMusic();
		animateText(namesLabel, "Made Possible by: Isabella Talijancic, Jake Alvarez,\n"
				+ "Wendy Guzman-Castro, Robert Sepulveda, and Christine Park");
		
	}
	
	@Override
	public void handle(ActionEvent event) {
		
		Image bannerImage = new Image("images/cherryblossombackground.gif");
		bannerImageView.setImage(bannerImage);
		
		Image logoImage = new Image("images/logo.png");
		logoImageView.setImage(logoImage);
		
		//check which button was pressed...
		Button sourceButton = (Button) event.getSource();
		String buttonText = sourceButton.getText();
				
		if(buttonText!=null && buttonText.contains("Play!") ) {
			// move the user to the selector view
			try {
				Parent root = FXMLLoader.load(getClass().getResource("../view/Rules.fxml"));
				Main.stage.setScene( new Scene(root, 600, 600) );
				Main.stage.show();
				
				//mediaPlayer.stop();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		else if(buttonText!=null && buttonText.contains("Settings") ) {
			mediaPlayer.stop();
			// move the user to the settings view
			try {
				Parent root = FXMLLoader.load(getClass().getResource("../view/Settings.fxml"));
				Main.stage.setScene( new Scene(root, 600, 600) );
				Main.stage.show();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		else if(buttonText!=null && buttonText.contains("Exit") ) {
			// exit the game
			try {
				Stage stage = (Stage) exitButton.getScene().getWindow();
                stage.close();
				
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
        playSound("cuteclick");
    }
	
    //Creates a new Media object to play sound effects.
    public void playSound(String soundName) {
        String s = "src/application/sounds/" + soundName + ".mp3";
        Media h = new Media(Paths.get(s).toUri().toString());
        mediaPlayerSFX = new MediaPlayer(h);
        mediaPlayerSFX.play();
    }
	
	public void backgroundMusic() {
        String s = "src/application/sounds/kawaii.mp3";
        Media h = new Media(Paths.get(s).toUri().toString());
        mediaPlayer = new MediaPlayer(h);
        mediaPlayer.play();
    }
	
	public void animateText(Label lbl, String stringToType) {
        String content = stringToType;
        final Animation animation = new Transition() {
            {
                setCycleDuration(Duration.millis(8000));
            }

            protected void interpolate(double frac) {
                final int length = content.length();
                final int n = Math.round(length * (float) frac);
                lbl.setText(content.substring(0, n));
            }
        };
        animation.play();
    }
}
