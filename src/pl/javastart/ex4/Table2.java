package pl.javastart.ex4;

import java.util.Scanner;

/**
 * Created by Rysiek on 2017-01-07.
 */
public class Table2 {

    public static void main(String[] args) {

        int[][] tabNumbers = new int[3][3];
        int[] tabSum = new int[3];
        int counter1 = 0;
        int counter2 = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (counter1 < tabNumbers.length) {
            while (counter2 < tabNumbers.length) {
                System.out.println("Podaj liczbę całkowitą");
                tabNumbers[counter1][counter2] = scanner.nextInt();
                sum = sum + tabNumbers[counter1][counter2];
                counter2++;
            }
            tabSum[counter1] = sum;
            sum = 0;
            counter2 = 0;
            counter1++;
        }
        System.out.println("Podałeś już wszystkie potrzebne liczby.");
        counter1 = 1;
        sum = 0;
        while (counter1 < tabSum.length) {
            if (tabSum[sum] < tabSum[counter1]) {
                sum = counter1;
            } else {
                sum = sum;
            }
            counter1++;
        }
        int result = sum+1;
        System.out.println("Największa suma liczb jest w wierszu "+result+" i wynosi "+tabSum[sum]);
    }
}
