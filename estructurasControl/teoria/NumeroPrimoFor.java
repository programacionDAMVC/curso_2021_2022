/*
 * Ejercicio núnmero primo
 * con bucle for
 */
import java.util.Scanner;


public class NumeroPrimoFor {
	
	public static void main (String[] args) {
		//Lógica sería, por ejemplo, para saber si 31 es primo o no
		// Hacer 31 % 2 si es cero, no es primo, sino seguimos 31 % 3 si es cero, no es primo, sino seguimos ... 31 % 30 si ...
		// si aparece un resto de división por cero, el número ya no es primo, no hace falta continuar.
		
		//solicitamos el número por Scanner
		System.out.println("Introduce un número");
		Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        boolean esPrimo = true;
        
       // int contador = 2;
        for (int i = 2 ; i < numero; i++) {
			if (numero % i == 0) {
				//System.out.println(numero + " no es primo");
				//System.exit(1);
				esPrimo = false;
				break;
			}
			
		}
		System.out.println(numero + " ¿es primo? " + esPrimo);
	}
	
}

