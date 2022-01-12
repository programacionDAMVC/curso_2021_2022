package matematicas.geometria.figuras_poligonales.cuadraticas;

import java.util.StringJoiner;

public class Rectangulo {
    //atributos
    private double base;
    private double altura;

    //constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    //getters y setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //toString
    @Override
    public String toString() {
        return String.format("RECTÁNGULO;%.2f;%.2f", base, altura);
    }

    //calcular area
    public double calcularArea() {
        return base * altura;
    }
    //calcular perimetro
    public  double calcularPerimetro(){
        return base + altura + base + altura;
    }
    //calcular diagonal
    public double calcularDiagonal() {
        return Math.hypot(base, altura);
    }
}
