package ejercicios.ejercicio1;

public abstract class Trabajador {

    private String nombreTrabajador;
    private String apellidosTrabajador;

    public Trabajador(String nombreTrabajador, String apellidosTrabajador) {
        this.nombreTrabajador = nombreTrabajador;
        this.apellidosTrabajador = apellidosTrabajador;
    }

    protected String obtenerNombreCompleto() {
        return String.format("%S, %S", apellidosTrabajador, nombreTrabajador);
    }

    public abstract double calcularSueldoMensual(int diasTrabajados);
}
