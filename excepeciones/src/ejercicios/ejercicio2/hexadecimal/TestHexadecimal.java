package ejercicios.ejercicio2.hexadecimal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestHexadecimal {
    public static void main(String[] args) {
       /* String valor = "ff";
        try {
            Hexadecimal hexadecimal = new Hexadecimal(valor);
            System.out.println(hexadecimal);
        } catch (HexadecimalException e) {
            //e.printStackTrace();
            System.err.printf("%s no es un valor hexadecimal%n", valor);
        }*/
        List<Hexadecimal> listaHexadecimales = new ArrayList<>();
        String valor ="";
        Hexadecimal hexadecimal = null;
        File inFile = new File("ficheros/hexadecimal.txt");
        try (Scanner sc = new Scanner(inFile)) {
            while (sc.hasNextLine()){
                valor = sc.nextLine();
                try {
                    hexadecimal = new Hexadecimal(valor);
                    //System.out.println(valor);
                    listaHexadecimales.add(hexadecimal);
                } catch (HexadecimalException e) {
                    //e.printStackTrace();
                    System.err.printf("%s no es un valor hexadecimal%n", valor);
                }

                //System.out.println(sc.nextLine());
            }

        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.err.printf("El fichero %s no existe", inFile);
        }

        for (Hexadecimal hex: listaHexadecimales) {
            System.out.println(hex);
            System.out.printf("Valor en decimal %d%n", hex.convertirADecimal1());
        }

    }
}
