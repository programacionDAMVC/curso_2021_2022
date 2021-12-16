package com.iesvirgendelcarmen.tests;


import java.util.Arrays;
import java.util.HashSet;

/*import static com.iesvirgendelcarmen.clases.HelperArrays.obtenerNumeroComunesDeDosArrays;
import static com.iesvirgendelcarmen.clases.HelperArrays.obtenerNumeroMayorDeArray;*/
import static com.iesvirgendelcarmen.clases.HelperArrays.*;

public class TestArrays {
    public static void main(String[] args) {
        int[] array1;
        array1 = new int[]{1, 2, 4, 5, 6, 7, 7, 8, 5, 2, 1};
        int[] array2 = {4,3,4,5,6,7,8,9};
        int mayor = obtenerNumeroMayorDeArray(array1);
        System.out.println(Arrays.toString(array1));
        System.out.printf("Nº mayor del array anterior es %d%n", mayor);
        HashSet<Integer> comunes = obtenerNumeroComunesDeDosArrays(array1, array2);
        System.out.printf("%s-%s%n",Arrays.toString(array1), Arrays.toString(array2) );
        System.out.printf("Elementos comunes %s%n", comunes);
    }
}
