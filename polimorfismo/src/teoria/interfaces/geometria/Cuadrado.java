package teoria.interfaces.geometria;

public class Cuadrado extends FiguraCuadratica {

    public Cuadrado(int lado) {
        super(lado, lado, lado, lado);
    }

    @Override
    public double calcularArea() {
        return getLado1() * getLado1();
    }

    @Override
    public String nombrar() {
        return String.format("Cuadrado de lado %d", getLado1());
    }
}
