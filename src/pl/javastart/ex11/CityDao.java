package pl.javastart.ex11;


import java.util.ArrayList;

/**
 * Created by Rysiek on 2017-02-02.
 */
public interface CityDao {

    public abstract City searchByName(String name);
    public abstract ArrayList<City> searchByCountryCode(String countryCode);
    public abstract ArrayList<City> searchByPopulation(int population);
    public abstract void addCity(City city);
    public abstract void deleteCity(long id);
}
