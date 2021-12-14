package ejercicios.tests;

import ejercicios.ejercicio9.TrianguloRectangulo;

import java.util.Scanner;

public class TestTrianguloRectangulo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cateto1 = -1, cateto2 = -1;
        do {
            System.out.println("Dame valor cateto1 (positivo, distinto de cero:)");
            cateto1 = scanner.nextInt();
            System.out.println("Damen valor cateto2:");
             cateto2 = scanner.nextInt();
        } while (cateto1 <= 0 || cateto2 <= 0);
        //si llegamos aquí, salimos de bucle porque los dos catetos son positivos y distintos ceros
        scanner.close();
        TrianguloRectangulo trianguloRectangulo = new TrianguloRectangulo();
        trianguloRectangulo.setCateto1(cateto1);
        trianguloRectangulo.setCateto2(cateto2);
        int hipotenusa = trianguloRectangulo.calcularHipotenusa();
        float area = trianguloRectangulo.calcuarArea();
        int perimetro = trianguloRectangulo.calcularPerimetro();
        System.out.printf("TRIÁNGULO RECTÁNGULO: hipotenusa %d; area %.1f; perimetro %d%n ",
                hipotenusa, area, perimetro);
    }
}
