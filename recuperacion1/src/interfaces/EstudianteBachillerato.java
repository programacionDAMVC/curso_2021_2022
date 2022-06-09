package interfaces;

public class EstudianteBachillerato extends Estudiante{
    private EspecialidadesBachillerato especialidad;

    public EstudianteBachillerato(String nombre, String apellidos, double mediaCursoAnterior,
                                  EspecialidadesBachillerato especialidad) {
        super(nombre, apellidos, mediaCursoAnterior);
        this.especialidad = especialidad;
    }

    @Override
    public String mostrarEspecialidadEstudio() {
        return especialidad.toString();
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos().toUpperCase();
    }
}
