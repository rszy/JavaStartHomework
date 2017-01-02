package pl.javastart.ex3;

/**
 * Created by Rysiek on 2017-01-02.
 */
public class Rectangle {

    private double side1;
    private double side2;
    private final String shape = "Jestem prostokątem.";

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double calculatePerimeter() {
        return 2*(side1+side2);
    }

    public double getSide1() {

        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public String getShape() {
        return shape;
    }
}
