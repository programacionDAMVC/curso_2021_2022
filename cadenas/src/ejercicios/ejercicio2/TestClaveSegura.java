package ejercicios.ejercicio2;

import numeros.Numeros;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TestClaveSegura {
    public static void main(String[] args) {
        //solicite por Scanner el número de claves que queremos generar
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de claves a generar:");
        String sNumero = "";
        do {
            sNumero = sc.nextLine();
        } while ( ! Numeros.esNumeroNaturalSinCero(sNumero) );
        sc.close();
        int iNumero = Integer.parseInt(sNumero);
        //generamos las claves y las guardamos en una colección
        ArrayList<ClaveSegura> listaClaves = new ArrayList<>(); //lista vacía
        ClaveSegura cSegura = null;
        for (int i = 0; i < iNumero; i++){
            cSegura = new ClaveSegura();
            listaClaves.add(cSegura);
        }
        //listaClaves es un arraylist de objetos ClaveSegura
        //elegimos un objeto ClaveSegura al azar
        Random random = new Random();
        int posicionLista = random.nextInt(listaClaves.size());
        cSegura = listaClaves.get(posicionLista);
        System.out.printf("Clave elegida es: %s%n", cSegura.getClaveSegura());
    }
}
