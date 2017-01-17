package pl.javastart.ex6;

/**
 * Created by Rysiek on 2017-01-16.
 */
public class Rectangle extends GeometricShape {

    private double side1;
    private double side2;

    @Override
    public double calculateArea() {
        return side1*side2;
    }

    @Override
    public double calculateParimeter() {
        return 2*(side1+side2);
    }


    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }
}
