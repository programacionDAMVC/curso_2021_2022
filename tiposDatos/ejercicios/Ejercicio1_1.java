/*
 * Ejercicio1_1.java
 * Ejercicio para practicar tipos de datos
 * constantes ....
 */


public class Ejercicio1_1 {
	
	public static void main (String[] args) {
		float millasRecorridadas;
		millasRecorridadas = 100;
		final float MILLAS_POR_KILOMETRO = 1.609f;
		double kilometrosRealizados = millasRecorridadas * MILLAS_POR_KILOMETRO;
		System.out.println(millasRecorridadas + " millas son " + kilometrosRealizados + " km");
	}
}

