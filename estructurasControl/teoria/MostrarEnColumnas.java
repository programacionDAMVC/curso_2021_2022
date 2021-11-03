/*
 * El programa muestra en cuatro columnas los números de 1 a 100
 * 1      2      3      4
 * 5      6      7      8
 * 9     10     11     12
 * ..............
 */


public class MostrarEnColumnas {
	
	public static void main (String[] args) {
		/*for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
			if (i % 4 == 0) {
				System.out.println();
			}
		}*/
		for (int i = 1; i <= 100; i++) {
			System.out.printf("%6d", i);  //ponermos 6 espacios para colocar el número
			if (i % 4 == 0) {
				System.out.println();
			}
		}
		
	}
}

