package matematicas.geometria.figuras_poligonales.triangulares;

import java.util.StringJoiner;

public class TrianguloRectangulo {
    //atributos
    private double catetoMenor;
    private double catetoMayor;

    //constructor
    public TrianguloRectangulo(double catetoMenor, double catetoMayor) {
        this.catetoMenor = catetoMenor;
        this.catetoMayor = catetoMayor;
    }
    public TrianguloRectangulo() {
    }

    //getters y setters
    public double getCatetoMenor() {
        return catetoMenor;
    }

    public void setCatetoMenor(double catetoMenor) {
        this.catetoMenor = catetoMenor;
    }

    public double getCatetoMayor() {
        return catetoMayor;
    }

    public void setCatetoMayor(double catetoMayor) {
        this.catetoMayor = catetoMayor;
    }

    @Override
    public String toString() {
        //representación como un registro de un csv
        //5.5;2.2
        //6.6;2.1
        return String.format("TRIÁNGULO RECTÁNGULO;%.2f;%.2f", catetoMayor, catetoMenor);
    }

    //resto de métodos
    public double calcularHipotenusa() {
        return Math.sqrt(catetoMayor * catetoMayor + catetoMenor * catetoMenor);
    }

    public double calcularPerimetro() {
        return catetoMenor + catetoMayor + calcularHipotenusa();
    }
    public double calcularArea() {
        return catetoMenor * catetoMayor / 2.0;  //no necesario 2.0 vale 2
    }


}
