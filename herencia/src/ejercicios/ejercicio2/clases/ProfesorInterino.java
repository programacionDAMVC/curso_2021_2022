package ejercicios.ejercicio2.clases;

import java.time.LocalDate;

//hereda de profesor
public class ProfesorInterino extends Profesor{
    //atributo: meses de contratación
    //toString de persona, profesor y atributo
    private int mesesContratacion;

    public ProfesorInterino(String nombrePersona, LocalDate fechaNacimiento, String dni,
                            Especialidad especialidad, int mesesContratacion) {
        super(nombrePersona, fechaNacimiento, dni, especialidad);
        this.mesesContratacion = mesesContratacion;
    }

    @Override
    public String toString() {
        return String.format("%s, meses de contratación %d",
                super.toString(), mesesContratacion);
    }
}
