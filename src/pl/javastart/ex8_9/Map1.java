package pl.javastart.ex8_9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Rysiek on 2017-01-26.
 */
public class Map1 {

    public static void main(String[] args) {

        HashMap<String, Product> hashMap = new HashMap<>();
        Product product1 = new Product("Mleko", "Mlekovita", 3.99);
        Product product2 = new Product("Masło", "Mlekpol", 4.50);
        Product product3 = new Product("Chleb", "Jul-Ka", 3.50);

        hashMap.put(product1.getName(), product1);
        hashMap.put(product2.getName(), product2);
        hashMap.put(product3.getName(), product3);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę produktu: ");
        String key = scanner.nextLine();
        if (hashMap.containsKey(key)) {
            System.out.println(hashMap.get(key).toString());
        } else {
            System.out.println("Nie ma takiego produktu.");
        }

        String fileName = "ProductsEx8_9";
        File file = new File(fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Nie udało się utworzyć pliku o nazwie "+fileName);
            }
        } else {
            System.out.println("Plik o nazwie "+fileName+" już istnieje.");
        }

        Collection<Product> mapValues = hashMap.values();
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            for (Product mapValue : mapValues) {
                bufferedWriter.write(mapValue.getName()+";"+mapValue.getProducer()+";"+mapValue.getPrice());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
