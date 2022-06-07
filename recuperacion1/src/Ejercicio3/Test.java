package Ejercicio3;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Persona persona1 = null;
        try {
            persona1 = new Persona("joaquin", "zafra garrido", "11111111h",
                    LocalDate.of(2000,9,15), false);
            System.out.println(persona1);
        } catch (DNIException e) {
            e.printStackTrace();
        }
        Persona persona2 = null;
        try {
            persona2 = new Persona("esteban", "zafra garrido", "11111111h",
                    LocalDate.of(2000,9,15), false);
        } catch (DNIException e) {
            e.printStackTrace();

        }
        System.out.println(persona1.equals(persona2));
        String saludo1 = new String("hola");
        String saludo2 = new String("hola");
        System.out.println(saludo1.equals(saludo2));
        Persona persona3 = null;
        try {
            persona3 = new Persona("irene", "garcía garrido", "1111h",
                    LocalDate.of(2000,9,15), true);
            System.out.println(persona3);
        } catch (DNIException e) {
           // e.printStackTrace();
            System.err.println(e.getMessage());
        }



    }
}
