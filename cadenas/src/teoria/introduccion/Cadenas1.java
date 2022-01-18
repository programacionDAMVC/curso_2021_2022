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
    }

    private static String devolverNombreMayuscula(String nombre) {
        return nombre.toUpperCase();
    }

    //método 1
    //método 2
}
