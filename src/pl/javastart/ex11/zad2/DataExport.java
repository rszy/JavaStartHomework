package pl.javastart.ex11.zad2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Rysiek on 2017-02-04.
 */
public class DataExport {

    public static void dataExport() {

        FileReader fileReader = null;
        try {
            fileReader = new FileReader("EmployeeEx11.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            EmployeeDao employeeDao = new EmployeeDao();
            while ((line = bufferedReader.readLine()) != null) {
                employeeDao.addEmployee(line.split(";"));
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
