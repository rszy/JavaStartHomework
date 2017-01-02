package pl.javastart.ex3;

/**
 * Created by Rysiek on 2017-01-02.
 */
public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee("Jan", "Kowalski");
        Employee employee3 = new Employee("Paweł", "Nowak", 5800);

        System.out.println(employee1.getFirstName()+employee1.getLastName()+employee1.getSalary());
        System.out.println(employee2.getFirstName()+employee2.getLastName()+employee2.getSalary());
        System.out.println(employee3.getFirstName()+employee2.getLastName()+employee3.getSalary());
    }
}
