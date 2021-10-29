/*
 * Clase que  convierte  euros a
 * dólares y viceversa. Usando métodos
 */


public class Moneda2 {
	
	static final float UN_EURO_EN_DOLARES = 1.16f;
	static final float UN_DOLAR_EN_EURO = 0.86f;
	
	public static void main (String[] args) {
		
		convertirEurosADolares(5.5f);
		convertirEurosADolares(5);
		convertirEurosADolares(15.5f);
		convertirEurosADolares(25.5f);
		convertirEurosADolares(55.5f);
		convertirEurosADolares(105.5f);
		System.out.println("-------------------");
		convertirDolaresAEuros(15);
		convertirDolaresAEuros(1.15f);
		convertirDolaresAEuros(25.23f);
		convertirDolaresAEuros(1.01f);
		convertirDolaresAEuros(35);
		System.out.println("-------------------");
		convertirEurosADolares(5.5f);
		convertirEurosADolares(5);
		convertirEurosADolares(15.5f);
		convertirEurosADolares(25.5f);
		convertirEurosADolares(55.5f);
		convertirEurosADolares(105.5f);
		System.out.println("-------------------");
		convertirDolaresAEuros(15);
		convertirDolaresAEuros(1.15f);
		convertirDolaresAEuros(25.23f);
		convertirDolaresAEuros(1.01f);
		convertirDolaresAEuros(35);


	}
	
	public static void convertirEurosADolares (float euros) {
		float dolares = euros * UN_EURO_EN_DOLARES;
		System.out.println(euros + "€ son " + dolares + "$"); 
	}
	
	public static void convertirDolaresAEuros (float dolares) {   //f(x) = x * x 
		float euros = dolares * UN_DOLAR_EN_EURO;
		System.out.println(dolares + "$ son " + euros + "€"); 
 
	}
}

