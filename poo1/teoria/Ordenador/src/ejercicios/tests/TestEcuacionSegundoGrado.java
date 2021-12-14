package ejercicios.tests;

import ejercicios.ejercicio8.EcuacionSegundoGrado;

import java.util.Scanner;

public class TestEcuacionSegundoGrado {
    public static void main(String[] args) {
        System.out.println("Ecuación segundo grado: a · x² + b · x + c = 0");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce coeficiente a:");
        double a = scanner.nextDouble();
        System.out.println("Introduce coeficiente b:");
        double b = scanner.nextDouble();
        System.out.println("Introduce coeficiente c:");
        double c = scanner.nextDouble();
        scanner.close();
        EcuacionSegundoGrado ecuacionSegundoGrado =
                new EcuacionSegundoGrado(a, b, c);
        //primera forma
        /*if (ecuacionSegundoGrado.esResoluble()){
            System.out.println("Se puede resolver");
            //llamamos a calcularX1 y a calcularX2
        }
        else {
             System.err.println("no se puede resolver la ecuación");
        }*/
        //segunda forma
        /*if (! ecuacionSegundoGrado.esResoluble()){
            System.err.println("no se puede resolver la ecuación");
            System.exit(1);
        }
        System.out.println("Se puede resolver");*/
        //forma definitiva
        if (! ecuacionSegundoGrado.esResoluble()){
            System.err.println("no se puede resolver la ecuación");
            return;
        }
        System.out.println("Se puede resolver");
        double x1 = ecuacionSegundoGrado.calcularX1();
        double x2 = ecuacionSegundoGrado.calcularX2();
        System.out.printf("X1: %.2f, X2: %.2f%n", x1, x2);
    }




}
