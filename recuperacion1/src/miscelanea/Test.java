package miscelanea;

import miscelanea.diccionarios.CrearDiccionario;
import miscelanea.ficheros.CrearFicheroCSV;

import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) {
        final int[] CLAVES = {1,2,3,4,5};
        final String[] VALORES = {"hola", "adios", "hello", "bye bye", "end"};
        CrearDiccionario diccionario = new CrearDiccionario();
        for (int i = 0; i < CLAVES.length; i++) {
            diccionario.addDatos(CLAVES[i], VALORES[i]);
        }
        System.out.println(diccionario);
        try {
            CrearFicheroCSV.crearFichero(diccionario, "diccionario.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
