package pl.javastart.ex7;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Rysiek on 2017-01-20.
 */
public class NumbersSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Podaj ilość liczb, którą chcesz wprowadzić:");
        try {
            int nrsAmount = scanner.nextInt();
            double[] table = new double[nrsAmount];
            double sum = 0;
            for (int i = 0; i < table.length; i++) {
                table[i] = random.nextDouble();
                sum = sum + table[i];
                System.out.println("Suma to: " + sum);
            }
        } catch (InputMismatchException | NegativeArraySizeException e) {
            System.out.println("Nieprawidłowa wartość. Podaj liczbę całkowitą większą od zera.");
        }
    }
}
