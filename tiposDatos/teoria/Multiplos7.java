/*
 * Calcular los múltiplos de 7
 * comprendidos entre 1 y 100
 * son: 7, 14, 21, 28, 35 ...
 * Lógica: bucle recorrer los números de 1 a 100: 1, 2, 3, .....
 * Comprobar que ese número sea múltiplo de 7
 * ¿Cómo? si el resto  numero % 7 == 0 
 */


public class Multiplos7 {
	
	public static void main (String[] args) {
		
		int contador = 1;
		while (contador <= 100) {
			//System.out.println(contador);
			//si el resto de división de contador entre 7 es cero, lo decimos en pantalla
			if (contador % 7 == 0) {
				System.out.println(contador + " es múltiplo de 7");
			}
			contador++;
		}
		
		
	}
}

