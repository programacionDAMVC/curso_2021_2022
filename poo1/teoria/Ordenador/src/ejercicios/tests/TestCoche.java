package ejercicios.tests;

import ejercicios.ejercicio2.Coche;

public class TestCoche {
    public static void main(String[] args) {
        //dos objeto de la clase Coche
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        //añade 5 litros a cada coche
        coche1.echarCombustible(5);
     //   System.out.printf("El coche tiene ahora mismo %.2f litros de combustible%n",
     //           coche1.echarCombustible(5) );
        coche2.echarCombustible(5);
        //con coche1 conocemos la cantidad de combustible
        System.out.printf("El coche 1 tiene %.2f litros de combustible%n",
                coche1.getCantidadCombustible());
        //con coche2 conocemos los km que puede recorrer
        System.out.printf("El cohce 2 tiene una autonomía de %.2f km%n",
                coche2.saberAutonomia());
    }
}
