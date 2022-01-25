package teoria.regex;

import java.util.Scanner;

public class TestTelefono {
    public static void main(String[] args) {
        //usamos scanner para solicitar número de teléfono de españa
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un número de teléfono");
        //usamos do - while solicitando hasta formato correcto
        String numeroTelefono = null;
        do {
            numeroTelefono = sc.nextLine();
        } while (! esFormatoDeTelefono(numeroTelefono));
        System.out.println(numeroTelefono);
        //formatos:
        // +34 al principio que puede o no puede venir
        // +34222222222 +34 222222222 puede haber un espacio en blanco
        //tiene que tener nueve dígitos
        //debe empezar por 9,6, 8 ó 7
        // podemos adimitir 953-222222
        // admitir X66 666666 X es 6, 7, 8 ó 9    953 222222
        //al final formateamos el teléfono sin - o espacios en blanco
        //es decir solo nueve digitos
        String numeroTelefonoForateado = formatearNumeroTelefono(numeroTelefono);
        System.out.printf("%s formateado es %s%n", numeroTelefono, numeroTelefonoForateado);
    }

    private static String formatearNumeroTelefono(String numeroTelefono) {
        return numeroTelefono.replaceAll("\\+34|-| ","");
    }

    private static boolean esFormatoDeTelefono(String numeroTelefono) {
        return numeroTelefono.replaceAll(" ", "").
                matches("(\\+34)?[6-9][0-9]{2}-?[0-9]{6}");
    }
}
