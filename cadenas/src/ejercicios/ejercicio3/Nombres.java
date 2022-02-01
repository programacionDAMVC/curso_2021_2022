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
        ArrayList<String> nombreQueEmpizanPor = obtenerNombresPorLetraInicial(
                listaNombres, letra);
        System.out.printf("Nombres que empiezan por %s son %d:%n%s%n",
                letra, nombreQueEmpizanPor.size(), nombreQueEmpizanPor.toString());

        ArrayList<String> nombreQueNoAcabanEnVocal = obtenerNombresNoAcabanEnVocal(listaNombres);
        System.out.printf("Nombres que NO acabaen en vocal son %d:%n%s%n",
                nombreQueNoAcabanEnVocal.size(), nombreQueNoAcabanEnVocal);

        System.out.println("Introduce una nombre a buscar");
        String nombreABuscar = null;
        do {
            nombreABuscar = sc.nextLine();
        } while (! nombreABuscar.toLowerCase().matches("[a-záéíóúñü]{2,}"));
        boolean encontradoNombre = buscarNombre(listaNombres, nombreABuscar);
        System.out.printf("Existe el nombre %s en la lista %B%n", nombreABuscar, encontradoNombre);

        System.out.println("Introduce coincidencia a buscar");
        String secuenciaABuscar = null;
        do {
            secuenciaABuscar = sc.nextLine();
        } while (! nombreABuscar.toLowerCase().matches("[a-záéíóúñü]+"));
        ArrayList<String> listaCoincidencias = buscarCoincidencias(listaNombres, secuenciaABuscar);
        System.out.printf("Coincidencias de %s en la lista son %d%n%s%n",
                secuenciaABuscar, listaCoincidencias.size(), listaCoincidencias);
    }

    private static ArrayList<String> buscarCoincidencias(ArrayList<String> listaNombres, String secuenciaABuscar) {
        ArrayList<String> coicidencias = new ArrayList<>(); //lista vacía
        for (String nombre: listaNombres) {
            if(nombre.toLowerCase().contains(secuenciaABuscar.toLowerCase()))
                coicidencias.add(nombre);
        }
        return coicidencias;
    }

    private static boolean buscarNombre(ArrayList<String> listaNombres, String nombreABuscar) {
        for (String nombre : listaNombres) {
            if (nombre.equalsIgnoreCase(nombreABuscar))
                return true;
        }
        return false;
    }

    private static ArrayList<String> obtenerNombresNoAcabanEnVocal(ArrayList<String> listaNombres) {
        ArrayList<String> nombresNoAcabanEnVocal = new ArrayList<>(); //crear lista vacía
        for (String nombre : listaNombres) {
            if (nombre.toLowerCase().matches(".+[^aeiouáéíóú]$"))
                nombresNoAcabanEnVocal.add(nombre);
        }
        return nombresNoAcabanEnVocal;
    }

    private static ArrayList<String> obtenerNombresPorLetraInicial(ArrayList<String> listaNombres, String letra) {
        ArrayList<String> nombresABuscar = new ArrayList<>(); //crear lista vacía
        for (String nombre : listaNombres) {
            if (nombre.toUpperCase().startsWith(letra.toUpperCase()))
                nombresABuscar.add(nombre);
        }
        return nombresABuscar;
    }

    private static int obtenerNumeroNombres(ArrayList<String> listaNombres) {
        return listaNombres.size();
    }
}
