package pl.javastart.ex2;

/**
 * Created by Rysiek on 2016-12-27.
 */
public class ShapeCalculatorTest {
    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();

        double poleKwadratu = calculator.square(3.0);
        System.out.println("Pole kwadratu: "+poleKwadratu);

        double poleKola = calculator.circle(2.0);
        System.out.println("Pole koła: "+poleKola);

        double obwodTrojkata = calculator.triangle(3.5, 4.5, 5.0);
        System.out.println("Obwód trójkąta: "+obwodTrojkata);

        double obwodProstokata = calculator.rectangle(12.0, 8.0);
        System.out.println("Obwód prostokąta: "+obwodProstokata);
    }
}
