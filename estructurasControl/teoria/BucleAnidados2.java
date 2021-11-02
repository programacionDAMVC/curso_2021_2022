/*
/*
 * Bucle anidados
 * tres niveles de anidación
 * 
 */

public class BucleAnidados2 {
	
	public static void main (String[] args) {
		for (int i = 1; i < 3; i++) {
			for (int j = 1; j < 3; j++) {
				for (int k = 1; k <3; k++) {
					System.out.println("Valor de i " + i + ", valor de j " + j + ", valor de k " + k);
				}
			}
		}
	}
}

