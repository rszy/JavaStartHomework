package pl.javastart.ex6;

/**
 * Created by Rysiek on 2017-01-16.
 */
public class GeometricShapeTest {

    public static void main(String[] args) {


        GeometricShape[] geometricShapes = new GeometricShape[6];
        geometricShapes[0] = new Rectangle(4.0,5.0);
        geometricShapes[1] = new Rectangle(7.0, 8.0);
        geometricShapes[2] = new Circle(1.5);
        geometricShapes[3] = new Circle(5.0);
        geometricShapes[4] = new Square(25.0);
        geometricShapes[5] = new Square(35.0);

        for (GeometricShape geometricShape : geometricShapes) {
            System.out.println("Pole: "+geometricShape.calculateArea());
            System.out.println("Obwód: "+geometricShape.calculateParimeter());
        }

    }
}
