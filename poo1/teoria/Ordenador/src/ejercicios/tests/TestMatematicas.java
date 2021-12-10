package ejercicios.tests;

import ejercicios.ejercicio6.Matematicas;

import java.util.Scanner;

public class TestMatematicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un númermo");
        double numero = sc.nextDouble();
        double raizCuadrada = Matematicas.calcularRaizCuadrada(numero);
        System.out.printf("La raíz cuadrada de %.2f vale %.2f%n",  numero, raizCuadrada);
        double raizCubica = Matematicas.calcularRaizCubica(numero);
        System.out.printf("La raíz cúbica de %.2f vale %.2f%n",  numero, raizCubica);
        int enteroPositivoRedondeado = Matematicas.redondearAPositivoNumero(numero);
        System.out.printf("%.2f positivo y redondeado a entero vale %d%n",
                numero, enteroPositivoRedondeado);
        int numeroAleatorio = Matematicas.devolverAleatorioDe0ANumero(numero);
        System.out.printf("Número aleatorio sobre numero %.2f es %d%n",
                numero, numeroAleatorio);

    }
}
