package ejercicios.ejercicio2;

import java.util.Random;

public class ClaveSegura {
    private static Random random = new Random();

    private static final String FUENTE_CARACTERES =
            "abcdefghijklmnñ¿?~()=@.&&opqrstuvwxyzABCDEFEGHIJKL34567890124567MNÑOPQRSTUVWXYZ¿?~()=@.&&$!¿¡:,;!¡&{}0123456789012456789";
    private String claveSegura; //hay especifiaciones
    private int tamannoClave;

    public ClaveSegura() {
        tamannoClave = generarTamanno();
        do {
            claveSegura = generarClave();
        } while (! esClaveSegura() );

    }

    private boolean esClaveSegura() {
        return tieneAlMenos8Caracteres() && tieneAlMenosUnaMinuscula() &&
                tieneAlMenosUnaMayuscula() && tieneAlMenosUnNumero() &&
                tieneAlMenosUnCaracterNoAlfaNumerico();
    }

    private boolean tieneAlMenosUnCaracterNoAlfaNumerico() {
        return false;
    }

    private boolean tieneAlMenosUnNumero() {
        return false;
    }

    private boolean tieneAlMenosUnaMayuscula() {
        return claveSegura.matches("[A-ZÁÉÍÓÚÜÑ]");
    }

    private boolean tieneAlMenosUnaMinuscula() {
        return claveSegura.matches(".*[a-záéíóúüñ].*");
    }

    private boolean tieneAlMenos8Caracteres() {
        return claveSegura.length() >= 8;
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
        Random random = new Random();
        //usamos la clase Random y el método nextInt(...)
        //cambiar la lógica para obtener un tamaño de 8 a 12 inclusive ámbos
        return 8 + random.nextInt(5);
    }

    public static void main(String[] args) {
        for (int i= 0; i < 10; i++) {
            ClaveSegura cSegura = new ClaveSegura();
            System.out.printf("Tamaño de la clave %d%n", cSegura.tamannoClave);
            System.out.printf("Clave %s%n", cSegura.claveSegura);
        }
    }
}
