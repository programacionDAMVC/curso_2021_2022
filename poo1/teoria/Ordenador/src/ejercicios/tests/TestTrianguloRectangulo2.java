package ejercicios.tests;

import ejercicios.ejercicio9.TrianguloRectangulo;

import javax.swing.*;

public class TestTrianguloRectangulo2 {
    public static void main(String[] args) {
        String sCateto1 = JOptionPane.showInputDialog("Introduce el valor del cateto1");
        int iCateto1    = Integer.parseInt(sCateto1);
        String sCateto2 = JOptionPane.showInputDialog("Introduce el valor del cateto1");
        int iCateto2    = Integer.parseInt(sCateto2);
        TrianguloRectangulo trianguloRectangulo = new TrianguloRectangulo();
        trianguloRectangulo.setCateto1(iCateto1);
        trianguloRectangulo.setCateto2(iCateto2);
        int hipotenusa = trianguloRectangulo.calcularHipotenusa();
        float area = trianguloRectangulo.calcuarArea();
        int perimetro = trianguloRectangulo.calcularPerimetro();
        String information = String.format("TRIÁNGULO RECTÁNGULO: hipotenusa %d; area %.1f; perimetro %d",
                hipotenusa, area, perimetro);
        JOptionPane.showInternalMessageDialog(
                null, information,"TRIÁNGULO RECTÁNGULO", JOptionPane.INFORMATION_MESSAGE);

    }
}
