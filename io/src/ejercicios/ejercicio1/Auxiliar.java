package ejercicios.ejercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Auxiliar {
    //método con argumentos la ruta del un fichero, return List<Persona>
    //fichero csv, probar en un main
    public static List<Persona> crearListaPersonas(String rutaFichero) throws FileNotFoundException {
        //crear lista vacía
        List<Persona> lista = new ArrayList<>();
        //abrir el scanner
        Scanner in = new Scanner(new File(rutaFichero));
        //omitir la primera linea
        in.nextLine();
        //leer mientras queden líneas
        while (in.hasNextLine()) {
            //leer la linea
            String linea = in.nextLine();
            //trocear la linea
            String[] tokens = linea.split(",");
            //crear el objeto Persona con los trozos creados
            Persona persona = new Persona(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4]);
            //añadirlo a la lista
            lista.add(persona);
        }
        in.close();
        //devolver la lista
        return lista;
    }

    //método con un argumento List<Persona> y escribe un fichero de texto csv y el nombre
    //fichero es personal_fecha_hora.csv trabajamos con un LocalDateTime, ejemplo:
    // personal_17_3_2022_10_15_25.csv
    //escribir fichero texto usamos PrintWriter


    public static void main(String[] args) {
        try {
            System.out.println(crearListaPersonas("FICHEROS/personal.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
