package pl.javastart.ex11.zad2;

import java.sql.*;
import java.util.AbstractList;
import java.util.ArrayList;

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
        final String query = "INSERT INTO dane_pracownikow(imie, nazwisko, wiek, pensja, stanowisko) values(?, ?, ?, ?, ?)";
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
            e.printStackTrace();
        }
    }

    public ArrayList<String[]> getAll() {
        ArrayList<String[]> arrayList = new ArrayList<>();
        try {
        Statement statement = connection.createStatement();
        String query = "SELECT id, imie, nazwisko, wiek, pensja, stanowisko FROM dane_pracownikow";
        ResultSet resultSet = statement.executeQuery(query);
        while(resultSet.next()) {
            String[] strings = new String[6];
            strings[0] = String.valueOf(resultSet.getInt(1));
            strings[1] = resultSet.getString(2);
            strings[2] = resultSet.getString(3);
            strings[3] = String.valueOf(resultSet.getInt(4));
            strings[4] = String.valueOf(resultSet.getString(5));
            strings[5] = resultSet.getString(6);
            arrayList.add(strings);
        }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return arrayList;
    }
}
