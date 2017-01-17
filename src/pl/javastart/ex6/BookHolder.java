package pl.javastart.ex6;

import java.text.BreakIterator;

/**
 * Created by Rysiek on 2017-01-17.
 */
public class BookHolder {

    Book[] books = new Book[3];
    boolean contains = false;

    public boolean contains(Book book) {
       for (int i = 0; i < books.length; i++) {
           if (book.equals(books[i])){
               System.out.println("Taka książka już istnieje w bazie.");
               break;
           }
       }
       return contains;
    }

    public void add(Book book) {
        if (contains) {
            System.out.println("Nie możesz dodać tej książki");
        } else {
            for (int i = 0; i < books.length; i++) {
                if (books[i] == null) {
                    books[i] = book;
                    break;
                }
            }
        }
    }

    public void printAll() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i]);
            }
        }
    }
}
