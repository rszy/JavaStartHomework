package pl.javastart.ex4;

import java.util.Scanner;

/**
 * Created by Rysiek on 2017-01-07.
 */
public class CoordinatesXY {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj współrzędną X osi odciętych:");
        double x = input.nextDouble();
        System.out.println("Podaj współrzędna Y osi rzędnych:");
        double y = input.nextDouble();

        System.out.println("Podałeś liczby: "+x+", "+y);
        String part = "";
        if (x==0 && y==0) {
            part = "w początku";
        } else if (x==0) {
            part = "na osi Y";
        } else if (y==0) {
            part = "na osi X";
        } else if (x>0 && y>0) {
            part = "w I ćwiartce";
        } else if (x<0 && y>0) {
            part = "w II ćwiartce";
        } else if (x<0 && y<0) {
            part = "w III ćwiartce";
        } else if (x>0 && y<0) {
            part = "w IV ćwiartce";
        }
        System.out.println("Punkt ("+x+", "+y+") leży "+part+" układu współrzędnych.");
    }
}
