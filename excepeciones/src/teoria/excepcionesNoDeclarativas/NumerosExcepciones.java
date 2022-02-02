package teoria.excepcionesNoDeclarativas;

import numeros.Numeros;

import java.util.Scanner;

public class NumerosExcepciones {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("introduce numerador:");
        String sINumerador = null;
        do {
            sINumerador = sc.next();
        } while ( !Numeros.esNumeroEntero(sINumerador) );
        int iNnumerador   = Integer.parseInt(sINumerador);
        System.out.println("introduce denominador:");
        String sDnominador = null;
        do {
            sDnominador = sc.next();
        } while ( !Numeros.esNumeroEntero(sDnominador) );
        int iDenominador = Integer.parseInt(sDnominador);
        if (iDenominador == 0)
            System.out.println("División entera no posible");
        else {
            int iDivision = iNnumerador / iDenominador;
            System.out.printf("%d / %d = %d%n", iNnumerador, iDenominador, iDivision);
        }

        System.out.println("Introduce un numerador");
        String sFNumerador = null;
        do {
            sFNumerador = sc.next();
        } while ( ! Numeros.esNumeroReal(sFNumerador) );
        float fNumerador = Float.parseFloat(sFNumerador);
        System.out.println("Introduce un denominador");
        String sFDenominador = null;
        do {
            sFDenominador = sc.next();
        } while ( ! Numeros.esNumeroReal(sFDenominador) );
        sc.close();
        float fDenominador = Float.parseFloat(sFDenominador);
        float fDivision = fNumerador / fDenominador;
        if (Float.isInfinite(fDivision) || Float.isNaN(fDivision))
            System.out.println("División decimal imposible");
        else
            System.out.printf("%.2f / %.2f = %.2f%n", fNumerador, fDenominador, fDivision);
    }
}
