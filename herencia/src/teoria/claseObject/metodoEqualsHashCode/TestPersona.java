package teoria.claseObject.metodoEqualsHashCode;

import java.time.LocalDate;

public class TestPersona {
    public static void main(String[] args) {
        Persona persona1 = null;
        try {
            persona1 = new Persona("alberto colino",
                    LocalDate.of(2000, 2, 20), "1111111h");
        } catch (DNIExcepetion e) {
            System.out.println("error en el dni");
        }
        Persona persona2 = null;
        try {
            persona2 = new Persona("esteban miranda",
                    LocalDate.of(1995, 12, 2), "1111111a");
        } catch (DNIExcepetion e) {
            System.out.println("error en el dni");
        }
        Persona persona3 = null;
        try {
            persona3 = new Persona("albert colino",
                    LocalDate.of(2000, 2, 20), "11111111h");
        } catch (DNIExcepetion e) {
            e.printStackTrace();
        }
        Persona persona4 = persona1;
        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
        System.out.println(persona4);

        //ejecuto siempre que persona sea distinta de null
        if (persona1 != null) {
            System.out.printf("¿persona1 igual a persona2? %B%n", persona1.equals(persona2));
            System.out.printf("¿persona1 igual a persona3? %B%n", persona1.equals(persona3));
            System.out.printf("¿persona1 igual a persona4? %B%n", persona1.equals(persona4));
        }


    }
}
