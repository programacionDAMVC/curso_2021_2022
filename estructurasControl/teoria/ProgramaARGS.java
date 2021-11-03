/*
 * Leemos argumentos desde la entrada
 * ejecutamos el programa java ProgramaARGS argumento1 argumento2 ....
 */


public class ProgramaARGS {
	
	public static void main (String[] args) {
		//suponemos que podemos leer hasta tres argumentos
		
		if (args.length < 3) {
			System.out.println("Faltan argumentos");
			System.exit(1);
		}
		
		System.out.println("Argumento 1:" + args[0]);
		System.out.println("Argumento 2:" + args[1]);
		System.out.println("Argumento 3:" + args[2]);
	
	}
}

