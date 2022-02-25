package teoria.polimorfismo;

public class TrianguloEquilatero extends FiguraRegular {
    public TrianguloEquilatero(int valorLado) {
        super(3, valorLado);
    }

    public TrianguloEquilatero() {
        setNumeroLados(3);
    }
    public double calcularArea() {
        return Math.pow(getValorLado(), 2) * Math.sqrt(3) / 4.0;
    }
}
