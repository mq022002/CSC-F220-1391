import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Rubber extends Application {

	private Line line;

	public void start(Stage primaryStage){
		Group root = new Group();
		Scene scene = new Scene(root, 500, 300, Color.WHITE);

		scene.setOnMousePressed(e->{
			line = new Line(e.getX(), e.getY(), e.getX(), e.getY());
			root.getChildren().add(line);
		});

		scene.setOnMouseDragged(e->{
			line.setEndX(e.getX());
			line.setEndY(e.getY());
		});

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

}
