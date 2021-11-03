/*
 * Ejercicio 1
 */


public class Numero {
	
	public static void main (String[] args) {
		//mostrarEnConsolaN1a10();
		//mostrarEnConsolaSerieDe5en5();
		//mostrarEnConsolaSerieDe2en2Decreciente();
		int numero = 7;
		int multiplicacion = multiplicarNEnteros(numero);
		//mostrar en consola esa multiplicación
		System.out.printf("Multiplicar de 1 a %d vale %d%n", numero, multiplicacion);
	}
		
	//método que muestre en consola los números del 1 al 10.
	public static void mostrarEnConsolaN1a10() {
		//código
		int contador = 1;
		do {
			System.out.printf("%d  ", contador);
			contador++;
		} while (contador <= 10);
		System.out.println();
	}
	
	//método que muestre en consola la siguiente serie: 20 25 30 35 . . . 70 75 80
	public static void mostrarEnConsolaSerieDe5en5() {
		int contador = 20;
		while (contador <= 80) {
			System.out.printf("%d  ", contador);
			contador += 5; 
		}
		System.out.println();

	}
	
	//método que muestre en consola la siguiente serie: 100 98 96 94 . . . 56 54 52 50
	public static void mostrarEnConsolaSerieDe2en2Decreciente() {
		for (int i = 100; i >= 50; i -= 2) {
			System.out.printf("%d  ", i);
		}
		System.out.println();
	}
	
	//método que devuelva la multiplicación de los números enteros del 1 a N
	public static int multiplicarNEnteros(int numero){
		int multiplicacion = 1;
		//bucle
		for (int i = 1; i <= numero; i++) {
			multiplicacion *= i;
		}
		return multiplicacion;
	}
	
	
	
}

