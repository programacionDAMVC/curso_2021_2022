package teoria.introduccion.interfaces.geometria;

import java.util.ArrayList;
import java.util.List;

public class TestFiguras {
    public static void main(String[] args) {

        List<Figura> listaFiguras = new ArrayList<>();

        Figura cuadrado   = new Cuadrado(3);
        Figura rectangulo = new Rectangulo(3,5);
        Figura rombo      = new Rombo(5,30);
        Figura circulo    = new Circulo(6);
        Figura elipse     = new Elipse(3,4);

        listaFiguras.add(cuadrado);
        listaFiguras.add(rectangulo);
        listaFiguras.add(elipse);
        listaFiguras.add(circulo);
        listaFiguras.add(rombo);

        mostrarDatosFiguras(listaFiguras);
    }

    private static void mostrarDatosFiguras(List<Figura> listaFiguras) {

        for (Figura figura: listaFiguras) {
            System.out.printf("%s, perímetro %.2f y área %.2f%n",
                    figura.nombrar(), figura.calcularPerimetro(), figura.calcularArea());
        }

       /* listaFiguras.forEach(figura -> System.out.printf("%s, perímetro %.2f y área %.2f%n",
                        figura.nombrar(), figura.calcularPerimetro(), figura.calcularArea()));*/
    }
}
