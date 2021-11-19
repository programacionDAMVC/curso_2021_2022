/*
 * Se inicializa un array del tipo double[][][]
 * Mostramos los datos como en el ejercicio anterior
 * usando un método aparte
 * Ejemplo (0, 0, 0) vale 2.22  (0, 0, 1) vale 3.33
 * .....
 * (0, 1, 0) vale 33.22 .....
 * .....
 * ....... (2, 2, 1) vale 55.23
 */


public class Arrays4 {
	
	public static void main (String[] args) {
		double[][][] array = { 
						{{1.1, 2}, {3}, {4.4, 6.6, 7.7}},
						{ {2, 5, -6, 3.25}, {8}},
						{ {1, 2 , 3.4, 5} }
					   };
		mostrarArrayTridimensional(array);
	}
	
	public static void mostrarArrayTridimensional(double[][][] arrayT) {
		for (int i = 0; i < arrayT.length; i++){
			for (int j = 0; j < arrayT[i].length; j++) {
				for (int k = 0; k < arrayT[i][j].length; k++){
					System.out.printf("(%d, %d, %d) vale %.2f%n", i, j ,k, arrayT[i][j][k]);
				}
			}
		}
	}
}

