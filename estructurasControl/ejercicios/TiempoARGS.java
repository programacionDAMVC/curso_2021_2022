/*
 * Ejercicio 5
 * Usando los argumentos (args) introducios números
 * corresponde hora, minutos y segundos
 * sin título.java
 * java Tiempo 22 10 15
 * Hora válida
 * java Tiempo 25 10 15
 * Hora no válida
 */


public class TiempoARGS {
	
	public static void main (String[] args) {
		
		//comprobamos que hay tres argumentos mínimo
		//si no los hay lo decimos y acaba el programa
		
		//convertir las cadenas a número enteros
		String sHoras = args[0];
		int    iHoras = Integer.parseInt(sHoras);
		// minutos
		//segundos
		
		boolean horaValida = (horas vayan de 0  a 23) y (minutos de 0 a 59) y ( segundos de 0 a 59)
		
		String mensaje = horaValida ? "hora válida" : "hora no válida";  //es como un if else
		
		//mostrar en consola el mensaje
		
	}
}

