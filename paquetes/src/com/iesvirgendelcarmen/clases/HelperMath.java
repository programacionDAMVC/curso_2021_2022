package com.iesvirgendelcarmen.clases;

public class HelperMath {
    public static int mayorNumero(int numero1, int numero2) {
        /*if (numero1 > numero2)
            return numero1;
        else
            return numero2;*/
        if (numero1 > numero2)
            return numero1;
        return numero2;

    }
    public static boolean sonIguales(int numero1, int numero2) {
        return numero1 == numero2;
    }

    /*public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 9;
        System.out.printf("El mayor número de %d y %d es %d%n",
                numero1, numero2, mayorNumero(numero1, numero2));
        System.out.printf("Son iguales %d y %d: es %b%n",
                numero1, numero2, sonIguales(numero1, numero2));
    }*/
}
