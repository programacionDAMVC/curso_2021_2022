package ejercicios.ejercicio1;

public class Tecnico extends Trabajador{

    private static final double PAGA_DIARIA = 200.0;
    private Titulacion titulacion;

    public Tecnico(String nombreTrabajador, String apellidosTrabajador, Titulacion titulacion) {
        super(nombreTrabajador, apellidosTrabajador);
        this.titulacion = titulacion;
    }

    public Titulacion getTitulacion() {
        return titulacion;
    }

    @Override
    public double calcularSueldoMensual(int diasTrabajados) {
        //idem que en Oficial, pero ahora cambiamos el enum de Tecnico y ahí
        //se asigna en el enum los valores de 500, 400 y 300 respectivamente
        //se retorna el sueldo mensual mas la paga extra
        //return PAGA_DIARIA * diasTrabajados; sin la extra
        return PAGA_DIARIA * diasTrabajados + titulacion.getExtra();

    }
}
