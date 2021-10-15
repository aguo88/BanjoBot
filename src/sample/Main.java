package sample;

import javafx.application.Application;
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
        Coordinate p1 = new Coordinate(-10, 0);
//        System.out.println(p1.getX());
//        System.out.println(p1.getY());
        robot.moveTo(p1);

        Circle point = new Circle(300 + 160, 300 + 160, 1);
        layout.getChildren().add(point);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
