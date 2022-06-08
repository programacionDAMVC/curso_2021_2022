package Ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestPolimorfismo {
    public static void main(String[] args) {
        List<Persona> lista = new ArrayList<>();
        Persona estudiante1 = null, estudiante2 = null,
                profesor1 = null, profesor2 = null;
        try {
            estudiante1 = new Estudiante("agustina", "zafra garrido", "11111111h",
                    LocalDate.of(2000,9,15), false, Estudios.CICLOS);
            lista.add(estudiante1);
            profesor1 = new Profesor("esther", "garcía rebollo", "12345678a",
                    LocalDate.of(2000,9,15), "1º DAM", Asignaturas.SISTEMAS_OPERATIVOS);
            lista.add(profesor1);
            estudiante2 = new Estudiante("agustin", "zafra gómez", "11111112h",
                    LocalDate.of(2010,9,15), false, Estudios.CICLOS);
            lista.add(estudiante2);
            profesor2 = new Profesor("esther", "garcía rebollo", "12345678b",
                    LocalDate.of(2000,9,15), "1º DAM", Asignaturas.CIENCIAS_NATURALES);
            lista.add(profesor2);

        } catch (DNIException e) {
            e.printStackTrace();
        }

        mostrarDatosPersona(estudiante1);
        mostrarDatosPersona(profesor1);

        mostrarDatosLista(lista);
        System.out.println("-----------------------------------------");
        mostrarDatosLista(obtenerListaMayoresEdad(lista));
        System.out.println("-----------------------------------------");
        mostrarDatosEspecificosLista(lista);
    }
    //método que nos diga si es un profesor nos dé la materia que imparte
    //si es un alumno nos de los estudios
    private static void mostrarDatosEspecificosLista(List<Persona> lista) {
        for (Persona persona: lista) {
            if (persona instanceof Estudiante)
                System.out.printf("%s, %s ESTUDIANTE de estudios %s%n",
                        persona.getApellidos(), persona.getNombrePersona() ,((Estudiante) persona).getEstudios());
            else
                System.out.printf("%s, %s PROFESOR de asignatura %s%n",
                        persona.getApellidos(), persona.getNombrePersona() , ((Profesor) persona).getAsignatura());
        }
    }



    private static List<Persona> obtenerListaMayoresEdad(List<Persona> lista) {
        List<Persona> listaMayores = new ArrayList<>();
        for (Persona persona : lista) {
            if (Helper.calcularEdad(persona.getFechaNacimiento()) >= 18){
                listaMayores.add(persona);
            }
        }
        return listaMayores;
    }

    private static void mostrarDatosLista(List<Persona> lista) {
        int contador = 1;
        for (Persona persona: lista) {
            System.out.printf("%d. %s%n", contador++, persona);
        }
    }



    private static void mostrarDatosPersona(Persona persona) {
        System.out.println(persona);
    }
}
