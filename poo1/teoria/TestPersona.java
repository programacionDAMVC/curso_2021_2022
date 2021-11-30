/*
 * TestPersona.java
 */
import java.util.ArrayList;

public class TestPersona {
	
	public static void main (String[] args) {
		
		Persona persona1 = new Persona();
		persona1.setNombre("Estefanía");
		persona1.setApellidos("García Ramirez");
		persona1.setEdad(17);
		System.out.printf("%S ¿Es mayor de edad? %B%n",
					persona1.getNombreCompleto(), persona1.esMayorDeEdad());
					
		Persona persona2 = new Persona();
		persona2.setNombre("Elías");
		persona2.setApellidos("Ramirez Fernández");
		persona2.setEdad(27);
		System.out.printf("%S ¿Es mayor de edad? %B%n",
					persona2.getNombreCompleto(), persona2.esMayorDeEdad());
					
		Persona persona3 = new Persona();
		persona3.setNombre("Wenceslao");
		persona3.setApellidos("Fernández Monedero");
		persona3.setEdad(7);
		System.out.printf("%S ¿Es mayor de edad? %B%n",
					persona3.getNombreCompleto(), persona3.esMayorDeEdad());
					
		//Creamos una lista de objetos Persona
		//añadimos los objetos Persona creados anteriormente
		ArrayList<Persona> personas = new ArrayList<>(); //lista vacía, preparada para almecenar
		//objetos Persona
		System.out.println("Inicialmente la lista está vacía");
		System.out.println(personas);
		personas.add(persona1);
		personas.add(persona2);
		personas.add(persona3);
		System.out.printf("Tamaño de la lista %d%n", personas.size());
		System.out.println("Ahora la lista NO está vacía");
		System.out.println(personas);
		
		System.out.printf("Personas mayores de edad: %d%n", obtenerNumeroMayorEdad(personas));
	
	}
	
	//método que se le pase la lista de objetos Persona y 
	//devuelva el número de personas que son mayores de edad
	public static int obtenerNumeroMayorEdad (ArrayList<Persona> personas){
		int contador = 0;
		/*for (Persona persona : personas) {
			if (persona.esMayorDeEdad())
				contador++;
		}*/
		for (int i = 0; i < personas.size(); i++) {
			if (personas.get(i).esMayorDeEdad())
				contador++;
		}
		return contador;
	}
}

