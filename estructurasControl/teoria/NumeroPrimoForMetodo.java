/*
 * Ejercicio número primo
 * usando un método
 */
import java.util.Scanner;


public class NumeroPrimoForMetodo {
	
	public static void main (String[] args) {
		
		//solicitamos el número por Scanner
		System.out.println("Introduce un número");
		Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        
        //llamamos a un métod que nos diga si el número es primo o no
        System.out.println(numero + " ¿es primo? " + esPrimo(numero));
	}
	
	public static boolean esPrimo(int digito) {
		boolean primo = true;
		for (int i = 2; i < digito; i++) {
			if (digito % i == 0) {
				primo = false;
				break;
			}
		}
		return primo;
	}
}

