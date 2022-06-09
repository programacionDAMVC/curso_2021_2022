package Ejercicio3;

import java.time.LocalDate;

public class Estudiante extends Persona{
    private static final double PORCENTAJE = 10.2;
    private static final double TASAS = 10.0;
    private static final float REBAJA_FISCAL = 1.0f;
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
        return super.mostrarSueldo() * super.mostrarSueldo() * PORCENTAJE / 100.0;
    }

    @Override
    public double pagarTasas() {
        return TASAS;
    }
    @Override
    public double pagarIVA() {
        return mostrarSueldo() * (IVA - REBAJA_FISCAL) / 100.0;
    }
}
