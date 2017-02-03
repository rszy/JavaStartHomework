package pl.javastart.ex11;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by Rysiek on 2017-02-02.
 */
public class MysqlCityDao implements CityDao {

    private static final String URL = "jdbc:mysql://localhost:3306/world?characterEncoding=utf8";
    private static final String USER = "root";
    private static final String PASS = "prolog2016";
    private Connection connection;

    public MysqlCityDao() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException e) {
            System.out.println("No driver found");
        } catch (SQLException e) {
            System.out.println("Could not establish connection");
        }
    }

    @Override
    public City searchByName(String name) {
        final String query = "SELECT ID, Name, CountryCode, District, Population FROM world.city WHERE Name=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);
            ResultSet result = preparedStatement.executeQuery();
            if (result.next()) {
                City city = new City();
                city.setID(result.getLong("ID"));
                city.setName(result.getString("Name"));
                city.setCountryCode(result.getString("CountryCode"));
                city.setDistrict(result.getString("District"));
                city.setPopulation(result.getInt("Population"));
                return city;
            }
        } catch (SQLException e) {
            System.out.println("Nie odnaleziono wskazanego miasta.");
        } return null;
    }

    @Override
    public ArrayList<City> searchByCountryCode(String countryCode) {
        ArrayList<City> cities = new ArrayList<>();
        final String query = "SELECT ID, Name, CountryCode, District, Population FROM city WHERE CountryCode=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, countryCode);
            ResultSet result = preparedStatement.executeQuery();
            while (result.next()) {
                City city = new City();
                city.setID(result.getLong("ID"));
                city.setName(result.getString("Name"));
                city.setCountryCode(result.getString("CountryCode"));
                city.setDistrict(result.getString("District"));
                city.setPopulation(result.getInt("Population"));
                cities.add(city);
            }
            return cities;
        } catch (SQLException e) {
            System.out.println("Nie odnaleziono żadnego miasta.");
        } return null;
    }

    @Override
    public ArrayList<City> searchByPopulation(int population) {
        ArrayList<City> cities = new ArrayList<>();
        final String query = "SELECT ID, Name, CountryCode, District, Population FROM city WHERE Population>=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, population);
            ResultSet result = preparedStatement.executeQuery();
            while (result.next()) {
                City city = new City();
                city.setID(result.getLong("ID"));
                city.setName(result.getString("Name"));
                city.setCountryCode(result.getString("CountryCode"));
                city.setDistrict(result.getString("District"));
                city.setPopulation(result.getInt("Population"));
                cities.add(city);
            }
            return cities;
        } catch (SQLException e) {
            System.out.println("Nie odnaleziono żadnego miasta.");
        } return null;

    }

    @Override
    public void addCity(City city) {
        final String query = "INSERT INTO city(Name, CountryCode, District, Population) values(?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, city.getName());
            preparedStatement.setString(2, city.getCountryCode());
            preparedStatement.setString(3, city.getDistrict());
            preparedStatement.setInt(4, city.getPopulation());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Nie dodano do bazy żadnego miasta.");
        }
    }

    @Override
    public void deleteCity(long id) {
        final String query = "DELETE FROM city WHERE id = ?";
        try {
            PreparedStatement prepStmt = connection.prepareStatement(query);
            prepStmt.setLong(1, id);
            prepStmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Operacja usuwania nie powiodła się.");
        }
    }
}

