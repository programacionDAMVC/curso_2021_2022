package ejercicios.ejercicio1;

public class Oficial extends Trabajador{

    private static final double PAGA_DIARIA = 100.0;
    private Grado clase;

    public Oficial(String nombreTrabajador, String apellidosTrabajador, Grado clase) {
        super(nombreTrabajador, apellidosTrabajador);
        this.clase = clase;
    }

    public Grado getClase() {
        return clase;
    }

    @Override
    public double calcularSueldoMensual(int diasTrabajados) {
        //usando un switch, el sueldo mensual puede incrementarse de diferente manera
        //PRIMERA: ganan 100 más, los de SEGUNDA: 150  Y los de TERCERA: 200
        //cantidad mensual, no diaria
        return PAGA_DIARIA * diasTrabajados ;
    }
}
