package metodos;

import java.util.Scanner;

public class Metodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma1 = sumar(1,2);
        System.out.printf("Suma de valores 1: %d%n", suma1);
        int[] iArray = {1, 2, 3, 4, 5};
        int suma2 = sumar(iArray);
        System.out.printf("Suma de valores 2: %d%n", suma2);
        /*double[] dArray = {1, 2, 3, 4, 5};
        int suma3 = sumar(dArray);*/
        double suma3 = sumar(1, 2 ,3, 4, 5);
        System.out.printf("Suma de valores 3: %.2f%n", suma3);
        int iDia = -1;
        do {
            System.out.println("Introduce un valor entero positivo o cero");
            iDia = sc.nextInt();
        } while (iDia < 0); //se ejecuta mientras que iDia sea negativo
        sc.close();
        String diaSemana = obtenerDiaSemanaCadena(iDia);
        if (diaSemana != null)
            System.out.printf("Día de la semana %d es %s%n", iDia, diaSemana);

    }

    /**
     * Método que calcula la suma de los componentes de una lista de doubles
     * @param array lista que contiene los números a sumar
     * @return suma de los valores de la lista
     */
    private static double sumar(double... array) {
        double suma = 0;
        for (double numero : array ) {
            suma += numero;
        }
        return suma;
    }
    /**
     * Método que calcula la suma de los componentes de un array de enteros
     * @param array colección que contiene los números a sumar
     * @return suma de los valores del array
     */
    private static int sumar(int[] array) {
        int suma = 0;
        for (int numero : array ) {
            suma += numero;
        }
        return suma;
    }


    /**
     * Método que devuelve la suma de dos valores enteros
     * @param valor1 valor int, primer sumando
     * @param valor2 valor int, segudo sumando
     * @return la suma de los dos valores
     */
    private static int sumar(int valor1 , int valor2) {
        return valor1 + valor2;
       // System.out.println(valor1 + valor2); no ponemos sentencias después del return
    }

    /**
     * Debemos controlar que no le llegue negativos
     * Método que convierte un int a su valor String de día de la seman
     * @param valor puede ser 1,2,3, ....
     * @return para 1, devuelve LUNES, para 2, devuelve MARTES ...
     */
    public static String obtenerDiaSemanaCadena(int valor) {
        valor %= 7; //normalizamos valores, de 0 a 7
       /* if (valor < 0)
            valor += 7;
        if (valor == 7)
            valor = 0;*/ //para los valores negativos
        switch (valor) {
            case 0, 9 :
                return  "DOMINGO";
            case 1:
                return  "LUNES";
            case 2:
                return  "MARTES";
            case 3 :
                return  "MIÉRCOLES";
            case 4:
                return  "JUEVES";
            case 5:
                return  "VIERNES";
            case 6:
                return  "SÁBADO";
            default:
                return null;
        }

    }
}
