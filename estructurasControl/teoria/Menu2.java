/*
 * Creamos un menú:
 * 0: Salir
 * 1: Crear un usuario
 * 2: Actualizar un usuario
 * 3: Borrar un usuario
 * 4: Listar un usuario
 * 
 * Recoger la opción en un una variable entera llamada opcion
 * Usando un Scanner para ell
 * 
 * En función de lo que hayamos introducido, damos un mensaje
 * Ejemplo: con 1, diríamos operaciones de crear un usuario...
 * Ejemplo:_con 0, fin de programa....
 */
import java.util.Scanner;

public class Menu2 {
	
	
	
	public static void main (String[] args) {
		
		int opcion;
		
		do {
			
			System.out.println("0: Salir");
			System.out.println("1: Crear un usuario");
			System.out.println("2: Actualizar un usuario");
			System.out.println("3: Borrar un usuario");
			System.out.println("4: Editar un usuario");
			System.out.println();
			System.out.print("Esperando opción: ");
			Scanner sc = new Scanner(System.in);
			opcion = sc.nextInt();
			System.out.println();

			switch(opcion) {
				case 0:
					System.out.println("Saliendo del programa");
					break;
				case 1:
					System.out.println("operaciones de crear un usuario...");
					break;
				case 2:
					System.out.println("operaciones de actualizar un usuario...");
					break;
				case 3:
					System.out.println("operaciones de borrar un usuario...");
					break;
				case 4:
					System.out.println("operaciones de editar un usuario...");
					break;
				default:
					System.out.println("Opción incorrecta");
					break;
			}
			
			
			
		} while (opcion != 0);
		System.out.println("FIN DE PROGRAMA");
		
	}
}

