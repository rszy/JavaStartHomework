package pl.javastart.ex4;

import java.util.Scanner;

/**
 * Created by Rysiek on 2017-01-07.
 */
public class Names {

    public static void main(String[] args) {

        String[] names = new String[5];
        int licznik = 0;
        Scanner scanner = new Scanner(System.in);

        while (licznik < names.length) {
            System.out.println("Podaj imię osoby nr "+ ++licznik);
            licznik--;
            names[licznik] = scanner.nextLine();
            licznik++;
        }

        while (licznik != 0) {
            System.out.println("Cześć "+names[licznik-1]);
            licznik--;
        }
    }
}
