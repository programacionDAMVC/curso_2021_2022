/*
 * Calculo de la longitud de una circuferencia
 * Pedimos el radio con un Scanner
 * Y mostramos la salida usando un printf
 */
import java.util.Scanner;

public class LongitudCircunferencia1 {
	
	public static void main (String[] args) {
		
		final double PI = 3.14;
		
		System.out.println("Introduce el radio de la circunferencia");
		Scanner sc = new Scanner(System.in);
		//int i = sc.nextInt();   tal y como viene en la documentación
		double radio = sc.nextDouble();
		
		//calculamos la longitud
		double longitud = 2.0 * PI * radio;
		
		//mostramos el valor de la longitud
		System.out.println("La longitud de una circuferencia de radio " + radio + " vale " + longitud);
		
		//usando printf
		System.out.printf("La longitud de una circuferencia de radio %.2f vale %.2f%n", radio, longitud);
	}
}

