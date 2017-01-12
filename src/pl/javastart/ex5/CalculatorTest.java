package pl.javastart.ex5;

/**
 * Created by Rysiek on 2017-01-12.
 */
public class CalculatorTest {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(5,10);
        Circle circle1 = new Circle(10);

        ShapeCalculator.rectanglePerimeter(rectangle1);
        ShapeCalculator.rectangleArea(rectangle1);
        ShapeCalculator.circlePerimeter(circle1);
        ShapeCalculator.circleArea(circle1);
    }
}
