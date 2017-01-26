package pl.javastart.ex8_9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Rysiek on 2017-01-26.
 */
public class List1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int input;
        do {
            System.out.println("Podaj liczbę całkowitą");
            input = scanner.nextInt();
            if (input>=0) {
                Integer integer = input;
                arrayList.add(integer);
            }
        } while (input>=0);

        String fileName = "NumbersEx8_9.txt";
        File file = new File(fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("Tworzę plik o nazwie "+fileName);
            } catch (IOException e) {
                System.out.println("Nie udało się utworzyć pliku.");
            }
        } else {
            System.out.println("Plik o nazwie"+fileName+" juz istnieje.");
        }


        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            for (Integer integer : arrayList) {
                bufferedWriter.write(String.valueOf(integer));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("Nie udało się zapis do pliku.");
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
