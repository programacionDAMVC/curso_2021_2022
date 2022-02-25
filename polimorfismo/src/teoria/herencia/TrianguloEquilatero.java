package teoria.herencia;

public class TrianguloEquilatero extends FiguraRegular{
    public TrianguloEquilatero(int valorLado) {
        super(3, valorLado);
    }

    public TrianguloEquilatero() {
      //  setNumeroLados(3);
        numeroLados = 3; //gracias a que el atributo del padre es protected
    }
    /*public double calcularArea() {
        return Math.pow(getValorLado(), 2) * Math.sqrt(3) / 4.0;
    }*/
    public double calcularArea() {
        return Math.pow(valorLado, 2) * Math.sqrt(3) / 4.0;
    }
}
