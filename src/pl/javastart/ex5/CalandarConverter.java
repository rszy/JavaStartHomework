package pl.javastart.ex5;

/**
 * Created by Rysiek on 2017-01-11.
 */
public class CalandarConverter {

    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;
    public static final int SUNDAY = 7;

    public static String convertDayToString (int dayNumber) {
        String day = "";
        switch (dayNumber) {
            case MONDAY:
                day = "Poniedziałek";
                break;
            case TUESDAY:
                day = "Wtorek";
                break;
            case WEDNESDAY:
                day = "Sroda";
                break;
            case THURSDAY:
                day = "Czwartek";
                break;
            case FRIDAY:
                day = "Piątek";
                break;
            case SATURDAY:
                day = "Sobota";
                break;
            case SUNDAY:
                day = "Niedziela";
                break;
        }
        return day;
    }
}
