/*
 * Ejercicio 4
 */
import java.util.*;

public class ColeccionDinamica {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Declara un ArrayList para guardar objetos de tipo String.
		ArrayList<String> listaCadenas = new ArrayList<>(); //lista vacía
		System.out.println(listaCadenas);
		
		//vamos a leer hasta encontrar fin o FIN
		String palabra = "";
		System.out.println("Introduce palabras");
		while (true) {
			palabra = sc.next();
			if (palabra.equalsIgnoreCase("fin"))
				break;				
			//System.out.println(palabra);
			//añadir la palabra a la lista	
			listaCadenas.add(palabra);		
		}
		//mostrar de nuevo la lista
		System.out.println(listaCadenas);

	}
	
	public static void annadirNuevaPalabra(ArrayList lista, String nuevaPalabra) {
		
	}
	
	public static void eliminarPalabra(ArrayList lista, String palabra) {
		
	}
}

