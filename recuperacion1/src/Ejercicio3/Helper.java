package Ejercicio3;

public class Helper {
    public static boolean esDNIValido (String dni){
        return dni.toUpperCase().matches("^[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]$");
    }

    public static void main(String[] args) {
        System.out.println(esDNIValido("123456a"));
    }
}
