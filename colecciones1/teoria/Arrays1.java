/*
 * Usando Scanner vamos a solicitar el tamaño del array de números float
 * Usando el mismo Scanner, solicitamos los datos (bucle for)
 * Vamos a mostrar los datos en cuatro columnas (bucle for y printf)
 * Vamos elegir una posición aleatoria del array (Random)
 * Cambiamos el signo del float de dicha posición
 * Ejemplo aleatoriamente sale la posición 2
 * Si numeros[2] era 4, ahora numeros[2] será -4
 * Un método que me devuelva el número mas grande de la colección
 * El método contrario, que devuelva el número mas pequeño de la colección (para casa)
 * Un método que devuelva la media (sumar todos los valores y dividirlo por el nº de datos)
 * Si el tamaño es cero o negativo bucle do-while hasta que introduzcamos un número > 0
 */

import java.util.Scanner;
import java.util.Random;

public class Arrays1 {
	
	public static void main (String[] args) {
		
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int tamanno = -1;
		//solicitamos los datos
		do {
			System.out.println("Introduce tamaño correcto del array");
			tamanno = sc.nextInt();
		} while (tamanno <= 0);
		
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
		System.out.println("\n-----------------------------");
		System.out.printf("El valor medio del array es %.2f%n", 
						obtenerValorMedioDelArray(numeros));
		//sacamos la posición al azar
		int posicion = random.nextInt(tamanno);
		//cambiamos el signo
		numeros[posicion] *= -1;
		//mostramos datos
		System.out.println("-----------------------------");
		mostrarDatosEnConsola(numeros);
		System.out.println("\n-----------------------------");
		System.out.printf("El número mas grande del array es %.2f%n", 
						obtenerValorMasGrandeDelArray(numeros));
		System.out.printf("El número mas chcio del array es %.2f%n", 
						obtenerValorMasChicoDelArray(numeros));						
		


	}
	
	public static void mostrarDatosEnConsola (float[] numeros) {
		//los mostramos en consola
		for (int i = 0; i < numeros.length; i++) {
			if (i % 4 == 0)
				System.out.println();
			System.out.printf("%8.2f",numeros[i]);
		}
	}
	
	public static float obtenerValorMasGrandeDelArray(float[] numeros) {
		float numeroMasGrande = -Float.MIN_VALUE;  //para que sea mas pequeño que los negativos
		for(int i = 0; i < numeros.length; i++){
			if (numeros[i] > numeroMasGrande) {
				numeroMasGrande = numeros[i];
			}
		} 
		return numeroMasGrande;
	}
	
	public static float obtenerValorMasChicoDelArray(float[] numeros) {
		float numeroMasChico = Float.MAX_VALUE;  //para que sea el float mas grande
		for (float numero : numeros) {
			if (numero < numeroMasChico){
				numeroMasChico = numero;
			}
		}
		return numeroMasChico;
	}
	
	
	public static float obtenerValorMedioDelArray(float[] numeros) {
			float suma = 0;
			for (int i = 0; i < numeros.length; i++) {
				suma += numeros[i];
			}
			return suma / numeros.length;
	}
}

