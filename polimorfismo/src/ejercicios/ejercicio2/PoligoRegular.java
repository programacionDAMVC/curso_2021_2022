package ejercicios.ejercicio2;
//poligono regular todos sus lados son iguales
public abstract class PoligoRegular implements Comparable<PoligoRegular>{

    protected int numeroLados;
    protected int longitudLado;

    public PoligoRegular(int numeroLados, int longitudLado) {
        this.numeroLados = numeroLados;
        this.longitudLado = longitudLado;
    }

    public int calcularPerimetro () {
        return numeroLados * longitudLado;
    }

    public abstract double calcularArea();

    @Override
    public String toString() {
        return String.format("POLIGONO REGULAR de %d lados e %d de longitud de lado cuyo perı́metro es %d y área %.2f",
                numeroLados, longitudLado, calcularPerimetro(), calcularArea());
    }

    @Override
    public int compareTo(PoligoRegular poligoRegular) {
        //tenemos en cuenta el caso a1 = 3.1 a2 = 3.9
        //la diferencia es -0.8
        //despues del casting es 0, los dos son iguales.
        //si multiplicas por 100 (no obligatorio, pero recomendado)
        //la operación es 310 - 390 = -80
        //el primero es mas chico que el segundo
        return (int) (this.calcularArea() * 100 - poligoRegular.calcularArea() * 100 );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PoligoRegular that = (PoligoRegular) o;

        if (numeroLados != that.numeroLados) return false;
        return longitudLado == that.longitudLado;
    }

    @Override
    public int hashCode() {
        int result = numeroLados;
        result = 31 * result + longitudLado;
        return result;
    }
}
