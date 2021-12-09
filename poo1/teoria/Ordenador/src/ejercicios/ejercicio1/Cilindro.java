package ejercicios.ejercicio1;

public class Cilindro {
    //atributos
    private double radio;
    private double longitud;
    //constructor

    public Cilindro(double radio, double longitud) {
        this.radio = radio;
        this.longitud = longitud;
    }

    //getters y setters

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    //resto de métodos
    public double calcularArea() {
        return 2 * Math.PI * radio * longitud + 2 * Math.PI * Math.pow(radio, 2);
    }
    public double calcularVolumen() {
        return Math.PI * longitud * radio * radio;
    }
    //toString

    @Override
    public String toString() {
        return String.format( "CILINDRO: radio %.2f; longitud %.2f; área %.2f y volumen %.2f%n" ,
                radio, longitud, calcularArea(), calcularVolumen() );
    }
}
