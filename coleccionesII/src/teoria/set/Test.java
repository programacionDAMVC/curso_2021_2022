package teoria.set;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test {
    private static Set<Town> listOfCitys;
    private static final String PATH = "FILES/ciudades.csv";
    private static Area area;
    public static void main(String[] args) {
        listOfCitys = getData(PATH);
        area = new Area(listOfCitys);
        showData();
        Town jaen = new Town("Jaén", "Spain", -3.7902800, 37.7692200);
        area.addCity(jaen);
        showData();
        System.out.printf("Existe Jaén: %B%n", area.findCity(
                new Town(null, null,-3.7902800,  37.7692200)));
        area.removeCity(new Town(null, null,-3.7902800,  37.7692200));showData();
        System.out.printf("Existe Jaén: %B%n", area.findCity(
                new Town(null, null,-3.7902800,  37.7692200)));



    }

    private static void showData() {
        area.getTowns().forEach(System.out::println);
        System.out.printf("Número de ciudades %d%n", area.getTowns().size());
    }

    private static Set<Town> getData(String path) {
        Set<Town> set = new HashSet<>();
        try (Scanner sc = new Scanner(new File(path))) {
            String cabecera = sc.nextLine(); //no lo voy a usar
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                String[] tokens = linea.split(";");
                String city       = tokens[0];
                String country    = tokens[1];
                String sLatitude  = tokens[2];
                String sLongitude = tokens[3];
                double dLatitude  = Double.parseDouble(sLatitude);
                double dLongitude = Double.parseDouble(sLongitude);
                Town town = new Town(city, country, dLatitude, dLongitude);
                set.add(town);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return set;
    }
}



