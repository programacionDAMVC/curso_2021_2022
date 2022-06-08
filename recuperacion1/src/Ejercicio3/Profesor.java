package Ejercicio3;

import java.time.LocalDate;

public class Profesor extends Persona{

    private static final double EXTRAPROFESOR = 815;

    private String cursoImpartido;
    private Asignaturas asignatura;

    public Profesor(String nombrePersona, String apellidos, String dni, LocalDate fechaNacimiento,
                    String cursoImpartido, Asignaturas asignatura) throws DNIException {
        super(nombrePersona, apellidos, dni, fechaNacimiento, false);
        this.cursoImpartido = cursoImpartido;
        this.asignatura = asignatura;
    }

    public String getCursoImpartido() {
        return cursoImpartido;
    }

    public void setCursoImpartido(String cursoImpartido) {
        this.cursoImpartido = cursoImpartido;
    }

    public Asignaturas getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignaturas asignatura) {
        this.asignatura = asignatura;
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(',');
        stringBuilder.append(cursoImpartido);
        stringBuilder.append(',');
        stringBuilder.append(asignatura);
        return stringBuilder.toString();
    }
}
