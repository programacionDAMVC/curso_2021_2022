package teoria.introduccion.herencia;

import java.util.ArrayList;
import java.util.List;

public class TestFigurasRegulares {
    public static void main(String[] args) {

        List<FiguraRegular> listaFigurasRegulares  = new ArrayList<>();
        Cuadrado cuadrado1 = new Cuadrado();
        cuadrado1.setValorLado(4);
        System.out.printf("Área vale %.2f%n", cuadrado1.calcularArea());
        listaFigurasRegulares.add(cuadrado1);
        Cuadrado cuadrado2 = new Cuadrado(5);
        System.out.printf("Área vale %.2f%n", cuadrado2.calcularArea());
        listaFigurasRegulares.add(cuadrado2);

        TrianguloEquilatero triangulo1 = new TrianguloEquilatero();
        triangulo1.setValorLado(3);
        System.out.printf("Área vale %.2f%n", triangulo1.calcularArea());
        listaFigurasRegulares.add(triangulo1);
        TrianguloEquilatero triangulo2 = new TrianguloEquilatero(5);
        System.out.printf("Área vale %.2f%n", triangulo2.calcularArea());
        listaFigurasRegulares.add(triangulo2);

        mostrarFiguras(listaFigurasRegulares);
    }
    private static void mostrarFiguras ( List<FiguraRegular> lista) {
        for (FiguraRegular figura: lista) {
            System.out.printf("Figura regular, perímetro %d,%n"
                    , figura.calcularPerimetro());
        }
    }
}
