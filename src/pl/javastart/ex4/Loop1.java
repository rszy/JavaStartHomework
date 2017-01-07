package pl.javastart.ex4;

import java.text.DecimalFormat;

/**
 * Created by Rysiek on 2017-01-05.
 */
public class Loop1 {

    public static void main(String[] args) {

        double i = 0.0;
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        while (i<3.1) {
            System.out.println(decimalFormat.format(i));
            i = i+0.1;
        }
        System.out.println("------");
        i = 0.0;
        do {
            System.out.println(decimalFormat.format(i));
            i = i+0.1;
        } while (i<3.1);
    }
}
