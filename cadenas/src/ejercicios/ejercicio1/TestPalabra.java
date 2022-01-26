package ejercicios.ejercicio1;

import java.util.Locale;
import java.util.Scanner;

public class TestPalabra {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una palabra");
        String palabra1 = null;
        do {
            palabra1 = sc.next();
        } while ( ! palabra1.toLowerCase().matches("[a-záéíóúñü]+"));
       // palabra1 = palabra1.trim(); sobra porque lo hace ya el Scanner

        System.out.printf("Palabra introducida %s%n", palabra1);
        int numeroDeLetras = Palabra.obtenerNumeroLetrasDePalabra(palabra1);
        System.out.printf("La palabra %s tiene %d letras%n",
                palabra1, numeroDeLetras);
        boolean empiezaVocal = Palabra.empiezaPorVocalPalabra(palabra1);
        System.out.printf("La palabra %s empieza por vocal: %b%n",
                palabra1, empiezaVocal);
        boolean acabaVocal = Palabra.acabaEnVocalPalabra(palabra1);
        System.out.printf("La palabra %s acaba en vocal: %b%n",
                palabra1, acabaVocal);
        int numeroVocales = Palabra.obtenerNumeroDeVocales(palabra1);
        System.out.printf("La palabra %s tiene %d vocales%n",
                palabra1, numeroVocales);
        System.out.println("INTRODUCE UNA LETRA:");
        String letra = null;
        do {
            letra = sc.next();
        } while (! letra.toLowerCase().matches("[a-záéíóúñü]"));
        boolean contieneLetra = Palabra.contieneLetra(palabra1, letra);
        System.out.printf("%s ¿Contiene la letra %s? %b%n",
                palabra1, letra, contieneLetra);

        System.out.println("Introduce otra palabra");
        String palabra2 = null;
        do {
            palabra2 = sc.next();
        } while ( ! palabra2.toLowerCase().matches("[a-záéíóúñü]+"));
        boolean iguales = Palabra.sonIguales(palabra1, palabra2);
        System.out.printf("%s ¿Es igual a %s? %b%n",
                palabra1, palabra2, iguales);
        boolean palindromo = Palabra.esPalindrom(palabra1);
        System.out.printf("%s ¿Es un palíndromo? %B%n", palabra1, palindromo);
    }
}
