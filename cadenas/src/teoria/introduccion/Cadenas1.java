package teoria.introduccion;

import java.util.Locale;
import java.util.Scanner;

//leer con scanner nombres de personas
//pueden ser compuesto, ej. Ana Gabriela
//llamamos a un método que devuelva el nombre en mayúscula
//ejemplo con Ana Gabriela devuelve ANA GABRIELA
//otro método que devuelva el nombre capitalizado
//Ejemplo manuel devuelve una cadena Manuel
//Ejemplo luis wenceslao devuelve Luis Wenceslao
public class Cadenas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un nombre:");
        String nombre = sc.nextLine();
        sc.close();
        String nombreMayuscula = devolverNombreMayuscula(nombre);
        System.out.printf("Recibido: %s, en mayúscula %s %n",
                nombre, nombreMayuscula);
        String nombreCapitalizado = devolverNombreCapitalizadoCompuesto(nombre);
        System.out.printf("Longitud de nombre %d%n", nombreCapitalizado.length());
        System.out.printf("Recibido: %s, capitalizado %s %n",
                nombre, nombreCapitalizado);
    }

    private static String devolverNombreCapitalizadoCompuesto(String nombre) {
        //maria de los ángeles: María De Los Ángelos
        //split espacio en blanco y obtengo ["maría","de","los","ángeles"]
        System.out.printf("Longitud de nombre %d%n", nombre.length());
        String nombreCompuestoCapitalizado = "";
        String[] tokens = nombre.split(" ");
   //     String[] tokens = nombre.split("\s+");
        for (String nombreSimple: tokens) {
            nombreCompuestoCapitalizado += devolverNombreCapitalizadoSimple(nombreSimple) + " ";
        }
        return nombreCompuestoCapitalizado.trim();
    }


    private static String devolverNombreCapitalizadoSimple(String nombre) {
        //manuel : crear dos subcadenas m  -  anuel
        //m -> M
        //Concatebar M con anuel y hacer el return
        if (nombre.length() == 0)
            return "";
        String primeraLetra = (nombre.charAt(0) + "").toUpperCase();
        String subcadena = nombre.substring(1).toLowerCase();
        return primeraLetra + subcadena;
    }

    private static String devolverNombreMayuscula(String nombre) {
        return nombre.toUpperCase();
    }

    //método 2
}
