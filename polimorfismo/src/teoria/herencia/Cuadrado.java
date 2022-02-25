package teoria.herencia;

public class Cuadrado extends FiguraRegular{

    public Cuadrado(int valorLado) {
        super(4, valorLado);
    }

    public Cuadrado() {
       // setNumeroLados(4);
        numeroLados = 4;
    }
   /* public double calcularArea() {
        return getValorLado() * getValorLado();
    }*/
    public double calcularArea() {
        return valorLado * valorLado;
    }

}
