package communicatingbetweenwindows;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Window1 extends Application{

	Stage window;
	Button button;

	public static void main(String[] args) { launch(args); }

	@Override
	public void start(Stage primaryStage) {
		window = primaryStage;
		window.setTitle("Window 1");
		button = new Button("Click Me!");

		button.setOnAction(e -> {
			Window2.display("Window 2", "Is this Window 2");
		});

		//Aligns child elements
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout, 300, 250);
		window.setScene(scene);
		window.show();
	}
}
