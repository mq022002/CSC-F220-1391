package communicatingbetweenwindows;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class Window3 {

	static boolean answer;

	public static boolean display(String title, String message) {
		Stage window = new Stage();
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinWidth(250);
		Label label = new Label();
		label.setText(message);

		Button noButton2 = new Button("No");
		Button noButton3 = new Button("No");

		noButton2.setOnAction(e -> {
			Window2.display("Window 2", "Is this Window 2");
			window.close();
		});

		noButton3.setOnAction(e -> {
			Window2.display("Window 2", "Is this Window 2");
			window.close();
		});

		VBox layout = new VBox(10);
		layout.getChildren().addAll(label, noButton2, noButton3);
		layout.setAlignment(Pos.CENTER);
		Scene scene = new Scene(layout);
		window.setScene(scene);
		window.showAndWait();

		return false;
	}
}
