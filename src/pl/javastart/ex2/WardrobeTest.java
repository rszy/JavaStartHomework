package pl.javastart.ex2;

/**
 * Created by Rysiek on 2016-12-27.
 */
public class WardrobeTest {
    public static void main(String[] args) {

        Wardrobe w1 = new Wardrobe("Flip", 2.0f, 1.5f, 21.5f, 3, 2, "oak", "brown", 899.00);
        Wardrobe w2 = new Wardrobe("Flap",2.2f, 2.4f, 25.0f, 6, 3, "mahogany", "black", 1895.00);

        System.out.println("Informacje o szafie: \n " +
                "nazwa: "+w1.name+
                "\n wysokość "+w1.hight+
                "\n szerokość "+w1.width+
                "\n cieżar: "+w1.weight+
                "\n liczba szuflad "+w1.drawersNumber+
                "\n liczba drzwi "+w1.doorNumber+
                "\n materiał: "+w1.material+
                "\n kolor: "+w1.color+
                "\n cena: "+w1.price+"\n ");

        System.out.println("Informacje o szafie: \n " +
                "nazwa: "+w2.name+
                "\n wysokość "+w2.hight+
                "\n szerokość "+w2.width+
                "\n cieżar: "+w2.weight+
                "\n liczba szuflad "+w2.drawersNumber+
                "\n liczba drzwi "+w2.doorNumber+
                "\n materiał: "+w2.material+
                "\n kolor: "+w2.color+
                "\n cena: "+w2.price+"\n ");
    }
}
