package ejercicios.ejercicio2.clases;

import java.time.LocalDate;

//hereda de Persona
public class Profesor extends Persona{
    //atributo especialidad, enum MATEMATICAS, LENGUA, INFORMATICA, FOL, ...
    private Especialidad especialidad;

    public Profesor(String nombrePersona, LocalDate fechaNacimiento, String dni, Especialidad especialidad) {
        super(nombrePersona, fechaNacimiento, dni);
        this.especialidad = especialidad;
    }
    //toString nombre, dni y edad X años, especialiad

    @Override
    public String toString() {
        return String.format("%s, %s", super.toString(), especialidad);
    }
}
