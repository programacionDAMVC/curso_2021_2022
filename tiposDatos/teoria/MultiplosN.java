/*
 * MultiplosN.java
 * Pedimos N por consola
 * Si introducimos 5
 * Mostramos los múltiplo de 5, comprendidos entre 1 y 100 (inclusive)
 * Son: 5, 10, 15, 20, 25 .... 100
 */

import java.util.Scanner;

public class MultiplosN {
	
	public static void main (String[] args) {
		
		//solicitamos el número
		System.out.println("Introduce el múltiplo");
		Scanner sc = new Scanner(System.in);
		int multiplo = sc.nextInt();
		
		//Si el número es negativo o cero, o mayor que 100
		//no se ejecuta la lógica de abajo
		//avisamos que el número introducido no es válido
		//finalizamos el programa
		if (multiplo <= 0 || multiplo > 100) {
			System.out.println(multiplo + " valor no válido");
			System.exit(1);
		} 
		
		//lógica como en el caso anterior
		int contador = 1;
		
		while (contador <= 100) {
			if (contador % multiplo == 0) {
				System.out.println(contador + " es múltiplo de " + multiplo);
			}
			contador++;
		}
		
		
		
		
	}
}

