package pl.javastart.ex3;

/**
 * Created by Rysiek on 2017-01-02.
 */
public class ShapeCalculatorTest {

    public static void main(String[] args) {

        Square square1 = new Square(5.0);
        Circle circle1 = new Circle(2.0);
        Triangle triangle1 = new Triangle(2, 3, 4);
        Rectangle rectangle1 = new Rectangle(4,5);

        ShapeCalculator shapeCalculator1 = new ShapeCalculator();
        shapeCalculator1.squareArea(square1);
        shapeCalculator1.circleArea(circle1);
        shapeCalculator1.trianglePerimeter(triangle1);
        shapeCalculator1.rectPerimeter(rectangle1);

        System.out.println(square1.calculateArea());
    }
}
