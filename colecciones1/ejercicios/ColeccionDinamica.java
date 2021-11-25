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
		//mostrar de nuevo la lista después de recoger los datos.
		System.out.println(listaCadenas);
		annadirNuevaPalabra(listaCadenas, "josé");
		//mostrar de nuevo la lista después de añadir un dato.
		System.out.println(listaCadenas);
		//eliminar de la lista una cadena
		String palabraAEliminar = "josé";
		System.out.printf("¿Eliminado %s? %B%n", palabraAEliminar,
				eliminarPalabra(listaCadenas, palabraAEliminar));
		//mostrar de nuevo la lista después de eliminar un dato.
		System.out.println(listaCadenas);
		//buscar una palabra
		String palabraABuscar = "dos";
		System.out.printf("¿Se encuentra %s? %B%n", palabraABuscar,
				contienePalabra(listaCadenas, palabraABuscar));
		//palabras de mayor longitud
		System.out.println(obtenerListaCadenasMayorLongitud(listaCadenas));
	}
	
	
	//método que añade un nuevo elemento (nuevaPalabra) a la colección (lista)
	public static void annadirNuevaPalabra(ArrayList<String> lista, String nuevaPalabra) {
		lista.add(nuevaPalabra);
	}
	//método que elimina un elemento (palabra) de la colección (lista)
	public static boolean eliminarPalabra(ArrayList<String> lista, String palabra) {
		return lista.remove(palabra);
	}
	//Un método que se le pase por argumento una cadena y nos diga si dicha
	//cadena se encuentra en la colección anterior.
	public static boolean contienePalabra(ArrayList<String> lista, String palabra) {
		//opción complicada:
		/*boolean contiene = false;
		for (String cadena : lista) {
			if (cadena.equals(palabra)) {
				contiene = true;
				break;
			}
		}
		return contiene;*/
		return lista.contains(palabra);
	}
	//método que devuelve una lista con las cadenas de igual longitud
	//siendo estás las de mayor longitud de la lista
	public static ArrayList<String> obtenerListaCadenasMayorLongitud
		(ArrayList<String> lista) {
			
		ArrayList<String> listaMayorLongitud = new ArrayList<>(); //vacía
		int mayorLongitud = 0;
		for (String cadena : lista) {
			if (cadena.length() == mayorLongitud) {
				listaMayorLongitud.add(cadena);
			} else if (cadena.length() > mayorLongitud){
				mayorLongitud = cadena.length();
				listaMayorLongitud.clear();
				listaMayorLongitud.add(cadena);
			}
		}
		return listaMayorLongitud;
		
	}
}








