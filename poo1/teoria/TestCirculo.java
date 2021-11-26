/*
 * TestCirculo.java
 */


public class TestCirculo {
	
	public static void main (String[] args) {
		
		Circulo circulo1 = new Circulo();
		System.out.printf("Circulo de radio %.2f tiene de área %.2f y de longitud %.2f%n",
		circulo1.getRadio(), circulo1.getArea(), circulo1.getLongitud());		
		circulo1.setRadio(2);
		circulo1.setRadio(2.2f);
		System.out.printf("Circulo de radio %.2f tiene de área %.2f y de longitud %.2f%n",
					circulo1.getRadio(), circulo1.getArea(), circulo1.getLongitud());
					
		Circulo circulo2 = new Circulo();
		System.out.printf("Circulo de radio %.2f tiene de área %.2f y de longitud %.2f%n",
					circulo2.getRadio(), circulo2.getArea(), circulo2.getLongitud());		
	}
}

