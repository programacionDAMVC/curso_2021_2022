package ejercicios.ejercicio1;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Auxiliar {
    //método con argumentos la ruta del un fichero, return List<Persona>
    //fichero csv, probar en un main
    public static List<Persona> crearListaPersonasDesdeCSV(String rutaFichero) {
        //crear lista vacía
        List<Persona> lista = new ArrayList<>();
        //abrir el scanner
        try (Scanner in = new Scanner(new File(rutaFichero))) {
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
            /*if (in != null)
                in.close();*/
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //devolver la lista
        return lista;
    }
    public static List<Persona> crearListaPersonasDesdeJSON(String rutaFichero) {
        //1. incorpora la libreria Gson, buscamos el jar en maven repository
        //2. Usando el tutorial crear la lista List<Persona>
        //3. Lo probamos en el main, con sout
        //4. Cambiamos TestPersonal y leemos ahora de personal.json en vez de personal.csv
        Gson gson = new Gson();
        List<Persona> personas = null;
        try (Reader reader = Files.newBufferedReader(Paths.get(rutaFichero))) {
            personas = new Gson().fromJson(reader, new TypeToken<List<Persona>>() {
            }.getType());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return personas;
    }
    //método con un argumento List<Persona> y escribe un fichero de texto csv y el nombre
    //fichero es personal_fecha_hora.csv trabajamos con un LocalDateTime, ejemplo:
    // personal_17_3_2022_10_15.csv
    //escribir fichero texto usamos PrintWriter
    public static void crearFicheroPersonas(List<Persona> lista) throws FileNotFoundException {
        LocalDateTime fecha = LocalDateTime.now();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FICHEROS/personal_");
        stringBuilder.append(fecha.getDayOfMonth());
        stringBuilder.append("_");
        stringBuilder.append(fecha.getMonthValue());
        stringBuilder.append("_");
        stringBuilder.append(fecha.getYear());
        stringBuilder.append("_");
        stringBuilder.append(fecha.getHour());
        stringBuilder.append("_");
        stringBuilder.append(fecha.getMinute());
        stringBuilder.append(".csv");
        String path = stringBuilder.toString();
        File outFile = new File(path);
        PrintWriter out = new PrintWriter(outFile);
        for (Persona persona: lista) {
            out.println(persona);
            out.flush();
        }
        if (out != null)
            out.close();
        System.out.printf("Escritos %d bytes en el fichero %s%n",
                outFile.length(), outFile);
    }

    public static boolean validarEmail(String email) {
        return email.matches("\\w+@\\w+\\.[a-zA-Z]{2,6}");
    }

    /*public static void main(String[] args) {
        List<Persona> lista = null;
        try {
            lista = crearListaPersonas("FICHEROS/personal.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            crearFicheroPersonas(lista);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<Persona> personas = crearListaPersonasDesdeJSON(
                "FICHEROS/personal.json");
        personas.forEach(System.out::println);
    }*/

}
