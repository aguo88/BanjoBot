package sample;

public class Coordinate {

    private double X;
    private double Y;

    public void setX(double x) {
        X = x;
    }

    public void setY(double y) {
        Y = y;
    }

    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }

    public Coordinate() {

    }

    public Coordinate(double x,double y) {
        X = x;
        Y = y;
    }
}
