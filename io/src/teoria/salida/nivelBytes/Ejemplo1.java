package teoria.salida.nivelBytes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

//vamos a ecribir una cadena en un fichero
//usamos stream a nivel de bytes
public class Ejemplo1 {
    public static void main(String[] args) {
        //tratamiento de objetos File
        File outFile = new File("FICHEROS/fichero1.txt");
       /* if (outFile.exists()) {
            System.out.println("existe el fichero");
            System.out.printf("El fichero tiene %d bytes%n", outFile.length());
        }
        else {
            System.out.println("no existe el fichero");
        }*/

        String contenido = "This exception will be thrown by the FileInputStream, FileOutputStream, and RandomAccessFile constructors when a file with the specified pathname does not exist. It will also be thrown by these constructors if the file does exist but for some reason is inaccessible, for example when an attempt is made to open a read-only file for writing.";
        byte[] bytes = contenido.getBytes();
        System.out.println("Bytes a escribir:");
        System.out.println(Arrays.toString(bytes));
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(outFile); //abrir flujo
            out.write(bytes); //escribimos en el flujo
            out.flush(); //escribir 
            System.out.printf("Creado fichero %s con %d bytes%n",
                    outFile, outFile.length());
        } catch (FileNotFoundException e) {
            System.err.println("Fichero no localizado");
        } catch (IOException e) {
            System.err.println("Error I/O");
        } finally {  //usamos la forma clásica para cerrar el fichero
            try {
                if (out != null)
                    out.close();   //cerrar flujo
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
