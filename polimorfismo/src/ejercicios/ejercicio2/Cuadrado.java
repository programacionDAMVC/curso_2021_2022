package ejercicios.ejercicio2;

public class Cuadrado extends PoligoRegular{


    public Cuadrado(int longitudLado) {
        super(4, longitudLado);
    }

    @Override
    public double calcularArea() {
        return Math.pow(longitudLado, 2);
    }

    @Override
    public String toString() {
        return String.format("CUADRADO, %s" , super.toString());
    }
}
