package teoria.interfaces.geometria;

public class Rectangulo extends FiguraCuadratica {

    public Rectangulo(int base, int altura) {
        super(base, altura, base, altura);
    }

    @Override
    public double calcularArea() {
        return getLado1() * getLado2(); //ojo lado1 es base y lado2 altura
        //por las posiciones del constructor
        //super(base, altura, base, altura);
        //public FiguraCuadratica(int lado1, int lado2, int lado3, int lado4) {
    }

    @Override
    public String nombrar() {
        return String.format("Rectángulo de base %d y altura %d"
                , getLado1(), getLado2());
    }
}
