package ejercicio1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    //Un método que lea de la entrada estándar cinco y solo cinco números decimales y
    //que devuelva un array de float.
    private static final int TAMANNO = 8;
    public static float[] devolverArrayFloat(){
        Scanner sc = new Scanner(System.in);
        float[] array = new float[TAMANNO];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce un número decimal");
            array[i] = sc.nextFloat();
        }
        sc.close();
        return array;
    }
    //Un método que se le pasa como argumento un array de float y usando obligatoria-
    //mente un bucle fori, devuelva el mayor valor.
    public static float devolverMayorValorArray(float[] array) {
        float valorMayor = - Float.MIN_VALUE;  //-123333333 otra forma
        for (int i = 0; i < array.length; i++) {
            if (array[i] > valorMayor){
                valorMayor = array[i];
            }
        }
        return valorMayor;
    }
    public static float calcularValorMedioArray(float[] array) {
        float suma = 0;
        int i = 0;
        while (i < array.length){
            suma += array[i];
            i++;
        }
        return suma / array.length;
    }
    //Un método que se le pasa como argumento un array de float y usando obligato-
    //riamente un bucle do while, devuelva un array de enteros, obteniendo los valores
    //haciendo un casting de los valores del array de float.
    public static int[] devolverArrayEnteros(float[] arrayFloat){
        int[] arrayInt = new int[arrayFloat.length]; //obligatorio declarar tamaño del array
        int i = 0;
        do {
            arrayInt[i] = (int) arrayFloat[i];
            i++;
        } while (i < arrayInt.length);
        return arrayInt;
    }
    //Un método que se le pasa como argumento un array de float y usando obligatoria-
    //mente un bucle foreach, devuelva el menor valor.
    public static float obtenerMenorValorArray(float[] array) {
        float valorMenor = Float.MAX_VALUE;
        for (float dato : array ) {
            if (dato < valorMenor) {
                valorMenor = dato;
            }
        }
        return valorMenor;
    }


    public static void main(String[] args) {
        //obtener datos
        float[] array = devolverArrayFloat();
        //dos formas de saber que datos hemos metido
        //forma 1
        for (float dato : array) {
            System.out.println(dato);
        }
        //forma 2
        System.out.println(Arrays.toString(array));
        //obtenemos la valor mas grande
        float valorMayor = devolverMayorValorArray(array);
        System.out.println(valorMayor);
        System.out.printf("Valor mayor %.3f%n", valorMayor);
        float valorMedio = calcularValorMedioArray(array);
        System.out.printf("Valor medio %.2f%n", valorMedio);
        int[] arrayInt = devolverArrayEnteros(array);
        System.out.println(Arrays.toString(arrayInt));
        float valorMenor = obtenerMenorValorArray(array);
        System.out.printf("Valor mas pequeño %.4f%n", valorMenor);
    }


}
