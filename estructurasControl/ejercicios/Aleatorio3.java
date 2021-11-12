/*
 * Hacemos un menú:
 * 
 * 1. Averiguar el número aleatorio por parte del usuario
 * 2. Averiguar el número aleatorio por el ordenador usando algoritmo 1
 * 3. Averiguar el número aleatorio por el ordenador usando algoritmo 2
 * 4. Averiguar el número aleatorio por el ordenador usando algoritmo 3
 * 5. Salir
 * Introduce opción: 
 * 
 * Nos quedamos engachados en el menú hasta que pulsemos 5
 * 
 */
import java.util.Scanner;
import java.util.Random;

public class Aleatorio3 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Random  ra = new Random();
		//Generar el número aleatorio
		int aleatorio = ra.nextInt(9);
		//Mostrar el menú
		int opcion = -1;
		do {
			System.out.println();
			System.out.println("1. Averiguar el número aleatorio por parte del usuario");
			System.out.println("2. Averiguar el número aleatorio por el ordenador usando algoritmo 1");
			System.out.println("3. Averiguar el número aleatorio por el ordenador usando algoritmo 2");
			System.out.println("4. Averiguar el número aleatorio por el ordenador usando algoritmo 3");
			System.out.println("5. Salir");
			System.out.print("Introduce opción: ");
			//recepcionar la opción
			opcion = sc.nextInt();
			System.out.println(); //salto de línea, pues viene de un print	
			switch (opcion) {
				case 1: 
					int contadorUsuario = Aleatorio2.devolverNumeroIntentosUsuario(aleatorio);
					System.out.printf("El usuario ha acertado, el número era el %d y has usado %d intentos%n",
										aleatorio, contadorUsuario);
					break;
				case 2:
					int contadorOrdenador1 = Aleatorio2.devolverNumeroIntentosOrdenador1(aleatorio);
					System.out.printf("La máquina ha acertado, el número era el %d y has usado %d intentos%n",
										aleatorio, contadorOrdenador1);
					break;
				case 3:
					int contadorOrdenador2 = Aleatorio2.devolverNumeroIntentosOrdenador2(aleatorio);
					System.out.printf("La máquina ha acertado, el número era el %d y has usado %d intentos%n",
										aleatorio, contadorOrdenador2);
					break;
				case 4:
					int contadorOrdenador3 = Aleatorio2.devolverNumeroIntentosOrdenador3(aleatorio);
					System.out.printf("La máquina ha acertado, el número era el %d y has usado %d intentos%n",
										aleatorio, contadorOrdenador3);
					break;
				case 5:
					sc.close();
					break;
				default:
					System.out.printf("%d opción incorrecta%n", opcion);
					break;
			}
			
		} while (opcion != 5);
		System.out.println("FIN DE PROGRAMA");
	}
}

