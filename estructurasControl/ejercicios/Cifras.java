/*
 * EJERCICIO 4
 * Leemos con el Scanner un número de tres cifras
 * y lo desglosamos en centena, decenas y unidades
 * Ejemplo: 571
 * Programa muestra:
 * Cifra 1 (centena) : 5
 * Cifra 2 (decena)  : 7
 * Cifra 3 (unidades): 1
 */
import java.util.Scanner;


public class Cifras{
	
	public static void main (String[] args) {
		
		//solicitar con Scanner el número
		System.out.println("Introduce un número entero de tres cifras");
		Scanner sc = new Scanner(System.in);
		int numero3Cifras = sc.nextInt();
		
		//comprobamos que es de tres cifras, si no lo es el programa termina 100-999
		//if (!(numero3Cifras >= 100 && numero3Cifras <= 1000)) {  una forma de hacerlo
		if (numero3Cifras < 100 || numero3Cifras > 999) { //con un lenguaje  mas natural
			System.out.printf("El número %d no tiene tres cifras%n", numero3Cifras);
			System.exit(1);
		}
		
		//si es de tres cifras, desglosamos en centenas, decenas y unidades
		//centena  ejemplo 912  912 / 100 = 9    ejemplo 857/ 100 = 8
		int centena = numero3Cifras / 100;
		
		//decena ejemplo 912    12 / 10 = 1      ejemplo 857  57 / 10 = 5
		//llegamos con 912 a 12  haciendo 912 - 100 * centena = 12
		int decena = (numero3Cifras - centena * 100)  / 10;
		
		//unidad ejemplo 912   912 - 900 - 10 = 2
		// 912 - centena * 100 - decena * 10
		int unidad = numero3Cifras - centena * 100 - decena * 10;
		
		//mostramos los datos en consola usando un printf
		System.out.printf("Cifra 1: %d%nCifra 2: %d%nCifra 3: %d%n", centena, decena, unidad);
		
	}
}

