

public class Constantes {
	
	public static void main (String[] args) {
		//defino una constante con la palabra resarvada final
		final double PI = 3.1416;  //ES UNA CONSTANTE
		
		double radio1 = 3.15;
		double area1 = PI * radio1 * radio1;
		System.out.println("Valor del área: " + area1);
		
		double radio2 = 12.15;
		radio2++; 
	//	PI = 3.2; no se puede cambiar el valor de la variable PI, está declarada como final
		double area2 = PI * radio2 * radio2;
		System.out.println("Valor del área: " + area2);
		
		
	}
}

