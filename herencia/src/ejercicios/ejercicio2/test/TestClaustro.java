package ejercicios.ejercicio2.test;

import ejercicios.ejercicio2.clases.Persona;

import java.time.LocalDate;

public class TestClaustro {
    public static void main(String[] args) {
        //cambio código para solicitar datos:
        //primero nombre
        //segundo fecha nacimiento (validar dias, meses y años) mejor usar un  método
        //tercer dni, hasta que sea válido usando el método del Helper
        Persona persona = new Persona("joaquin buenavista",
                LocalDate.of(2000, 11, 11), "111");
        System.out.println(persona);
    }
}
