package pl.javastart.ex2;

/**
 * Created by Rysiek on 2016-12-27.
 */
public class ShapeCalculator {

    double square (double side) {
        return Math.pow(side, 2);
    }

    double circle (double radius) {
        return Math.PI*Math.pow(radius, 2);
    }

    double triangle (double a, double b, double c) {
        return a+b+c;
    }

    double rectangle (double a, double b) {
        return 2*(a+b);
    }
}
