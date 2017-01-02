package pl.javastart.ex3;

/**
 * Created by Rysiek on 2017-01-02.
 */
public class TriangleTest {

    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(3, 4, 5);
        TriangleVerify triangleVerify1 = new TriangleVerify();
        triangleVerify1.isRightTriangle(triangle1);
    }

}
