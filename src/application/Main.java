package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;

public class Main extends Application {
	private AnchorPane mypane;

	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("menuSplashscreen.fxml"));
			mypane = (AnchorPane) loader.load();

			Scene scene = new Scene(mypane);
			scene.getStylesheets().add("https://fonts.googleapis.com/css?family=Berkshire+Swash");
			
			/*
			 * Si queremos añadir una fuente que tengamos descargada en local se meteria en el proyecto en forma de ttf y se llamaria asi
			 * 
			 * Font.loadFont(getClass().getResourceAsStream("assets/Sacramento-Regular.ttf"), 20);
			 */

			primaryStage.initStyle(StageStyle.UNDECORATED);
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		launch(args);
	}
}
