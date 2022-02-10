package teoria.claseObject.metodoEqualsHashCode;

import java.time.LocalDate;

public class Persona {

    private String nombrePersona;
    private LocalDate fechaNacimiento;
    private String dni;

    //si el dni no es válido se debe lanzar la excepción DNIException
    //un dni es válidos si tiene 8 dígitos seguido de una letra (anglosajón)

    /**
     *
     * @param nombrePersona ....
     * @param fechaNacimiento ...
     * @param dni String
     * @throws DNIExcepetion cuando el dni no tiene formato válido
     */
    public Persona(String nombrePersona, LocalDate fechaNacimiento, String dni) throws DNIExcepetion {
        if ( esDNIValido(dni)) {
            this.nombrePersona = nombrePersona;
            this.fechaNacimiento = fechaNacimiento;
            this.dni = dni;
        } else
            throw new DNIExcepetion("dni no válido");
    }

    private boolean esDNIValido(String dni) {
        return dni.toLowerCase().matches("[0-9]{8}[a-z]");
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    //se guarda en un fichero CSV con el formato:
    //juan garcía, 1/1/2000, 11111111h
    @Override
    public String toString() {
        return String.format("%s,%d/%d/%d,%s", nombrePersona, fechaNacimiento.getDayOfMonth(),
                fechaNacimiento.getMonthValue(), fechaNacimiento.getYear(), dni);
    }

    //dos personas son idénticas si tienen el mismo dni

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persona persona = (Persona) o;

        return dni != null ? dni.equals(persona.dni) : persona.dni == null;
    }

    @Override
    public int hashCode() {
        return dni != null ? dni.hashCode() : 0;
    }
}
