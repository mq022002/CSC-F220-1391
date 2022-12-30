import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Dots extends Application{

	private Color[] colorList = {
			Color.RED, Color.BLUE, Color.YELLOW

	};
	private int colorNum = 0;
	public void start(Stage primaryStage){
		Group root = new Group();
		Scene scene = new Scene(root, 400, 300, Color.BLACK);
		scene.setOnMouseClicked(e->{
			if  (e.getClickCount() == 2){
				root.getChildren().clear();
			}
			else {
				Circle circle = new Circle(e.getX(), e.getY(), 10);
				circle.setFill(colorList[colorNum]);
				root.getChildren().add(circle);
				colorNum = (colorNum+1) % colorList.length;
			}
		});

		primaryStage.setScene(scene);
		primaryStage.setTitle("Dots");
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
