package teoria.introduccion.polimorfismo;

public class Cuadrado extends FiguraRegular {

    public Cuadrado(int valorLado) {
        super(4, valorLado);
    }

    public Cuadrado() {
        setNumeroLados(4);
    }
    public double calcularArea() {
        return getValorLado() * getValorLado();
    }
}
