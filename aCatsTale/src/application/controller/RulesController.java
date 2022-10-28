package application.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import application.Main;
import application.model.Tamagotchi;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
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
public class RulesController implements EventHandler<ActionEvent> {
	
	@FXML
	Button backButton;
	
	@FXML
    ImageView bannerImageView;
	
	@FXML
	Label rulesLabel;
	
    Image bannerImage, logoImage;
	
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

}
