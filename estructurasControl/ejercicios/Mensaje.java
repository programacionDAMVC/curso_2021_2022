/*
 * EJERCICIO 2
 * Realiza un programa en Java, que introduzca como argumentos el nombre
 * y apellidos de alguién y posteriormente muestre el siguiente mensaje:
 * ”Hola nombre apellidos”
 * Las dobles comillas incluidas
 */


public class Mensaje {
	
	public static void main (String[] args) {
		
		//comprobamos que vienen mínimo tres argumentos
		// nombre apellido1 apellido2
		if (args.length < 3) {
			System.out.println("Faltan argumentos");
			System.exit(1);
		}
		String nombre    = args[0];
		String apellido1 = args[1];
		String apellido2 = args[2];
		
		System.out.printf("\"Hola %s %s %s\"%n", nombre, apellido1, apellido2);

		
	}
}

