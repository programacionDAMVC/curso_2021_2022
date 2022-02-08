package ejercicios.ejercicio2.binario;

import ejercicios.ejercicio2.binario.Binario;
import ejercicios.ejercicio2.binario.BinarioException;

import java.util.Scanner;

public class TestNumerosBinarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //leer el número con un Scanner
        System.out.println("introduce un número en binario");
        String numeroBinario = sc.next();
        //crear el objeto Binario, mostrar con sout y llamar al método que devuelve el
        //valor en decimal, siempre y cuando sea un número binario
        try {
            Binario binario = new Binario(numeroBinario);
            System.out.println(binario);
        } catch (BinarioException e) {
           // e.printStackTrace();
            System.err.printf("%s no es un número binario", numeroBinario);
        }
    }
}
