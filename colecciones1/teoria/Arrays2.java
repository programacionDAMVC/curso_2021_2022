/*
 * Probando bucles mejorados
 */


public class Arrays2 {
	
	public static void main (String[] args) {
		
		long[] numeros = {12, 23, 22, 55, 3, -9};
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("En la posición %d tenemos el valor %d%n", i, numeros[i]);
		}
		
		for (long numero : numeros) {
			System.out.println(numero);
		}
		
		long suma = 0;
		for (long numero : numeros) {
			suma += numero;
		}
		float media = 1.0f * suma / numeros.length;
		System.out.printf("El valor medio es %.2f%n", media); 
	}
}

