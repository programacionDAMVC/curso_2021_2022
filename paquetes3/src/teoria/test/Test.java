package teoria.test;



import matematicas.estadistica.Basica;
import matematicas.geometria.circulares.Circulo;
import matematicas.geometria.figuras_poligonales.cuadraticas.Rectangulo;
import matematicas.geometria.figuras_poligonales.triangulares.TrianguloRectangulo;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5 , 6, 7 };
        double valorMedio  = Basica.calcularValorMedioArray(array);
        int valorMasGrande = Basica.devolverNumeroMasGrandeDeArray(array);
        System.out.println(Arrays.toString(array));
        System.out.printf("Valor medio %.2f y valor mas grande %d%n",
                valorMedio, valorMasGrande);

        Circulo circulo = new Circulo(2.3);
        circulo.setRadio(5.5);
        System.out.println(circulo);
        System.out.printf("Area %.2f y perímetro %.2f%n",
                circulo.calcularArea(), circulo.calcularPerimetro());

        //triángulo rectángulo, usamos el constructor vación ()
        TrianguloRectangulo trianguloRectangulo = new TrianguloRectangulo();
        trianguloRectangulo.setCatetoMenor(5.2);
        trianguloRectangulo.setCatetoMayor(8.1);
        System.out.println(trianguloRectangulo);
        System.out.printf("Area %.2f, perímetro %.2f e hipotenusa %.2f%n",
                trianguloRectangulo.calcularArea(),
                trianguloRectangulo.calcularPerimetro(),
                trianguloRectangulo.calcularHipotenusa());
        //rectángulo, usamos el constructor normal
        Rectangulo rectangulo = new Rectangulo(4.33, 5.12);
        System.out.println(rectangulo);
        System.out.printf("Area %.2f y perímetro %.2f%n",
                rectangulo.calcularArea(),
                rectangulo.calcularPerimetro());
    }
}
