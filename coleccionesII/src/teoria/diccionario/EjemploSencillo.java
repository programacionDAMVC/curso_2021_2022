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

        //diccionario 3, simulando los datos del fichero datos.csv,
        //clave el email
        //clase Persona con dos atributos: firstName, lastName
    }
}
