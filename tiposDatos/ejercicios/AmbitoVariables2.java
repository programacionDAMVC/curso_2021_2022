


public class AmbitoVariables2 {
	static final double PI = 3.1416;
	static int variableDeClase = 6;
//	System.out.println("LOCAL: variableDeClase : " + variableDeClase); NO SE PUEDE USAR SYSTEM... FUERA DE UN MÉTODO
	
	public static void main (String[] args) {
		
		int variableLocal = 5;
		System.out.println("LOCAL: variableDeClase : " + variableDeClase);
		System.out.println("LOCAL: variableLocal : "   + variableLocal);
	//	System.out.println("LOCAL: variableBloque : "   + variableBloque); VARIABLE DE UN BLOQUE INTERNO

		
		{
			int variableBloque = 7;
			System.out.println("BLOQUE1: variableDeClase : "  + variableDeClase);
			System.out.println("BLOQUE1: variableLocal : "    + variableLocal);
			System.out.println("BLOQUE1: variableBloque : "   + variableBloque);
			//System.out.println("BLOQUE1 : variableBloque1: "   + variableBloque1);
			{
				int variableBloque1 = 6;
				System.out.println("BLOQUE INTERNO: variableDeClase : "  + variableDeClase);
				System.out.println("BLOQUE INTERNO: variableLocal : "    + variableLocal);
				System.out.println("BLOQUE INTERNO: variableBloque : "   + variableBloque);
				System.out.println("BLOQUE INTERNO: variableBloque1: "   + variableBloque1);
				variableDeClase = 111;

			}

		}
		{
			int variableBloque2 = 9;
			variableDeClase++;
		//	PI++;
			System.out.println("BLOQUE2 : variableDeClase : "  + variableDeClase++);
			System.out.println("BLOQUE2 : variableLocal : "    + variableLocal);
		//	System.out.println("BLOQUE2 : variableBloque : "   + variableBloque);
		//	System.out.println("BLOQUE2 : variableBloque1: "   + variableBloque1);
			System.out.println("BLOQUE2 : variableBloque2: "   + variableBloque2);

		}
		System.out.println("BLOQUE2 : variableDeClase : "  + variableDeClase);

	}
}
	//		variableDeClase++;

