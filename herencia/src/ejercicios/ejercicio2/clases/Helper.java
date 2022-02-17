package ejercicios.ejercicio2.clases;

import java.time.LocalDate;

public class Helper {
    //método que valide dni tanto en formato como en letra 11111111H
    public static boolean validarDNI(String dni) {
        String juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKE";
        if (!dni.toUpperCase().matches("[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]"))
            return false;
        String sNumero = dni.substring(0, 8);
        char letra  = dni.toUpperCase().charAt(8);
        //aplicar el algoritmo del dni
        int iNumero = Integer.parseInt(sNumero);
        int posicion = iNumero % 23;
        return juegoCaracteres.charAt(posicion) == letra;
    }



    //método para validar dias, meses y años o fecha completa
    public static boolean validarFecha(String dia, String mes, String anno) {
        boolean bisiesto = false;
       //admitimos años a partir de 19.., 20.., ..,29..
        if ( !anno.matches( "(19|2[0-9])[0-9]{2}") )
            return false;
        bisiesto = Integer.parseInt(anno) % 4 == 0 ;
        boolean finalSiglo = anno.endsWith("00");
        if (finalSiglo) {
            int centenaAnno = Integer.parseInt(anno) / 10;
            if (! (centenaAnno % 4 == 0))
                bisiesto = false;
        }
        //meses 1,2,3 ..., 10,11,12
        if (!mes.matches("0?[1-9]|1[0-2]"))
            return false;
        //días 1,2,3, ..., 10,11...,19,20,...29, 30, 31
        if (!dia.matches("0?[1-9]|1[0-9]|2[0-9]|3[01]"))
            return false;
        int iDia = Integer.parseInt(dia);
        //meses de 31: 1,3,5,7,8,10,12 no de 31 son 2,4,6,9,11
        switch (mes) {
            case "2" :
                if ( iDia > 29)
                    return false;
                if ( iDia == 29 && !bisiesto)
                    return false;
                return true;
            case "4", "6", "9", "11":
                if (iDia > 30)
                    return false;
                return true;
            default:
                return true;
        }
    }
}
