package pl.javastart.ex3;

/**
 * Created by Rysiek on 2017-01-02.
 */
public class ShapeCalculator {

    public double squareArea(Square square) {
        double result = Math.pow(square.getSide(), 2);
        System.out.println(square.getShape()+" Moja powierzchnia to: "+result);
        return result;
    }

    public double circleArea(Circle circle) {
        double result = Math.PI*Math.pow(circle.getRadius(), 2);
        System.out.println(circle.getShape()+" Moja powierzchnia to: "+result);
        return result;
    }

    public double trianglePerimeter(Triangle triangle){
        double result = triangle.getSide1()+triangle.getSide2()+triangle.getSide3();
        System.out.println(triangle.getShape()+" Mój obwód to: "+result);
        return result;
    }

    public double rectPerimeter(Rectangle rectangle) {
        double result = 2*(rectangle.getSide1()+rectangle.getSide2());
        System.out.println(rectangle.getShape()+" Mój obwód to: "+result);
        return result;
    }
}
