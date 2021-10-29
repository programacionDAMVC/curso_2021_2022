import java.util.Scanner;


public class RepetirNombre {
	
	public static void main (String[] args) {
		
		System.out.println("Introduce el número de veces a repetir el nombre");
		Scanner sc = new Scanner(System.in);
		int veces = sc.nextInt();
		
		int contador = 0;
		
		while (contador < veces) {
			System.out.println(contador + " Hola Manuel");
			contador++;
		}
		
		System.out.println("Fin de programa");
		
		//contador veces   contador < veces
		//   0      5			true
		//	 1      5           true
		//   2      5           true
		//   3      5           true
		//   4      5           true
		//   5      5 			false
	}
}

