/*
 * Leer en número desde consola
 * Si introducimos el número 3, debe retornar 1 * 2 * 3: 6
 * Si introducimos el número 4, debe retornar 1 * 2 * 3 * 4: 24
 * Si introducimos el número 5, debe retornar 1 * 2 * 3 * 4 * 5 : 120
 * */

import java.util.Scanner;


public class MultiplicarNumeros {
	
	public static void main (String[] args) {
		
		System.out.println("Introduce un número");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		
		//si el número introducido es 0 o negativo
		//no se ejecuta las líneas de abajo, el programa termina System.exit(1)
		//avisando que el número introducido no es válido
		if (numero <= 0) {
			System.out.println(numero + " valor no válido");
			System.exit(1);
		}
		
		int multiplicacion = 1;
		int contador = 1;
		
		while (contador <= numero) {
			//multiplicacion = multiplicacion * contador;
			multiplicacion *= contador;
			contador++;
		}
		
		System.out.println("La multiplicación desde 1 a " + numero + " vale " + multiplicacion);

	}
}

