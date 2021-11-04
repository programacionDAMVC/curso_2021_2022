/*
 *  EJERCICIO 3
 * Ejercio sobre el Scanner
 * probar los métodos nextInt()
 * y hasNextInt()
 */

import java.util.Scanner;

public class EjercicioScanner {
	
	public static void main (String[] args) {
		System.out.println("Introduce número enteros, cualquier letra para acabar");
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()){
			int numero = sc.nextInt();
			System.out.printf("Nº leído %d%n", numero);
		}
		System.out.println("Fin de programa");
	}
}

