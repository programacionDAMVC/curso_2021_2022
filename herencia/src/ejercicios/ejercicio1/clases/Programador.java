package ejercicios.ejercicio1.clases;

public class Programador extends Informatico{
    //cambio de público a privado, por el motivo indicado en la clase Analista
    //cambio el tipo de String a un tipo enum con valor, como nueva característica de los enum
    private Lenguaje lenguaje;

    public Programador(String nombreEmpresa, Lenguaje lenguaje) {
        super(nombreEmpresa);
        this.lenguaje = lenguaje;
    }
    //al cambiar el atributo de públic a privado, incluyo getters y settes

    public Lenguaje getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(Lenguaje lenguaje) {
        this.lenguaje = lenguaje;
    }

    //Especializamos el método del padre
    @Override
    public double recibirSueldo(double horas) {
        return super.recibirSueldo(horas) + horas * lenguaje.getComplemento();
    }
}
