package pl.javastart.ex7;

/**
 * Created by Rysiek on 2017-01-18.
 */
public class Cube extends Shape3D {

    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
