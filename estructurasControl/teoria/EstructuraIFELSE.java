/*
 * Solicitamos con Scanner un número
 * decimos si es par o no
 * Un número es par si el resto de división por 2 es 0
 * Ej. 4 % 2 == 0 ES PAR, 5 % 2 != 0  NO ES PAR
 */
import java.util.Scanner;

public class EstructuraIFELSE {
	
	public static void main (String[] args) {
		//solicitamos el número
		System.out.println("Introduce un número");
		Scanner in = new Scanner(System.in);
		int numero = in.nextInt();
		
		String mensaje = (numero % 2 == 0) ? "es par" : "no es par";
		
		System.out.println(numero + " " + mensaje);
		
		System.out.printf("%d %s%n", numero, mensaje);
	}
}

