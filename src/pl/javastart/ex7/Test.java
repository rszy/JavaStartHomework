package pl.javastart.ex7;

/**
 * Created by Rysiek on 2017-01-18.
 */
public class Test {

    public static void main(String[] args) {

        Line2D line1 = new Line2D(0,0, 5,5);
        Circle circle1 = new Circle(10);
        Rectangle rectangle1 = new Rectangle(4,5);
        Ball ball1 = new Ball(10);
        Cube cube1 = new Cube(5);

        ShapeCalculator calculator = new ShapeCalculator();
        System.out.println("Długość linii: "+calculator.lineLength(line1));
        System.out.println("Powierzchnia koła: "+calculator.circleArea(circle1));
        System.out.println("Powierzchnia prostokąta: "+calculator.rectangleArea(rectangle1));
        System.out.println("Objętość kuli: "+calculator.ballVolume(ball1));
        System.out.println("Objętość szcześcianu: "+calculator.cubeVolume(cube1));

        Shape[] shapes = new Shape[5];
        shapes[0] = new Line2D(0,0,5,5);
        shapes[1] = new Circle(10);
        shapes[2] = new Rectangle(4,5);
        shapes[3] = new Ball(10);
        shapes[4] = new Cube(5);

        for (Shape shape : shapes) {
            if (shape instanceof Line2D) {
                double length = calculator.lineLength((Line2D)shape);
                System.out.println("Odcinek wyznaczony przez współrzędne ["
                        +((Line2D) shape).getX1()+", "+((Line2D) shape).getY1()+"] ma długość "
                        +length);
            } else if (shape instanceof GeometricShape) {
                double area = calculator.shapeArea(((GeometricShape)shape));
                    if (shape instanceof Circle) {
                        System.out.println("Koło o promieniu "+((Circle) shape).getRadius()+" ma pole równe "+area);
                    } else if (shape instanceof Rectangle) {
                        System.out.println("Prostokąt o bokach "+((Rectangle) shape).getSide1()+" i "
                                +((Rectangle) shape).getSide2()+" ma pole równe "+area);
                    }
            } else if (shape instanceof Shape3D){
                double volume = calculator.volume((Shape3D)shape);
                    if (shape instanceof Ball) {
                        System.out.println("Kula o promieniu "+((Ball) shape).getRadius()+" ma objętość równą "+volume);
                    } else if (shape instanceof Cube) {
                        System.out.println("Sześcian o boku "+((Cube) shape).getSide()+" ma objętość równą "+volume);
                    }
            }
        }
    }
}
