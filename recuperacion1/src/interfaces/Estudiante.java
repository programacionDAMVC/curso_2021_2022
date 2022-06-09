package interfaces;

public abstract class Estudiante implements EstudianteGenerico{

    private String nombre;
    private String apellidos;
    private double mediaCursoAnterior;

    public Estudiante(String nombre, String apellidos, double mediaCursoAnterior) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.mediaCursoAnterior = mediaCursoAnterior;
    }

    @Override
    public abstract String mostrarEspecialidadEstudio() ;

    @Override
    public double mostrarMediaCursoAnterior() {
        return mediaCursoAnterior;
    }

    @Override
    public String mostarNombreCompleto() {
        return String.format("%s, %s", apellidos, nombre);
    }
}
