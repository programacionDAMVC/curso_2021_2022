import java.util.Scanner;


public class AreaCirculo2 {
	
	public static void main (String[] args) {
		final double PI = 3.1416;
		
		//leer el radio del círculo
		System.out.println("Introduce el radio del círculo");
		Scanner sc = new Scanner(System.in);
		int radio = sc.nextInt();
		
		//si el radio es negativo o cero, lo decimos, y finalizamos el programa
		if ( radio <= 0) {
			System.out.println("No existen círculos de radio " + radio);
			//acabamos el programa
			System.exit(1);
		}
		
		//calcular el área
		double area = PI * radio * radio;
		System.out.println("El área de un círculo de radio " + radio + " vale " + area);
	}
}

