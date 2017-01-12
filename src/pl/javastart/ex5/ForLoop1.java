package pl.javastart.ex5;

/**
 * Created by Rysiek on 2017-01-11.
 */
public class ForLoop1 {

    public static void main(String[] args) {

        for (int i = 0; i <=100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
