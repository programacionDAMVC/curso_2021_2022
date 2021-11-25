/*
 * Testear la clase Rectangulo
 */


public class TestRectangulo {
	
	public static void main (String[] args) {
		
		//creamos el objeto Rectangulo
		Rectangulo rectangulo1 = new Rectangulo();
		rectangulo1.setAlto(5);
		rectangulo1.setAncho(3);
		//rectangulo1.ancho = 7; no se puede ver el atributo ancho porque es privado en accesibilidad
		System.out.println("Rectángulo de ancho " + rectangulo1.getAncho());
		System.out.println("Rectángulo de alto " + rectangulo1.getAlto());
		System.out.println("Rectángulo de área " + rectangulo1.getArea());
		System.out.println("Rectángulo de perímetro " + rectangulo1.getPerimetro());

	}
}

