package ejercicios.ejercicio2;

public class Hexagono extends PoligoRegular{


    public Hexagono(int longitudLado) {
        super(6, longitudLado);
    }

    @Override
    public double calcularArea() {
        return 2.60 * Math.pow(longitudLado, 2);
    }
    @Override
    public String toString() {
        return String.format("HEXÁGONO, %s" , super.toString());
    }
}
