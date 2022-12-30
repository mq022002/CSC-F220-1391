package pp_07_11;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PP_711 extends Application{
	private Group root;
	public void start(Stage primaryStage) {

		root = new Group();
		Scene scene = new Scene(root, 1280, 720);
		scene.setOnMouseMoved(e->{
			if(e.getX()<scene.getWidth()/2) {
				scene.setFill(Color.RED);
			}
			else {
				scene.setFill(Color.GREEN);
			}
		});
		primaryStage.setScene(scene);;
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
