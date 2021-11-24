/*
 * Ejercicio 3
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ColeccionAleatoria {
	
	public static void main (String[] args) {
		
		Random random = new Random();
		final int TAMANNO = 100;
		//declarar un array con tamaño 100
		int[] iArray = new int[TAMANNO];
		System.out.println(Arrays.toString(iArray));
		//rellenar de forma aleatoria con números de 0 a 100
		//usamos clase Random y el método nextInt(100)
		//rellenamos usando un bucle fori
		for (int i = 0; i < TAMANNO; i++) {
			iArray[i] = random.nextInt(100);
		}
		System.out.println(Arrays.toString(iArray));
		
		double valorMedio = calcularValorMedio(iArray);
		System.out.printf("El valor medio vale %.3f%n", valorMedio);
		
		double desviacionTipica = calcularDesviacionTipica(iArray);
		System.out.printf("La desviación típica vale %.3f%n", desviacionTipica);
		
		System.out.println("ordenando el array....");
		ordenarArray(iArray);
		System.out.println(Arrays.toString(iArray));
		System.out.println(Arrays.toString(iArray));
		
		System.out.println("elementos pares");
		System.out.println(obtenerColeccionDePares(iArray));
		
		System.out.printf("%nelemento mas chico es %d%n", obtenerValorMasChico(iArray));
		
		System.out.printf("%nelemento mas grande es %d%n", obtenerValorMasGrande(iArray));
	
	}

	//metodo que devuelva el valor medio de los datos.
	public static double calcularValorMedio(int[] array) {
		int suma = 0;
		for (int numero : array) {
			suma += numero;
		}
		return 1.0 * suma / array.length;
	}
	
	public static double calcularDesviacionTipica(int[] array) {
		double suma = 0;
		double valorMedio = calcularValorMedio(array);
		for (int numero : array) {
			//suma += (numero - valorMedio) * (numero - valorMedio);
			suma += Math.pow(numero - valorMedio , 2);
		}
		return Math.sqrt(suma / (array.length - 1));
	}
	
	public static void ordenarArray(int[] array) {
		Arrays.sort(array);
	}
	
	public static ArrayList<Integer> obtenerColeccionDePares(int[] array) {
		ArrayList<Integer> listaDePares = new ArrayList<>();  //crea una lista vacía
		for (int numero : array){
			if (numero % 2 == 0) {
				listaDePares.add(numero);
			}
		}
		/*for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				listaDePares.add(array[i]);
			}
		}*/
		return listaDePares;
	}
	
	public static int obtenerValorMasChico (int[] array){
		Arrays.sort(array);
		return array[0];
	}
	
	public static int obtenerValorMasGrande (int[] array){
		Arrays.sort(array);
		return array[array.length -1];
	}


}

