/*
 * Generamos un número aleatorio entre 0 y 9 inclusive
 * Se trata de adivinar que número es:
 * Vamos solicitando por Scanner un número, hasta que adivinimos que número es 
 * Ejemplo aleatorio ha sido 7
 * Introduce un nº: 6
 * Introduce un nº: 5
 * Introduce un nº: 0
 * Introduce un nº: 7
 * Has acertado, el número era el 7 y has usado 4 intentos
 */
 
import java.util.Random;
import java.util.Scanner;
//import java.util.*;

public class Aleatorio2 {
	static Random r = new Random();
	public static void main (String[] args) {
		
		int aleatorio = r.nextInt(10);
		
		int contadorUsuario = devolverNumeroIntentosUsuario(aleatorio);
		System.out.printf("El usuario ha acertado, el número era el %d y has usado %d intentos%n",
			aleatorio, contadorUsuario);
			
		int contadorOrdenador1 = devolverNumeroIntentosOrdenador1(aleatorio);
		System.out.printf("La máquina ha acertado, el número era el %d y has usado %d intentos%n",
			aleatorio, contadorOrdenador1);
			
		int contadorOrdenador2 = devolverNumeroIntentosOrdenador2(aleatorio);
		System.out.printf("La máquina ha acertado, el número era el %d y has usado %d intentos%n",
			aleatorio, contadorOrdenador2);	
			
		int contadorOrdenador3 = devolverNumeroIntentosOrdenador3(aleatorio);
		System.out.printf("La máquina ha acertado, el número era el %d y has usado %d intentos%n",
			aleatorio, contadorOrdenador3);	
		
	}
	
	public static int devolverNumeroIntentosUsuario(int aleatorio) {
		Scanner sc = new Scanner(System.in);
		int numero = -1;
		int contador = 0;
		do {
			System.out.print("Introduce un nº: ");
			numero = sc.nextInt();
			contador++;
		} while (aleatorio != numero);
		sc.close();
		return contador;
	}
	
	public static int devolverNumeroIntentosOrdenador1(int aleatorio) {
		//bucle desde 0  a  10 (sin llegar a 10): 0, 1, 2, 3, 4 ... 
		int contador = 0;
		while (contador < 10) {
			if (contador == aleatorio) {
				break;
			}
			contador++;
		} 
		return contador + 1;
	}
	public static int devolverNumeroIntentosOrdenador2(int aleatorio) {
		//bucle desde 9 a 0:  9, 8, 7 ... hasta que acierte
		int contador = 9;
		while (contador >= 0) {
			if (contador == aleatorio) {
				break;
			}
			contador--;
		}
		return 10 - contador;
	}
	
	public static int devolverNumeroIntentosOrdenador3(int aleatorio) {
		//genera de forma aleatoria de 0 a 9 hasta que acertemos
		int aleatorioDelMetodo = r.nextInt(10);
		int contador = 0;
		while (true) {
			contador++;
			if (aleatorioDelMetodo == aleatorio) {
				break;
			}
			aleatorioDelMetodo = r.nextInt(10);
		}
		return contador++;
	}
	
	
	
	
}

