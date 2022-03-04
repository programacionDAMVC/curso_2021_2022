package ejercicios.ejercicio2;

public class TrianguloEquilatero extends PoligoRegular{


    public TrianguloEquilatero(int longitudLado) {
        super(3, longitudLado);
    }

    @Override
    public double calcularArea() {
        return Math.pow(longitudLado, 2) * Math.sqrt(3.0) / 4.0;
    }

    @Override
    public String toString() {
        return String.format("TRIÁNGULO EQUILATERO, %s" , super.toString());
    }
}
