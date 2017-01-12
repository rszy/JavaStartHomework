package pl.javastart.ex5;

/**
 * Created by Rysiek on 2017-01-12.
 */
public class School {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Anna", "Kosińska", "Matematyka");
        Student student1 = new Student("Janek", "Obibok", "6A");

        teacher1.showData();
        student1.showData();
    }
}
