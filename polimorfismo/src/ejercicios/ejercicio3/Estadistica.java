package ejercicios.ejercicio3;

public interface Estadistica {
    int obtenerNumeroValores(); //n´umero de elementos de una colecci´on
    double obtenerValorMinimo(); //valor m´ınimo de una colecci´on
    double obtenerValorMaximo(); //valor m´aximo de una colecci´on
    double calcularSuma(); //suma de los valores de una colecci´on
    double calcularValorMedio(); //valor medio de de una colecci´on
    double calcularDesviacionTipica(); //desviaci´on t´ıpica de de una colecci´on.
    default String mostrarDatosEstadisticos() {
        return String.format("Nº datos %d, valor mínimo %.2f, valor máximo %.2f, suma %.2f, valor medio %.2f y desviación típica %.2f%n",
                obtenerNumeroValores(), obtenerValorMinimo(), obtenerValorMaximo(),
                calcularSuma(), calcularValorMedio(), calcularDesviacionTipica());
    }
    static Estadistica getArrayDeMayorDesviacionTipica(Estadistica e1, Estadistica e2) {
        double dT1 = e1.calcularDesviacionTipica();
        double dT2 = e2.calcularDesviacionTipica();
        if (dT1 > dT2)
            return e1;
        return e2;
    }
}
