package pl.javastart.ex5;

/**
 * Created by Rysiek on 2017-01-12.
 */
public class Teacher extends PersonalData {

    private String whichSubject;

    @Override
    public void showData() {
        super.showData();
        System.out.println(whichSubject);
    }

    public Teacher(String firstName, String lastName, String whichSubject) {
        super(firstName, lastName);
        this.whichSubject = whichSubject;
    }


}
