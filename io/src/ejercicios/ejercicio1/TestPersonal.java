package ejercicios.ejercicio1;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class TestPersonal {
    private static Scanner sc = new Scanner(System.in);
    private static Personal personal = null;
    public static void main(String[] args) {
        crearInstanciaPersonal();

        while (true) {
            mostrarMenu();
        }
    }

    private static void crearInstanciaPersonal() {
        try {
            List<Persona> personas = Auxiliar.crearListaPersonas(
                    "FICHEROS/personal.csv");
            personal = new Personal(personas);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //leer el fichero csv usando el método crear crearListaPersonas
        //devuelve un List<Persona>
        //crear una instancia de la clase Personal
    }

    private static void mostrarMenu() {
        System.out.println("0. Salir del programa");
        System.out.println("1. Personas de un país");
        System.out.println("2. Eliminar persona por email");
        String opcion = "";
        do {
            System.out.println("Introduce opción:");
            opcion = sc.nextLine();
        } while (! opcion.matches("[012]"));
        switch (opcion) {
            case "0":
                salir();
                break;
            case "1":
                buscarPersonasDePais();
                break;
            case "2":
                eliminarPersona();
                break;
            default:
        }

    }

    private static void eliminarPersona() {
        System.out.println("Introduce un email válido");
        String email;
        do {
            email = sc.nextLine();
        } while(!Auxiliar.validarEmail(email));
        boolean exito = personal.eliminarPersonaPorEmail(email);
        String mensaje = exito ? "usuario eliminado" : "usuario no eliminado";
        System.out.println(mensaje);
    }

    private static void buscarPersonasDePais() {
        System.out.println("Introduce país de personas a buscar...");
        String pais = sc.nextLine();
        List<Persona> personasPorPais = personal.obtenerPersonasDeUnPais(pais);
        if (personasPorPais.isEmpty()){
            System.out.printf("No hay personas del pais %s%n", pais);
            return;
        }
        personasPorPais.forEach(System.out::println);
    }

    private static void salir() {
        System.out.println("Fin de programa");
        if (sc != null)
            sc.close();
        //grabamos el fichero con los datos actuales (posibles borrados)

        System.exit(0);
    }
}
