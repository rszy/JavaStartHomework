package pl.javastart.ex6;

/**
 * Created by Rysiek on 2017-01-16.
 */
public class Square extends GeometricShape {

    private double side;

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double calculateParimeter() {
        return 4*side;
    }


    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }
}
