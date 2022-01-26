package ejercicios.ejercicio1;

public class Palabra {
    public static int obtenerNumeroLetrasDePalabra(String palabra) {
        return palabra.length();
    }
    public static boolean empiezaPorVocalPalabra(String palabra) {
        return palabra.toLowerCase().matches("^[aeiouáéíóú].*");
    }
    public static boolean acabaEnVocalPalabra(String palabra) {
        return palabra.toLowerCase().matches(".*[aeiouáéíóú]$");
    }
    public static int obtenerNumeroDeVocales(String palabra) {
        int numeroVocales = 0;
        for (int i = 0; i < palabra.length() ; i++){
            //System.out.println(palabra.charAt(i));
            if ( (palabra.charAt(i) + "").toLowerCase().matches("[aeiouáéíóú]") ) {
                numeroVocales++;
            }
        }
        return numeroVocales;
    }
    public static boolean contieneLetra(String palabra, String letra) {
        return palabra.toLowerCase().contains(letra.toLowerCase());
        //añadimos que puede contener letra a pesar de que estén en mayúcula o no.
    }
    public static boolean sonIguales(String palabra1, String palabra2) {
        return palabra1.equalsIgnoreCase(palabra2);
    }
    public static boolean esPalindrom(String palabra) {
        StringBuilder stringBuilder = new StringBuilder(palabra);
        stringBuilder.reverse();
        String palabraInvetida = stringBuilder.toString();
        return sonIguales(palabra, palabraInvetida);
    }
}
