package ch.juventus.fx.firstSteps;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;

public class firstStepsApp extends Application {

	private final String fxmlPath = "file:///Users/anon/repos/_juventusPhilipp/swe2_course/src/main/java/ch/juventus/fx/firstSteps/firstSteps.fxml";

	@Override
	public void start(Stage primaryStage) throws Exception {
		firstStepsController controller = new firstStepsController();
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(new URL(fxmlPath));
		loader.setController(controller);
		VBox vbox = loader.<VBox>load();
		Button button = loader.<Button>load();

		//primaryStage.setTitle("My First JavaFX App");
		Scene scene = new Scene(vbox);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}