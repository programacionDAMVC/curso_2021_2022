/*
 * Solicitamos un número, lo llamamos numero
 * Si es 7, devolvemos el resultado de 0 + 1 + 2 + 3 + 4 + 5 + 6 + 7
 * Usamos un acumulador suma, que se inicializa a cero
 */

import java.util.Scanner;


public class SumarNNumerosFor {
	
	public static void main (String[] args) {
		
		System.out.println("Introduce el número");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		
		//declaramos e incializamos el valor de la variable suma
		int suma = 0;
		
		for (int i = 0; i <= numero ; i++ ) {
			suma += i;
		}
		
		if (numero >= 0) {
			System.out.println("La suma de los " + numero + " valores vale " + suma);
		} else {
			System.out.println(numero + " es negativo");
		}
	}
}

