import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

public class Alien extends Application{

	public void start(Stage primaryStage){

		Image alien = new Image("alien.png");
		ImageView alienView = new ImageView(alien);

		Group root = new Group(alienView);
		Scene scene = new Scene(root, 600, 400);

		scene.setOnKeyPressed(e->{
			if(e.getCode() == KeyCode.UP)
				alienView.setY(alienView.getY() - 10);
			if(e.getCode() == KeyCode.DOWN)
				alienView.setY(alienView.getY() + 10);

			if(e.getCode() == KeyCode.LEFT)
				alienView.setX(alienView.getX() - 10);
			if(e.getCode() == KeyCode.RIGHT)
				alienView.setX(alienView.getX() + 10);
		});

		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}

}
