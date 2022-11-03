package application.controller;

import javafx.animation.Animation;
import javafx.animation.Transition;
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
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

/**
 * MainController is a Java class that will need to implement the EventHandler interface,
 * and handle any events that occur when the user interacts with Main.fxml. 
 * 
 * @author Isabella Talijancic (juu530)
 * UTSA CS 3443 - A Cat's Tale
 * Fall 2022
 */
public class RulesController implements EventHandler<ActionEvent>, Initializable {
	
	@FXML
	Button backButton;
	
	@FXML
    ImageView bannerImageView;
	
	@FXML
	Label rulesLabel;
	
	@FXML
    Image bannerImage, logoImage;
	
	@FXML
	MediaPlayer mediaPlayer, mediaPlayerSFX;
	
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    	//backgroundMusic();
    	animateText(rulesLabel, "Welcome!\n"
        		+ "\nA Cat's Tale is a 2D tamagotchi game that lets you bring the fun and sweetness\n"
        		+ "of a cute little kitten with you everywhere!\n"
        		+ "\nFeed them, clean them, and bond with them to increase their happiness!\n"
        		+ "\nHere, players take care of their very own tamagotchi cat by using\n"
        		+ "the following options~ feed: feed a meal or snack, medicine: to use medicine\n"
        		+ "to cure their sick pet, mood: to check the cat's happiness level,\n"
        		+ "bathroom: to clean up after pet, and sleep: to turn off lights.\n"
        		+ "\nYou'll have a purr-fect time! Are you feline up to it?"
        		);

    }
    
	@Override
	public void handle(ActionEvent event) {
		
		Image bannerImage = new Image("images/greenroom.png");
		bannerImageView.setImage(bannerImage);
		
		//check which button was pressed...
		Button sourceButton = (Button) event.getSource();
		String buttonText = sourceButton.getText();
				
		if(buttonText!=null && buttonText.contains("Go Back") ) {
			// move the user back to the main view
			try {
				Parent root = FXMLLoader.load(getClass().getResource("../view/Main.fxml"));
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
	
	public void animateText(Label lbl, String stringToType) {
        String content = stringToType;
        final Animation animation = new Transition() {
            {
                setCycleDuration(Duration.millis(33000));
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
