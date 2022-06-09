package interfaces;

public interface EstudianteGenerico {

    String mostrarEspecialidadEstudio();
    double mostrarMediaCursoAnterior();
    String mostarNombreCompleto();

    default String mostrarDatos() {
        return  String.format("%S: curso matriculado %s, nota media anterior %.2f",
                mostarNombreCompleto(), mostrarEspecialidadEstudio(),
                mostrarMediaCursoAnterior());
    }

}
