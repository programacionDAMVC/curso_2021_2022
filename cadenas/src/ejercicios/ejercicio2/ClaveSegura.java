package ejercicios.ejercicio2;

import java.util.Random;

public class ClaveSegura {
    private static final int TAMANNO_MINIMO = 16;
    private static final int RANGO_TAMANNO = 5;
    private static int contador = 0;  //conocer el  nº intentos para generar todas las claves

    private static Random random = new Random();
    private static final String FUENTE_CARACTERES =
            "abcdefghijklmnñ¿?~()=@.&&opqrstuvwxyzABCDEFEGHIJKL34567890124567MNÑOPQRSTUVWXYZ¿p?~()=@.&&$!¿¡:,;!¡&{}0123456789012456789";

    //atributos
    private String claveSegura;
    private int tamannoClave;  //comprendido entre 8 y 12 caracteres

    //constructor
    public ClaveSegura() {
        tamannoClave = generarTamanno();
        do {
            claveSegura = generarClave();
            contador++;
        } while ( ! esClaveSegura() );
    }
    //getter del String claveSegura
    public String getClaveSegura() {
        return claveSegura;
    }

    private boolean esClaveSegura() {
        return tieneAlMenos8Caracteres() && tieneAlMenosUnaMinuscula() &&
                tieneAlMenosUnaMayuscula() && tieneAlMenosUnNumero() &&
                tieneAlMenosUnCaracterNoAlfaNumerico();
    }

    private boolean tieneAlMenosUnCaracterNoAlfaNumerico() {
        return claveSegura.matches(".*[^0-9a-záéíóúüñA-ZÁÉÍÓÚÜÑ].*");
    }

    private boolean tieneAlMenosUnNumero() {
        return claveSegura.matches(".*[0-9].*");
    }

    private boolean tieneAlMenosUnaMayuscula() {
        return claveSegura.matches(".*[A-ZÁÉÍÓÚÜÑ].*");
    }

    private boolean tieneAlMenosUnaMinuscula() {
        return claveSegura.matches(".*[a-záéíóúüñ].*");
    }

    private boolean tieneAlMenos8Caracteres() {
        return claveSegura.length() >= TAMANNO_MINIMO;
    }


    private String generarClave() {
        StringBuilder sBuilder = new StringBuilder();
        for (int i = 0; i < tamannoClave; i++) {
            int posicionCaracter = random.nextInt(FUENTE_CARACTERES.length());
            char caracterElegido = FUENTE_CARACTERES.charAt(posicionCaracter);
            sBuilder.append(caracterElegido);
        }
        return sBuilder.toString();
    }

    private int generarTamanno() {
       return TAMANNO_MINIMO + random.nextInt(RANGO_TAMANNO);
    }

    public static void main(String[] args) {
        ClaveSegura cSegura = null;
        for (int i= 0; i < 10; i++) {
            cSegura = new ClaveSegura();
            System.out.printf("Tamaño de la clave %d%n", cSegura.tamannoClave);
            System.out.printf("Clave %s%n", cSegura.claveSegura);
        }
        System.out.printf("Nº de intentos: %d", contador);
    }
}
