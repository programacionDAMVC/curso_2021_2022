/*
 * Bucles de mas de una dimensión
 * Ejemplo de bidimensionales 
 * Usamos int[][]
 */


public class Arrays3 {
	
	public static void main (String[] args) {
		
		int dimension1_1 = 2;
		int dimension2_1 = 3;
		int[][] bidimensional1 = new int[dimension1_1][dimension2_1];
		System.out.println("Datos inicializados por defecto");
		mostrarDatosEnConsolaArrayBidimensional(bidimensional1);
		//rellenar la fila primera
		bidimensional1[0][0] = 0;
		bidimensional1[0][1] = 1;
		bidimensional1[0][2] = 2;
		//rellenar la fila segunda
		bidimensional1[1][0] = 3;
		bidimensional1[1][1] = 4;
		bidimensional1[1][2] = 5;
		System.out.println("\nDatos inicializados por usuario");
		mostrarDatosEnConsolaArrayBidimensional(bidimensional1);
		
		int[][] bidimensional2 = { 
									{0, 1, 2} ,
									{3, 4} , 
									{5, 6, 7, 8, 9},
								 };
		System.out.println("\n\nArray bidimensional inicializado por el usuario");
		mostrarDatosEnConsolaArrayBidimensional(bidimensional2);
	}
	
	public static void mostrarDatosEnConsolaArrayBidimensional(int[][] bidimensional) {
		for (int i = 0; i < bidimensional.length; i++) {
			System.out.printf("%nFila: %d%n", i);
			for (int j = 0; j < bidimensional[i].length; j++) {
				System.out.printf("Columna: %d, dato: %d\t", j, bidimensional[i][j]);
			}
		}
	}
}

