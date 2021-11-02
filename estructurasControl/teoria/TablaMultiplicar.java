/*
 * Tablas de multiplicar:
 * Tabla 1: 
 * 1 * 1 = 1
 * 1 * 2 = 2
 * 1 * 3 = 3
 * .........
 * 1 * 10 = 10
 * Tabla 2:
 * 2 * 1 = 2
 * 2 * 2 = 4
 * .........
 * 2 * 10 = 20
 * ...........
 * Tabla 10
 * 10 * 1 = 10
 * 10 * 2 = 20
 * ...........
 * 10 * 10 = 100 
 */


public class TablaMultiplicar {
	
	public static void main (String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Tabla del " + i);
			for (int j = 1; j <= 10; j++) {
					System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}
	}
}

