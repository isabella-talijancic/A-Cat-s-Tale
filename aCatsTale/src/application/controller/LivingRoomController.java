package application.controller;

import java.net.URL;
import java.nio.file.Paths;
import java.util.Random;
import java.util.ResourceBundle;

import application.Main;
import application.model.Tamagotchi;
import application.controller.*;
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

public class LivingRoomController implements EventHandler<ActionEvent>, Initializable {
	
	@FXML
	Button home, cat1, cat2, cat3, cat4, moodButton, feedButton, bathroomButton, sleepButton, medicineButton, settingsButton;
	
	@FXML
	Label textOutput, welcome;
	
	@FXML
    ImageView bannerImageView, catImageView1, catImageView2, catImageView3, catImageView4, moodImageView, feedImageView, bathroomImageView, sleepImageView, medicineImageView, settingsImageView;
	
	@FXML
    Image bannerImage, catImage1, catImage2, catImage3, catImage4, mood, feed, bathroom, sleep, medicine, settings;

	@FXML
	MediaPlayer mediaPlayer, mediaPlayerSFX;
	
	String catChosen = SelectorController.catChosen;
	Tamagotchi Cat = SelectorController.Cat;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
		//backgroundMusic();
		Image bannerImage = new Image("file:src/application/images/strawberryroom.png");
		bannerImageView.setImage(bannerImage);
		
		//check which cat was chosen
		
		//set up button icons & start the game!
		Image mood = new Image("file:src/application/images/status.png");
		moodImageView.setImage(mood);
		moodButton.setGraphic(moodImageView);
		
		Image feed = new Image("file:src/application/images/feed.png");
		feedImageView.setImage(feed);
		feedButton.setGraphic(feedImageView);
		
		Image bathroom = new Image("file:src/application/images/bathroom.png");
		bathroomImageView.setImage(bathroom);
		bathroomButton.setGraphic(bathroomImageView);
		
		Image sleep = new Image("file:src/application/images/sleep.png");
		sleepImageView.setImage(sleep);
		sleepButton.setGraphic(sleepImageView);
		
		Image medicine = new Image("file:src/application/images/medicine.png");
		medicineImageView.setImage(medicine);
		medicineButton.setGraphic(medicineImageView);
		
		Image settings = new Image("file:src/application/images/settings.png");
		settingsImageView.setImage(settings);
		settingsButton.setGraphic(settingsImageView);
	}

	@Override
	public void handle(ActionEvent event) {
		//check which button was pressed...
		Button sourceButton = (Button) event.getSource();
		String buttonText = sourceButton.getText();
			
		
		if(sourceButton.getId().equals("moodButton")) {
			//Happiness/mood
			//TODO: remove later this is only for testing
			Cat.setHunger(new Random().nextInt(10));
			Cat.calculateHappiness();
			System.out.println("mood button!" + Cat);
		}
		else if(sourceButton.getId().equals("feedButton") ) {
			//Feed
			System.out.println("feed button!");
		}
		else if(sourceButton.getId().equals("bathroomButton") ) {
			//Clean/bathroom
			System.out.println("bathroom button!");
		}
		else if(sourceButton.getId().equals("sleepButton") ) {
			//Sleep
			System.out.println("sleep button!");
		}
		else if(sourceButton.getId().equals("medicineButton") ) {
			//Medicine
			System.out.println("medicine button!");
		}
		else if(sourceButton.getId().equals("settingsButton") ) {
			// move the user to the settings view
			try {
				Parent root = FXMLLoader.load(getClass().getResource("../view/Settings.fxml"));
				Main.stage.setScene( new Scene(root, 600, 600) );
				Main.stage.show();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		else if(buttonText!=null && buttonText.contains("Home") ) {
			// move the user to the Main view
			try {
				Parent root = FXMLLoader.load(getClass().getResource("../view/Main.fxml"));
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
