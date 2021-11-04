/*
 * Ejercicio 1
 */


public class Numero {
	
	public static void main (String[] args) {
		//mostrarEnConsolaN1a10();
		//mostrarEnConsolaSerieDe5en5();
		//mostrarEnConsolaSerieDe2en2Decreciente();
		int numero = 13;
		//int multiplicacion = multiplicarNEnteros(numero);
		//mostrar en consola esa multiplicación
		//System.out.printf("Multiplicar de 1 a %d vale %d%n", numero, multiplicacion);
		//int sumaCuadrados = sumarNCuadrados(numero);
		// para numero = 3,  1 * 1 + 2 * 2 + 3 * 3 = 1 + 4 + 9 = 14
		//System.out.printf("La suma de los cuadrados desde 1 a %d vale %d%n", numero, sumaCuadrados);
		mostrarEnConsolaSumaParesEImpares(numero);
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
	
	//método que devuelva la suma de los cuadrados de los N primeros números naturales.
	public static int sumarNCuadrados( int numero ) {
		//si pasamos numero como  5, devolvemos: 1 * 1 + 2 * 2 + 3 * 3 + 4 * 4 + 5 * 5
		int contador = 1;
		int suma = 0;
		while (contador <= numero) {
			suma += contador * contador;
			contador++;
		}
		return suma;
	}
	
	//método muestre en consola independientemente la suma de los pares e impares comprendidos entre 1 y N
	public static void mostrarEnConsolaSumaParesEImpares(int numero) {
		//ejemplo numero = 8
		// sumamos pares  : 2 + 4 + 6 + 8
		// sumamos impares: 1 + 3 + 5 + 7
		int sumaPares = 0, sumaImpares = 0;
		for (int i = 1 ; i <= numero ; i++) {
			if (i % 2 == 0) {
				sumaPares += i;
			} else {
				sumaImpares +=i;
			}
		}
		System.out.printf("La suma de los números pares desde el cero a %d vale %d%n", numero, sumaPares);
		System.out.printf("La suma de los números impares desde el cero a %d vale %d%n", numero, sumaImpares );

	}
	
	
}

