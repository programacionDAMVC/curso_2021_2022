/*
 * Ejercicio 2
 */

import java.util.Arrays;

public class Colecciones {
	
	static final int TAMANNO = 10;

	
	public static void main (String[] args) {
			
			
			int[] iArray1 = new int[TAMANNO];  // {0, 0, .... 0}
			System.out.println("valores de iArray1 cuando se inicializa");
			mostrarDatosDeArrayEnteros(iArray1);
			int[] iArray2 = new int[TAMANNO];  // idem
			
			//rellenamos el primer array con el mismo valor a todas las posiciones, ej. 3
			/*for (int numero : iArray1 ) {
				numero = 3;
			}*/  //no vale para rellenar
			for (int i = 0; i < iArray1.length; i++) {
				iArray1[i] = 3;
			}
			System.out.println("\nvalores de iArray1 cuando se rellena");
			mostrarDatosDeArrayEnteros(iArray1);
			
			//rellenamos el segundo array usando el método fill de la clase Arrays
			Arrays.fill(iArray2, 5);
			System.out.println("\nvalores de iArray2 cuando se rellena");
			mostrarDatosDeArrayEnteros(iArray2);
			
			//mostramos los valores de los dos array de forma emparejada
			System.out.println();
			if (iArray1.length == iArray2.length)
				mostrarDatosDeDosArraysDeEnteros(iArray1, iArray2);
			
	}
	
	public static void mostrarDatosDeArrayEnteros(int[] array) {
		for (int numero : array ) {
			System.out.printf("%d\t", numero);
		}
	} 
	
	//Método que nos muestre en la misma fila los dos elementos de cada array
	// 5 3
	// 5 3
	// ......
	
	public static void mostrarDatosDeDosArraysDeEnteros(int[] array1 , int[] array2) {
		for (int i = 0; i < TAMANNO; i++) {
			System.out.printf("%5d%5d%n", array1[i], array2[i]);
		}
	}
}

