import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Collector extends Application{

	public static void main(String[] args){
		launch(args);
	}

	public void start(Stage mainStage){
		mainStage.setTitle("Collectable Game by Matthew Quijano");
		mainStage.setResizable(false);

		BorderPane root = new BorderPane();

		// Player //
		Sprite player = new Sprite();
		player.position.set(500, 500);
		player.setImage("turtle.png");

		// Player Speed //
		player.velocity.set(0, 0);
		double speed = 70;

		// Collectables //
		ArrayList<Sprite> collectableList = new ArrayList<Sprite>();
		int collectableCount = 30;

		for(int n = 0; n < collectableCount; n++){

			Sprite collectable = new Sprite();

			// Position of Collectables //
			double x = Math.random() * 350 + Math.random() * 260;
			double y = Math.random() * 210 + Math.random() * 350;

			collectable.position.set(x, y);
			collectable.setImage("seashell.png");

			collectableList.add(collectable);
		}

		// Music //
		Media media = new Media(Paths.get("nocturne_op9_no2.mp3").toUri().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		mediaPlayer.play();

		// Change Player Appearance and Change Music //
		Menu skins = new Menu("Current Player Skin");
		Menu backgrounds = new Menu("Current Background");
		Menu music = new Menu("Current Music");

		MenuItem turtleSkin = new MenuItem("Turtle (Default)");
		MenuItem crabSkin = new MenuItem("Crab");
		MenuItem jellyfishSkin = new MenuItem("Jellyfish");
		MenuItem octopusSkin = new MenuItem("Octopus");

		MenuItem beachbg = new MenuItem("Beach (Default)");
		MenuItem spacebg = new MenuItem("Space");

		MenuItem clairdelune = new MenuItem("Clair de Lune");
		MenuItem nocturne = new MenuItem("Nocturne Op.9 No.2 (Default)");

		turtleSkin.setOnAction(e -> {
			player.setImage("turtle.png");
		});
		crabSkin.setOnAction(e -> {
			player.setImage("crab.png");
		});
		jellyfishSkin.setOnAction(e -> {
			player.setImage("jellyfish.png");
		});
		octopusSkin.setOnAction(e -> {
			player.setImage("octopus.png");
		});

		beachbg.setOnAction(e -> {

		});

		spacebg.setOnAction(e -> {

		});


//		clairdelune.setOnAction(e -> {
//			Media media = Media(Paths.get("clairdelune.mp3").toUri().toString());
//		});
//		
//		nocturne.setOnAction(e -> {
//			Media media = Media(Paths.get("nocturne_op9_no2.mp3").toUri().toString());
//		});

		skins.getItems().add(turtleSkin);
		skins.getItems().add(crabSkin);
		skins.getItems().add(jellyfishSkin);
		skins.getItems().add(octopusSkin);

		backgrounds.getItems().add(beachbg);
		backgrounds.getItems().add(spacebg);

		music.getItems().add(clairdelune);
		music.getItems().add(nocturne);

		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().add(skins);
		menuBar.getMenus().add(backgrounds);
		menuBar.getMenus().add(music);

		// Scene //
		root.setTop(menuBar);
		Scene mainScene = new Scene(root);

		mainStage.setScene(mainScene);

		Canvas canvas = new Canvas(600, 600);

		GraphicsContext gc = canvas.getGraphicsContext2D();

		root.setCenter(canvas);
		gc.setFill(Color.BLUE);
		gc.fillRect(0, 0, 600, 600);

		ArrayList<String> inputList = new ArrayList<String>();

		// Record KeyPressed Status //
		mainScene.setOnKeyPressed(
				(KeyEvent event) ->{

					String keyName = event.getCode().toString();
					if (!inputList.contains(keyName))
						inputList.add(keyName);
				});

		mainScene.setOnKeyReleased(
				(KeyEvent event) ->{

					String keyName = event.getCode().toString();
					inputList.remove(keyName);
				});

		AnimationTimer gameloop = new AnimationTimer(){

			public void handle(long nanotime){

				// Inputs //
				if(inputList.contains("LEFT"))
					player.velocity.add(-speed, 0);
				if(inputList.contains("RIGHT"))
					player.velocity.add(speed, 0);
				if(inputList.contains("UP"))
					player.velocity.add(0, -speed);
				if(inputList.contains("DOWN"))
					player.velocity.add(0, speed);

				player.velocity.multiply(1/60.0);
				player.position.add(player.velocity);

				// Remove/Collect Collectable //
				for(int s = 0; s < collectableList.size(); s++){

					Sprite collectable = collectableList.get(s);

					if(player.overlaps(collectable))
						collectableList.remove(collectable);
				}

				// Clears Canvas //
				gc.setFill(Color.LIGHTBLUE);
				gc.fillRect(0, 0, 600, 600);

				// Draw Collectables //
				for(Sprite collectable : collectableList){

					collectable.render(gc);
				}

				// Draw Player //
				player.render(gc);

				// Score / Win //
				int collectableLeft = collectableList.size();

				gc.setFont(new Font("Arial", 24));
				gc.setStroke(Color.BLACK);
				gc.setFill(Color.BLACK);

				if(collectableLeft > 0){

					String text = "Objects left: " + collectableLeft;

					gc.strokeText(text, 20, 40);
					gc.fillText(text, 20, 40);

				}

				else{
					String text = "Great job! You have collected all " + collectableCount + " objects!";

					gc.strokeText(text, 20, 40);
					gc.fillText(text, 20, 40);
				}
			}
		};

		gameloop.start();
		mainStage.show();
	}
}