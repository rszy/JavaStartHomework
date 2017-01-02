package pl.javastart.ex3;

/**
 * Created by Rysiek on 2017-01-02.
 */
public class Televisor {

    private boolean ifTurnOn;

    public void turnOn() {
        ifTurnOn = true;
        System.out.println("Włączam telewizor");
    }

    public void turnOff() {
        ifTurnOn = false;
        System.out.println("Wyłączam telewizor");
    }

    public void showStatus() {
        if(ifTurnOn == false) {
            System.out.println("Telewizor jest wyłączony");
        } else {
            System.out.println("Telewizor jest włączony");
        }
    }
}
