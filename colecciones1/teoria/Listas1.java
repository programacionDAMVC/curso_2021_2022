/*
 * Comparamos arrays y listas 
 */

import java.util.Arrays;
import java.util.ArrayList;

public class Listas1 {
	
	public static void main (String[] args) {
		
		//declarar e inicializar una array de este tipo String[] sArray = {"juan", ....}
		//mostramos los datos que contiene
		String[] sArray = {"joaquin", "ester", "luisa", "esmeralda", "felipe"};
		System.out.println(sArray);
		for (String nombre : sArray) {
			System.out.println(nombre);
		}
		System.out.println(Arrays.toString(sArray));
		
		ArrayList<String> listaCadenas = new ArrayList<>(); //crea lista vacía
		System.out.printf("Tamaño de la lista %d%n", listaCadenas.size());
		//añadir elementos a la lista
		listaCadenas.add("ROSA");
		listaCadenas.add("JOAQUÍN");
		System.out.println(listaCadenas);
		//añadimos mas datos a las colecciones
		listaCadenas.add("ENRIQUE");
		//??? Y al array
		//sArray[5] = "enrique"; no se puede aumentar el tamaño del array
		listaCadenas.add("ROMERO"); //si el de la lista
		System.out.println(listaCadenas);

		//Recorremos las listas:
		//usamos un bucle fori
		for (int i = 0; i < listaCadenas.size(); i++) {
			System.out.printf("Posición: %d, valor: %s%n", i, listaCadenas.get(i));
		}
		//usando un bucle mejorado:
		for (String nombre : listaCadenas) {
			System.out.println(nombre);
		}
		
		//Queremos saber si la lista contiene un dato		
		System.out.printf("¿Está ENRIQUE? %b%n", listaCadenas.contains("ENRIQUE"));
		//lo mismo con un array
		String nombreABuscar = "luisa";
		for (String nombre : sArray ) {
			if (nombre == nombreABuscar){
				System.out.printf("%s está en el array%n", nombreABuscar);
				break; //no hace falta seguir, hemos encontrado el nombre
			}
		}
		System.out.println("\n----------------------");
		System.out.println(listaCadenas);
		//Eliminamos ENRIQUE de la lista
		System.out.printf("¿Se ha eliminado ENRIQUE de lalista? %b%n", 
								listaCadenas.remove("ENRIQUE"));
		System.out.println(listaCadenas);
		System.out.printf("¿Se ha eliminado ENRIQUE de lalista? %b%n", 
								listaCadenas.remove("ENRIQUE"));
		

	}
}

