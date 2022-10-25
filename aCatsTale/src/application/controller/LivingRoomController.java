package application.controller;

import application.Main;
import application.controller.SelectorController;
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
	Button home;
	@FXML
	Button cat1;
	@FXML
	Button cat2;
	@FXML
	Button cat3;
	@FXML
	Button cat4;
	@FXML
	Label textOutput;
	@FXML
    ImageView bannerImageView;
	@FXML
    Image bannerImage;
	@FXML
    ImageView catImageView1;
	@FXML
    Image catImage1;
	@FXML
    ImageView catImageView2;
	@FXML
    Image catImage2;
	@FXML
    ImageView catImageView3;
	@FXML
    Image catImage3;
	@FXML
    ImageView catImageView4;
	@FXML
    Image catImage4;
	@FXML
	Label welcome;
	
	String catChosen;
	
	@FXML
	public void initialize() {
		
	}

	@Override
	public void handle(ActionEvent event) {
		
		Image bannerImage = new Image("images/livingroombackground.gif");
		bannerImageView.setImage(bannerImage);
		
		//check which button was pressed...
		Button sourceButton = (Button) event.getSource();
		String buttonText = sourceButton.getText();
				
		if(buttonText!=null && buttonText.contains("Feed") ) {
			//Feed
		}
		else if(buttonText!=null && buttonText.contains("Clean") ) {
			//Clean
		}
		else if(buttonText!=null && buttonText.contains("Sleep") ) {
			//Sleep
		}
		else if(buttonText!=null && buttonText.contains("Settings") ) {
			//Settings
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
