package teoria.excepcionesNoDeclarativas;

import numeros.Numeros;

import java.util.Scanner;

public class Colecciones {
    public static void main(String[] args) {
        int[] enteros = {1, 2, 4, 5, 3, 1, 3, 5, 4, 3, 8, 5, 6, 1, 1, 3};
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce una posición de la colección");
        String sPosicion = null;
        do {
            sPosicion = sc.next();
        } while ( !Numeros.esNumeroEntero(sPosicion));
        sc.close();
        int iPosicion = Integer.parseInt(sPosicion);
        //código para averiguar el valor de la posición
        if (iPosicion < enteros.length)
             System.out.printf("El valor de la posicion %d es %d%n",
                iPosicion, enteros[iPosicion]);
        else
            System.out.printf("No existe posición %d en la colección%n",
                    iPosicion);
    }
}
