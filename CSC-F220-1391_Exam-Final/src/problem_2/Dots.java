package problem_2;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Dots extends Application{

	private Color[] colorList = {
			Color.RED, Color.BLUE, Color.YELLOW, Color.ALICEBLUE, Color.BURLYWOOD, Color.DARKGRAY
	};

	private int colorNum = 0;

    Group root, circlesGroup;
    Button clearBtn;

    @Override
    public void start(Stage stage) {

        root = new Group();

        circlesGroup = new Group();

        Scene scene = new Scene(root, 600, 600, Color.BLACK);

        clearBtn = new Button("Clear");
        clearBtn.setOnAction(x -> circlesGroup.getChildren().clear());

        root.getChildren().add(circlesGroup);

        scene.setOnMousePressed(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent  event) {

                double x = event.getSceneX();
                double y = event.getSceneY();

                Circle circle = new Circle();
                circle.setCenterX(x);
                circle.setCenterY(y);
                circle.setRadius(Math.random() * 100 + 20);
				circle.setFill(colorList[colorNum]);
				circlesGroup.getChildren().add(circle);
				colorNum = (colorNum+1) % colorList.length;
            }
        });

        root.getChildren().add(clearBtn);

        clearBtn.setLayoutX(250);
        clearBtn.setLayoutY(250);
        clearBtn.setMinWidth(100);
        clearBtn.setMinHeight(100);

        stage.setTitle("Dots");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String args[]) {
        launch(args);
    }
}