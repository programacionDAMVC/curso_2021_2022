package interfaces;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class Helper {

    public static void guardarDatosFichero(List<Estudiante> lista) throws FileNotFoundException {
        File outFichero = new File("FICHEROS/copia.txt");
        PrintWriter out = new PrintWriter(outFichero);  //para ficheros de texto
        for (Estudiante estudiante: lista) {
            out.println(estudiante.mostrarDatos());
            out.flush();
        }
        System.out.printf("Escritos %d bytes en el fichero %s%n",
                outFichero.length(), outFichero);
    }
    public static List<Estudiante> leerDatosFichero(String path) throws FileNotFoundException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FICHEROS/");
        stringBuilder.append(path);
        File inFile = new File(stringBuilder.toString());
        //leemos siempre ficheros de texto con Scanner
        Scanner sc = new Scanner(inFile);
        String cabecera = sc.nextLine(); //omitimos la cabecera
      //  System.out.println(cabecera);
        while (sc.hasNextLine()){
            String linea = sc.nextLine();
            String[] tokens = linea.split(";");
            System.out.println(linea);
            String nombre = tokens[1].trim();
            String apellidos = tokens[0].trim();
            String sNota = tokens[3].trim().replace(',','.');
            double dNota = Double.parseDouble(sNota);
            //si leo en el campo token[2] MIXTO, CIENCIAS ó LETRAS creo un estudiante de bachillerato
            //en caso contrario creo un estudiante de ciclos
            //creo método privado que haga eso
            if (esAlumnoBachillerato(tokens[2].trim())) {
                System.out.println("creo un alumno de bachillerato");
                //añado a lista
            }
            else  {
                System.out.println("creo un alumno de ciclos");
                //añado a lista
            }
        }
        return null;
    }

    private static boolean esAlumnoBachillerato(String especialidad) {
        switch (especialidad.toUpperCase()) {
            case "MIXTO", "CIENCIAS", "LETRAS" :
                return true;
            default:
                return false;
        }
    }
}
