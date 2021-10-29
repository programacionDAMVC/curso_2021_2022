/**
* Esta clase define objetos que contienen
* un atributo denominado número
* y posee un método para devolver
* el valor doble
* @author Manuel Molino
* @version 1.0
*/

public class Numero{
	private int numero; //propiedad de los objetos.
	/**
	* Constructor: es un método que tiene
	* el mismo nombre que la clase y se
	* usa para crear objetos
	* @param n parámetro para inicializar el objeto
	* se usa para inicializar los objetos
	* de tipo número
	*/
	public Numero(int n){
		this.numero=n;
	}
	/**
	* método que devuelve el valor doble
	* @return el valor doble del atributo
	* numero de dicho objeto.
	*/
	public int calcularDoble(){
		return this.numero*2;
	}
	/**
	* método que devuelve el valor triple
	* @return el valor triple del atributo
	* numero de dicho objeto.
	*/
	public int calcularTriple(){
		return this.numero * 3;
	}
	/**
	* método que devuelve el valor mitad
	* @return el valor mitad del atributo
	* numero de dicho objeto.
	*/
	public double calcularMitad(){
		return numero / 2.0;
	}
}

//clase para comprobar el funcionamiento de la
//clase anterior
class TestNumeros {
	public static void main(String[] arg){
		//Creo uno objeto de tipo Número
		Numero n1 = new Numero(9);
		//Imprimo su valor doble
		System.out.println("Valor doble: " + n1.calcularDoble());
		//Imprimo su valor triple
		System.out.println("Valor triple: " + n1.calcularTriple());
		//Imprimo su valor mitad
		System.out.println("Valor mitad: " + n1.calcularMitad());
	}
}
class LoQueSea {
}
