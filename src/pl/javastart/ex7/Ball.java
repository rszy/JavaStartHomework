package pl.javastart.ex7;

/**
 * Created by Rysiek on 2017-01-18.
 */
public class Ball extends Shape3D {

    private double radius;

    public Ball(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
