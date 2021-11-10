/*
 * Programa se ejecuta "java Recuperacion3 5 7"
 * 1. Comprobamos que vengan al menos 2 args (args.length), si no vienen damos mensaje y acabamos
 * 2. Convertimos los args que son String a int, usando Integer.parseInt(args[0])
 * 3. Decimos si el primer argumento es mayor, menor o igual que el segundo (if -else if -else)
 */


public class Recuperacion3 {
	
	public static void main (String[] args) {
		//1.
		if (args.length < 2) {
			System.out.println("Faltan argumentos");
			System.exit(1);
		}
		//2.
		int numero1 = Integer.parseInt(args[0]);
		int numero2 = Integer.parseInt(args[1]);
		//3.
		if (numero1 > numero2)
			System.out.printf("%d es mayor que %d%n", numero1, numero2);
		else if (numero1 < numero2)
			System.out.printf("%d es menor que %d%n", numero1, numero2);
		else
			System.out.printf("%d es igual que %d%n", numero1, numero2);


			

	}
}

