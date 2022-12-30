package pp_07_15;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

public class PP_715 extends Application {

	public void start(Stage primaryStage){
		Image alien = new Image("alien.png");
		ImageView alienView = new ImageView(alien);
		Group root = new Group(alienView);
		Scene scene = new Scene(root, 1000, 600);
		scene.setOnKeyPressed(e->{
			if(e.getCode() == KeyCode.UP){
				if(alienView.getY()>0){
			alienView.setY(alienView.getY() - 10);
				}
			}
			if(e.getCode() == KeyCode.DOWN){
				if(alienView.getY()<scene.getHeight()-alien.getHeight()){
			alienView.setY(alienView.getY() + 10);
				}
			}
			if(e.getCode() == KeyCode.LEFT){
				if(alienView.getX()>0){
			alienView.setX(alienView.getX() - 10);
				}
			}
			if(e.getCode() == KeyCode.RIGHT){
				if(alienView.getX()<scene.getWidth()-alien.getWidth()){
			alienView.setX(alienView.getX() + 10);
				}
			}
		});

		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
