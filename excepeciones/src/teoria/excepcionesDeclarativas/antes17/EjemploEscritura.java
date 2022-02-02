package teoria.excepcionesDeclarativas.antes17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class EjemploEscritura {
    public static void main(String[] args) {
        PrintWriter out = null;
        try {
            out = new PrintWriter(new File("fiche/salida.txt"));
            String nombre = "Javier Malavida Gonzáles";
            int edad = 25;
            out.printf("NOMBRE: %s, edad: %d", nombre, edad);
            out.flush();
            System.out.println("Escrito fichero");
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.err.println("Error escribiendo fichero");
        } finally {
            if (out != null)
                out.close();
        }
    }
}
