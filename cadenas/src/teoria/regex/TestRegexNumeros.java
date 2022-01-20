package teoria.regex;

import java.util.Scanner;

import static numeros.Numeros.esNumeroNaturalSinCero;
import static numeros.Numeros.esNumeroReal;

public class TestRegexNumeros {
    private static final double IVA = 21;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el precio sin IVA");
     //   double precioSinIVA = sc.nextDouble(); puede generar problemas con
        //lo que introduce el usario
        String sPrecioSinIVA = "";
        do {
            sPrecioSinIVA = sc.nextLine();
        } while (! esNumeroReal(sPrecioSinIVA));
        double dPrecioSinIVA = Double.parseDouble(sPrecioSinIVA);
        double precioConIVA = dPrecioSinIVA + dPrecioSinIVA * IVA / 100.0;
        System.out.printf("Precio con IVA %.2f%n", precioConIVA);
        //vamos a pedir por scanner un número real, que puede ser
        //una cantidad sin IVA y vamos a mostrar el precio con IVA
    }
}
