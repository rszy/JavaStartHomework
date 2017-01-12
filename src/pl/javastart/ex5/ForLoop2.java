package pl.javastart.ex5;

import java.util.Random;

/**
 * Created by Rysiek on 2017-01-11.
 */
public class ForLoop2 {

    public static void main(String[] args) {

        int[] numbers = new int[100];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000);
        }

        int numberLess50 = 0;
        int numberGreater50 = 0;
        int numberEven = 0;
        int numberOdd = 0;

        for (int number: numbers) {
            if (number < 50) {
                numberLess50++;
            }
            if (number > 50) {
                numberGreater50++;
            }
            if (number % 2 == 0) {
                numberEven++;
            }
            if (number % 2 != 0) {
                numberOdd++;
            }
        }
        System.out.println("Ilość liczb mniejszych od 50: "+numberLess50);
        System.out.println("Ilość liczb większych od 50: "+numberGreater50);
        System.out.println("Ilość liczb parzystych: "+numberEven);
        System.out.println("Ilość liczb nieparzystych: "+numberOdd);
    }
}
