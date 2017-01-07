package pl.javastart.ex4;

/**
 * Created by Rysiek on 2017-01-05.
 */
public class Table1 {

    public static void main(String[] args) {

        String[] tab1 = new String[3];
        tab1[0] = "Kasia";
        tab1[1] = "Basia";
        tab1[2] = "Zosia";

        System.out.println(tab1[0]);
        System.out.println(tab1[1]);
        System.out.println(tab1[2]);

        int[] tab2 = new int[5];
        tab2[0] = 1;
        tab2[1] = 1;
        tab2[2] = 2;
        tab2[3] = 3;
        tab2[4] = 5;

        int sum = tab2[0]+tab2[2]+tab2[4];

        System.out.println(sum);
    }
}
