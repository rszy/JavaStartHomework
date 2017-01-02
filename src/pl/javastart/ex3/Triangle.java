package pl.javastart.ex3;

/**
 * Created by Rysiek on 2017-01-02.
 */
public class Triangle {

    private double side1;
    private double side2;
    private double side3;
    private final String shape = "Jestem trójkątem.";

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double calculatePerimeter() {
        return side1+side2+side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public String getShape() {
        return shape;
    }
}
