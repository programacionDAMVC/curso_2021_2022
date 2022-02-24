package teoria.introduccion.interfaces.geometria18;

import java.util.List;

public interface Figura {

    double PI = 3.1416;

    double calcularArea();
    double calcularPerimetro();
    String nombrar();

     static int[] ordenarValores(int valor1, int valor2) { //siempre valor1 será mayor que valor2
         if (valor1 < valor2) {  // 7 y 6 valor1 < valor2(no se hace) si llega 6 y 7 valor1 < valor2 TRUE
             int tmp = valor1;
             valor1 = valor2;
             valor2 = tmp;
         }
         return new int[]{valor1, valor2};
    }
    //método que se le pasa una lista de figuras y te devuelva el de mayor área
    static Figura devolverFiguraMasArea (List<Figura> listaFiguras) {
         return null;
    }


    default void mostrarEnConsolaDatosFiguras() {
        System.out.printf("%s, perímetro %.2f y área %.2f%n",
                nombrar(), calcularPerimetro(), calcularArea());
    }
    
}
