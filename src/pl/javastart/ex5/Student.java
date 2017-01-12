package pl.javastart.ex5;

/**
 * Created by Rysiek on 2017-01-12.
 */
public class Student extends PersonalData {

    private String whichClass;

    public void showData() {
        super.showData();
        System.out.println(whichClass);
    }

    public Student(String firstName, String lastName, String whichClass) {
        super(firstName, lastName);
        this.whichClass = whichClass;
    }
}
