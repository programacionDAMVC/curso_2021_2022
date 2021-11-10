/*
 * Solictar mediante Scanner un número positivo distinto de cero
 * A diferencia del ejercicio anterior, lo vamos a estar solicitando
 * hasta que cumpla con las especificaciones
 * Usamos Scanner para solicitar dicho número
 * Como sentencia de control do-while
 * Solicitamos otro número, debe ser distinto de cero, positivo y distinto al primero solicitado
 * Una vez que tenemos los dos números, decimos en consola el número que es mayor
 */

import java.util.Scanner;

public class Recuperacion2 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero1 = 0, numero2 = 0;
		do {
			System.out.println("Introduce un número positivo distinto de cero");
			numero1 = sc.nextInt();
		} while (numero1 <= 0);
		
		//pedir el numero2 y debe ser distinto de cero, positivo y distinto de numero1
		
		do {
			System.out.println("Introduce un número positivo distinto de cero y distinto del anterior");
			numero2 = sc.nextInt();
		} while (numero2 <= 0 || numero2 == numero1) ;
		
		sc.close(); //cerramos el Scanner, no hace falta mas veces
		
		if (numero1 > numero2) {
			System.out.printf("%d es mayor que %d%n", numero1,  numero2);
		} else {
			System.out.printf("%d es mayor que %d%n", numero2,  numero1);
		}
		
		
	}
}

