package sample;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;

public class Robot {
    public final double a1 = 8;
    public final double a2 = 6;
    public final double scale = 20;

    public double q1 = 0, q2 = 0;

    public Rectangle link1, link2;

    public Coordinate currentCoord;

    public Robot() {
        link1 = new Rectangle(300,300,a1 * scale,2);
        link2 = new Rectangle(link1.getX() + (Math.cos(q1) * a1 * scale),link1.getY() + (Math.sin(q1) * a1 * scale),a2 * scale,2);
        link1.setFill(Color.GREEN);
        link2.setFill(Color.RED);
        Main.layout.getChildren().addAll(link1, link2);
    }

    public void moveTo(Coordinate target) {
        double Q2 = Math.acos((Math.pow(target.getX(),2) + Math.pow(target.getY(),2) - Math.pow(a1,2) - Math.pow(a2,2))/(2 * a1 * a2));
        System.out.println(Math.toDegrees(Q2));
        double Q1 = Math.atan(target.getY()/target.getX()) - Math.atan((a2 * Math.sin(Q2))/(a1 + (a2 * Math.cos(Q2))));
        System.out.println(Math.toDegrees(Q1));
        Rotate rotate1 = new Rotate(Math.toDegrees(q1 + Q1), link1.getX(), link1.getY());
        q1 = Q1;
        link1.getTransforms().add(rotate1);
        refresh();
        Rotate rotate2 = new Rotate(Math.toDegrees(Q2 + q1), link2.getX(), link2.getY());
        q2 = Q2;
        link2.getTransforms().add(rotate2);
    }

    public void refresh() {
        link2.setX(link1.getX() + (Math.cos(q1) * a1 * scale));
        link2.setY(link1.getY() + (Math.sin(q1) * a1 * scale));
    }

}
