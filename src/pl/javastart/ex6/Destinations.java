package pl.javastart.ex6;

/**
 * Created by Rysiek on 2017-01-17.
 */
public enum Destinations {

    NORTH("Północ"),
    EAST("Wschód"),
    SOUTH("Południe"),
    WEST("Zachód"),
    UNDEFINED("nieznany");

    public final String destination;

    private Destinations(String destination) {
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    public static Destinations convert(int num) {

        switch (num) {
            case 0:
                return NORTH;
            case 1:
                return EAST;
            case 2:
                return SOUTH;
            case 3:
                return WEST;
        }
        return UNDEFINED;
    }
}
