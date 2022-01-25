package ejercicios.ejercicio1;

public class Palabra {
    public static int obtenerNumeroLetrasDePalabra(String palabra) {
        return palabra.length();
    }
    public static boolean empiezaPorVocalPalabra(String palabra) {
        return palabra.toLowerCase().matches("^[aeiouáéíóú].*");
    }
}
