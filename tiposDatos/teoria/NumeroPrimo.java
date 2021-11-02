/*
 * Solicitar con Scanner un número entero
 * Se trata de averiguar si ese número es primo o no.
 * Sabemos que un número es primo, si no tiene divisores
 * Ejemplo 25, no es primo porque es divisible por 5
 * Ejemplo 31, es primo no hay ningún divisor entre 2 y 30
 * Lógica, usar un bucle recorrer desde 2 a 30 y si no hay un resto de división igual a cero, ES PRIMO
 * El programa no es válido para números negativos o cero.
 */

import java.util.Scanner ;



public class NumeroPrimo {
	
	public static void main (String[] args) {
		//Lógica sería, por ejemplo, para saber si 31 es primo o no
		// Hacer 31 % 2 si es cero, no es primo, sino seguimos 31 % 3 si es cero, no es primo, sino seguimos ... 31 % 30 si ...
		// si aparece un resto de división por cero, el número ya no es primo, no hace falta continuar.
		
		//solicitamos el número por Scanner
		System.out.println("Introduce un número");
		Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        
        int contador = 2;
        while (contador < numero) {
			if (numero % contador == 0) {
				System.out.println(numero + " no es primo");
				System.exit(1);
			}
			contador++;
		}
		System.out.println(numero + " es primo");
	}
}

