/*
 * El programa solicita un número
 * y repite la palabra echo ese número de veces
 * siempre se va repetir como mínimo una vez
 */
import java.util.Scanner;

public class Echo {
	
	public static void main (String[] args) {
		
		System.out.println("Introduce el número de veces a repetir el echo");
		Scanner sc = new Scanner(System.in);
		int veces = sc.nextInt();
		
		int contador = 0;
		
		do {
			System.out.println("echo....");
			contador++;
		} while ( contador < veces );
	}
}

