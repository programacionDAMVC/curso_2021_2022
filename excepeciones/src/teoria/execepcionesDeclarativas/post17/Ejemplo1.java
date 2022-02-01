package teoria.execepcionesDeclarativas.post17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {
        //el scanner se cierra, si se abre
        try (Scanner sc = new Scanner(new File("ficheros/constitucion"))) {
            System.out.println("fichero abierto");
        } catch (FileNotFoundException e) {
            System.out.println("no encontrado fichero");
           // e.printStackTrace();
        }
        System.out.println("continuación del programa");
    }
}
