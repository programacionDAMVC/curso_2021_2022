package teoria.entrada.nivelBytes;

import java.io.*;

public class LeerImagen {
    public static void main(String[] args) {
        File inFile = new File("FICHEROS/imagen.png");
        if (!inFile.exists()) {
            System.out.printf("No existe el fichero %s%n", inFile);
            System.out.println("abandonando el programa....");
            return;
        }
        //crear el flujo de entrada: buffer--inputstream para leer un fichero
        try (BufferedInputStream in = new BufferedInputStream(
                new FileInputStream(inFile))) {
            int contadorBytes = 0;
            while (in.available() != 0) {
                int byteLeido = in.read();
                System.out.printf("Byte leido %d%n", byteLeido);
                contadorBytes++;
            }
            System.out.printf("Bytes leidos %d%n", contadorBytes);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
