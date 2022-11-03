package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;

/**
 * Main is a Java class that will launch the application and show the Main.fxml.
 * 
 * @author Isabella Talijancic (juu530)
 * UTSA CS 3443 - A Cat's Tale
 * Fall 2022
 */

public class Main extends Application {
	
	public static Stage stage;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			// give access to the other controllers to this primary stage!
			stage = primaryStage;
			primaryStage.setTitle("A Cat's Tale");
			
			// Icon to appear next to the primary stage title:
            Image icon = new Image("images/siticon.png");
            //"C:\Users\bella\git\repository\aCatsTale\images\gameicon.png"
            primaryStage.getIcons().add(icon);
			
            // Connect to the FXML (contains our layout) and load it in
            Parent root = FXMLLoader.load(Main.class.getResource("view/Main.fxml"));

            // Put the layout onto the scene
            Scene scene = new Scene(root);

            // Set the scene on the stage
            primaryStage.setScene(scene);
            primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
