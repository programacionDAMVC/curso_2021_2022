/*
 * EJERCICIO 5, nueva versión de hora válida
 * Solicitamos horas, minutos y segundos usando Scannerr
 * Usamos bucles do while para solicitar los datos
 * No salimos de los bucles hasta que los datos sean correctos
 * Es decir hora vaya de 00 a 23, minutos de 00 a 59 y segundos de 00 a 59
 * Mostramos hora válida
 */
import java.util.Scanner;

public class TiempoSCANNER {
	
	public static void main (String[] args) {
		
		//abrimos el Scanner para solicitar los datos
		Scanner sc = new Scanner(System.in);
		
		//solicitamos las horas
		int horas = 0;
		do {
			System.out.println("Introduce hora válida");
			horas = sc.nextInt();
		} while (horas < 0 || horas > 23);
		
		//solicitamos los minutos
		int minutos = 0;
		do {
			System.out.println("Introduce minutos válidos");
			minutos = sc.nextInt();
		} while (minutos < 0 || minutos > 59);
		
		//solicitamos los segundos
		int segundos = 0;
		do {
			System.out.println("Introduce segundos válidos");
			segundos = sc.nextInt();
		} while (segundos < 0 || segundos > 59);
		
		sc.close();
		
		//mensaje hora:minutos:segundos hora válida
		System.out.printf("La hora %d:%d:%d es válida%n", horas, minutos, segundos);
		
	}
}

