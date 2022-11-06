package application;
	
import java.io.File;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {
	
	@Override
	public void start(Stage stage) {
		
		try {
			
			// Creating the GUI
			Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			String css = this.getClass().getResource("application.css").toExternalForm();
			scene.getStylesheets().add(css);			
			
			Image icon = new Image("ghoul.png");
			stage.getIcons().add(icon);		
			stage.setTitle("Objektivering");
			stage.setResizable(false);
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
