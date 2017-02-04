package pl.javastart.ex11.zad2;

import java.sql.*;

/**
 * Created by Rysiek on 2017-02-04.
 */
public class EmployeeDao {

    private static final String URL = "jdbc:mysql://localhost:3306/pracownicy?characterEncoding=utf8";
    private static final String USER = "root";
    private static final String PASS = "prolog2016";
    private Connection connection;

    public EmployeeDao() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException e) {
            System.out.println("No driver found");
        } catch (SQLException e) {
            System.out.println("Could not establish connection");
        }
    }

    public void addEmployee(String[] strings) {
        final String query = "INSERT INTO pracownicy(imie, nazwisko, wiek, pensja, stanowisko) values(?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, strings[0]);
            preparedStatement.setString(2, strings[1]);
            preparedStatement.setInt(3, Integer.parseInt(strings[2]));
            preparedStatement.setDouble(4, Double.parseDouble(strings[3]));
            preparedStatement.setString(5, strings[4]);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Nie dodano do bazy żadnego pracownika.");
        }
    }
}
