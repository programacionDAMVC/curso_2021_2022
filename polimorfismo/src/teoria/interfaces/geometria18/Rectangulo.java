package teoria.interfaces.geometria18;

public class Rectangulo extends FiguraCuadratica {

    public Rectangulo(int base, int altura) {

        super(base, altura, base, altura);
        if (base < altura ) { //queremos que la base sea el lado mas grande
            int[] ordenado = Figura.ordenarValores(base, altura);
            setLado1(ordenado[0]);
            setLado2(ordenado[1]);
            setLado3(ordenado[0]);
            setLado4(ordenado[1]);
        }
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
