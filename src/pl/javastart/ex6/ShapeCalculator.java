package pl.javastart.ex6;

/**
 * Created by Rysiek on 2017-01-16.
 */
public class ShapeCalculator {

    public double calculateArea(Rectangle rectangle) {
        return rectangle.getSide1()*rectangle.getSide2();
    }

    public double calculatePerimeter(Rectangle rectangle) {
        return 2*(rectangle.getSide1()+rectangle.getSide2());
    }

    public double calculateArea(Circle circle) {
        return Math.PI*Math.pow(circle.getRadius(), 2);
    }

    public double calculatePerimeter(Circle circle) {
        return 2*Math.PI*circle.getRadius();
    }

    public double calculateArea(Square square) {
        return Math.pow(square.getSide(), 2);
    }

    public double calculateParimeter(Square square) {
        return 4*square.getSide();
    }
}
