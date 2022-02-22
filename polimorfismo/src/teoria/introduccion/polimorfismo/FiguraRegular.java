package teoria.introduccion.polimorfismo;

public abstract class FiguraRegular {

    private int numeroLados;
    private int valorLado;

    public FiguraRegular(int numeroLados, int valorLado) {
        this.numeroLados = numeroLados;
        this.valorLado = valorLado;
    }

    public FiguraRegular() {
    }

    public int getValorLado() {
        return valorLado;
    }

    public void setValorLado(int valorLado) {
        this.valorLado = valorLado;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    public void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int calcularPerimetro () {
        return numeroLados * valorLado;
    }

    public abstract double calcularArea();
}
