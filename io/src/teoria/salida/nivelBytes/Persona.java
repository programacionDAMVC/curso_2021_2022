package teoria.salida.nivelBytes;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

    private String nombrePersona;
    private String apellidos;
    private LocalDate fechaNacimiento;

    public Persona(String nombrePersona, String apellidos, LocalDate fechaNacimiento) {
        this.nombrePersona = nombrePersona;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    //toString (nombre,apellidos,edad)

    @Override
    public String toString() {
        return String.format("%s,%s,%d",
                nombrePersona, apellidos, getEdad());
    }

    private int getEdad() {
        Period period = Period.between(fechaNacimiento, LocalDate.now());
        return period.getYears();
    }
}
