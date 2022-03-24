package teoria.diccionario;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploSencillo {
    public static void main(String[] args) {

        Map<String, String> diccionario1 = new HashMap<>();
        diccionario1.put("lexema", "Unidad mínima con significado léxico que no presenta morfemas gramaticales; p. ej., sol, o que, poseyéndolos, prescinde de ellos por un proceso de segmentación; p. ej., terr, en enterráis.");
        diccionario1.put("prefijo"," Dicho de un afijo: Que va antepuesto principalmente a la raíz; p. ej., des- en desconfiar, re- en reponer.");
        diccionario1.put("sufijo", " Dicho de un afijo: Que va pospuesto a la base léxica; p. ej., -al en regional, -miento en hundimiento. ");

        //mostrar el tamaño
        System.out.printf("Tamaño del diccionario1 %d%n", diccionario1.size());
        //mostramos las claves
        Set<String> claves = diccionario1.keySet();
        System.out.println("Claves:");
        claves.forEach(System.out::println);
        //obtener el valor de una clave
        System.out.println("Obteniendo el valor de una clave:");
        String valor = diccionario1.get("lexema");
        System.out.printf("%s -> %s%n", "lexema", valor);
        //obtener todas los valores
        System.out.println("Mostrando todos los datos");
        for (String clave: claves) {
            System.out.printf("%s -> %s%n", clave, diccionario1.get(clave));
        }

        Map<Integer, String> diccionario2 = new HashMap<>();
        diccionario2.put(1, "juan");
        diccionario2.put(2, "pepe");
        diccionario2.put(3, "luis");
        System.out.println("Mostrando todos los datos de diccionario 2");
        for (int clave: diccionario2.keySet()) {
            System.out.printf("%s -> %s%n", clave, diccionario2.get(clave));
        }

        //crear tres objetos Person, uno de ellos usando el constructor vacío
        //Brittaney,Buttress,bbuttress0@cornell.edu
        Person person1 = new Person(); //usando el constructor vacío
        person1.setFirstName("Brittaney");
        person1.setLastName("Buttress");
        //Arabele,Carbin,acarbin1@dagondesign.com
        Person person2 = new Person("Arabele" ,"Carbin");
        //Bebe,Poncet,bponcet2@parallels.com
        Person person3 = new Person("Bebe","Poncet");
        //definimos el dicccionario, usamos como clave el email
        Map<String, Person> diccionario3 = new HashMap<>();
        //añadimos los tres objetos
        diccionario3.put("bbuttress0@cornell.edu", person1);
        diccionario3.put("acarbin1@dagondesign.com", person2);
        diccionario3.put("bponcet2@parallels.com", person3);
        //recorremos mostrando los datos: email -> personio
        //obtenemos una colección con las claves, es de tipo Set
        Set<String> clavesDiccionario3 = diccionario3.keySet();
        //usamos foreach y el método get(clave) para obtener el valor
        System.out.println("Datos del diccionario 3");
        for (String clave: clavesDiccionario3) {
            System.out.printf("%s -> %S%n", clave, diccionario3.get(clave));
        }
    }
}
