package teoria.introduccion.polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class TestFigurasRegulares {
    public static void main(String[] args) {

        //FiguraRegular figuraRegular = new FiguraRegular();
        //no se puede instanciar (crear objetos) de una clase abstracta

        List<FiguraRegular> listaFigurasRegulares  = new ArrayList<>();

        FiguraRegular cuadrado1 = new Cuadrado();
        cuadrado1.setValorLado(4);
       // System.out.printf("Área vale %.2f%n", cuadrado1.calcularArea());
        listaFigurasRegulares.add(cuadrado1);
        FiguraRegular cuadrado2 = new Cuadrado(5);
   //     System.out.printf("Área vale %.2f%n", cuadrado2.calcularArea());
        listaFigurasRegulares.add(cuadrado2);


        FiguraRegular triangulo1 = new TrianguloEquilatero();
        triangulo1.setValorLado(3);
     //   System.out.printf("Área vale %.2f%n", triangulo1.calcularArea());
        listaFigurasRegulares.add(triangulo1);
        FiguraRegular triangulo2 = new TrianguloEquilatero(5);
    //    System.out.printf("Área vale %.2f%n", triangulo2.calcularArea());
        listaFigurasRegulares.add(triangulo2);

        FiguraRegular pentagono1 = new Pentagono();
        pentagono1.setValorLado(2);
        listaFigurasRegulares.add(pentagono1);

        FiguraRegular pentagono2 = new Pentagono(3);
        listaFigurasRegulares.add(pentagono2);

        mostrarFiguras(listaFigurasRegulares);
    }
    private static void mostrarFiguras ( List<FiguraRegular> lista) {
        for (FiguraRegular figura: lista) {
            System.out.printf("Figura regular %S, perímetro %d, área %.2f,%n",
                    obtenerNombre(figura), figura.calcularPerimetro(), figura.calcularArea());
        }
    }

    private static String obtenerNombre(FiguraRegular figura) {
        String[] tokens = figura.getClass().getName().split("\\.");
        return tokens[3];
    }
}
