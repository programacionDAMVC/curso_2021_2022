package teoria.excepcionesDeclarativas.antes17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjemploLectura {
    public static void main(String[] args) {
        Scanner sc = null;
        try {
            sc = new Scanner(new File("ficheros/constitucion"));
            System.out.println("encontrado fichero");

        } catch (FileNotFoundException e) {
           // e.printStackTrace();
            System.err.println("No localizado fichero");
        } finally { //se usa para cerrar flujos
            System.out.println("bloque finally");
            if (sc != null)
                sc.close();
        }
        //operaciones

        System.out.println("fin de programa");
    }
}
