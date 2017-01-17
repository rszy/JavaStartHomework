package pl.javastart.ex6;

/**
 * Created by Rysiek on 2017-01-17.
 */
public class BookTest {

    public static void main(String[] args) {

        Book book1 = new Book("Platon", "Dialogi", 45.50);
        Book book2 = new Book("Arystoteles", "Metafizyka", 39.90);
        Book book3 = new Book("Spinoza", "Etyka", 42.00);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        System.out.println("Czy book1 = book2 " + book1.equals(book2));
        System.out.println("Czy book1 = book3 " + book1.equals(book3));
        System.out.println("Czy book2 = book3 " + book2.equals(book3));

        boolean ifTrue = (book1.equals(book2) || book1.equals(book3) || book2.equals(book3));
        System.out.println("Czy któraś z trzech książek jest taka sama: "+ifTrue);

        BookHolder bookHolder = new BookHolder();
        bookHolder.add(book1);
        bookHolder.add(book2);
        bookHolder.add(book3);
        bookHolder.printAll();
    }
}
