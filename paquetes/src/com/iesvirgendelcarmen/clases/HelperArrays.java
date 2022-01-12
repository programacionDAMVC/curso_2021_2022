package com.iesvirgendelcarmen.clases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class HelperArrays {
    public static int obtenerNumeroMayorDeArray(int[] array){
        int mayor = -Integer.MIN_VALUE;
        for (int numero: array)
            if (numero > mayor)
                mayor = numero;
        return mayor;
    }
    public static HashSet<Integer> obtenerNumeroComunesDeDosArrays(int[] array1, int[] array2){
        //HasSet es una colección parecida a ArrayList, pero con la salvedad
        //que no permite repetidos
        HashSet<Integer> comjuntoComunes = new HashSet<>();
        for (int numeroArray1: array1) {
            for (int numeroArray2: array2) {
                if (numeroArray1 == numeroArray2) {
                    comjuntoComunes.add(numeroArray1);
                    break;
                }
            }
        }
        return comjuntoComunes;
    }
    //método que se le pasa un array y muestra los datos en dos columnas
    //Ejemplo:
    //1     2
    //3     4
    //.......
    public static void mostrarArrayEnDosColumnas(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%5d", array[i]);
            if (i % 2 == 1)
                System.out.println();
        }
    }
    //método nos devuelve el nº de elementos mayor que el valor de la media
    //de un array
    public static int obtenerNumeroValoresSuperiorMediaArray(int[] array){
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        /*for (int numero: array) {
            suma += numero;
        }*/
        double media = 1.0 * suma / array.length;
        int contador = 0;
        for (int numero: array) {
            if (numero > media){
                contador++;
            }
        }
        return contador;
    }
    /*public static void main(String[] args) {
        int[] array1;
        array1 = new int[]{1, 2, 4, 5, 6, 7, 7, 8, 5, 2, 1};
        int[] array2 = {4,3,4,5,6,7,8,9};

        int mayor = obtenerNumeroMayorDeArray(array1);
        System.out.println(Arrays.toString(array1));
        System.out.printf("Nº mayor del array anterior es %d%n", mayor);

        HashSet<Integer> comunes = obtenerNumeroComunesDeDosArrays(array1, array2);
        System.out.printf("%s-%s%n",Arrays.toString(array1), Arrays.toString(array2) );
        System.out.printf("Elementos comunes %s%n", comunes);

        mostrarArrayEnDosColumnas(array1);

        int numeroValoresMayorMedia = obtenerNumeroValoresSuperiorMediaArray(array1);
        System.out.println();
        System.out.println(Arrays.toString(array2));
        System.out.printf("Nº de valores superior a la media %d%n", numeroValoresMayorMedia);
    }*/
}
