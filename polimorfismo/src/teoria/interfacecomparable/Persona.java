package teoria.interfacecomparable;

import java.time.LocalDate;
import java.time.Period;

public class Persona implements Comparable<Persona>{
    private String nombre;
    private LocalDate fechaNacimiento;
    private String dni;

    public Persona(String nombre, LocalDate fechaNacimiento, String dni) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return String.format("NOMBRE: %s, EDAD: %d y DNI: %s",
                nombre, calcularEdad(), dni);
    }

    private int calcularEdad() {
        Period period = Period.between(fechaNacimiento, LocalDate.now());
        int annos = period.getYears();
        return annos;
      //  return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

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

    @Override
    public int compareTo(Persona persona) {
        return this.calcularEdad() - persona.calcularEdad();
    }
}
