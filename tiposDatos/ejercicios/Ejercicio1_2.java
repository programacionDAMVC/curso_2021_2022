

public class Ejercicio1_2 {
	
	public static void main (String[] args) {
		
			
			double millasRecorridadas;
			millasRecorridadas = 100;
			final double MILLAS_POR_KILOMETRO = 1.609f;
//			float kilometrosRealizados = (float) millasRecorridadas * (float) MILLAS_POR_KILOMETRO;
			float kilometrosRealizados = (float) ( millasRecorridadas *  MILLAS_POR_KILOMETRO );

			System.out.println(millasRecorridadas + " millas son " + kilometrosRealizados + " km");
		
	}
	
}

