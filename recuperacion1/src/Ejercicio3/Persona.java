package Ejercicio3;

import java.time.LocalDate;

public class Persona {
    //Atributos para nombre, apellidos, dni, fecha de nacimiento y persona con trabajo
    //o sin trabajo.
    private String nombrePersona;
    private String apellidos;
    private String dni;
    private LocalDate fechaNacimiento;
    private boolean desempleado;

    public Persona(String nombrePersona, String apellidos, String dni,
                   LocalDate fechaNacimiento, boolean desempleado) throws DNIException {
        if (!Helper.esDNIValido(dni))
            throw new DNIException();
        this.nombrePersona = nombrePersona;
        this.apellidos = apellidos;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.desempleado = desempleado;
       /* if (Helper.esDNIValido(dni)) {
            this.nombrePersona = nombrePersona;
            this.apellidos = apellidos;
            this.dni = dni;
            this.fechaNacimiento = fechaNacimiento;
            this.desempleado = desempleado;
        } else {
            throw new DNIException();
        }*/
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isDesempleado() {
        return desempleado;
    }

    public void setDesempleado(boolean desempleado) {
        this.desempleado = desempleado;
    }

    //joaquin,zafra,11111111H,12/12/1999,TRUE
    @Override
    public String toString() {
        return String.format("%s,%s,%S,%d/%d/%d,%B",
                nombrePersona,apellidos,dni,fechaNacimiento.getDayOfMonth(),
                fechaNacimiento.getMonthValue(), fechaNacimiento.getYear(),desempleado);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persona persona = (Persona) o;

        return dni.equalsIgnoreCase(persona.dni);
    }

    @Override
    public int hashCode() {
        return dni.hashCode();
    }
}
