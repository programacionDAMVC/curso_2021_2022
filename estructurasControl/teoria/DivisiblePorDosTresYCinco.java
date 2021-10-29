import java.util.Scanner;

public class DivisiblePorDosTresYCinco {
	
	public static void main (String[] args) {
		
		//leer desde consola el número, usando la clase Scanner
		System.out.println("Introduce número a analizar");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		
		//si es divisible por 2, 3 y 5 lo decimos, ejemplo 300 (if)
		if (numero % 2 == 0 && numero % 3 == 0 && numero % 5 == 0) {
			System.out.println(numero + " es divisible por 2, 3 y 5");
		}
		//si es divisible por 2 y 3, lo decimos, ejemplo 12 (else if)
		else if (numero % 2 == 0 && numero % 3 == 0) {
			System.out.println(numero + " es divisible por 2 y 3");
		}
		//si es divisible por 2 y 5, lo decimos, ejemplo 100 (else if)
		else if (numero % 2 == 0 && numero % 5 == 0) {
			System.out.println(numero + " es divisible por 2 y 5");
		}
		//si es divisible por 3 y 5, lo decimos, ejemplo 15 (else if)
		else if (numero % 3 == 0 && numero % 5 == 0) {
			System.out.println(numero + " es divisible por 3 y 5");
		}
		//si es divisible por 2, lo decimos, ejemplo 8 (else if)
		else if (numero % 2 == 0) {
			System.out.println(numero + " es divisible por 2");
		}
		//si es divisible por 3, lo decimos, ejemplo 27 (else if)
		else if (numero % 3 == 0) {
			System.out.println(numero + " es divisible por 3");
		}
		//si es divisible por 5, lo decimos, ejemplo 25 (else if)
		else if (numero % 5 == 0) {
			System.out.println(numero + " es divisible por 5");
		}
		//si no es divisible ni por 2, 3 y 5 lo decimos, ejemplo 49 (else)
		else {
			System.out.println(numero + " no es divisible por 2, 3 y 5");
		}

		
	}
}

