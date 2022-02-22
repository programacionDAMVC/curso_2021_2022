package ejercicios.ejercicio2.test;

import ejercicios.ejercicio2.clases.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestClaustro {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        String sNumeroProfesores = null;
        Profesor profesor = null;
        List<Profesor> listaProfesores = new ArrayList<>();

        do {
            System.out.println("introduce número de profesores (5 - 100)");
            sNumeroProfesores = sc.nextLine();
        } while ( !sNumeroProfesores.matches("[5-9]|[1-9][0-9]|100") );
        int iNumeroProfesores = Integer.parseInt(sNumeroProfesores);
        for (int i = 0; i < iNumeroProfesores; i++) {
            System.out.printf("%n%nIntroduce datos del profesor %d%n", ++i);
            profesor = crearObjetoProfesor();
            listaProfesores.add(profesor);
        }

        sc.close();
        System.out.println("\n\n");
        System.out.println(listaProfesores);

    }
    private static Profesor crearObjetoProfesor() {

        Persona persona = crearPersona();
        Especialidad especialidad = solicitarEspecilidad();
        String opcionProfesor = solicitarTipProfesor();
        if (opcionProfesor.equals("1")) {
            int tiempoServicio = solicitarTiempoServicio();
            Profesor profesorInterino = new ProfesorInterino(persona.getNombrePersona(),
                    persona.getFechaNacimiento(), persona.getDni(), especialidad,
                    tiempoServicio);
            return profesorInterino;
        }
        System.out.println("Introduce fecha de incorporación:");
        LocalDate fechaIncorporacion = getFecha();
        Profesor profesorTitular = new ProfesorTitular(persona.getNombrePersona(),
                persona.getFechaNacimiento(), persona.getDni(), especialidad,
                fechaIncorporacion);
        return profesorTitular;
    }

    private static int solicitarTiempoServicio() {
        String sTiempo = null;
        do {
            System.out.println("Introduce tiempo de servicio, de 1 a 12 meses");
            sTiempo = sc.nextLine();
        } while (! sTiempo.matches("[1-9]|1[0-2]"));
        return  Integer.parseInt(sTiempo);
    }

    private static String solicitarTipProfesor() {
        String sOpcion  ="";
        do {
            System.out.println("Elige opción: ");
            System.out.println("1. Profesor interino");
            System.out.println("2. Profesor titular\n");
            sOpcion = sc.nextLine();
        } while (! sOpcion.matches("[12]"));
        return sOpcion;
    }

    private static Persona crearPersona() {
        System.out.println("Introduce nombre:");
        String nombre = sc.nextLine();
        System.out.println("Introduce datos fecha de nacimiento");
        LocalDate fecha = getFecha();

        String dni = null;
        do {
            System.out.println("Introduce dni:");
            dni = sc.nextLine();
        } while ( !Helper.validarDNI(dni) );
        return new Persona(nombre, fecha, dni);
    }

    private static LocalDate getFecha() {
        String sDia = null, sMes = null, sAnno = null;
        do {
            System.out.println("Introduce día:");
            sDia = sc.nextLine();
            System.out.println("Introduce mes:");
            sMes = sc.nextLine();
            System.out.println("Introduce año:");
            sAnno = sc.nextLine();
        } while ( !Helper.validarFecha(sDia, sMes, sAnno ) );
        int dia = Integer.parseInt(sDia);
        int mes = Integer.parseInt(sMes);
        int anno = Integer.parseInt(sAnno);
        LocalDate fecha = LocalDate.of(anno, mes, dia);
        return fecha;
    }

    private static Especialidad solicitarEspecilidad() {
        String opcion = null;
        do {
            System.out.println("Introduce la especialidad");
            System.out.println("1. MATEMATICAS");
            System.out.println("2. LENGUA");
            System.out.println("3. INFORMATICA");
            System.out.println("4. ECONOMIA");
            System.out.println("5. INGLES");
            System.out.print("Elige opción:  ");
            opcion = sc.nextLine();
        } while (! opcion.matches("[1-5]"));
        switch (opcion) {
            case "1":
                return Especialidad.MATEMATICAS;
            case "2":
                return Especialidad.LENGUA;
            case "3":
                return Especialidad.INFORMATICA;
            case "4":
                return Especialidad.ECONOMIA;
            default:
                return Especialidad.INGLES;
        }
   }
}
