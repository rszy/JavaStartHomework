package pl.javastart.ex3;

/**
 * Created by Rysiek on 2017-01-02.
 */
public class Circle {

    private double radius;
    private final String shape = "Jestem kołem.";

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI*Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public String getShape() {
        return shape;
    }
}
