package teoria.salida.nivelBytes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;

public class EscribirPersonas {
    public static void main(String[] args) {

        Persona persona1 = new Persona("julio", "mena armenteros",
                LocalDate.of(2000,10,10));
        byte[] bytesPersona1 = persona1.toString().getBytes();
        Persona persona2 = new Persona("rocío", "cañada armenteros",
                LocalDate.of(2011,2,1));
        byte[] bytesPersona2 = persona2.toString().getBytes();

        File outFile = new File("FICHEROS/personas.txt");
        try (FileOutputStream out = new FileOutputStream(outFile)) {
            out.write(bytesPersona1);
            out.write("\n".getBytes());
            out.write(bytesPersona2);
            out.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.printf("Escritos %d bytes en el fichero %s%n",
                outFile.length(), outFile);
    }
}
