package application.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import application.model.Tamagotchi;
import application.model.playerTamagotchi;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * MainController is a Java class that will need to implement the EventHandler interface,
 * and handle any events that occur when the user interacts with Main.fxml. 
 * 
 * @author Isabella Talijancic (juu530)
 * UTSA CS 3443 - A Cat's Tale
 * Fall 2022
 */
public class MainController implements EventHandler<ActionEvent> {
	
	@FXML
    ImageView bannerImageView;
	@FXML
    Image bannerImage;
	
	@Override
	public void handle(ActionEvent event) {
		
		bannerImageView.setVisible(true);
		Image bannerImage = new Image("https://m.media-amazon.com/images/I/716hxgSNnuL.jpg");
		bannerImageView.setImage(bannerImage);
	}

}
