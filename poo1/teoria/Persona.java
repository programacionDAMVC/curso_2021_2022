/**
 * Clase Persona
 * 
 * Atributos: nombre, apellidos y edad
 * Métodos: getters y setters, método que nos devuelva el nombre completo
 * método que nos diga si la persona es mayor de edad o no
 * @author Manuel Molino
 * @version 1.0.0
 */


public class Persona {
	
	//atributos
	private String nombre;
	private String apellidos;
	private int edad;
	
	/**
	 * getter atributo nombre
	 * @return devuelve el valor del atributo
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * getter atributo apellidos
	 * @return devuelve el valor del atributo
	 */
	public String getApellidos(){
		return apellidos;
	}
	/**
	 * getter atributo edad
	 * @return devuelve el valor del atributo
	 */
	public int getEdad(){
		return edad;
	}
	/**
	 * setter atributo nombre
	 * @param nombre valor nuevo del atributo
	 */
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	/**
	 * setter atributo apellidos
	 * @param apellidos valor nuevo del atributo
	 */
	public void setApellidos(String apellidos){
		this.apellidos = apellidos;
	}
	/**
	 * setter atributo edad
	 * @param edad valor nuevo del atributo
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	/**
	 * método que devuelve el nombre completo: garcía garcía, juan
	 * @return devuelve el nombre completo con el formato indicado
	 */
	public String getNombreCompleto() {
		return apellidos + "; " + nombre;
	}
	
	/**
	 * método que devuelve el nombre si la persona es mayor de edad
	 * @return true si y solo si la persona es mayor de edad
	 */
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
	
	/** 
	 * Método toString, representación en cadena 
	 * de las referencias de los objetos Persona
	 * @return la cadena representando al objeto
	 */
	public String toString() {
		return getNombreCompleto();
	}
	
	
	
	
	
	
	
	
	
}

