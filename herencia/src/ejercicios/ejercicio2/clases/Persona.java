package ejercicios.ejercicio2.clases;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

    //atributos
    private String nombrePersona;
    private LocalDate fechaNacimiento;
    private String dni;

    //constructor
    public Persona(String nombrePersona, LocalDate fechaNacimiento, String dni) {
        this.nombrePersona = nombrePersona;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    //toString nombre, dni y edad X años
    @Override
    public String toString() {
        return String.format("%S, %s y edad %d años", nombrePersona, dni,
                getAnnos());
    }

    private int getAnnos() {
        Period periodo = Period.between(fechaNacimiento, LocalDate.now());
        return periodo.getYears();
    }


}
