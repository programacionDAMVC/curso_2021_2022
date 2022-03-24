package teoria.diccionario;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestStaff {
    private static final String path = "FILES/datos.csv";
    private static Staff staffObject;
    public static void main(String[] args) {
        Map<String, Person> staff = createStaff(path);
        staffObject = new Staff(staff);
        staffObject.showData();
        //add new staff to staffObject
        //buscamos el staff anterior
        //eliminamos

    }



    private static Map<String, Person> createStaff(String path) {
        Map<String, Person> staff = new HashMap<>();
        try (Scanner sc = new Scanner(new File(path))) {
            String cabecera = sc.nextLine();
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                String[] tokens = linea.split(",");
                String key = tokens[2];
                Person person = new Person(tokens[0], tokens[1]);
                staff.put(key, person);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return staff;
    }
}
