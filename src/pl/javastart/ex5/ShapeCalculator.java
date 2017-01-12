package pl.javastart.ex5;

/**
 * Created by Rysiek on 2017-01-12.
 */
public class ShapeCalculator {


    public static double rectanglePerimeter(Rectangle rectangle) {
        double result =  2*(rectangle.getSide1()+rectangle.getSide2());
        System.out.println("Obwód prostokąta o bokach "+rectangle.getSide1()+", "+rectangle.getSide2()+" wynosi "+result);
        return result;
    }

    public static double rectangleArea(Rectangle rectangle) {
        double result = rectangle.getSide1()*rectangle.getSide2();
        System.out.println("Pole prostokąta o bokach "+rectangle.getSide1()+", "+rectangle.getSide2()+" wynosi "+result);
        return result;
    }

    public static double circlePerimeter(Circle circle) {
        double result = 2*Math.PI*circle.getRadius();
        System.out.println("Obwód koła o promieniu "+circle.getRadius()+" wynosi "+result);
        return result;
    }

    public static double circleArea(Circle circle) {
        double result = Math.PI*Math.pow(circle.getRadius(), 2);
        System.out.println("Pole koła o promieniu "+circle.getRadius()+" wynosi "+result);
        return result;
    }
}
