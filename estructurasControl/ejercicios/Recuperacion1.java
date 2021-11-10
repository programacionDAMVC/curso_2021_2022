/*
 * EJERCICIO REPASO 1
 * 1. El programa solicita un número (n) por Scanner
 * 2. Si es cero o negativo damos un mensaje que (if) 
 * el número n no es válido y el programa termina  (printf y System.exit)
 * 3. Si es positivo empezamos diciendo, 
 * El número n es válido (printf)
 * 4. Decimos si el n es par o impar (es par cuando el resto de división por 2 es cero) (if-else)
 * 5. Decimos si es divisible por 15 (30), o por 3 (9), o por 5 (25), o ni por 3 ni por 5 (154) (if- else if- ... - else)
 * 6. Usando un bucle while mostramos en consola la secuencia 1 2 3 4 5 ..... n
 * 7. Usando un bucle do-while mostramos en consola la secuencia 2 4 6 8 ..... n ó n-1
 * 8. Usando un bucle for mostramos los impares 1 3 5 ....n ó n-1  pero en cuatro columnas
 */

import java.util.Scanner;

public class Recuperacion1 {
	
	public static void main (String[] args) {
		//1.
		System.out.println("Introduce un número positivo distinto de cero");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		sc.close(); //cerramos el Scanner
		//2.
		if (numero <= 0) {
			System.out.printf("el número %d no es válido%n", numero );
			System.exit(1);
		}
		//3.
		System.out.printf("El número %d es válido%n", numero);
		//4.
		if (numero % 2 == 0) {
			System.out.printf("el número %d es par%n", numero );
		} else {
			System.out.printf("el número %d es impar%n", numero );
		}
		//5.
		if (numero % 15 == 0) {
			System.out.printf("el número %d es divisible por 15%n", numero );
		} else if (numero % 3 == 0) {
			System.out.printf("el número %d es divisible por 3%n", numero );
		} else if (numero % 5 == 0) {
			System.out.printf("el número %d es divisible por 5%n", numero );
		} else {
			System.out.printf("el número %d no es divisible ni por 3 ni por 5%n", numero );
		}
		//6.
		int contador = 1;
		System.out.println("Imprimiendo secuencia primera");
		while (contador <= numero) {
			System.out.printf("%-5d", contador);
			contador++;
		}
		//7
		//System.out.printf("%nValor de número %d, valor de contador %d%n", numero , contador);
		System.out.println("\nImprimiendo secuencia segunda"); //salto de línea para separa las secuencias que vienen
		contador = 2;
		do {
			System.out.printf("%-5d", contador);
			contador += 2; //contador = contador + 2;
		} while (contador <= numero);
		//8
		System.out.println("\nImprimiendo secuencia tercera");
		contador = 0;
		for (int i = 1 ; i <= numero; i += 2 ) {
			System.out.printf("%5d", i);
			contador++;
			if (contador % 4 == 0) {
				System.out.println(); //cada 4 veces hago salto de línea (4 columnas que pide el ejercicio)
			}
		}
		
		
		
		
		
	}
}

