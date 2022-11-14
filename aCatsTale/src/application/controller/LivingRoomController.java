package application.controller;

import java.net.URL;
import java.nio.file.Paths;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

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
import javafx.stage.Stage;

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
    ImageView catPlayerView, bannerImageView, catImageView1, catImageView2, catImageView3, catImageView4, moodImageView, feedImageView, bathroomImageView, sleepImageView, medicineImageView, settingsImageView, homebackView;
	
	@FXML
    Image catPlayer, bannerImage, catImage1, catImage2, catImage3, catImage4, mood, feed, bathroom, sleep, medicine, settings, homeback;

	@FXML
	MediaPlayer mediaPlayer, mediaPlayerSFX;
	
	String catChosen = SelectorController.catChosen;
	Tamagotchi Cat = SelectorController.Cat;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		//home button changed to have icon sleepdoor png image that was originally sleep
		Image homeback = new Image("file:src/application/images/transparent_sleepdoor.png");
		homebackView.setImage(homeback);
		home.setGraphic(homebackView);
		
		
		//backgroundMusic();
		Image bannerImage = new Image("file:src/application/images/strawberryroom.png");
		bannerImageView.setImage(bannerImage);
		
		//set up button icons & start the game!
		Image mood = new Image("file:src/application/images/transparent_status.png");
		moodImageView.setImage(mood);
		moodButton.setGraphic(moodImageView);
		
		Image feed = new Image("file:src/application/images/transparent_feed.png");
		feedImageView.setImage(feed);
		feedButton.setGraphic(feedImageView);
		
		Image bathroom = new Image("file:src/application/images/transparent_bathroom.png");
		bathroomImageView.setImage(bathroom);
		bathroomButton.setGraphic(bathroomImageView);
		
		Image sleep = new Image("file:src/application/images/fixed fatter zs.png");
		sleepImageView.setImage(sleep);
		sleepButton.setGraphic(sleepImageView);
		
		Image medicine = new Image("file:src/application/images/transparent_medicine.png");
		medicineImageView.setImage(medicine);
		medicineButton.setGraphic(medicineImageView);
		
		Image settings = new Image("file:src/application/images/transparent_settings.png");
		settingsImageView.setImage(settings);
		settingsButton.setGraphic(settingsImageView);
		
		//TODO: Pumpkin and Snowball gif, Maple is not the right color atm
		if(catChosen == "Pumpkin"||catChosen == "Snowball")
			catChosen = "Luna";
		Image catPlayer = new Image("file:src/application/images/"+catChosen+".gif");
		catPlayerView.setImage(catPlayer);
	}

	@Override
	public void handle(ActionEvent event) {
		//check which button was pressed...
		Button sourceButton = (Button) event.getSource();
		String buttonText = sourceButton.getText();
			
		
		if(sourceButton.getId().equals("moodButton")) {
			//Happiness/mood
			//TODO: testing purposes needs to be updated
			Cat.calculateHappiness();
			System.out.println("mood button!" + Cat);
		}
		else if(sourceButton.getId().equals("feedButton") ) {
			//Feed
			//TODO: testing purposes needs to be updated
			System.out.println("feed button!");
			Cat.lowerHunger();
		}
		else if(sourceButton.getId().equals("bathroomButton") ) {
			//Clean/bathroom
			//TODO: testing purposes needs to be updated
			System.out.println("bathroom button!");
			Cat.dropALog();
		}
		else if(sourceButton.getId().equals("sleepButton") ) {
			//Sleep
			System.out.println("sleep button!");
			// exit the game,
			// TODO: save player information and switch to exit screen
			try {
				Stage stage = (Stage) sleepButton.getScene().getWindow();
                stage.close();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		else if(sourceButton.getId().equals("medicineButton") ) {
			//Medicine
			//TODO: testing purposes needs to be updated
			System.out.println("medicine button!");
			Cat.treatSickness();
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
		
		//home button does have text home just very tiny font
		else if(buttonText!=null && buttonText.contains("Home") ) {
			// move the user to the Main view
			try {
				MainController.mediaPlayer.stop();
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
