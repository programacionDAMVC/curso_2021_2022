package ejercicios.ejercicio2.test;

import ejercicios.ejercicio2.clases.Helper;
import ejercicios.ejercicio2.clases.Persona;

import java.time.LocalDate;
import java.util.Scanner;

public class TestClaustro {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //cambio código para solicitar datos:
        //primero nombre
        //segundo fecha nacimiento (validar dias, meses y años) mejor usar un  método
        //tercer dni, hasta que sea válido usando el método del Helper
        Persona persona = crearObjetoPersona();
    }
    private static Persona crearObjetoPersona() {
        System.out.println("Introduce nombre:");
        String nombre = sc.nextLine();

        String sDia = null, sMes = null, sAnno = null;
        do {
            System.out.println("Introduce día de nacimiento:");
            sDia = sc.nextLine();
            System.out.println("Introduce mes de nacimiento:");
            sMes = sc.nextLine();
            System.out.println("Introduce año de nacimiento:");
            sAnno = sc.nextLine();
        } while ( !Helper.validarFecha(sDia, sMes, sAnno ) );
        int dia = Integer.parseInt(sDia);
        int mes = Integer.parseInt(sMes);
        int anno = Integer.parseInt(sAnno);
        LocalDate fecha = LocalDate.of(anno, mes, dia);

        String dni = null;
        do {
            System.out.println("Introduce dni:");
            dni = sc.nextLine();
        } while ( !Helper.validarDNI(dni));
        System.out.println(dni);
        return new Persona(nombre, fecha, dni);
    }
}
