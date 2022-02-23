package teoria.introduccion.interfaces.geometria;

public class Cuadrado extends FiguraCuadraticas{

    public Cuadrado(int lado) {
        super(lado, lado, lado, lado);
    }

    @Override
    public double calcularArea() {
        return getLado1() * getLado1();
    }

    @Override
    public String nombrar() {
        return "Cuadrado";
    }
}
