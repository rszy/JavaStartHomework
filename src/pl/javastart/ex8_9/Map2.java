package pl.javastart.ex8_9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Rysiek on 2017-01-27.
 */
public class Map2 {

    public static void main(String[] args) {

        HashMap<String, Product> hashMap = new HashMap<>();
        File file = new File("InputProductsEx8_9.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            String[] tab = nextLine.split(" ");
            double price = Double.valueOf(tab[2]);
            hashMap.put(tab[0], new Product(tab[0], tab[1], price));
        }
        scanner.close();

        Collection<Product> products = hashMap.values();
        for (Product product : products) {
            System.out.println(product);
        }

    }
}
