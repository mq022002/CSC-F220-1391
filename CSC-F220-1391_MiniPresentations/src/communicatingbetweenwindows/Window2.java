package communicatingbetweenwindows;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class Window2 {

	static boolean answer;

	public static boolean display(String title, String message) {
		Stage window = new Stage();

		/*Makes it so actions are focused only on the active window (I will only be able to perform
		actions on Window 2, but not perform actions on Window 1*/
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);

		window.setMinWidth(250);
		Label label = new Label();
		label.setText(message);

		Button yesButton = new Button("Yes");
		Button noButton1 = new Button("No");

		yesButton.setOnAction(e -> {
			answer = true;
			window.close();
		});

		noButton1.setOnAction(e -> {
			answer = false;
			Window3.display("Window 3", "Are you sure?");
			window.close();
		});


		//Aligns child elements vertically
		VBox layout = new VBox(10);
		layout.getChildren().addAll(label, yesButton, noButton1);
		layout.setAlignment(Pos.CENTER);
		Scene scene = new Scene(layout);
		window.setScene(scene);
		window.showAndWait();

		return answer;
	}
}
