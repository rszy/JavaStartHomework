package pl.javastart.ex5;

/**
 * Created by Rysiek on 2017-01-11.
 */
public class ForLoop3 {

    public static void main(String[] args) {

        int[][] numbers = new int[4][4];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = j + i;
            }
        }

        for (int[] number1: numbers){
            for (int number2: number1) {
                System.out.print(number2);
            }
            System.out.println();
        }
    }
}
