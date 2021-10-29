import java.util.Scanner;


public class AreaCirculo1 {
	
	public static void main (String[] args) {
		
		final double PI = 3.1416;
		
		//leer el radio del círculo
		System.out.println("Introduce el radio del círculo");
		Scanner sc = new Scanner(System.in);
		int radio = sc.nextInt();
		
		//si el radio es positivo hacemos el cálculo
		if (radio > 0) {
			//calcular el área
			double area = PI * radio * radio;
			System.out.println("El área de un círculo de radio " + radio + " vale " + area);
		}
		
		//sino decimos que no existe ese tipo de círculo
		else {
			System.out.println("No existen círculos con radio " + radio);
		}
	}
}

