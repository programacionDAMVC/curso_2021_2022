package miscelanea.ficheros;

import miscelanea.diccionarios.CrearDiccionario;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Map;

public class CrearFicheroCSV {
    public static void crearFichero(CrearDiccionario diccionario, String path) throws FileNotFoundException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FICHEROS/");
        stringBuilder.append(path);
        File outFile = new File(stringBuilder.toString());
        PrintWriter out = new PrintWriter(outFile);
        out.print(diccionario);
        out.flush();
        System.out.printf("Escritos %d bytes%n", outFile.length());
    }
}
