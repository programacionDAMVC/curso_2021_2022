package ejercicios.ejercicio1.clases;

public class Informatico {
    private String nombreEmpresa;  //cambio de nombre a nombreEmpresa (mas claro)
    private double sueldoPorHoras; //cambio de sueldo a sueldoPorHoras el mismo motivo

    public Informatico(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public double getSueldoPorHoras() {
        return sueldoPorHoras;
    }

    public void setSueldoPorHoras(double sueldoPorHoras) {
        this.sueldoPorHoras = sueldoPorHoras;
    }
    //cambio el nombre del método de pagarSueldo por recibirSueldo, es el tomador no el pagador
    public double recibirSueldo(double horas) {
        return sueldoPorHoras * horas;
    }
}
