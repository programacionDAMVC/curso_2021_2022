package teoria.stringbuilder;

import numeros.Numeros;

import java.util.Scanner;

public class TestStringBuilder {
    public static void main(String[] args) {
        //usamos scanner
        Scanner sc = new Scanner(System.in);
        //solicitamos nombre
        System.out.println("Introduce nombre de la persona:");
        String nombrePersona = null;
        do {
            nombrePersona = sc.nextLine();
        } while (! validarNombreYApellidos(nombrePersona) );
        //solicitamos apellidos
        System.out.println("Introduce apellidos de la persona:");
        String apellidosPersona = null;
        do {
            apellidosPersona = sc.nextLine();
        } while (! validarNombreYApellidos(apellidosPersona) );
        //en ambos comprobamos que vienen mínimo dos caracteres
        //solo se puede admitir caracteres
        //hacemos un método aparte
        //solicitamos edad, debe ser un número natural
        System.out.println("Introduce edad de la persona:");
        String sEdad = null;
        do {
            sEdad = sc.nextLine();
        } while (! Numeros.esNumeroNatural(sEdad) );
        sc.close();
        int iEdad = Integer.parseInt(sEdad);
        //usamos stringbuider para crear la cadena
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(apellidosPersona);
        sBuilder.append(", ");
        sBuilder.append(nombrePersona);
        sBuilder.append(", ");
        sBuilder.append(iEdad);
        sBuilder.append(" años");
        // garcía garcía, juan, 22 años
        String mensaje = sBuilder.toString();
        //la mostramos en consola
        System.out.println(mensaje);
    }

    private static boolean validarNombreYApellidos(String cadena) {
        return cadena.toLowerCase().matches("[a-záéíóúñü\s]{2,}");
    }
}