package teoria.entrada.nivelBytes;

import java.io.*;

public class CopiarImagen {
    public static void main(String[] args) {
        File inFile  = new File("FICHEROS/imagen.png");
        File outFile = new File("FICHEROS/imagen_backup.png");
        if (!inFile.exists()) {
            System.out.printf("No existe el fichero %s%n", inFile);
            System.out.println("abandonando el programa....");
            return;
        }
        //crear el flujo de entrada: buffer--inputstream para leer un fichero
        try (BufferedInputStream in = new BufferedInputStream(
                new FileInputStream(inFile));
            BufferedOutputStream out = new BufferedOutputStream(
                    new FileOutputStream(outFile));) {

            while (in.available() != 0) {
                int byteLeido = in.read();  //leo desde el fujo de entrada
                out.write(byteLeido);       //escribo el byte en el flujo de salida
                out.flush();
            }
            System.out.printf("copiado %d bytes%n", outFile.length());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
