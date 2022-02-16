package ejercicios.ejercicio1.clases;

public class Analista extends Informatico{
    //cambio la visibilidad de public a private
    //implica crear getters y setters
    //uso la ocultación de POO
    private String especialidad;

    public Analista(String nombreEmpresa, String especialidad) {
        super(nombreEmpresa);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    //especializo el sueldo del analista con un complemento de 15€ la hora
    @Override
    public double recibirSueldo(double horas) {
        return super.recibirSueldo(horas) + horas * 15;
    }
}
