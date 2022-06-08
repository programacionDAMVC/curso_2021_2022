package Ejercicio3;

import java.time.LocalDate;

public class TestHerencia {
    public static void main(String[] args) {
        Estudiante estudiante1 = null;
        Profesor profesor1 = null;
        try {
            estudiante1 = new Estudiante("agustina", "zafra garrido", "11111111h",
                    LocalDate.of(2000,9,15), false, Estudios.CICLOS);
            profesor1 = new Profesor("esther", "garcía rebollo", "12345678a",
                    LocalDate.of(2000,9,15), "1º DAM", Asignaturas.SISTEMAS_OPERATIVOS);
        } catch (DNIException e) {
            e.printStackTrace();
        }
        System.out.println(estudiante1);
        System.out.println(profesor1);
    }
}
