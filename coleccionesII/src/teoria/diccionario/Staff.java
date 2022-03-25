package teoria.diccionario;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Staff {
    //atributo diccionario email -> Person
    private Map<String, Person> staff = new HashMap<>();
    //constructor

    public Staff(Map<String, Person> staff) {
        this.staff = staff;
    }

    //método para añadir datos al atributo
    public boolean addPerson (Person person, String email) {
        int init = staff.size();
        staff.put(email, person);
        int end = staff.size();
        return end == init + 1;
    }
    //método para eliminar(mirar documentación API java Map)
    public Person removePerson(String email){
        return staff.remove(email);
    }
    //método que dado un email nos devuelva el objeto Person
    public Person getPersonByEmail(String email) {
        return staff.get(email);
    }
    //método para mostrar los datos email -> Person
    public void showData() {
        Set<String> emails = staff.keySet();
        for (String email: emails) {
            System.out.printf("%s -> %S%n", email, getPersonByEmail(email));
        }
    }
}
