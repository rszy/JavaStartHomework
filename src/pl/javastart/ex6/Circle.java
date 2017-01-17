package pl.javastart.ex6;

/**
 * Created by Rysiek on 2017-01-16.
 */
public class Circle extends GeometricShape {

    private double radius;

    @Override
    public double calculateArea() {
        return Math.PI*Math.pow(radius, 2);
    }

    @Override
    public double calculateParimeter() {
        return 2*radius*Math.PI;
    }


    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
