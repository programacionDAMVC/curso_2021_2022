
public class TestBoolean1 {
	
	public static void main (String[] args) {
		int numero1 = 3;
		int numero2 = numero1 * 2;
		mostrarSiEsPar(numero1);
		mostrarSiEsPar(numero2);
		mostrarSiEsPar(25);
		mostrarSiEsPar(29 / 3 * 5 % (7 - 3 * 45));
		
		/*boolean numero1EsPar = numero1 % 2 == 0;
		System.out.println("¿El número " + numero1 + " es par? " + numero1EsPar);
		boolean numero2EsPar = numero2 % 2 == 0;
		System.out.println("¿El número " + numero2 + " es par? " + numero2EsPar);
		//.......*/
	}
	
	public static void mostrarSiEsPar (int numero) {
		boolean numeroEsPar = numero % 2 == 0;
		System.out.println("¿El número " + numero + " es par? " + numeroEsPar);
	}
}

