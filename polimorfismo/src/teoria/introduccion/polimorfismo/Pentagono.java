package teoria.introduccion.polimorfismo;

public class Pentagono extends FiguraRegular{

    public Pentagono( int valorLado) {
        super(5, valorLado);
    }

    public Pentagono() {
        setNumeroLados(5);
    }

    @Override
    public double calcularArea() {
        return 1.72 * getValorLado() * getValorLado();
    }
}
