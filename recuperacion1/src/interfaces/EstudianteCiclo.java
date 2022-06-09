package interfaces;

public class EstudianteCiclo extends Estudiante{
    private EspecialidadesCiclos especialidad;

    public EstudianteCiclo(String nombre, String apellidos, double mediaCursoAnterior,
                           EspecialidadesCiclos especialidad) {
        super(nombre, apellidos, mediaCursoAnterior);
        this.especialidad = especialidad;
    }

    @Override
    public String mostrarEspecialidadEstudio() {
        return especialidad.toString();
    }
}
