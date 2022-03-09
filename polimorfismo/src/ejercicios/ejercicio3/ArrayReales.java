package ejercicios.ejercicio3;

import java.util.Arrays;

public class ArrayReales implements Estadistica{
    private double[] datos;

    public ArrayReales(double[] datos) {
        this.datos = datos;
        Arrays.sort(datos);
    }

    public double[] getDatos() {
        return datos;
    }

    @Override
    public int obtenerNumeroValores() {
        return datos.length;
    }

    @Override
    public double obtenerValorMinimo() {
        return datos[0];
    }

    @Override
    public double obtenerValorMaximo() {
        return datos[datos.length -1];
    }

    @Override
    public double calcularSuma() {
        double suma = 0.0;
        for (double dato: datos) {
            suma += dato;
        }
        return suma;
    }

    @Override
    public double calcularValorMedio() {
        return calcularSuma() / datos.length;
    }

    @Override
    public double calcularDesviacionTipica() {
        double valorMedio = calcularValorMedio();
        double suma = 0.0;
        for (double dato: datos) {
            suma += Math.pow((dato - valorMedio), 2);
        }
        return Math.sqrt( suma / datos.length );
    }
}
