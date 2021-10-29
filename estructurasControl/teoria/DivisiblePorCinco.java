
import java.util.Scanner;

public class DivisiblePorCinco {
	
	public static void main (String[] args) {
		System.out.println("Introduce un número por consola");
		//solicitamos el número por consola
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		//si es divisible por 5 decir que lo es
		if (numero % 5 == 0) {
			System.out.println(numero + " es divisible por 5");
		}
		//sino decir que no es divisible por 5
		else {
			System.out.println(numero + " no es divisible por 5");
		}
	}
}

