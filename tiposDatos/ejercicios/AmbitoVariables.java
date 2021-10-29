


public class AmbitoVariables {
	
	static int variableDeClase = 6;
//	System.out.println("LOCAL: variableDeClase : " + variableDeClase); NO SE PUEDE USAR SYSTEM... FUERA DE UN MÉTODO
	
	public static void main (String[] args) {
		
		int variableLocal = 5;
		System.out.println("LOCAL: variableDeClase : " + variableDeClase);
		System.out.println("LOCAL: variableLocal : "   + variableLocal);
	//	System.out.println("LOCAL: variableBloque : "   + variableBloque); VARIABLE DE UN BLOQUE INTERNO

		
		{
			int variableBloque = 7;
			System.out.println("BLOQUE: variableDeClase : "  + variableDeClase);
			System.out.println("BLOQUE: variableLocal : "    + variableLocal);
			System.out.println("BLOQUE: variableBloque : "   + variableBloque);

		}
	//	System.out.println("LOCAL: variableBloque : "   + variableBloque);  VARIABLE DE UN BLOQUE INTERNO

	}
}

