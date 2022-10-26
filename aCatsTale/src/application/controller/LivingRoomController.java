package application.controller;

import application.Main;
import application.controller.SelectorController;
import application.model.Tamagotchi;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * SelectorController is a Java class that will need to implement the EventHandler interface,
 * and handle any events that occur when the user interacts with Selector.fxml. 
 * 
 * @author Isabella Talijancic (juu530)
 * UTSA CS 3443 - A Cat's Tale
 * Fall 2022
 */

public class LivingRoomController implements EventHandler<ActionEvent> {
	
	@FXML
	Button home, cat1, cat2, cat3, cat4, moodButton, feedButton, bathroomButton, sleepButton, medicineButton, settingsButton;
	
	@FXML
	Label textOutput, welcome;
	
	@FXML
    ImageView bannerImageView, catImageView1, catImageView2, catImageView3, catImageView4, moodImageView, feedImageView, bathroomImageView, sleepImageView, medicineImageView, settingsImageView;
	
	@FXML
    Image bannerImage, catImage1, catImage2, catImage3, catImage4, mood, feed, bathroom, sleep, medicine, settings;

	String catChosen;
	
	@FXML
	public void initialize() {
		Image bannerImage = new Image("images/livingroombackground.gif");
		bannerImageView.setImage(bannerImage);
		
		//check which cat was chosen
		//set up button icons & start the game!
		Image mood = new Image("images/status.png");
		moodImageView.setImage(mood);
		moodButton.setGraphic(moodImageView);
		
		Image feed = new Image("images/feed.png");
		feedImageView.setImage(feed);
		feedButton.setGraphic(feedImageView);
		
		Image bathroom = new Image("images/bathroom.png");
		bathroomImageView.setImage(bathroom);
		bathroomButton.setGraphic(bathroomImageView);
		
		Image sleep = new Image("images/sleep.png");
		sleepImageView.setImage(sleep);
		sleepButton.setGraphic(sleepImageView);
		
		Image medicine = new Image("images/medicine.png");
		medicineImageView.setImage(medicine);
		medicineButton.setGraphic(medicineImageView);
		
		Image settings = new Image("images/settings.png");
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
			System.out.println("mood button!");
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
			//Settings
			System.out.println("settings button!");
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
		else {
			//else
		}
		
	}

}
