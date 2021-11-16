/*
 * Usando Scanner vamos a solicitar el tamaño del array de números float
 * Usando el mismo Scanner, solicitamos los datos (bucle for)
 * Vamos a mostrar los datos en cuatro columnas (bucle for y printf)
 * Vamos elegir una posición aleatoria del array (Random)
 * Cambiamos el signo del float de dicha posición
 * Ejemplo aleatoriamente sale la posición 2
 * Si numeros[2] era 4, ahora numeros[2] será -4
 * Un método que me devuelva el número mas grande de la colección
 */

import java.util.Scanner;
import java.util.Random;

public class Arrays1 {
	
	public static void main (String[] args) {
		Random random = new Random();
		//solicitamos los datos
		System.out.println("Introduce tamaño del array");
		Scanner sc = new Scanner(System.in);
		int tamanno = sc.nextInt();
		
		//creamos el array
		float[] numeros = new float[tamanno];
		mostrarDatosEnConsola(numeros);
		System.out.println("\n-----------------------------");

		//introducimos datos
		for (int i = 0; i < numeros.length; i++ ) {
			System.out.println("Introduce un número real");
			numeros[i] = sc.nextFloat();
		}
		sc.close();
		
		System.out.println("-----------------------------");
		mostrarDatosEnConsola(numeros);
		
		//sacamos la posición al azar
		int posicion = random.nextInt(tamanno);
		//cambiamos el signo
		numeros[posicion] *= -1;
		//mostramos datos
		System.out.println("\n-----------------------------");
		mostrarDatosEnConsola(numeros);
	}
	
	public static void mostrarDatosEnConsola (float[] numeros) {
		//los mostramos en consola
		for (int i = 0; i < numeros.length; i++) {
			if (i % 4 == 0)
				System.out.println();
			System.out.printf("%8.2f",numeros[i]);
		}
	}
	
	
}

