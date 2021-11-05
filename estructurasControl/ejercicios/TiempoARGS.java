/*
 * Ejercicio 5
 * Usando los argumentos (args) introducios números
 * corresponde hora, minutos y segundos
 * sin título.java
 * java TiempoARGS 22 10 15
 * Hora válida
 * java Tiempo 25 10 15
 * Hora no válida
 */


public class TiempoARGS {
	
	public static void main (String[] args) {
		
		//comprobamos que hay tres argumentos mínimo
		//si no los hay lo decimos y acaba el programa
		if (args.length < 3){
			System.out.println("Faltan argumentos");
			System.exit(1);
		}
		
		//convertir las cadenas a número enteros
		String sHoras = args[0];
		int    iHoras = Integer.parseInt(sHoras); //convierto una cadena a int usando Integer.parseInt
		// minutos
		String sMinutos = args[1];
		int    iMinutos = Integer.parseInt(sMinutos); //convierto una cadena a int usando Integer.parseInt
		//segundos
		String sSegundos = args[2];
		int    iSegundos = Integer.parseInt(sSegundos); //convierto una cadena a int usando Integer.parseInt
		
		//boolean horaValida = (horas vayan de 0  a 23) y (minutos de 0 a 59) y ( segundos de 0 a 59)
		boolean horaValida = (iHoras >= 0 && iHoras <= 23) && (iMinutos >= 0 && iMinutos <= 59) && (iSegundos >= 0 && iSegundos <= 59);
		
	//	String mensaje = "";
	//	if (horaValida) {
	//		mensaje = "hora válida";
	//	} else {
	//		mensaje = "hora no válida";
	//	}
		
		String mensaje = horaValida ? "hora válida" : "hora no válida";  //es como un if else
		
		//mostrar en consola el mensaje, mostrar la hora 22:12:22
		System.out.printf("La hora %d:%d:%d  %s%n", iHoras, iMinutos, iSegundos, mensaje);
		
	}
}

