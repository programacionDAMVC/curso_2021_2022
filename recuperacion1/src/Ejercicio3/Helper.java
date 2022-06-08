package Ejercicio3;

import java.time.LocalDate;
import java.time.Period;

public class Helper {

    public static boolean esDNIValido (String dni){
        return dni.toUpperCase().matches("^[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]$");
    }
    public static int calcularEdad(LocalDate fechaNacimiento) {
        Period periodo = Period.between(fechaNacimiento, LocalDate.now());
        return periodo.getYears();
    }

    public static void main(String[] args) {

        System.out.println(esDNIValido("123456a"));
        System.out.println(calcularEdad(LocalDate.of(2000, 7, 8)));
    }
}
