/*
 * EJERCICIO 7
 * Resolver sistemas de dos ecuaciones 
 * con dos incognitas
 * 
 * a · x + b · y = e
 * c · x + d · y = f
 * 
 */
 
import java.util.Scanner;

public class  Ecuaciones {
	
	static int a, b, c, d, e, f; //coeficientes de las ecuaciones
	
	public static void main (String[] args) {
		
		leerCoeficientes();
		
		boolean resoluble = sePuedeResolver();
		//mostramos un mensaje
		String mensaje = resoluble ? "se puede resolver" : "no se puede resolver";
		//String mensaje = "";
		//if (!resoluble) {
		//	mensaje = "No se puede resolver";
		//} else {
		//	mensaje = "se puede resolver");
		//}
			
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
		System.out.printf("Cálculo de X es %.2f%n", x);
		System.out.printf("Cálculo de Y es %.2f%n", y);
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
		//return a * d - b * c != 0;
	}
	
	public static double calcularX() {
		double resultado = 1.0 * (e * d - b * f) / (a * d - b * c);
		return resultado;
	}
	
	public static double calcularY() {
		double resultado = 1.0 * (a * f - e * c) / (a * d - b * c);
		return resultado ;
	}
		
	
	
	
	
}

