package pl.javastart.ex11;

import java.util.Scanner;

/**
 * Created by Rysiek on 2017-02-02.
 */
public class CityApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int option;
        MysqlCityDao mysqlCityDao = new MysqlCityDao();

        System.out.println("Witaj w aplikacji zarządzania bazą danych city.");

        do {
            System.out.println("Wybierz opcję:");
            System.out.println("1 - wyszukiwanie miast po nazwie");
            System.out.println("2 - wyszukiwanie miast po kodzie danego pańtwa");
            System.out.println("3 - wyszukiwanie miast po liczbie mieszkańców");
            System.out.println("4 - dodadnie miasta do bazy danych");
            System.out.println("5 - usunięcie miasta z bazy danych");
            System.out.println("0 - zakończenie pracy z programem");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Podaj nazwę miasta:");
                    String name = scanner.nextLine();
                    System.out.println(mysqlCityDao.searchByName(name).toString());
                    break;
                case 2:
                    System.out.println("Podaj kod państwa:");
                    String code = scanner.nextLine();
                    for (City city : mysqlCityDao.searchByCountryCode(code)) {
                        System.out.println(city.toString());
                    }
                    break;
                case 3:
                    System.out.println("Podaj liczbę mieszkanców:");
                    int population = scanner.nextInt();
                    scanner.nextLine();
                    for (City city : mysqlCityDao.searchByPopulation(population)) {
                        System.out.println(city.toString());
                    }
                    break;
                case 4:
                    System.out.println("Podaj nazwę miasta:");
                    String inputName = scanner.nextLine();
                    System.out.println("Podaj kod państwa:");
                    String inputCode = scanner.nextLine();
                    System.out.println("Podaj region, w którym znajduje się miasto:");
                    String inputDistrict = scanner.nextLine();
                    System.out.println("Podaj liczbę mieszkańców:");
                    int inputPopulation = scanner.nextInt();
                    scanner.nextLine();
                    City city = new City(inputName, inputCode, inputDistrict, inputPopulation);
                    mysqlCityDao.addCity(city);
                    break;
                case 5:
                    System.out.println("Podaj wartość ID reokrdu, który chcesz usunąć:");
                    Long inputID = scanner.nextLong();
                    mysqlCityDao.deleteCity(inputID);
                    break;
            }
        } while (option != 0);

    }
}
