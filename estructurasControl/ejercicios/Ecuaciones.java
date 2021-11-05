/*
 * EJERCICIO 7
 * Resolver sistemas de dos ecuaciones 
 * con dos incognitas
 */
import java.util.Scanner;

public class  Ecuaciones {
	
	static int a, b, c, d, e, f; //coeficientes de las ecuaciones
	
	public static void main (String[] args) {
		
		leerCoeficientes();
		boolean resoluble = sePuedeResolver();
		//mostramos un mensaje
		String mensaje = resoluble ? "se puede resolver" : "no se puede resolver";
		//si no se puede resolver, damos el mensaje y acaba el programa
		if (!resoluble) {
			System.out.printf("%s%n", mensaje);
			System.exit(1);
		}
		//si se puede resolver, damos el mensaje y continuamos ....
		System.out.printf("%s%n", mensaje);
		System.out.println("...........");
		double x = calcularX();
		double y = calcularY();
		
		//dar las soluciones en pantalla
	}
	
	public static void leerCoeficientes() {
		//usamos un Scanner
		Scanner sc = new Scanner(System.in);
		//leemos a, b, ... f
		System.out.println("Introduce coeficiente a");
		a = sc.nextInt();
		System.out.println("Introduce coeficiente b");
		b = sc.nextInt();
		System.out.println("Introduce coeficiente c");
		c = sc.nextInt();
		System.out.println("Introduce coeficiente d");
		d = sc.nextInt();
		System.out.println("Introduce coeficiente e");
		e = sc.nextInt();
		System.out.println("Introduce coeficiente f");
		f = sc.nextInt();
		sc.close();
	}
	
	public static boolean sePuedeResolver() {
		//comprobamos a · d − b · c != 0
		boolean resoluble = a * d - b * c != 0;
		return resoluble;
	}
	
	public static double calcularX() {
		return 0;
	}
	public static double calcularY() {
		return 0;
	}
		
	
	
	
	
}

