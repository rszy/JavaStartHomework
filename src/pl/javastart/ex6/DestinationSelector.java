package pl.javastart.ex6;

import java.util.Scanner;

/**
 * Created by Rysiek on 2017-01-17.
 */
public class DestinationSelector {

    public static void main(String[] args) {

        System.out.println("Oto wszystkie możliwe kierunki podróży: ");
        Destinations[] destinationss = Destinations.values();
        for (Destinations destinations : destinationss) {
            System.out.println(destinations);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Który kierunek wybierasz?");
        Destinations destinations = Destinations.valueOf(input.nextLine());
        System.out.println("Ok, więc idziemy na "+destinations.getDestination());
        System.out.println(Destinations.convert(5));

    }
}
