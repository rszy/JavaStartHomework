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
        int sum = 0;
        double avarage = 0;

        while (treeSet.size()<50){
            int input = (random.nextInt(1000));
            treeSet.add(input);
        }

        for (Object o : treeSet) {
            sum = sum + (int)o;
        }

        System.out.println(treeSet.size());
        avarage = sum/treeSet.size();
        System.out.println("Najmniejsza liczba to: "+treeSet.first());
        System.out.println("Największa liczba to: "+treeSet.last());
        System.out.println("Średnia wartość wynosi: "+avarage);

    }
}
