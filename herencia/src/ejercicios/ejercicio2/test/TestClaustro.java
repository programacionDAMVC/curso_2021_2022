package ejercicios.ejercicio2.test;

import ejercicios.ejercicio2.clases.Especialidad;
import ejercicios.ejercicio2.clases.Helper;
import ejercicios.ejercicio2.clases.Persona;
import ejercicios.ejercicio2.clases.Profesor;

import java.time.LocalDate;
import java.util.Scanner;

public class TestClaustro {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //cambio código para solicitar datos:
        //primero nombre
        //segundo fecha nacimiento (validar dias, meses y años) mejor usar un  método
        //tercer dni, hasta que sea válido usando el método del Helper
        Profesor profesor = crearObjetoProfesor();
    }
    private static Profesor crearObjetoProfesor() {
        Persona persona = crearPersona();
        Especialidad especialidad = solicitarEspecilidad();
        /* solicitamos si es profesor interino o titular
        si es titular solicitamos fecha de incorporación
        y si es interino meses de contrato
         */
        return null;
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
        } while ( !Helper.validarDNI(dni));
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
