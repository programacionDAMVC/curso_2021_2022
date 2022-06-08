package Ejercicio3;

import java.time.LocalDate;

public class Estudiante extends Persona{
    private static final double PORCENTAJE = 11.2;

    private Estudios estudios;

    public Estudiante(String nombrePersona, String apellidos, String dni, LocalDate fechaNacimiento,
                      boolean desempleado, Estudios estudios) throws DNIException {
        super(nombrePersona, apellidos, dni, fechaNacimiento, desempleado);
        this.estudios = estudios;
    }

    public Estudios getEstudios() {
        return estudios;
    }

    public void setEstudios(Estudios estudios) {
        this.estudios = estudios;
    }
    //joaquin,zafra,11111111H,12/12/1999,TRUE,CICLOS
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(',');
        stringBuilder.append(estudios);
        return stringBuilder.toString();
    }

    @Override
    public double mostrarSueldo() {
        return super.mostrarSueldo();
    }
}
