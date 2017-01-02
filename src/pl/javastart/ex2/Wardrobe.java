package pl.javastart.ex2;

/**
 * Created by Rysiek on 2016-12-27.
 */
public class Wardrobe {

    String name;
    float hight;
    float width;
    float weight;
    int drawersNumber;
    int doorNumber;
    String material;
    String color;
    double price;

    Wardrobe (String nm, float hght, float wdth, float wght, int dsNr, int drNr, String m, String c, double p) {
        name = nm;
        hight = hght;
        width = wdth;
        weight = wght;
        drawersNumber = drNr;
        doorNumber = drNr;
        material = m;
        color = c;
        price = p;
    }
}
