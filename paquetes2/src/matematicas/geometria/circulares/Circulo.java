package matematicas.geometria.circulares;

public class Circulo {
    //atributos
    private double radio;

    //constructores
    public Circulo(double radio) {
        this.radio = radio;
    }
    public Circulo() {
    }

    //getters y setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //toString
    @Override
    public String toString() {
        return String.format("CÍRCULO;%.2f", radio);
    }

    //calcular área
    public double calcularArea(){
        return Math.PI * Math.pow(radio, 2);
    }

    //calcular perímetro
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
