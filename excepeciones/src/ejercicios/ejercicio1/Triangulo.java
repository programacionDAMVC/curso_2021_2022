package ejercicios.ejercicio1;

public class Triangulo {
    //atributos
    private int lado1;
    private int lado2;
    private int lado3;
    //constructor o constructores
    public Triangulo(int lado1, int lado2, int lado3) throws IlegalTrianguloException {
        if ( esTriangulo (lado1, lado2, lado3) ) {
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.lado3 = lado3;
        } else {
            throw new IlegalTrianguloException();
        }
    }

    private boolean esTriangulo(int lado1, int lado2, int lado3) {
        return lado1 + lado2 > lado3 && lado1 + lado3 > lado2
                && lado2 + lado3 > lado1;
    }

    //getters
    public int getLado1() {
        return lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public int getLado3() {
        return lado3;
    }

    @Override
    public String toString() {
        return String.format("Triangulo: lado1 %d, lado2 %d y lado3 %d",
                lado1, lado2, lado3);
    }
}
