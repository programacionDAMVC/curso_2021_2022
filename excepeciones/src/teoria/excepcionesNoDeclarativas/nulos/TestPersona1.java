package teoria.excepcionesNoDeclarativas.nulos;

import java.util.List;
import java.util.Scanner;

public class TestPersona1 {
    public static void main(String[] args) {
        List<Persona> listaPersonas = List.of(new Persona("juan", 23),
                new Persona("pepe", 45),
                new Persona("maría", 23));
        System.out.println(listaPersonas);
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre de persona a buscar");
        String nombre = sc.nextLine();  //por si el nombre es compuesto
        sc.close();
        Persona personaABuscar = buscarPersona(listaPersonas, nombre);
        if (personaABuscar == null)
            System.out.println("no existe la persona");
        else
            System.out.printf("%s tiene %d años%n", nombre, personaABuscar.getEdad());
    }
    public static Persona buscarPersona (List<Persona> lista, String nombre) {
        for (Persona persona: lista) {
            if (persona.getNombre().equalsIgnoreCase(nombre))
                return persona;
        }
        return null;
    }
}
