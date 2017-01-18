package pl.javastart.ex7;

/**
 * Created by Rysiek on 2017-01-18.
 */
public class Circle extends GeometricShape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
