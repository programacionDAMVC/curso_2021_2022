package ejercicios.ejercicio1;

import numeros.Numeros;

import java.util.Scanner;

public class TestTriangulo {
    private static  Scanner sc = new Scanner(System.in);
    private static int numero = 1;
    public static void main(String[] args) {
        System.out.println("Introduce los lados del triángulo a crear...");
        int lado1 = obtenerLado();
        int lado2 = obtenerLado();
        int lado3 = obtenerLado();
        sc.close();
        System.out.printf("Intentado crear triángulo con los lados %d, %d y %d%n",
                lado1, lado2, lado3);
        //vamos a crear el triángulo
        try {
            Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
            System.out.println(triangulo);
        } catch (IlegalTrianguloException e) {
           // e.printStackTrace();
            System.err.println("No se puede construir ese triángulo");
        }
    }

    private static int obtenerLado() {
        System.out.printf("introduce lado %d: ", numero++);
        String sLado = null;
        do{
            sLado = sc.next();
        } while (!Numeros.esNumeroNaturalSinCero(sLado));
        return Integer.parseInt(sLado);
    }
}
