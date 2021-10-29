public class TestUnidades {
	
	public static void main (String[] args) {
		
		//mostrar cuantas libras son, por ejemplo, 5.8 kg
		Unidades.covertirKgALibras(2.2e2);
		//mostrar cuantos metros son, por ejemplo, 1500 pies
		Unidades.convertirPiesAMetros(1500);
		//obtenemos los litros, por ejemplo de 500 galones
		double galones = Unidades.convertirGaloneaALitros(500);
		System.out.println("Los galones obtenidos son: " + galones);
		
	}
}

