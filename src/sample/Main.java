package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Point2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Main extends Application {

    public static Stage root;
    public static Pane layout = new Pane();
    public static Scene scene = new Scene(layout, 600, 600);
    @Override
    public void start(Stage primaryStage) throws Exception{
        root = primaryStage;
        root.setScene(scene);
        primaryStage.setTitle("Hello World");
        primaryStage.show();


        Robot robot = new Robot();
        robot.moveTo(new Coordinate(12, 0));

        Circle point = new Circle(300 + 160, 300 + 120, 1);
        layout.getChildren().add(point);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
