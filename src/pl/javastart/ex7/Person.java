package pl.javastart.ex7;

/**
 * Created by Rysiek on 2017-01-20.
 */
public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Person(String firstName, String lastName, int age, String pesel) throws NameUndefinedException, IncorrectAgeException {
        if (firstName.length()<2 || firstName == null) {
            throw new NameUndefinedException("Nieprwidłowe imię.");
        } else {
            this.firstName = firstName;
        }
        if (lastName.length()<2 || lastName == null) {
            throw new NameUndefinedException("Nieprwidłowe nazwisko.");
        } else {
            this.lastName = lastName;
        }
        if (age < 1) {
            throw new IncorrectAgeException("Nieprawidłowy wiek");
        } else {
            this.age = age;
        }
        this.pesel = pesel;
    }

    public String toString() {
        return firstName+" "+lastName+" "+age+" "+pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
}
