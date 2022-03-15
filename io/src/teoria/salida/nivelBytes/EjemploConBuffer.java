package teoria.salida.nivelBytes;

import java.io.*;

public class EjemploConBuffer {
    public static void main(String[] args) {
        File outFile = new File("FICHEROS/buffer.txt");
        String frase = "En informática, un buffer de datos es un espacio en un disco o en un instrumento digital reservado para el almacenamiento temporal de información digital, mientras que está esperando ser procesada. Por ejemplo, un analizador TRF tendrá uno o varios buffers de entrada, donde se guardan las palabras digitales que representan las muestras de la señal de entrada. El Z-Buffer es el usado para el renderizado de imágenes 3D";
        byte[] bytes = frase.getBytes();
        try (BufferedOutputStream out = new BufferedOutputStream(
                new FileOutputStream(outFile))) {
            out.write(bytes);
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
