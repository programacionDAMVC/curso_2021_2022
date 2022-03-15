package teoria.salida.nivelBytes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Ejemplo2 {
    public static void main(String[] args) {
        //tratamiento de objetos File
        File outFile = new File("FICHEROS/fichero2.txt");


        String contenido = "This exception will be thrown by the FileInputStream, FileOutputStream, and RandomAccessFile constructors when a file with the specified pathname does not exist. It will also be thrown by these constructors if the file does exist but for some reason is inaccessible, for example when an attempt is made to open a read-only file for writing.";
        byte[] bytes = contenido.getBytes();
        System.out.println("Bytes a escribir:");
        System.out.println(Arrays.toString(bytes));

        try (FileOutputStream out = new FileOutputStream(outFile, true)) { //abrir flujo
            out.write(bytes); //escribr
            out.flush();
            System.out.printf("Creado fichero %s con %d bytes%n",
                    outFile, outFile.length());
        //el flujo se cierra, es autocloseable
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}