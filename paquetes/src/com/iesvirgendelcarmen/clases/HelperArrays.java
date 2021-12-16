package com.iesvirgendelcarmen.clases;

import java.util.ArrayList;
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

    //método nos devuelve el nº de elementos mayor que el valor de la media
}
