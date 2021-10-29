/**
 * Clase para convetir unidades:
 * Método para convertir de kg a lb
 * Método para convertir de ft a m
 * .............
 * @author Manuel 
 * @author manolo@iesvirgendelcarmen.com
 * @version 1.0.0
 */ 

public class Unidades{
	/**
	 * Constante pública cuyo valor es las libras de un kilogramo
	 */ 
	public static final double UN_KG_A_LIBRAS  = 2.205;
	/**
	 * Constante pública cuyo valor es los metros de un pie
	 */ 
	public static final double UN_PIE_A_METROS = 0.305;
	/**
	 * Constante pública cuyo valor es los litros de un galón
	 */ 
	public static final double UN_GALON_A_LITROS = 3.78;
	
	/**
	 * Método que se encarga de convertir kilogramos a libras
	 * y lo muestra a consola
	 * @param kilos kilogramos que se convertiran a libras
	 */ 
	public static void covertirKgALibras(double kilos) {
		double libras = kilos * UN_KG_A_LIBRAS;
		System.out.println(kilos + "kg son " + libras + "lb");
	}
	/**
	 * Método que se encarga de convertir pies a metros
	 * y los muestra a consola
	 * @param pies el ñº de pies que se convertiran a metros
	 */ 
	public static void convertirPiesAMetros(double pies) {
		double metros = pies * UN_PIE_A_METROS;
		System.out.println(pies + "ft son " + metros + "m");
	}
	/**
	 * Método que se encarga de convertir galones a litros
	 * @param galones el ñº de pies que se convertiran a metros
	 * @return los litros que corresponde esos galones
	 */ 
	public static double convertirGaloneaALitros(double galones) {
		double litros = galones * UN_GALON_A_LITROS;
		return litros;
	}
	
	
	
	

}

