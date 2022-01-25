package ejercicios.ejercicio1;

import java.util.Locale;
import java.util.Scanner;

public class TestPalabra {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una palabra");
        String palabra = null;
        do {
            palabra = sc.next();
        } while ( ! palabra.toLowerCase().matches("[a-záéíóúñü]+"));
        palabra = palabra.trim();

        System.out.printf("Palabra introducida %s%n", palabra);
        int numeroDeLetras = Palabra.obtenerNumeroLetrasDePalabra(palabra);
        System.out.printf("La palabra %s tiene %d letras%n",
                palabra, numeroDeLetras);
        boolean empiezaVocal = Palabra.empiezaPorVocalPalabra(palabra);
        System.out.printf("La palabra %s empieza por vocal: %b%n",
                palabra, empiezaVocal);
    }
}
