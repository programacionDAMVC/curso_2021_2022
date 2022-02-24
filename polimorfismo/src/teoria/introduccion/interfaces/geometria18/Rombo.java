package teoria.introduccion.interfaces.geometria18;

public class Rombo extends FiguraCuadratica {

    private int angulo; //viene en grados

    public Rombo(int lado, int angulo) {
        super(lado, lado, lado, lado);
        this.angulo = angulo;
    }

    @Override
    public double calcularArea() {
        return Math.pow(getLado1(), 2) * Math.sin(Math.toRadians(angulo));
    }

    @Override
    public String nombrar() {
        return String.format("Rombo de lado %d y ángulo %dº", getLado1(), angulo);
    }
}
