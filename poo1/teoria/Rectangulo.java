/*
 * Clase Rectangulo * 
 */


public class Rectangulo {
	
	//atributos: alto y ancho
	private int alto;
	private int ancho;
	
	//getters
	public int getAlto() {
		return alto;
	}
	public int getAncho() {
		return ancho;
	}
	
	//setters
	public void setAlto(int alto) {
		this.alto = alto;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	
	//resto de métodos
	public int getArea() {
		return alto * ancho;
	}
	public int getPerimetro() {
		return 2 * alto + 2 * ancho;
	}
	
}

