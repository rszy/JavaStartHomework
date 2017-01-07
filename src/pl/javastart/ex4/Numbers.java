package pl.javastart.ex4;

import java.util.Scanner;

/**
 * Created by Rysiek on 2017-01-07.
 */
public class Numbers {

    public static void main(String[] args) {

        boolean verify = false;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Podaj liczbę całkowitą:");
            int inputNumber = scanner.nextInt();
            if (inputNumber<100) {
                System.out.println("Podana liczba jest za mała");
            } else if (inputNumber>200) {
                System.out.println("Podana liczba jest za duża");
            } else if (inputNumber%3 != 0) {
                System.out.println("Podana liczba nie dzieli się przez 3");
            } else {
                verify = true;
                System.out.println("Podana liczba jest ok");
            }
        } while (verify != true);
    }
}
