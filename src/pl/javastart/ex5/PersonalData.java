package pl.javastart.ex5;

/**
 * Created by Rysiek on 2017-01-12.
 */
public class PersonalData {

    private String firstName;
    private String lastName;

    public void showData() {
        System.out.print(firstName+" "+lastName+" ");
    }

    public PersonalData(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
