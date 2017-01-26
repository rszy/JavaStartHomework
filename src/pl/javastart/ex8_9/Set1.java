package pl.javastart.ex8_9;

import java.util.Random;
import java.util.TreeSet;

/**
 * Created by Rysiek on 2017-01-26.
 */
public class Set1 {


    public static void main(String[] args) {

        TreeSet treeSet = new TreeSet();
        Random random = new Random();
        int setSize = 50;
        int sum = 0;
        double avarage = 0;

        for (int i = 0; i < setSize; i++) {
            int input = (random.nextInt(1000));
            treeSet.add(input);
            sum = sum + input;
        }
        avarage = sum/setSize;
        System.out.println("Najmniejsza liczba to: "+treeSet.first());
        System.out.println("Największa liczba to: "+treeSet.last());
        System.out.println("Średnia wartość wynosi: "+avarage);

    }
}
