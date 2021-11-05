/*
 * EJERCICIO 6
 * Imprimir en columnas
 */

import java.util.Scanner;

public class Columnas {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//solicitamos el nº de columnas
		System.out.println("Introduce el nº columnas");
		int numeroColumnas = sc.nextInt();
		
		//solicitamos el número
		System.out.println("Introduce un número");
		int numero = sc.nextInt();
		
		//cerrar el Scanner
		sc.close();
		
		for (int i = 1; i <= numero; i++) {
			System.out.printf("%5d", i);
			if (i % numeroColumnas == 0){
				System.out.println();
			}
		}
	}
}

