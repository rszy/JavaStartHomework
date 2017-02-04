package pl.javastart.ex11.zad2;

/**
 * Created by Rysiek on 2017-02-04.
 */
public class DataExportTest {

    public static void main(String[] args) {

        DataExport.dataExport();
        EmployeeDao employeeDao = new EmployeeDao();
        for (int i = 0; i < employeeDao.getAll().size(); i++) {
            for (String s : employeeDao.getAll().get(i)) {
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }
}
