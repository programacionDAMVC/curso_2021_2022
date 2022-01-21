package teoria.stringbuilder;

import java.util.Scanner;

public class TestStringBuilder {
    public static void main(String[] args) {
        //usamos scanner
        Scanner sc = new Scanner(System.in);
        //solicitamos nombre
        System.out.println("Introduce nombre de la persona:");
        String nombrePersona = "";
        do {
            nombrePersona = sc.nextLine();
        } while (! validarNombreYApellidos(nombrePersona));
        //solicitamos apellidos
        //en ambos comprobamos que vienen mínimo dos caracteres
        //solo se puede admitir caracteres
        //hacemos un método aparte
        //solicitamos edad, debe ser un número natural
        //usamos stringbuider para crear la cadena
        // garcía garcía, juan, 22 años
        //la mostramos en consola
    }

    private static boolean validarNombreYApellidos(String cadena) {
        return cadena.matches("");
    }
}
