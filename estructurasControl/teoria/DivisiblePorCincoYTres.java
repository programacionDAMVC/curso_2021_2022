import java.util.Scanner;

public class DivisiblePorCincoYTres {
	
	public static void main (String[] args) {
		
		//leer el número desde la consola, mediante la clase Scanner
		System.out.println("Introduce el número a analizar");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		
		//si es divisible por cinco y por tres a la vez, lo decimos (if), ejemplo 150
		if ( numero % 5 == 0 && numero % 3 == 0 )  {
			System.out.println(numero + " es divisible por 3 y 5 a la vez");
		}
		//si es divisible por cinco, lo decimos (if else) ejemplo 25
		else if ( numero % 5 == 0 ) {
			System.out.println(numero + " es divisible por 5");
		}
		//si es divisible por tres, lo decimos (if else) ejemplo 9
		else if ( numero % 3 == 0 ) {
			System.out.println(numero + " es divisible por 3");
		}
		//no es divisible ni por tres ni por cinco (else) ejemplo 7
		else {
			System.out.println(numero + " no es divisible ni por 3 ni por 5");
		}

		
	}
}

