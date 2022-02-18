package ejercicios.ejercicio2.clases;

import java.time.LocalDate;

//hereda de profesor
public class ProfesorTitular extends Profesor {
    //atributo fecha incorporación
    //toString que aparezca datos de persona, profesor + trienios
    private LocalDate fechaIncorporacion;

    public ProfesorTitular(String nombrePersona, LocalDate fechaNacimiento,
                           String dni, Especialidad especialidad, LocalDate fechaIncorporacion) {
        super(nombrePersona, fechaNacimiento, dni, especialidad);
        this.fechaIncorporacion = fechaIncorporacion;
    }

    @Override
    public String toString() {
        return String.format("%s, trienios: %d",
                super.toString(), Helper.getAnnos(fechaIncorporacion) / 3);
    }
}
