package pl.javastart.ex3;

/**
 * Created by Rysiek on 2017-01-02.
 */
public class TelevisorTest {

    public static void main(String[] args) {

        Televisor tv = new Televisor();
        tv.showStatus();
        tv.turnOn();
        tv.showStatus();
        tv.turnOff();
        tv.showStatus();
    }

}
