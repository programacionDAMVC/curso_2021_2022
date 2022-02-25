package teoria.interfaces.geometria18;

import java.util.ArrayList;
import java.util.List;

public class TestFiguras {
    public static void main(String[] args) {

        List<Figura> listaFiguras = new ArrayList<>();

        Figura cuadrado   = new Cuadrado(3);
        Figura rectangulo = new Rectangulo(3,5);
        Figura rombo      = new Rombo(5,30);
        Figura circulo    = new Circulo(6);
        Figura elipse     = new Elipse(13,4);

        listaFiguras.add(cuadrado);
        listaFiguras.add(rectangulo);
        listaFiguras.add(elipse);
        listaFiguras.add(circulo);
        listaFiguras.add(rombo);

        mostrarDatosFiguras(listaFiguras);
        Figura figuraMasArea = Figura.devolverFiguraMasArea(listaFiguras);
        System.out.println("Figura de más área");
        figuraMasArea.mostrarEnConsolaDatosFigura();

        //mensaje con figura de más área y sus datos
    }

    private static void mostrarDatosFiguras(List<Figura> listaFiguras) {

      //  listaFiguras.forEach(Figura::mostrarEnConsolaDatosFiguras);

        for (Figura figura: listaFiguras) {
            figura.mostrarEnConsolaDatosFigura();
        }
    }
}
