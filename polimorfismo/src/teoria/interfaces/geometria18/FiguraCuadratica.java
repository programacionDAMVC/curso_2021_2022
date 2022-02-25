package teoria.interfaces.geometria18;

public abstract class FiguraCuadratica implements Figura {

    private int lado1;
    private int lado2;
    private int lado3;
    private int lado4;

    public FiguraCuadratica(int lado1, int lado2, int lado3, int lado4) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
    }

    public int getLado1() {
        return lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public int getLado4() {
        return lado4;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public void setLado4(int lado4) {
        this.lado4 = lado4;
    }

  //  public abstract double calcularArea();

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3 + lado4;
    }

    @Override
    public String nombrar() {
        return "Figura cuadrática";
    }
}
