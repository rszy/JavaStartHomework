package pl.javastart.ex3;

/**
 * Created by Rysiek on 2017-01-02.
 */
public class TriangleVerify {

    public boolean isRightTriangle(Triangle triangle) {
        if (Math.pow(triangle.getSide1(), 2) == Math.pow(triangle.getSide2(), 2) + Math.pow(triangle.getSide3(), 2)
                || Math.pow(triangle.getSide2(), 2) == Math.pow(triangle.getSide1(), 2) + Math.pow(triangle.getSide3(), 2)
                || Math.pow(triangle.getSide3(), 2) == Math.pow(triangle.getSide2(), 2) + Math.pow(triangle.getSide1(), 2)) {
            boolean result = true;
            System.out.println(result);
            return result;
        } else {
            boolean result = false;
            System.out.println(result);
            return result;
        }
    }
}
