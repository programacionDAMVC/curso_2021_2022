package ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {
    private static final int TAMANNO = 4;

    //Un método que lea de la entrada estándar cinco y solo cinco palabras y que devuelva
    //una lista dinámica de String.
    public static List<String> obtenerListaPalabras(){
        Scanner sc = new Scanner(System.in);
        List<String> lista = new ArrayList<>();
        for (int i = 0; i < TAMANNO; i++) {
            System.out.println("Introduce una palabra");
            String palabra = sc.next();
            lista.add(palabra);
        }
        sc.close();
        return lista;
    }
    //Un método que se le pasa como argumento un lista de String y usando obliga-
    //toriamente un bucle for each, devuelva otra lista de String con las palabras en
    //mayúsculas.
    public static List<String> devolverListaMayusculas (List<String> listaMinuscula) {
        List<String> listaMayusculas = new ArrayList<>();
        for (String palabraMinuscula : listaMinuscula  ) {
            listaMayusculas.add(palabraMinuscula.toUpperCase());
        }
        return listaMayusculas;
    }
    //Un método que se le pasa como argumento un lista de String y usando obligato-
    //riamente una expresión regular nos devuelva el número de palabras que acaban en
    //vocal.
    public static int obtenerNumeroPalabrasAcabanVocal(List<String> lista) {
        int contador = 0;
        for (String palabra: lista) {
            if (palabra.toLowerCase().matches(".*[aeiouáéíóú]$")){
                contador++;
            }
        }
        return contador;
    }
    //Un método que se le pasa como argumento un lista de String y usando obligato-
    //riamente una expresión regular nos devuelva el número de palabras que empiezan en
    //vocal.
    public static int obtenerPalabrasEmpiezaVocal(List<String> lista) {
        int contador = 0;
        for (String palabra: lista) {
            if (palabra.toLowerCase().matches("^[aeiouáéíóú].*"))
                contador++;
        }
        return contador;
    }

    //Un método que se le pasa como argumento un lista de String y usando obligato-
    //riamente una expresión regular nos devuelva el número de palabras que contengan
    //vocal.
    public static int obtenerNumeroPalabraContieneVocal(List<String> lista) {
        int contador = 0;
        for (String word : lista) {
            if (word.toLowerCase().matches("^.*[aeiouáéíóúü].*$"))
                contador++;
        }
        return contador;
    }
    //un método que cuente el número de vocales de una palabra
    private static int contarNumeroVocalesEnUnaPalabra(String palabra) {
        //charAt(index) devuelve un char hola: h o l a convertimos String a char String.valueOf ó char + ""
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.toLowerCase().charAt(i);
            if (String.valueOf(letra).matches("[aeiouáéíóúü]"))
                contador++;
        }
        return contador;
    }
    //un método que se le pase una lista de palabras y devuelva el número de vocales
    public static int contarNumeroVocalesDeUnaListaDePalabras(List<String> lista) {
        int contador = 0;
        for (String palabra: lista) {
            contador += contarNumeroVocalesEnUnaPalabra(palabra);
        }
        return contador;
    }
    //un método que cuente números regex
    //modificamos de abajo para restar el número de números
    //un método que devuelva el número de consonantes de una lista de palabra
    public static int contarNumeroConsonantesDeUnaListaDePalabras(List<String> lista) {
        int numeroVocales = contarNumeroVocalesDeUnaListaDePalabras(lista);
        int numeroTotalLetras = 0;
        for (String palabra: lista) {
            numeroTotalLetras += palabra.length();
        }
        int numeroConsonantes = numeroTotalLetras - numeroVocales;
        return numeroConsonantes;
    }
    //método que se le pasa la lista y devuelve a la inversa las palabras concatenadas con #
    public static String concatenarInversaPalabras (List<String> lista) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = lista.size() - 1; i >= 0 ; i--) {
            stringBuilder.append(lista.get(i));  //en caso de array lista[i]
            stringBuilder.append("#");
        }
       // System.out.println(stringBuilder.reverse());
        String cadena1 = stringBuilder.toString();
        String cadena2 = cadena1.substring(0,cadena1.length() - 1);
       // System.out.println(cadena2);
        return cadena2;
    }

    public static void main(String[] args) {
        List<String> lista = obtenerListaPalabras();
        System.out.println(lista);
        List<String> listaMayusculas = devolverListaMayusculas(lista);
        System.out.println(listaMayusculas);
        int numeroPalabrasAcabanVocal = obtenerNumeroPalabrasAcabanVocal(lista);
        System.out.printf("Acaban en vocal: %d%n", numeroPalabrasAcabanVocal);
        int numeroPalabrasEmpiezanVocal = obtenerPalabrasEmpiezaVocal(lista);
        System.out.printf("Empiezan en vocal: %d%n", numeroPalabrasEmpiezanVocal);
        int numeroPalabrasContienenVocal = obtenerNumeroPalabraContieneVocal(lista);
        System.out.printf("Contienen vocal: %d%n", numeroPalabrasContienenVocal);
       /* String palabra = "SSSSSS";
        int numeroVocalesPalabra = contarNumeroVocalesEnUnaPalabra(palabra);
        System.out.printf("Nº de vocales de la palabra %s es %d%n", palabra, numeroVocalesPalabra);*/
        int numeroTotalVocales = contarNumeroVocalesDeUnaListaDePalabras(lista);
        System.out.printf("Total de vocales: %d%n", numeroTotalVocales);
        int numeroTotalConsonantes = contarNumeroConsonantesDeUnaListaDePalabras(lista);
        System.out.printf("Total de consonantes: %d%n", numeroTotalConsonantes);
        String cadena = concatenarInversaPalabras(lista);
        System.out.printf("Concatenación %s%n",cadena );

    }
}
