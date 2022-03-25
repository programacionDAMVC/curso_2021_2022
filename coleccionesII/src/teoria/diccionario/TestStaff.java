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
        String email = "correo@dkfdk.es";
        String firstName = "joaquin";
        String lastName = "martínez";
        Person person = new Person(firstName, lastName);
        boolean newStaff  = staffObject.addPerson(person, email);
        System.out.println("================================");
        System.out.printf("New member? %B%n", newStaff);
        newStaff  = staffObject.addPerson(person, email);
        System.out.println("================================");
        System.out.printf("New member? %B%n", newStaff);
        Person findStaff = staffObject.getPersonByEmail(email);
        System.out.println("================================");
        System.out.println("staff");
        if (findStaff != null)
            System.out.printf("%s%n", findStaff);
        else
            System.out.println("not member");
        findStaff = staffObject.getPersonByEmail("correo@noexisten.com");
        System.out.println("================================");
        System.out.println("staff");
        if (findStaff != null)
            System.out.printf("%s%n", findStaff);
        else
            System.out.println("not member");

        Person deleteStaff = staffObject.removePerson(email);
        System.out.println("================================");
        System.out.println("delete staff");
        if (deleteStaff != null)
            System.out.printf("%s%n", deleteStaff);
        else
            System.out.printf("not exist member");
        deleteStaff = staffObject.removePerson("email@noexiste.com");
        if (deleteStaff != null)
            System.out.printf("%s%n", deleteStaff);
        else
            System.out.printf("email not exist");

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
