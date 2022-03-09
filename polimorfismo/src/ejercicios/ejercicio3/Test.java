package ejercicios.ejercicio3;

import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        double[] numbers1 = new Random().doubles(0,350).limit(10).toArray();
       // System.out.println(Arrays.toString(numbers));
        ArrayReales a1 = new ArrayReales(numbers1);
        double[] numbers2 = new Random().doubles(0,350).limit(10).toArray();
        ArrayReales a2 = new ArrayReales(numbers2);

        //  Estadistica e = new ArrayReales(numbers);
       /* System.out.printf("Nº datos %d, valor mínimo %.2f, valor máximo %.2f, suma %.2f, valor medio %.2f y desviación típica %.2f%n",
                a1.obtenerNumeroValores(), a1.obtenerValorMinimo(), a1.obtenerValorMaximo(),
                a1.calcularSuma(), a1.calcularValorMedio(), a1.calcularDesviacionTipica());*/
        System.out.println(a1.mostrarDatosEstadisticos());
        System.out.println(a2.mostrarDatosEstadisticos());

    }
}
