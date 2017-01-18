package pl.javastart.ex7;

/**
 * Created by Rysiek on 2017-01-18.
 */
public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {

    @Override
    public double volume(Shape3D shape) {
        double volume = 0;
        if (shape instanceof Ball) {
            volume = Math.PI*Math.pow(((Ball)shape).getRadius(), 3)*4/3;
        } else if (shape instanceof Cube) {
            volume = Math.pow(((Cube) shape).getSide(), 3);
        }
        return volume;
    }

    @Override
    public double shapeArea(GeometricShape shape) {
        double area = 0;
        if (shape instanceof Circle) {
            area = Math.PI*Math.pow(((Circle)shape).getRadius(), 2);
        } else if (shape instanceof Rectangle) {
            area = ((Rectangle)shape).getSide1()*((Rectangle)shape).getSide2();
        }
        return area;
    }

    @Override
    public double circleArea(Circle circle) {
        return Math.PI*Math.pow(circle.getRadius(), 2);
    }

    @Override
    public double ballVolume(Ball ball) {
        return Math.PI*Math.pow(ball.getRadius(), 3)*4/3;
    }

    @Override
    public double cubeVolume(Cube cube) {
        return Math.pow(cube.getSide(), 3);
    }

    @Override
    public double rectangleArea(Rectangle rectangle) {
        return rectangle.getSide1()*rectangle.getSide2();
    }
}
