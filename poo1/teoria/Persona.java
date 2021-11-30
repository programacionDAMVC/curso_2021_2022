/*
 * Clase Persona
 * 
 * Atributos: nombre, apellidos y edad
 * Métodos: getters y setters, método que nos devuelva el nombre completo
 * método que nos diga si la persona es mayor de edad o no
 * 
 */


public class Persona {
	
	//atributos
	private String nombre;
	private String apellidos;
	private int edad;
	
	//getters
	public String getNombre() {
		return nombre;
	}
	public String getApellidos(){
		return apellidos;
	}
	public int getEdad(){
		return edad;
	}
	//setters
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setApellidos(String apellidos){
		this.apellidos = apellidos;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//método que devuelve el nombre completo: garcía garcía, juan
	public String getNombreCompleto() {
		return apellidos + "; " + nombre;
	}
	
	//método que nos dices si una persona es mayor de edad o no
	public boolean esMayorDeEdad() {
		
		/*boolean mayor = false;
		if (edad >= 18)
			mayor = true;
		return mayor;*/
		
		/*if (edad >= 18)
			return true;
		else
			return false;*/
			
		return edad >= 18;
	
	}
	
	public String toString() {
		return getNombreCompleto();
	}
	
	
	
	
	
	
	
	
	
}

