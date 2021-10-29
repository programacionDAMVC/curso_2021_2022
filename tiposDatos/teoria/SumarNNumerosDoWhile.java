import java.util.Scanner;

/*
 * Introduce el 3, nos debe dar la suma 0 + 1 + 2 + 3
 * Introduce el 5, nos debe dar la suma 0 + 1 + 2 + 3 + 4 + 5 
 */

public class SumarNNumerosDoWhile {
	
	public static void main (String[] args) {
		
		System.out.println("Introduce el número");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		
		int suma = 0;
		int contador = 0;
		
		//while (contador <= numero) {
	//		suma += contador;
	//		contador++;
	//	}
	
		do {
			suma += contador;
			contador++;
		} while (contador <= numero) ;
		
		System.out.println("La suma desde 0 a " + numero + " vale " + suma);
		
	}
}
