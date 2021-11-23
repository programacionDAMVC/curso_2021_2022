/*
 * Ejemplo de listas dinámicas para albergar datos primitivos: int, double, boolean, etc
 */

import java.util.ArrayList;
public class Listas2 {
	public static void main (String[] args) {
		ArrayList<String> listaCadenas = new ArrayList<>();
		ArrayList<Integer> listaEnteros = new ArrayList<>();
		ArrayList<Double> listaDoubles = new ArrayList<>();
		ArrayList<Boolean> listaBooleans = new ArrayList<>();
		
		listaCadenas.add("hola");
		listaCadenas.add(" mundo");
		System.out.println(listaCadenas);
		System.out.printf("¿Contiene %s? %B%n", "hola", listaCadenas.contains("hola"));
		
		listaEnteros.add(7);
		listaEnteros.add(8 / 7);
		System.out.println(listaEnteros);
		System.out.printf("¿Contiene %d? %B%n", 7, listaEnteros.contains(7));

		
		listaDoubles.add(7.0);
		listaDoubles.add(8.0 / 7);
		System.out.println(listaDoubles);
		System.out.printf("¿Contiene %.2f? %B%n", 7.0, listaDoubles.contains(7.0));

		
		listaBooleans.add(true);
		listaBooleans.add(7 > 8 || 5 != 4);
		System.out.println(listaBooleans);
		System.out.printf("¿Contiene %b? %B%n", false, listaBooleans.contains(false));



	}
	
}
