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

public class Aleatorio1 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int aleatorio = r.nextInt(10);
		int numero = -1;
		int contador = 0;
		do {
			System.out.print("Introduce un nº: ");
			numero = sc.nextInt();
			contador++;
		} while (aleatorio != numero);
		sc.close();
		System.out.printf("Has acertado, el número era el %d y has usado %d intentos%n",
			aleatorio, contador);
		
	}
}

