/*
 * Programa que calcula la longitud de una circunferencia
 * longitud = 2 * PI * radio
 * introducimos el radio como argumento
 */


public class LongitudCircunferencia {
	
	public static void main (String[] args) {
		
		final double PI = 3.14;
		
		//comprobamos que hay al menos un argumento
		if (args.length < 1) {
			System.out.println("Faltan argumentos");
			System.exit(1);
		}
		
		String sRadio = args[0];
		double dRadio = Double.parseDouble(sRadio);
		
		//calculamos la longitud
		double longitud = 2.0 * PI * dRadio;
		
		//mostramos el valor de la longitud
		System.out.println("La longitud de una circuferencia de radio " + sRadio + " vale " + longitud);
	}
}

