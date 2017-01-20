package pl.javastart.ex7;

import java.util.Scanner;

/**
 * Created by Rysiek on 2017-01-20.
 */
public class Test2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię:");
        String inputFirstName = scanner.nextLine();
        System.out.println("Podaj nazwisko:");
        String inputLastName = scanner.nextLine();
        System.out.println("Podaj wiek:");
        int inputAge = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj pesel");
        String inputPesel = scanner.nextLine();

        Person person1;
        try {
            person1 = new Person(inputFirstName, inputLastName, inputAge, inputPesel);
            System.out.println(person1.toString());
        } catch (NameUndefinedException e) {
            System.out.println(e.getMessage());
        } catch (IncorrectAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
