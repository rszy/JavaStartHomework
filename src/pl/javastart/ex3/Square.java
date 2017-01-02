package pl.javastart.ex3;

/**
 * Created by Rysiek on 2017-01-02.
 */
public class Square {

    private double side;
    private final String shape = "Jestem kwadratem.";

    public Square(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return Math.pow(side, 2);
    }

    public double getSide() {
        return side;
    }

    public String getShape() {
        return shape;
    }
}
