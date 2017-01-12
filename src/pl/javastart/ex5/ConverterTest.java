package pl.javastart.ex5;

/**
 * Created by Rysiek on 2017-01-11.
 */
public class ConverterTest {

    public static void main(String[] args) {

        for (int i = 1; i <= 7; i++) {
            System.out.println(i+" dzień tygodnia to "+ CalandarConverter.convertDayToString(i));
        }
    }
}
