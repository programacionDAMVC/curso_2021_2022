package teoria.interfacecomparable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestPersona {
    public static void main(String[] args) {
        List<Persona> listaPersonas = new ArrayList<>();
        String nombre = "hernan gonzález";
        LocalDate fechaNacimiento = LocalDate.of(2000, 11, 25);
        String dni = "11111111h";
        Persona persona = new Persona(nombre, fechaNacimiento, dni);
       // System.out.println(persona);
        listaPersonas.add(persona);
        listaPersonas.add(new Persona("marisa gonzález",
                LocalDate.of(1985, 1 ,2), "22222222h"));
        listaPersonas.add(new Persona("felipe gonzález",
                LocalDate.of(1975, 1 ,2), "33333333h"));
        listaPersonas.add(new Persona("esperanza ruiz",
                LocalDate.of(2001, 5 ,20), "44444444j"));
        System.out.println(listaPersonas);
        Persona personaABuscar = new Persona(null,
                null, "44444444b");
        boolean existe = buscarPersona(listaPersonas, personaABuscar);
        System.out.printf("¿Existe la persona con dni %s? %B%n", personaABuscar.getDni(), existe);

        List<String> listaCadenas = new ArrayList<>();
        listaCadenas.add("hola");
        listaCadenas.add("mundo");
        listaCadenas.add("antonio");
        listaCadenas.add("luisas");
        listaCadenas.add("cadena");
        listaCadenas.add("otra cadena");
        listaCadenas.add("probando el método sort");
        listaCadenas.add("hoy llueve");
        System.out.println(listaCadenas);
        Collections.sort(listaCadenas);
        System.out.println(listaCadenas);
        Collections.sort(listaPersonas);
        System.out.println(listaPersonas);
        System.out.printf("Persona con menos edad %s%n", listaPersonas.get(0));
        System.out.printf("Persona con mas edad %s%n",
                listaPersonas.get(listaPersonas.size() - 1));


    }

    private static boolean buscarPersona(List<Persona> listaPersonas, Persona persona) {
        return listaPersonas.contains(persona);
    }
}
