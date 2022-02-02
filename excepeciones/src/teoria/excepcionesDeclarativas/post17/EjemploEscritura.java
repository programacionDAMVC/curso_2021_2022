package teoria.excepcionesDeclarativas.post17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class EjemploEscritura {
    public static void main(String[] args) {
        try (PrintWriter out = new PrintWriter(new File("fich/salida2.txt"))) {
            String nombre = "Javier Buenavida Ramiro";
            int edad = 45;
            out.printf("NOMBRE: %s, edad: %d", nombre, edad);
            out.flush();
            System.out.println("Escrito fichero");
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.err.println("Error escribiendo fichero");
        }
    }
}
