package ejercicios.ejercicio3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Nombres {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("ficheros/nombres.txt"));
        ArrayList<String> listaNombres = new ArrayList<>();

        while (sc.hasNextLine()){
            String nombre = sc.nextLine();
          //  System.out.println(nombre);
            listaNombres.add(nombre);
        }
        sc.close();
        int numeroNombres = obtenerNumeroNombres(listaNombres);
        System.out.printf("Nº de nombres leídos es %d%n", numeroNombres);

        //leer por Scanner un caracter, solo admitimos un solo caracter
        sc = new Scanner(System.in);
        System.out.println("Introduce una letra, solo una letra:");
        String letra = null;
        do {
            letra = sc.nextLine();
        } while (! letra.toLowerCase().matches("[a-záéíóúñü]"));
        //obtener una lista con los nombres que empizan por ese caracter
        //usamos un método estático
    }

    private static int obtenerNumeroNombres(ArrayList<String> listaNombres) {
        return listaNombres.size();
    }
}
